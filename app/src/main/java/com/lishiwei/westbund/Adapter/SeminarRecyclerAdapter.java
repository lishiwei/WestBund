package com.lishiwei.westbund.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lishiwei.model.Seminar;
import com.lishiwei.westbund.R;
import com.lishiwei.westbund.Utils.DataBindingUtils;
import com.lishiwei.westbund.databinding.ItemSeminarRecyclerviewBinding;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lishiwei on 16/8/17.
 */
public class SeminarRecyclerAdapter extends RecyclerView.Adapter<SeminarRecyclerAdapter.ViewHolder> {
    private static final String TAG = SeminarRecyclerAdapter.class.getSimpleName();


    public void setSeminarList(List<Seminar> seminarList) {
        this.seminarList = seminarList;
    }

    List<Seminar> seminarList = new ArrayList<>();

    public SeminarRecyclerAdapter() {
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_seminar_recyclerview, null);
        ViewHolder viewHolder1 = new ViewHolder(viewHolder);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTvSeminarGuest.setText(seminarList.get(position).getGuest());
        holder.mTvSeminarStartTime.setText(seminarList.get(position).getStartTime());
        holder.mTvSeminarStatus.setText(DataBindingUtils.getCorrectStatus(seminarList.get(position).getStatus()));
        holder.mTvSeminarTime.setText(seminarList.get(position).getTime());
        holder.mTvSeminarWeek.setText(seminarList.get(position).getWeekday());
        holder.mTvSeminarTimeLocation.setText(seminarList.get(position).getLocation());
        holder.mTvSeminarTitile.setText(seminarList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {

        return seminarList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.tv_SeminarStartTime)
        TextView mTvSeminarStartTime;
        @Bind(R.id.tv_Seminar_Week)
        TextView mTvSeminarWeek;
        @Bind(R.id.tv_Seminar_Status)
        TextView mTvSeminarStatus;
        @Bind(R.id.tv_Seminar_Titile)
        TextView mTvSeminarTitile;
        @Bind(R.id.tv_Seminar_Guest)
        TextView mTvSeminarGuest;
        @Bind(R.id.tv_Seminar_Time)
        TextView mTvSeminarTime;
        @Bind(R.id.tv_Seminar_TimeLocation)
        TextView mTvSeminarTimeLocation;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
