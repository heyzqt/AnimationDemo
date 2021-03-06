package com.heyzqt.animationdemo.tween;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.heyzqt.animationdemo.R;

/**
 * Created by heyzqt on 2018/11/11.
 */

public class TweenAnimationActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;

    private ImageView mLauncherView;
    private Button mAlphaButton;
    private Button mTranslateButton;
    private Button mScaleButton;
    private Button mRotateButton;
    private Button mAnimationSetButton;
    private Button mXMLAnimationButton;

    private AlphaAnimation mAlphaAnimation;
    private TranslateAnimation mTranslateAnimation;
    private ScaleAnimation mScaleAnimation;
    private RotateAnimation mRotateAnimation;
    private AnimationSet mAnimationSet;
    private Animation mXMLAnimation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        context = this;
        initContentView();
        initBasicAnim();
        initAnimationSet();
        initXMLAnimation();
    }

    private void initContentView() {
        mLauncherView = findViewById(R.id.launcher_image);
        mAlphaButton = findViewById(R.id.alpha_button);
        mTranslateButton = findViewById(R.id.translate_button);
        mScaleButton = findViewById(R.id.scale_button);
        mRotateButton = findViewById(R.id.rotate_button);
        mAnimationSetButton = findViewById(R.id.animationset_button);
        mXMLAnimationButton = findViewById(R.id.xmlanim_button);

        mAlphaButton.setOnClickListener(this);
        mTranslateButton.setOnClickListener(this);
        mScaleButton.setOnClickListener(this);
        mRotateButton.setOnClickListener(this);
        mAnimationSetButton.setOnClickListener(this);
        mXMLAnimationButton.setOnClickListener(this);
    }

    private void initBasicAnim() {
        mAlphaAnimation = new AlphaAnimation(0, 1);
        mAlphaAnimation.setRepeatMode(Animation.RESTART);
        mAlphaAnimation.setRepeatCount(Animation.INFINITE);
        mAlphaAnimation.setDuration(1000);

        mTranslateAnimation = new TranslateAnimation(0, 200, 0, 200);
        mTranslateAnimation.setRepeatMode(Animation.REVERSE);
        mTranslateAnimation.setRepeatCount(Animation.INFINITE);
        mTranslateAnimation.setDuration(2000);

        mScaleAnimation = new ScaleAnimation(0, 2, 0, 2);
        mScaleAnimation.setRepeatMode(Animation.REVERSE);
        mScaleAnimation.setRepeatCount(Animation.INFINITE);
        mScaleAnimation.setDuration(2000);

        mRotateAnimation = new RotateAnimation(0, 360);
        mRotateAnimation.setRepeatMode(Animation.REVERSE);
        mRotateAnimation.setRepeatCount(Animation.INFINITE);
        mRotateAnimation.setDuration(2000);
    }

    private void initAnimationSet() {
        mAnimationSet = new AnimationSet(true);
        mAnimationSet.addAnimation(mAlphaAnimation);
        mAnimationSet.addAnimation(mTranslateAnimation);
        mAnimationSet.addAnimation(mScaleAnimation);
        mAnimationSet.addAnimation(mRotateAnimation);
    }

    private void initXMLAnimation() {
        mXMLAnimation = AnimationUtils.loadAnimation(context, R.anim.view_animation);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.alpha_button:
                mLauncherView.startAnimation(mAlphaAnimation);
                break;
            case R.id.translate_button:
                mLauncherView.startAnimation(mTranslateAnimation);
                break;
            case R.id.scale_button:
                mLauncherView.startAnimation(mScaleAnimation);
                break;
            case R.id.rotate_button:
                mLauncherView.startAnimation(mRotateAnimation);
                break;
            case R.id.animationset_button:
                mLauncherView.startAnimation(mAnimationSet);
                break;
            case R.id.xmlanim_button:
                mLauncherView.startAnimation(mXMLAnimation);
                break;
        }
    }
}
