package com.lishiwei.westbund.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.lishiwei.model.Gallery;
import com.lishiwei.westbund.R;

public class TelnetDetailActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telnet_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("画廊详情");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_back);
        Intent intent = getIntent();
        Gallery gallery = intent.getParcelableExtra("gallery");
        ((TextView)findViewById(R.id.tv_Telnet_AtAuthor)).setText(gallery.getAtTitle());
        ((TextView)findViewById(R.id.tv_Telnet_Author)).setText(gallery.getAuthor());
        ((TextView)findViewById(R.id.tv_Telnet_Material)).setText(gallery.getMaterial());
        ((TextView)findViewById(R.id.tv_Telnet_Size)).setText(gallery.getTechnique());
        ((TextView)findViewById(R.id.tv_Telnet_Time)).setText(gallery.getTime());
        ((TextView)findViewById(R.id.tv_Telnet_Title)).setText(gallery.getTitle());

        ((TextView)findViewById(R.id.text_gallerychineseName)).setText(gallery.getChineseName());
        ((TextView)findViewById(R.id.text_galleryEnglishName)).setText(gallery.getEnglishName());
        ((TextView)findViewById(R.id.text_city)).setText(gallery.getWebUrl());

        ((TextView)findViewById(R.id.text_contact)).setText(gallery.getLocation());
        ((TextView)findViewById(R.id.text_Artist)).setText(gallery.getArtists());
        ((ImageView)findViewById(R.id.iv_Gallery_Bg)).setImageResource(gallery.getImageResource());
    }
}
