package com.example.trial;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trial.Dashboard;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
    int SplashSreenDuration=3000;
        // Delay for 3 seconds
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(SplashScreen.this, Dashboard.class);
        startActivity(intent);
        finish();
        }
    },SplashSreenDuration);


    }
}