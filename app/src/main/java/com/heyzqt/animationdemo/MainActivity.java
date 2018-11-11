package com.heyzqt.animationdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.heyzqt.animationdemo.tween.TweenAnimationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;

    private Button mTweenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        initContentView();
    }

    private void initContentView() {
        mTweenButton = findViewById(R.id.tween_button);
        mTweenButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tween_button:
                startActivity(new Intent(context, TweenAnimationActivity.class));
                break;
        }
    }
}
