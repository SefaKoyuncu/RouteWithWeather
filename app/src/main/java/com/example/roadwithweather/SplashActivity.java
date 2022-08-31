package com.example.roadwithweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.example.roadwithweather.databinding.ActivitySplashBinding;
import com.example.roadwithweather.databinding.ActivityTimelineBinding;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Handler h=new Handler();
        h.postDelayed(new Runnable()
                      {
                          @Override public void run(){
                              Log.e("girdi","girdi");
                              binding.lottieAcilis.pauseAnimation();
                              Intent intent=new Intent(SplashActivity.this,MapsActivity.class);
                              intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                              startActivity(intent);
                              finish();
                          }
                      }
                ,1100);

        View decorView=getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        |View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        |View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}