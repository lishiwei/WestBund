package com.lishiwei.westbund.Adapter;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lishiwei.core.ImageLoad;
import com.lishiwei.core.Retrofit.WestBoundRetrofit;
import com.lishiwei.model.ArtSpot;
import com.lishiwei.model.Exhibition;
import com.lishiwei.westbund.Activity.ActivityArtSpotDetails;
import com.lishiwei.westbund.R;



import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lishiwei on 16/8/19.
 */
public class ArtSpotRecyclerAdapter extends RecyclerView.Adapter<ArtSpotRecyclerAdapter.ViewHolder> {

    private static final String TAG = ArtSpotRecyclerAdapter.class.getSimpleName();



    List<ArtSpot> artSpotList = new ArrayList<>();

    public void setArtSpotList(List<ArtSpot> artSpotList) {
        this.artSpotList = artSpotList;
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_artspot_recyclerview,null);
        final ViewHolder viewHolder = new ViewHolder(view);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(parent.getContext(),ActivityArtSpotDetails.class);
                intent.putExtra(ActivityArtSpotDetails.ARTSPOT,artSpotList.get(viewHolder.getLayoutPosition()));
                parent.getContext().startActivity(intent);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder:ArtSpotRecyclerAdapter ");
        holder.tvNewsRecyclerContent.setText(artSpotList.get(position).getDetail());
        holder.tvNewsRecyclerTime.setText(artSpotList.get(position).getCreateTimeStr());
        holder.tvArtistName.setText(artSpotList.get(position).getArtistName());
        holder.tvName.setText(artSpotList.get(position).getName());
        ImageLoad.displayImageView(holder.itemView.getContext(), WestBoundRetrofit.BaseUrl+artSpotList.get(position ).getImageUrl(),holder.ivArtSpotback);

    }

    @Override
    public int getItemCount() {
        return artSpotList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       @Bind(R.id.tv_ArtistName)
        TextView tvArtistName;
       @Bind(R.id.tv_NewsRecycler_Content)
        TextView tvNewsRecyclerContent;
       @Bind(R.id.tv_NewsRecycler_Time)
        TextView tvNewsRecyclerTime;
        @Bind(R.id.tv_Name)
        TextView tvName;
        @Bind(R.id.iv_ArtSpotback)
        ImageView ivArtSpotback;

        public ViewHolder(View itemView) {

            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
