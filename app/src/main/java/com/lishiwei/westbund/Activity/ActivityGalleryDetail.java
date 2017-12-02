package com.lishiwei.westbund.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.lishiwei.model.Gallery;
import com.lishiwei.westbund.R;

public class ActivityGalleryDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("画廊详情");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_back);
        Intent intent = getIntent();
        Gallery gallery = intent.getParcelableExtra("gallery");
        ((TextView)findViewById(R.id.text_gallerychineseName)).setText(gallery.getChineseName());
        ((TextView)findViewById(R.id.text_galleryEnglishName)).setText(gallery.getEnglishName());
        ((TextView)findViewById(R.id.text_city)).setText(gallery.getLocation());
        ((TextView)findViewById(R.id.text_address)).setText(gallery.getLocation());
        ((TextView)findViewById(R.id.text_contact)).setText(gallery.getDirector());
        ((TextView)findViewById(R.id.text_Artist)).setText(gallery.getArtists());
    }
}
