package com.lishiwei.westbund.Adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lishiwei.core.ImageLoad;
import com.lishiwei.model.Exhibition;
import com.lishiwei.westbund.R;
import com.lishiwei.westbund.Utils.DataBindingUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lishiwei on 16/8/19.
 */
public class OtherExhibitionRecyclerAdapter extends RecyclerView.Adapter<OtherExhibitionRecyclerAdapter.ViewHolder> {

    private static final String TAG = OtherExhibitionRecyclerAdapter.class.getSimpleName();


    public List<Exhibition> getExhibitionList() {
        return exhibitionList;
    }

    public void setExhibitionList(List<Exhibition> exhibitionList) {
        this.exhibitionList = exhibitionList;
    }

    List<Exhibition> exhibitionList = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_otherexhibition_recyclerview, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: ");
        holder.mTvExhibitionCurator.setText(exhibitionList.get(position).getCurator());
        holder.mTvExhibitionExpoName.setText(exhibitionList.get(position).getExpoName());
        holder.mTvExhibitionExpoNameBig.setText(exhibitionList.get(position).getExpoName());
        holder.mTvExhibitionShowName.setText(exhibitionList.get(position).getShowName());
        holder.mTvExhibitionStatus.setText(exhibitionList.get(position).getStatus());
        holder.mTvExhibitionTime.setText(exhibitionList.get(position).getTimeStart());
        holder.mTvSeminarTimeStr.setText(exhibitionList.get(position).getTimeStr());
        ImageLoad.displayImageView(holder.itemView.getContext(), DataBindingUtils.getCorrectImageUrl(exhibitionList.get(position).getExhibitionImgUrl()),holder.ivExhibitionBack);
    }

    @Override
    public int getItemCount() {
        return exhibitionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_Exhibition_ExpoNameBig)
        TextView mTvExhibitionExpoNameBig;
        @Bind(R.id.tv_Exhibition_ShowName)
        TextView mTvExhibitionShowName;
        @Bind(R.id.tv_Exhibition_Status)
        TextView mTvExhibitionStatus;
        @Bind(R.id.tv_Exhibition_ExpoName)
        TextView mTvExhibitionExpoName;
        @Bind(R.id.tv_Exhibition_Time)
        TextView mTvExhibitionTime;
        @Bind(R.id.tv_Exhibition_Curator)
        TextView mTvExhibitionCurator;
        @Bind(R.id.tv_Seminar_TimeStr)
        TextView mTvSeminarTimeStr;
        @Bind(R.id.iv_ExhibitionBack)
        ImageView ivExhibitionBack;

        public ViewHolder(View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
