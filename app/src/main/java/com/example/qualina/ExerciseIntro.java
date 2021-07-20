package com.example.qualina;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ExerciseIntro extends AppCompatActivity {

    TextView txtintro, txtdetails;
    ConstraintLayout clexerciseintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_intro);
        txtintro = findViewById(R.id.txtexintro);
        txtdetails = findViewById(R.id.details);
        clexerciseintro = findViewById(R.id.clexerciseintro);

        clexerciseintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toNameInput = new Intent(ExerciseIntro.this, GameIntro.class);
                startActivity(toNameInput);
            }
        });
    }
}