package com.stubborn.imageopacityanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        final ConstraintLayout iv = (ConstraintLayout) findViewById(R.id.listViewIcon);

        AlphaAnimation animation1 = new AlphaAnimation(0.1f, 0.9f);
        animation1.setDuration(3000);
        animation1.setStartOffset(3000);
        animation1.setFillAfter(true);
        iv.startAnimation(animation1);
    }
}
