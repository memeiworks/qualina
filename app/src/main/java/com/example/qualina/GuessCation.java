package com.example.qualina;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class GuessCation extends AppCompatActivity {

    String answer;
    int attempts = 3;
    Button btnSubmit;
    String cation1, cation2, cation3, cation_step, current_cation;
    int current_score;
    Spinner ddcations;
    String extra, player, result;
    int points_acquired;
    SharedPreferences preferences;
    int totalScore;
    TextView txtattempts, txtplayer, txtscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_cation);

        this.ddcations = (Spinner) findViewById(R.id.ddCations);
        this.txtattempts = (TextView) findViewById(R.id.txtattempts);
        this.btnSubmit = (Button) findViewById(R.id.btnSubmit);
        this.txtplayer = (TextView) findViewById(R.id.tb_player);
        this.txtscore = (TextView) findViewById(R.id.tb_score);
        this.extra = getIntent().getStringExtra("Result");
        this.player = getIntent().getStringExtra("Current Player");
        this.current_score = getIntent().getIntExtra("Current Score", 0);
        this.cation1 = getIntent().getStringExtra("Cation 1");
        this.cation2 = getIntent().getStringExtra("Cation 2");
        this.cation3 = getIntent().getStringExtra("Cation 3");
        this.current_cation = getIntent().getStringExtra("Current Cation");
        this.cation_step = getIntent().getStringExtra("Cation Step");
        this.result = getIntent().getStringExtra("Color Result");
        this.txtplayer.setText(this.player);
        this.preferences = getSharedPreferences("ScoreCation", 0);
        TextView textView = this.txtscore;
        textView.setText("SCORE: " + current_score + "/15");

        this.ddcations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                GuessCation.this.answer = parent.getItemAtPosition(position).toString();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                GuessCation guessCation = GuessCation.this;
                guessCation.getCorrectAnswer(guessCation.answer, GuessCation.this.current_cation);
            }
        });
    }

    public void getCorrectAnswer(String index, String extra2) {
        String str = "Current Cation";
        String str2 = "Cation 3";
        String str3 = "Cation 2";
        String str4 = "Cation 1";
        String str5 = "Current Player";
        if (index.equals(extra2)) {
            String str6 = "Score";
            this.txtattempts.setText(R.string.you_got_correct_answer);
            int i = this.attempts;
            if (i == 3) {
                this.attempts = 3;
                Intent toAnswerRes = new Intent(this, AnswerResult.class);
                if (this.cation_step.equals("First")) {
                    this.points_acquired = 5;
                    SharedPreferences.Editor editor = this.preferences.edit();
                    editor.putString("result 1", this.result);
                    editor.putString("cation 1", this.current_cation);
                    editor.putInt("score 1", this.points_acquired);
                    editor.apply();
                    toAnswerRes.putExtra("Current Score", this.points_acquired);
                } else if (this.cation_step.equals("Second")) {
                    this.points_acquired = 5;
                    SharedPreferences.Editor editor2 = this.preferences.edit();
                    editor2.putString("result 2", this.result);
                    editor2.putString("cation 2", this.current_cation);
                    editor2.putInt("score 2", this.points_acquired);
                    editor2.apply();
                    int i2 = this.current_score + this.points_acquired;
                    this.totalScore = i2;
                    toAnswerRes.putExtra("Current Score", i2);
                } else {
                    this.points_acquired = 5;
                    SharedPreferences.Editor editor3 = this.preferences.edit();
                    editor3.putString("result 3", this.result);
                    editor3.putString("cation 3", this.current_cation);
                    editor3.putInt("score 3", this.points_acquired);
                    editor3.apply();
                    int i3 = this.current_score + this.points_acquired;
                    this.totalScore = i3;
                    toAnswerRes.putExtra("Current Score", i3);
                }
                toAnswerRes.putExtra("Result", "Correct");
                toAnswerRes.putExtra(str6, this.points_acquired);
                toAnswerRes.putExtra(str5, this.player);
                toAnswerRes.putExtra(str4, this.cation1);
                toAnswerRes.putExtra(str3, this.cation2);
                toAnswerRes.putExtra(str2, this.cation3);
                toAnswerRes.putExtra(str, this.current_cation);
                toAnswerRes.putExtra("Cation Step", this.cation_step);
                startActivity(toAnswerRes);
                return;
            }
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            String str10 = str4;
            String str11 = str5;
            String str12 = str6;
            if (i == 2) {
                Intent toAnswerRes2 = new Intent(this, AnswerResult.class);
                if (this.cation_step.equals("First")) {
                    this.points_acquired = 3;
                    SharedPreferences.Editor editor4 = this.preferences.edit();
                    editor4.putString("result 1", this.result);
                    editor4.putString("cation 1", this.current_cation);
                    editor4.putInt("score 1", this.points_acquired);
                    editor4.apply();
                    toAnswerRes2.putExtra("Current Score", this.points_acquired);
                } else if (this.cation_step.equals("Second")) {
                    this.points_acquired = 3;
                    SharedPreferences.Editor editor5 = this.preferences.edit();
                    editor5.putString("result 2", this.result);
                    editor5.putString("cation 2", this.current_cation);
                    editor5.putInt("score 2", this.points_acquired);
                    editor5.apply();
                    int i4 = this.current_score + this.points_acquired;
                    this.totalScore = i4;
                    toAnswerRes2.putExtra("Current Score", i4);
                } else {
                    this.points_acquired = 3;
                    SharedPreferences.Editor editor6 = this.preferences.edit();
                    editor6.putString("result 3", this.result);
                    editor6.putString("cation 3", this.current_cation);
                    editor6.putInt("score 3", this.points_acquired);
                    editor6.apply();
                    int i5 = this.current_score + this.points_acquired;
                    this.totalScore = i5;
                    toAnswerRes2.putExtra("Current Score", i5);
                }
                toAnswerRes2.putExtra("Result", "Correct");
                toAnswerRes2.putExtra(str12, this.points_acquired);
                toAnswerRes2.putExtra(str11, this.player);
                toAnswerRes2.putExtra(str10, this.cation1);
                toAnswerRes2.putExtra(str9, this.cation2);
                toAnswerRes2.putExtra(str8, this.cation3);
                toAnswerRes2.putExtra(str7, this.current_cation);
                toAnswerRes2.putExtra("Cation Step", this.cation_step);
                startActivity(toAnswerRes2);
                return;
            }
            String str13 = str7;
            String str14 = str8;
            String str15 = str9;
            String str16 = str10;
            String str17 = str11;
            String str18 = str12;
            if (i == 1) {
                Intent toAnswerRes3 = new Intent(this, AnswerResult.class);
                if (this.cation_step.equals("First")) {
                    this.points_acquired = 1;
                    SharedPreferences.Editor editor7 = this.preferences.edit();
                    editor7.putString("result 1", this.result);
                    editor7.putString("cation 1", this.current_cation);
                    editor7.putInt("score 1", this.points_acquired);
                    editor7.apply();
                    toAnswerRes3.putExtra("Current Score", this.points_acquired);
                } else if (this.cation_step.equals("Second")) {
                    this.points_acquired = 1;
                    SharedPreferences.Editor editor8 = this.preferences.edit();
                    editor8.putString("result 2", this.result);
                    editor8.putString("cation 2", this.current_cation);
                    editor8.putInt("score 2", this.points_acquired);
                    editor8.apply();
                    int i6 = this.current_score + this.points_acquired;
                    this.totalScore = i6;
                    toAnswerRes3.putExtra("Current Score", i6);
                } else {
                    this.points_acquired = 1;
                    SharedPreferences.Editor editor9 = this.preferences.edit();
                    editor9.putString("result 3", this.result);
                    editor9.putString("cation 3", this.current_cation);
                    editor9.putInt("score 3", this.points_acquired);
                    editor9.apply();
                    int i7 = this.current_score + this.points_acquired;
                    this.totalScore = i7;
                    toAnswerRes3.putExtra("Current Score", i7);
                }
                toAnswerRes3.putExtra("Result", "Correct");
                toAnswerRes3.putExtra(str18, this.points_acquired);
                toAnswerRes3.putExtra(str17, this.player);
                toAnswerRes3.putExtra(str16, this.cation1);
                toAnswerRes3.putExtra(str15, this.cation2);
                toAnswerRes3.putExtra(str14, this.cation3);
                toAnswerRes3.putExtra(str13, this.current_cation);
                toAnswerRes3.putExtra("Cation Step", this.cation_step);
                startActivity(toAnswerRes3);
                return;
            }
            Toast.makeText(this, "Something went wrong.", Toast.LENGTH_SHORT).show();
            return;
        }
        String str19 = "Score";
        if (index.equals("Select a Cation")) {
            Toast.makeText(this, "Please choose your answer from the dropdown.", Toast.LENGTH_SHORT).show();
            return;
        }
        this.attempts--;
        TextView textView = this.txtattempts;
        StringBuilder sb = new StringBuilder();
        String str20 = "Result";
        sb.append("Incorrect Answer! You only have ");
        sb.append(this.attempts);
        sb.append(" left!");
        textView.setText(sb.toString());
        if (this.attempts == 0) {
            this.txtattempts.setText("You have no remaining attempts!");
            Intent toAnswerRes4 = new Intent(this, AnswerResult.class);
            if (this.cation_step.equals("First")) {
                this.points_acquired = 0;
                SharedPreferences.Editor editor10 = this.preferences.edit();
                editor10.putString("result 1", this.result);
                editor10.putString("cation 1", this.current_cation);
                editor10.putInt("score 1", this.points_acquired);
                editor10.apply();
                toAnswerRes4.putExtra("Current Score", this.points_acquired);
            } else if (this.cation_step.equals("Second")) {
                this.points_acquired = 0;
                SharedPreferences.Editor editor11 = this.preferences.edit();
                editor11.putString("result 2", this.result);
                editor11.putString("cation 2", this.current_cation);
                editor11.putInt("score 2", this.points_acquired);
                editor11.apply();
                int i8 = this.current_score;
                this.totalScore = i8;
                toAnswerRes4.putExtra("Current Score", i8);
            } else {
                this.points_acquired = 0;
                SharedPreferences.Editor editor12 = this.preferences.edit();
                editor12.putString("result 3", this.result);
                editor12.putString("cation 3", this.current_cation);
                editor12.putInt("score 3", this.points_acquired);
                editor12.apply();
                int i9 = this.current_score;
                this.totalScore = i9;
                toAnswerRes4.putExtra("Current Score", i9);
            }
            toAnswerRes4.putExtra(str20, "Incorrect");
            toAnswerRes4.putExtra(str19, this.points_acquired);
            toAnswerRes4.putExtra(str5, this.player);
            toAnswerRes4.putExtra(str4, this.cation1);
            toAnswerRes4.putExtra(str3, this.cation2);
            toAnswerRes4.putExtra(str2, this.cation3);
            toAnswerRes4.putExtra("Cation Step", this.cation_step);
            toAnswerRes4.putExtra(str, this.current_cation);
            startActivity(toAnswerRes4);
        }
    }
}