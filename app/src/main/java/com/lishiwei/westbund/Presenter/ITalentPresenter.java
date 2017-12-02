package com.lishiwei.westbund.Presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.lishiwei.westbund.ViewInterface.SeminarView;
import com.lishiwei.westbund.ViewInterface.TalentView;

/**
 * Created by lishiwei on 16/8/18.
 */
public interface ITalentPresenter extends MvpPresenter<TalentView> {
    public void loadData(int pageSize, int pageNo, final boolean pullToRefresh);
}
