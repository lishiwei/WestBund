package com.lishiwei.core;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.lishiwei.core.Retrofit.WestBoundRetrofit;
import com.lishiwei.model.BaseResponseBody;
import com.lishiwei.model.Talent;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by lishiwei on 16/5/21.
 */
public class TalentRemoteDataSource implements DataSource<Talent> {
    private static final String TAG = TalentRemoteDataSource.class.getSimpleName();
Context context;

    public TalentRemoteDataSource(Context context) {
        this.context = context;
    }

    @Override
    public void getDatas(int pageSize, int pageNo,final @NonNull LoadDataCallBack<Talent> loadDataCallBack) {

        final List<Talent> list = new ArrayList<>();
        Log.d(TAG, "getDatas: "+pageNo);
        WestBoundRetrofit.getRetrofitService(context).getTalent(JsonUtils.getPageInfoBody(pageSize,pageNo))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .map(new Func1<BaseResponseBody<Talent>, List<Talent>>() {
                    @Override
                    public List<Talent> call(BaseResponseBody<Talent> newsBaseResponseBody) {
                        Log.d(TAG, "call: "+newsBaseResponseBody.getPage().toString());
                        return newsBaseResponseBody.getDataList();
                    }
                }).subscribe(new Subscriber<List<Talent>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: "+e.toString());
                loadDataCallBack.onSucceed(list);
                //loadNewsCallBack.onError(e);

            }

            @Override
            public void onNext(List<Talent> newsList) {
                Log.d(TAG, "onNext: "+newsList.toString());
                if (newsList.size() > 0) {
                    loadDataCallBack.onSucceed(newsList);

                } else {
loadDataCallBack.onError();                }
            }
        });
    }
}
