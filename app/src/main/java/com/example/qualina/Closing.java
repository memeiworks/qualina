package com.example.qualina;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Closing extends AppCompatActivity {

    ConstraintLayout clcredits;
    ImageView img3;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closing);

        this.preferences = getSharedPreferences("ScoreCation", 0);
        SharedPreferences.Editor editor = this.preferences.edit();
        editor.clear().apply();

        clcredits = findViewById(R.id.clcredits);
        clcredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toGameIntro = new Intent(Closing.this, GameIntro.class);
                toGameIntro.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                toGameIntro.putExtra("Closing","Closing");
                startActivity(toGameIntro);
            }
        });
    }
}