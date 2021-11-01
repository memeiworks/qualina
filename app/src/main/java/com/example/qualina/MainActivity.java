package com.example.qualina;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img_logo;
    ConstraintLayout mainLayout;
    MediaPlayer soundbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_logo = findViewById(R.id.img_logo);
        mainLayout = findViewById(R.id.mainLayout);

        soundbg = MediaPlayer.create(MainActivity.this,R.raw.maxkomusic);
        soundbg.start();

        CountDownTimer timer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //Nothing
            }

            @Override
            public void onFinish() {
                soundbg.release();
            }
        };
        timer.start();

        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toGameIntro = new Intent(MainActivity.this, AboutGame.class);
                startActivity(toGameIntro);
            }
        });

    }
}