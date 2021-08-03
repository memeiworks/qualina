package com.example.qualina;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Closing extends AppCompatActivity {

    ConstraintLayout clcredits;
    ImageView img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closing);

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