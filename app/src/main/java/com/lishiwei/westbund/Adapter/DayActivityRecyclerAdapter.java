package com.lishiwei.westbund.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lishiwei.model.DayActivity;
import com.lishiwei.westbund.R;
import com.lishiwei.westbund.Utils.DataBindingUtils;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by shiwei on 2016/9/17.
 */
public class DayActivityRecyclerAdapter extends RecyclerView.Adapter<DayActivityRecyclerAdapter.ViewHolder> {
    List<DayActivity> dayActivityList;


    public void setDayActivityList(List<DayActivity> dayActivityList) {
        this.dayActivityList = dayActivityList;
    }

    public List<DayActivity> getDayActivityList() {
        return dayActivityList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dayactivity_recyclerview, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTvDayActivityGallery.setText(dayActivityList.get(position).getGallery());
        holder.mTvDayActivityLocation.setText(dayActivityList.get(position).getLocation());
//        holder.mTvDayActivityMail.setText(dayActivityList.get(position).getMail());
        holder.mTvDayActivityName.setText(dayActivityList.get(position).getName());
        holder.mTvDayActivityOpenTime.setText(getStartTime(dayActivityList.get(position).getOpenTime()));
//        holder.mTvDayActivityPhone.setText(dayActivityList.get(position).getPhone());
        holder.mTvDayActivityStatus.setText(getStatus(dayActivityList.get(position).getStatus()));
        holder.mTvDayActivityWeek.setText(dayActivityList.get(position).getWeekStr());
        holder.tvTimeString.setText(gettime(dayActivityList.get(position)));
    }
public String getStatus(String s){
        return s.equals("")||s.equals("NULL")?"ONGOING":s;
}public String getStartTime(String s){
        return s.equals("")||s.equals("NULL")?"未知":s;
}
public String gettime(DayActivity dayActivity)
{
    return dayActivity.getDateStartStr()+"     "+dayActivity.getTime();
}
    @Override
    public int getItemCount() {
        return dayActivityList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_DayActivityOpenTime)
        TextView mTvDayActivityOpenTime;
        @Bind(R.id.tv_DayActivityWeek)
        TextView mTvDayActivityWeek;
        @Bind(R.id.tv_DayActivityStatus)
        TextView mTvDayActivityStatus;
        @Bind(R.id.tv_DayActivityGallery)
        TextView mTvDayActivityGallery;
        @Bind(R.id.tv_DayActivityName)
        TextView mTvDayActivityName;
        @Bind(R.id.tv_DayActivityLocation)
        TextView mTvDayActivityLocation;
//        @Bind(R.id.tv_DayActivityMail)
//        TextView mTvDayActivityMail;
//        @Bind(R.id.tv_DayActivityPhone)
//        TextView mTvDayActivityPhone;
        @Bind(R.id.tv_TimeString)
        TextView tvTimeString;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
