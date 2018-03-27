package com.example.kr_pc.animationapplication;

import android.graphics.drawable.Animatable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImage = findViewById(R.id.my_image);
    }

    public void fadeInAnimation(View view) {
        myImage.setVisibility(View.VISIBLE);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        myImage.startAnimation(animation);
    }

    public void fadeOutAnimation(View view) throws InterruptedException {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        myImage.startAnimation(animation);
    }

    public void zoomInAnimation(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        myImage.startAnimation(animation);
    }

    public void zoomOutAnimation(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        myImage.startAnimation(animation);
    }

    public void leftToRight(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_left_to_right);
        myImage.startAnimation(animation);
    }

    public void RightToLeft(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_right_to_left);
        myImage.startAnimation(animation);
    }
}