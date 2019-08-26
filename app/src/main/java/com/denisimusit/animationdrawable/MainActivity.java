package com.denisimusit.animationdrawable;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private AnimationDrawable mAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_acctepted_anim_main);
        img = findViewById(R.id.accepted_imageView);

        img.setBackgroundResource(R.drawable.accepted_anim);

        mAnimationDrawable = (AnimationDrawable) img.getBackground();
        mAnimationDrawable.start();

    }
}
