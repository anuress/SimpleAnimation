package com.code.vannia.simpleanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.iv_picture);
        TextView tvName = findViewById(R.id.tv_name);
        TextView tvEmail = findViewById(R.id.tv_email);

        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim);
        Animation childAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.child_anim);

        imageView.startAnimation(animation);
        tvName.startAnimation(childAnimation);
        tvEmail.startAnimation(childAnimation);
    }
}
