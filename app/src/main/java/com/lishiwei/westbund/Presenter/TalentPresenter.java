package com.lishiwei.westbund.Presenter;

import android.content.Context;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.lishiwei.core.DataSource;
import com.lishiwei.core.TalentRemoteDataSource;
import com.lishiwei.model.Talent;
import com.lishiwei.westbund.ViewInterface.TalentView;
import com.lishiwei.westbund.ViewInterface.TalentView;

import java.util.List;

/**
 * Created by lishiwei on 16/5/22.
 */
public class TalentPresenter extends MvpBasePresenter<TalentView> implements ITalentPresenter {
    TalentRemoteDataSource TalentRemoteDataSource ;
    Context context;

    public TalentPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void loadData(int pageSize, int pageNo,final boolean pullToRefresh) {
        if (TalentRemoteDataSource==null)
        {
            TalentRemoteDataSource = new TalentRemoteDataSource(context);
        }
        if (isViewAttached())
        {
            getView().showLoading(pullToRefresh);
        }
        TalentRemoteDataSource.getDatas(pageSize,pageNo,new DataSource.LoadDataCallBack<Talent>() {
            @Override
            public void onSucceed(List<Talent> list) {
                if (isViewAttached())
                {
                    getView().showContent();
                    getView().setData(list);
                }
            }

            @Override
            public void onError() {
getView().showError(null,pullToRefresh);
            }
        });

    }

    @Override
    public void attachView(TalentView view) {
        super.attachView(view);
    }

    @Override
    public void detachView(boolean retainInstance) {
        super.detachView(retainInstance);
    }
}
