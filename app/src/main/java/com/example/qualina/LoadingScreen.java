package com.example.qualina;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LoadingScreen extends AppCompatActivity {

    ImageView centri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);
        this.centri = (ImageView) findViewById(R.id.gifcentri);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                new Intent(LoadingScreen.this, Decision.class);
                LoadingScreen.this.finish();
            }
        }, 3000);
    }
}