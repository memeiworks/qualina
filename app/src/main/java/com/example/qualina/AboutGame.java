package com.example.qualina;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutGame extends AppCompatActivity {

    TextView txtgameintro, txtdetails;
    ConstraintLayout CLgameintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_game);
        txtgameintro = findViewById(R.id.txtgameintro);
        txtdetails = findViewById(R.id.details);
        CLgameintro = findViewById(R.id.CLgameintro);

        CLgameintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toExerciseIntro = new Intent(AboutGame.this, ExerciseIntro.class);
                startActivity(toExerciseIntro);
            }
        });
    }
}