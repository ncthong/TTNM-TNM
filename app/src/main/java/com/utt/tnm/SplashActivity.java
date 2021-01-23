package com.utt.tnm;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.utt.ttnm.R;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView imageView;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView = findViewById(R.id.imgLogo);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.looo);
        new android.os.Handler().postDelayed(
                new Runnable(){
                    public void run(){
                        Intent intent=new Intent(SplashActivity.this,HomeActivity.class);
                        startActivity(intent);
                        finish();
                    }
                },1500);
    }
}