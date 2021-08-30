package com.example.qualina;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class UnknownSampleCode extends AppCompatActivity {

    Button btnproceed;
    final String[] cations = {"wA", "yB", "bC", "cD", "pE", "rF", "bG", "yH", "yI", "wJ", "wK", "wL", "cM", "mN", "wO", "yP", "wQ", "vR", "yS", "bT"};
    TextView code1;
    TextView code2;
    TextView code3;
    TextView player_name;
    TextView score;
    ConstraintLayout clCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unknown_sample_code);
        bindViews();
        generateRandomCations();
        final String player = getIntent().getStringExtra("Current Player");
        player_name.setText(player);
        btnproceed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toDecisionPage = new Intent(UnknownSampleCode.this, Decision.class);
                toDecisionPage.putExtra("Current Player", player);
                toDecisionPage.putExtra("Cation 1", UnknownSampleCode.this.code1.getText().toString());
                toDecisionPage.putExtra("Cation 2", UnknownSampleCode.this.code2.getText().toString());
                toDecisionPage.putExtra("Cation 3", UnknownSampleCode.this.code3.getText().toString());
                toDecisionPage.putExtra("Current Score", 0);
                toDecisionPage.putExtra("Cation Step", "First");
                UnknownSampleCode.this.startActivity(toDecisionPage);
            }
        });
    }

    public void generateRandomCations() {
        Collections.shuffle(Arrays.asList(this.cations));
        this.code1.setText(this.cations[0]);
        this.code2.setText(this.cations[1]);
        this.code3.setText(this.cations[2]);
    }

    public void bindViews() {
        btnproceed = findViewById(R.id.btnproceed);
        code1 = findViewById(R.id.txtCation1);
        code2 = findViewById(R.id.txtCation2);
        code3 = findViewById(R.id.txtCation3);
        player_name = findViewById(R.id.tb_player);
        score = findViewById(R.id.tb_score);
        clCode = findViewById(R.id.clCode);
    }
}