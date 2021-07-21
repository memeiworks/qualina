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

public class PostlabResult extends AppCompatActivity {

    Button btnNext;
    String cation1,cation2,cation3,cation_step,current_cation;
    int current_score;
    ImageView imgpostlab;
    String player;
    TextView txtcationans,txtplayer,txtscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postlab_result);
        bindViews();
        this.player = getIntent().getStringExtra("Current Player");
        this.current_score = getIntent().getIntExtra("Current Score", 0);
        this.cation1 = getIntent().getStringExtra("Cation 1");
        this.cation2 = getIntent().getStringExtra("Cation 2");
        this.cation3 = getIntent().getStringExtra("Cation 3");
        this.current_cation = getIntent().getStringExtra("Current Cation");
        this.cation_step = getIntent().getStringExtra("Cation Step");
        this.txtplayer.setText(this.player);
        TextView textView = this.txtscore;
        textView.setText("SCORE: " + current_score + "/15");
        getHTMLCation(this.current_cation);
        if (this.cation_step.equals("First")) {
            this.btnNext.setText("Proceed to next cation");
        } else if (this.cation_step.equals("Second")) {
            this.btnNext.setText("Proceed to next cation");
        } else {
            this.btnNext.setText("Summary");
        }
        this.btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (PostlabResult.this.cation_step.equals("First")) {
                    Intent toDecision = new Intent(PostlabResult.this, Decision.class);
                    toDecision.putExtra("Cation Step", "Second");
                    toDecision.putExtra("Current Player", PostlabResult.this.player);
                    toDecision.putExtra("Cation 1", PostlabResult.this.cation1);
                    toDecision.putExtra("Cation 2", PostlabResult.this.cation2);
                    toDecision.putExtra("Cation 3", PostlabResult.this.cation3);
                    toDecision.putExtra("Current Score", PostlabResult.this.current_score);
                    toDecision.putExtra("Current Cation", PostlabResult.this.current_cation);
                    PostlabResult.this.startActivity(toDecision);
                } else if (PostlabResult.this.cation_step.equals("Second")) {
                    Intent toDecision2 = new Intent(PostlabResult.this, Decision.class);
                    toDecision2.putExtra("Cation Step", "Third");
                    toDecision2.putExtra("Current Player", PostlabResult.this.player);
                    toDecision2.putExtra("Cation 1", PostlabResult.this.cation1);
                    toDecision2.putExtra("Cation 2", PostlabResult.this.cation2);
                    toDecision2.putExtra("Cation 3", PostlabResult.this.cation3);
                    toDecision2.putExtra("Current Score", PostlabResult.this.current_score);
                    toDecision2.putExtra("Current Cation", PostlabResult.this.current_cation);
                    PostlabResult.this.startActivity(toDecision2);
                } else {
                    Intent toRewards = new Intent(PostlabResult.this, Summary.class);
                    toRewards.putExtra("Current Player", PostlabResult.this.player);
                    toRewards.putExtra("Cation 1", PostlabResult.this.cation1);
                    toRewards.putExtra("Cation 2", PostlabResult.this.cation2);
                    toRewards.putExtra("Cation 3", PostlabResult.this.cation3);
                    toRewards.putExtra("Current Score", PostlabResult.this.current_score);
                    toRewards.putExtra("Current Cation", PostlabResult.this.current_cation);
                    PostlabResult.this.startActivity(toRewards);
                }
            }
        });
    }

    public void bindViews() {
        this.btnNext = (Button) findViewById(R.id.btnNext);
        this.txtplayer = (TextView) findViewById(R.id.tb_player);
        this.txtscore = (TextView) findViewById(R.id.tb_score);
        this.imgpostlab = (ImageView) findViewById(R.id.imgpostlab);
        this.txtcationans = (TextView) findViewById(R.id.txtcationans);
    }

    public void getHTMLCation(String index) {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        if (index.equals("wA") || index.contentEquals(Html.fromHtml("Ag<small><sup>+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Ag<small><sup>+</sup></small>", 0));
        } else if (index.equals("yB") || index.contentEquals(Html.fromHtml("Pb<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Pb<small><sup>2+</sup></small>", 0));
        } else if (index.equals("bC") || index.contentEquals(Html.fromHtml("Hg<small><sub>2</sub><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Hg<small><sub>2</sub><sup>2+</sup></small>", 0));
        } else if (index.equals("cD") || index.contentEquals(Html.fromHtml("Cr<small><sup>3+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Cr<small><sup>3+</sup></small>", 0));
        } else if (index.equals("pE") || index.contentEquals(Html.fromHtml("Mn<small><sup>4+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Mn<small><sup>4+</sup></small>", 0));
        } else if (index.equals("rF") || index.contentEquals(Html.fromHtml("Fe<small><sup>3+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Fe<small><sup>3+</sup></small>", 0));
        } else if (index.equals("bG") || index.contentEquals(Html.fromHtml("Bi<small><sup>3+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Bi<small><sup>3+</sup></small>", 0));
        } else if (index.equals("yH") || index.contentEquals(Html.fromHtml("Ba<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Ba<small><sup>2+</sup></small>", 0));
        } else if (index.equals("yI") || index.contentEquals(Html.fromHtml("Co<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Co<small><sup>2+</sup></small>", 0));
        } else if (index.equals("wJ") || index.contentEquals(Html.fromHtml("Ca<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Ca<small><sup>2+</sup></small>", 0));
        } else if (index.equals("wK") || index.contentEquals(Html.fromHtml("Sr<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Sr<small><sup>2+</sup></small>", 0));
        } else if (index.equals("wL") || index.contentEquals(Html.fromHtml("Mg<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Mg<small><sup>2+</sup></small>", 0));
        } else if (index.equals("cM") || index.contentEquals(Html.fromHtml("Ni<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Ni<small><sup>2+</sup></small>", 0));
        } else if (index.equals("mN") || index.contentEquals(Html.fromHtml("Cu<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Cu<small><sup>2+</sup></small>", 0));
        } else if (index.equals("wO") || index.equals("yP") || index.contentEquals(Html.fromHtml("Cd<small><sup>2+</sup></small>", 0))) {
            if (index.equals("wO")) {
                this.txtcationans.setText(Html.fromHtml("Your cation was Cd<small><sup>2+</sup></small>", 0));
            } else {
                this.txtcationans.setText(Html.fromHtml("Your cation was Cd<small><sup>2+</sup></small>", 0));
            }
        } else if (index.equals("wQ") || index.contentEquals(Html.fromHtml("Zn<small><sup>2+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Zn<small><sup>2+</sup></small>", 0));
        } else if (index.equals("vR") || index.contentEquals(Html.fromHtml("K<small><sup>+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was K<small><sup>+</sup></small>", 0));
        } else if (index.equals("yS") || index.contentEquals(Html.fromHtml("Na<small><sup>+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was Na<small><sup>+</sup></small>", 0));
        } else if (index.equals("bT") || index.contentEquals(Html.fromHtml("NH<small><sub>4</sub><sup>+</sup></small>", 0))) {
            this.txtcationans.setText(Html.fromHtml("Your cation was NH<small><sub>4</sub><sup>+</sup></small>", 0));
        } else {
            Toast.makeText(this, "Please Try Again!", Toast.LENGTH_SHORT).show();
        }
    }
}