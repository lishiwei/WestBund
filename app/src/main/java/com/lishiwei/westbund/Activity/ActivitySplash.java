package com.lishiwei.westbund.Activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.lishiwei.core.ImageLoad;
import com.lishiwei.westbund.R;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class ActivitySplash extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    private static final String TAG = ActivitySplash.class.getSimpleName();
    private final Handler mHideHandler = new Handler();
    @Bind(R.id.fullscreen_content)
    ImageView fullscreenContent;
    @Bind(R.id.fl_SplashActivity_Back)
    FrameLayout flSplashActivityBack;



    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        final AlphaAnimation displayAnimation = new AlphaAnimation(1.0f, 0.1f);
        displayAnimation.setDuration(2000);
        displayAnimation.setInterpolator(new LinearInterpolator());

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                fullscreenContent.startAnimation(displayAnimation);
//            }
//        }, 500);

        TranslateAnimation translateAnimation = new TranslateAnimation(0,-50,0,0);
        translateAnimation.setDuration(2000);
        flSplashActivityBack.startAnimation(translateAnimation);
        fullscreenContent.startAnimation(displayAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ActivitySplash.this, MainActivity.class));        // Schedule a runnable to remove the status and navigation bar after a delay
            }
        },2000);

//        displayAnimation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//                Log.d(TAG, "onAnimationStart: ");
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                Log.d(TAG, "onAnimationEnd: ");
//
//                //白色消失
//                AlphaAnimation whiteDismissnimation = new AlphaAnimation(1.0f, 0.1f);
//                whiteDismissnimation.setDuration(3000);
//                whiteDismissnimation.setInterpolator(new BounceInterpolator());
//                ivActivitySplashWhiteBack.startAnimation(whiteDismissnimation);
//
//                //放大动画一直存在
//                ScaleAnimation scaleAnimation = new ScaleAnimation(1, 1.2f, 1, 1.2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//                scaleAnimation.setDuration(3000);
//
//                flSplashActivityBack.setAnimation(scaleAnimation);
////
////                final AnimationSet animationSet = new AnimationSet(true);
////                animationSet.addAnimation(scaleAnimation);
//
//
//
//
//                //白色出现
//                final AlphaAnimation whiteDisplayAnimationEnd = new AlphaAnimation(0.1f, 1.0f);
//                whiteDisplayAnimationEnd.setDuration(1000);
//                whiteDisplayAnimationEnd.setStartOffset(2000);
//                ivActivitySplashWhiteBack.setAnimation(whiteDisplayAnimationEnd);
////logo消失
//                AlphaAnimation ContentDismissnimationEnd = new AlphaAnimation(1.0f, 0.1f);
//                fullscreenContent.setAnimation(ContentDismissnimationEnd);
//                ContentDismissnimationEnd.setStartOffset(1000);
//                ContentDismissnimationEnd.setDuration(2000);
//
//
//                scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
//                    @Override
//                    public void onAnimationStart(Animation animation) {
//                        Log.d(TAG, "onAnimationStart: animationSet");
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animation animation) {
//                        Log.d(TAG, "onAnimationEnd:animationSet ");
//
//                        mHideHandler.post(new Runnable() {
//                            @Override
//                            public void run() {
//                                startActivity(new Intent(ActivitySplash.this, MainActivity.class));        // Schedule a runnable to remove the status and navigation bar after a delay
//                                finish();
//                            }
//                        });
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animation animation) {
//
//                    }
//                });
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });

    }


}
