package com.example.qualina;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AnswerResult extends AppCompatActivity {

    Button btndefault;
    String cation1, cation2, cation3, cation_step, current_cation;
    int current_score;
    ImageView imgresult;
    TextView lblAnswer, lblResult;
    String player, result;
    int points_acquired;
    TextView txtplayer,txtscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_result);
        bindViews();
        this.player = getIntent().getStringExtra("Current Player");
        this.result = getIntent().getStringExtra("Result");
        this.current_score = getIntent().getIntExtra("Current Score", 0);
        this.cation1 = getIntent().getStringExtra("Cation 1");
        this.cation2 = getIntent().getStringExtra("Cation 2");
        this.cation3 = getIntent().getStringExtra("Cation 3");
        this.current_cation = getIntent().getStringExtra("Current Cation");
        this.cation_step = getIntent().getStringExtra("Cation Step");
        this.points_acquired = getIntent().getIntExtra("Score", 0);
        this.txtplayer.setText(this.player);
        TextView textView = this.txtscore;
        textView.setText("SCORE: " + this.current_score + "/15");
        if (this.result.equals("Incorrect")) {
            if (this.cation_step.equals("First")) {
                getHTMLCation(this.current_cation);
                this.lblAnswer.setText("You were unable to catch your cation.");
                this.imgresult.setImageResource(R.drawable.wrong_guess);
                this.btndefault.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent toPostlab = new Intent(AnswerResult.this, PostlabResult.class);
                        toPostlab.putExtra("Current Player", AnswerResult.this.player);
                        toPostlab.putExtra("Cation 1", AnswerResult.this.cation1);
                        toPostlab.putExtra("Cation 2", AnswerResult.this.cation2);
                        toPostlab.putExtra("Cation 3", AnswerResult.this.cation3);
                        toPostlab.putExtra("Current Score", AnswerResult.this.current_score);
                        toPostlab.putExtra("Current Cation", AnswerResult.this.current_cation);
                        toPostlab.putExtra("Cation Step", AnswerResult.this.cation_step);
                        AnswerResult.this.startActivity(toPostlab);
                    }
                });
            } else if (this.cation_step.equals("Second")) {
                getHTMLCation(this.current_cation);
                this.lblAnswer.setText("You were unable to catch your cation.");
                this.imgresult.setImageResource(R.drawable.wrong_guess);
                this.btndefault.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent toPostlab = new Intent(AnswerResult.this, PostlabResult.class);
                        toPostlab.putExtra("Current Player", AnswerResult.this.player);
                        toPostlab.putExtra("Cation 1", AnswerResult.this.cation1);
                        toPostlab.putExtra("Cation 2", AnswerResult.this.cation2);
                        toPostlab.putExtra("Cation 3", AnswerResult.this.cation3);
                        toPostlab.putExtra("Current Score", AnswerResult.this.current_score);
                        toPostlab.putExtra("Current Cation", AnswerResult.this.current_cation);
                        toPostlab.putExtra("Cation Step", AnswerResult.this.cation_step);
                        AnswerResult.this.startActivity(toPostlab);
                    }
                });
            } else if (!this.cation_step.equals("Third")) {
                Toast.makeText(this, "Something went wrong. Please try again.", Toast.LENGTH_SHORT).show();
            } else if (this.current_score == 0) {
                getHTMLCation(this.current_cation);
                this.lblAnswer.setText("You were unable to catch ALL of your cations.");
                this.imgresult.setImageResource(R.drawable.all_wrong_guess);
                this.btndefault.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent toPostlab = new Intent(AnswerResult.this, PostlabResult.class);
                        toPostlab.putExtra("Current Player", AnswerResult.this.player);
                        toPostlab.putExtra("Cation 1", AnswerResult.this.cation1);
                        toPostlab.putExtra("Cation 2", AnswerResult.this.cation2);
                        toPostlab.putExtra("Cation 3", AnswerResult.this.cation3);
                        toPostlab.putExtra("Current Score", AnswerResult.this.current_score);
                        toPostlab.putExtra("Current Cation", AnswerResult.this.current_cation);
                        toPostlab.putExtra("Cation Step", AnswerResult.this.cation_step);
                        AnswerResult.this.startActivity(toPostlab);
                    }
                });
            } else {
                getHTMLCation(this.current_cation);
                this.lblAnswer.setText("You were unable to catch your cation.");
                this.imgresult.setImageResource(R.drawable.wrong_guess);
                this.btndefault.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent toPostlab = new Intent(AnswerResult.this, PostlabResult.class);
                        toPostlab.putExtra("Current Player", AnswerResult.this.player);
                        toPostlab.putExtra("Cation 1", AnswerResult.this.cation1);
                        toPostlab.putExtra("Cation 2", AnswerResult.this.cation2);
                        toPostlab.putExtra("Cation 3", AnswerResult.this.cation3);
                        toPostlab.putExtra("Current Score", AnswerResult.this.current_score);
                        toPostlab.putExtra("Current Cation", AnswerResult.this.current_cation);
                        toPostlab.putExtra("Cation Step", AnswerResult.this.cation_step);
                        AnswerResult.this.startActivity(toPostlab);
                    }
                });
            }
        } else if (this.result.equals("Correct")) {
            int i = this.points_acquired;
            if (i == 1) {
                this.lblAnswer.setText("You have been rewarded 1 point!");
            } else if (i == 3) {
                this.lblAnswer.setText("You have been rewarded 3 points!");
            } else if (i == 5) {
                this.lblAnswer.setText("You have been rewarded 5 points!");
            } else {
                this.lblAnswer.setText("You have been rewarded 0 point!");
            }
            this.imgresult.setImageResource(R.drawable.correct_guess);
            getHTMLCation(this.current_cation);
            this.btndefault.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent toPostlab = new Intent(AnswerResult.this, PostlabResult.class);
                    toPostlab.putExtra("Current Player", AnswerResult.this.player);
                    toPostlab.putExtra("Cation 1", AnswerResult.this.cation1);
                    toPostlab.putExtra("Cation 2", AnswerResult.this.cation2);
                    toPostlab.putExtra("Cation 3", AnswerResult.this.cation3);
                    toPostlab.putExtra("Current Score", AnswerResult.this.current_score);
                    toPostlab.putExtra("Current Cation", AnswerResult.this.current_cation);
                    toPostlab.putExtra("Cation Step", AnswerResult.this.cation_step);
                    AnswerResult.this.startActivity(toPostlab);
                }
            });
        } else {
            Toast.makeText(this, "Something went wrong.", Toast.LENGTH_SHORT).show();
            this.btndefault.setText(R.string.try_again);
            this.btndefault.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AnswerResult.this.startActivity(new Intent(AnswerResult.this, UnknownSampleCode.class));
                }
            });
        }
    }

    public void getHTMLCation(String index) {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        if (index.equals("wA") || index.contentEquals(Html.fromHtml("Ag<small><sup>+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Ag<small><sup>+</sup></small>", 0));
        } else if (index.equals("yB") || index.contentEquals(Html.fromHtml("Pb<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Pb<small><sup>2+</sup></small>", 0));
        } else if (index.equals("bC") || index.contentEquals(Html.fromHtml("Hg<small><sub>2</sub><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Hg<small><sub>2</sub><sup>2+</sup></small>", 0));
        } else if (index.equals("cD") || index.contentEquals(Html.fromHtml("Cr<small><sup>3+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Cr<small><sup>3+</sup></small>", 0));
        } else if (index.equals("pE") || index.contentEquals(Html.fromHtml("Mn<small><sup>4+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Mn<small><sup>4+</sup></small>", 0));
        } else if (index.equals("rF") || index.contentEquals(Html.fromHtml("Fe<small><sup>3+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Fe<small><sup>3+</sup></small>", 0));
        } else if (index.equals("bG") || index.contentEquals(Html.fromHtml("Bi<small><sup>3+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Bi<small><sup>3+</sup></small>", 0));
        } else if (index.equals("yH") || index.contentEquals(Html.fromHtml("Ba<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Ba<small><sup>2+</sup></small>", 0));
        } else if (index.equals("yI") || index.contentEquals(Html.fromHtml("Co<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Co<small><sup>2+</sup></small>", 0));
        } else if (index.equals("wJ") || index.contentEquals(Html.fromHtml("Ca<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Ca<small><sup>2+</sup></small>", 0));
        } else if (index.equals("wK") || index.contentEquals(Html.fromHtml("Sr<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Sr<small><sup>2+</sup></small>", 0));
        } else if (index.equals("wL") || index.contentEquals(Html.fromHtml("Mg<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Mg<small><sup>2+</sup></small>", 0));
        } else if (index.equals("cM") || index.contentEquals(Html.fromHtml("Ni<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Ni<small><sup>2+</sup></small>", 0));
        } else if (index.equals("mN") || index.contentEquals(Html.fromHtml("Cu<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Cu<small><sup>2+</sup></small>", 0));
        } else if (index.equals("wO") || index.equals("yP") || index.contentEquals(Html.fromHtml("Cd<small><sup>2+</sup></small>", 0))) {
            if (index.equals("wO")) {
                this.lblResult.setText(Html.fromHtml("Your cation was Cd<small><sup>2+</sup></small>", 0));
            } else {
                this.lblResult.setText(Html.fromHtml("Your cation was Cd<small><sup>2+</sup></small>", 0));
            }
        } else if (index.equals("wQ") || index.contentEquals(Html.fromHtml("Zn<small><sup>2+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Zn<small><sup>2+</sup></small>", 0));
        } else if (index.equals("vR") || index.contentEquals(Html.fromHtml("K<small><sup>+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was K<small><sup>+</sup></small>", 0));
        } else if (index.equals("yS") || index.contentEquals(Html.fromHtml("Na<small><sup>+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was Na<small><sup>+</sup></small>", 0));
        } else if (index.equals("bT") || index.contentEquals(Html.fromHtml("NH<small><sub>4</sub><sup>+</sup></small>", 0))) {
            this.lblResult.setText(Html.fromHtml("Your cation was NH<small><sub>4</sub><sup>+</sup></small>", 0));
        } else {
            Toast.makeText(this, "Please Try Again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void bindViews() {
        this.txtplayer = (TextView) findViewById(R.id.tb_player);
        this.txtscore = (TextView) findViewById(R.id.tb_score);
        this.lblAnswer = (TextView) findViewById(R.id.lblanswer);
        this.lblResult = (TextView) findViewById(R.id.lblresult);
        this.imgresult = (ImageView) findViewById(R.id.imgresult);
        this.btndefault = (Button) findViewById(R.id.btndefault);
    }

    public void onBackPressed() {
        Toast.makeText(this, "OOPS! No cheating!", Toast.LENGTH_SHORT).show();
    }
}