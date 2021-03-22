package com.example.project_individu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash_Screen extends AppCompatActivity {
    private static int splashInterval = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash__screen);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(Splash_Screen.this, Home.class);
                startActivity(i);
                this.finish();
            }
            private void finish() {
                // TODO Auto-generated method stub
            }
        }, splashInterval);
    };
}

