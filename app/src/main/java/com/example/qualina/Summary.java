package com.example.qualina;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Summary extends AppCompatActivity {

    Button btnplayagain;
    String cation1, cation2, cation3,cation_code,cation_step,current_cation;
    int current_score, gotScore1, gotScore2, gotScore3;
    String player, result1, result2, result3;
    TextView txtcat1, txtcat2,txtcat3, txtres1, txtres2, txtres3, txtscore1, txtscore2, txtscore3, txttotalscore, gotcations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        this.btnplayagain = (Button) findViewById(R.id.btnplayagain);
        this.txttotalscore = (TextView) findViewById(R.id.txttotalscore);
        this.txtcat1 = (TextView) findViewById(R.id.gotcat1);
        this.txtcat2 = (TextView) findViewById(R.id.gotcat2);
        this.txtcat3 = (TextView) findViewById(R.id.gotcat3);
        this.player = getIntent().getStringExtra("Current Player");
        this.current_score = getIntent().getIntExtra("Current Score", 0);
        this.cation1 = getIntent().getStringExtra("Cation 1");
        this.cation2 = getIntent().getStringExtra("Cation 2");
        this.cation3 = getIntent().getStringExtra("Cation 3");
        this.current_cation = getIntent().getStringExtra("Current Cation");
        this.cation_step = getIntent().getStringExtra("Cation Step");
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("ScoreCation", 0);
        String gotCation1 = preferences.getString("cation 1", "");
        String gotCation2 = preferences.getString("cation 2", "");
        String gotCation3 = preferences.getString("cation 3", "");
        this.gotScore1 = preferences.getInt("score 1", 0);
        this.gotScore2 = preferences.getInt("score 2", 0);
        this.gotScore3 = preferences.getInt("score 3", 0);
        this.result1 = preferences.getString("result 1", "");
        this.result2 = preferences.getString("result 2", "");
        this.result3 = preferences.getString("result 3", "");
        this.cation_code = this.cation1 + this.cation2 + this.cation3;
        TextView textView = this.txttotalscore;
        textView.setText("YOUR TOTAL SCORE: " + this.current_score + "/15");
        Log.e("RES CAT1", gotCation1);
        getCationIndex1(gotCation1, this.gotScore1);
        getCationIndex2(gotCation2, this.gotScore2);
        getCationIndex3(gotCation3, this.gotScore3);

        this.btnplayagain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Summary.this.startActivity(new Intent(Summary.this, Closing.class));
            }
        });
    }

    public void getCationIndex1(String index, int gotScore12) {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        if (index.equals("Ag+")) {
            if (gotScore12 == 0) {
                TextView textView = this.txtcat1;
                textView.setText(Html.fromHtml("You were not able to confirm Ag<small><sup>+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore12 == 3) {
                TextView textView2 = this.txtcat1;
                textView2.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore12 == 5) {
                TextView textView3 = this.txtcat1;
                textView3.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView4 = this.txtcat1;
                textView4.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Pb2+")) {
            if (gotScore12 == 0) {
                TextView textView5 = this.txtcat1;
                textView5.setText(Html.fromHtml("You were not able to confirm Pb<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore12 == 3) {
                TextView textView6 = this.txtcat1;
                textView6.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore12 == 5) {
                TextView textView7 = this.txtcat1;
                textView7.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView8 = this.txtcat1;
                textView8.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Hg22+")) {
            if (gotScore12 == 0) {
                TextView textView9 = this.txtcat1;
                textView9.setText(Html.fromHtml("You were not able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore12 == 3) {
                TextView textView10 = this.txtcat1;
                textView10.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore12 == 5) {
                TextView textView11 = this.txtcat1;
                textView11.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView12 = this.txtcat1;
                textView12.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Cr3+")) {
            if (gotScore12 == 0) {
                TextView textView13 = this.txtcat1;
                textView13.setText(Html.fromHtml("You were not able to confirm Cr<small><sup>3+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore12 == 3) {
                TextView textView14 = this.txtcat1;
                textView14.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore12 == 5) {
                TextView textView15 = this.txtcat1;
                textView15.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView16 = this.txtcat1;
                textView16.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Mn2+")) {
            if (gotScore12 == 0) {
                TextView textView17 = this.txtcat1;
                textView17.setText(Html.fromHtml("You were not able to confirm Mn<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore12 == 3) {
                TextView textView18 = this.txtcat1;
                textView18.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore12 == 5) {
                TextView textView19 = this.txtcat1;
                textView19.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView20 = this.txtcat1;
                textView20.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Fe3+")) {
            if (gotScore12 == 0) {
                TextView textView21 = this.txtcat1;
                textView21.setText(Html.fromHtml("You were not able to confirm Fe<small><sup>3+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore12 == 3) {
                TextView textView22 = this.txtcat1;
                textView22.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore12 == 5) {
                TextView textView23 = this.txtcat1;
                textView23.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView24 = this.txtcat1;
                textView24.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Bi3+")) {
            if (gotScore12 == 0) {
                TextView textView25 = this.txtcat1;
                textView25.setText(Html.fromHtml("You were not able to confirm Bi<small><sup>3+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore12 == 3) {
                TextView textView26 = this.txtcat1;
                textView26.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore12 == 5) {
                TextView textView27 = this.txtcat1;
                textView27.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView28 = this.txtcat1;
                textView28.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Ba2+")) {
            if (gotScore12 == 0) {
                TextView textView29 = this.txtcat1;
                textView29.setText(Html.fromHtml("You were not able to confirm Ba<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore12 == 3) {
                TextView textView30 = this.txtcat1;
                textView30.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore12 == 5) {
                TextView textView31 = this.txtcat1;
                textView31.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView32 = this.txtcat1;
                textView32.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Co2+")) {
            if (gotScore12 == 0) {
                TextView textView33 = this.txtcat1;
                textView33.setText(Html.fromHtml("You were not able to confirm Co<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore12 == 3) {
                TextView textView34 = this.txtcat1;
                textView34.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore12 == 5) {
                TextView textView35 = this.txtcat1;
                textView35.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView36 = this.txtcat1;
                textView36.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Ca2+")) {
            if (gotScore12 == 0) {
                TextView textView37 = this.txtcat1;
                textView37.setText(Html.fromHtml("You were not able to confirm Ca<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore12 == 3) {
                TextView textView38 = this.txtcat1;
                textView38.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore12 == 5) {
                TextView textView39 = this.txtcat1;
                textView39.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView40 = this.txtcat1;
                textView40.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Sr2+")) {
            if (gotScore12 == 0) {
                TextView textView41 = this.txtcat1;
                textView41.setText(Html.fromHtml("You were not able to confirm Sr<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore12 == 3) {
                TextView textView42 = this.txtcat1;
                textView42.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore12 == 5) {
                TextView textView43 = this.txtcat1;
                textView43.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView44 = this.txtcat1;
                textView44.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Mg2+")) {
            if (gotScore12 == 0) {
                TextView textView45 = this.txtcat1;
                textView45.setText(Html.fromHtml("You were not able to confirm Mg<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 3) {
                TextView textView46 = this.txtcat1;
                textView46.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 5) {
                TextView textView47 = this.txtcat1;
                textView47.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView48 = this.txtcat1;
                textView48.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Ni2+")) {
            if (gotScore12 == 0) {
                TextView textView49 = this.txtcat1;
                textView49.setText(Html.fromHtml("You were not able to confirm Ni<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 3) {
                TextView textView50 = this.txtcat1;
                textView50.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 5) {
                TextView textView51 = this.txtcat1;
                textView51.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView52 = this.txtcat1;
                textView52.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Cu2+")) {
            if (gotScore12 == 0) {
                TextView textView53 = this.txtcat1;
                textView53.setText(Html.fromHtml("You were not able to confirm Cu<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 3) {
                TextView textView54 = this.txtcat1;
                textView54.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 5) {
                TextView textView55 = this.txtcat1;
                textView55.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView56 = this.txtcat1;
                textView56.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Cd2+")) {
            if (gotScore12 == 0) {
                TextView textView57 = this.txtcat1;
                textView57.setText(Html.fromHtml("You were not able to confirm Cd<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 3) {
                TextView textView58 = this.txtcat1;
                textView58.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 5) {
                TextView textView59 = this.txtcat1;
                textView59.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView60 = this.txtcat1;
                textView60.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Zn2+")) {
            if (gotScore12 == 0) {
                TextView textView61 = this.txtcat1;
                textView61.setText(Html.fromHtml("You were not able to confirm Zn<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 3) {
                TextView textView62 = this.txtcat1;
                textView62.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore12 == 5) {
                TextView textView63 = this.txtcat1;
                textView63.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView64 = this.txtcat1;
                textView64.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("K+")) {
            if (gotScore12 == 0) {
                TextView textView65 = this.txtcat1;
                textView65.setText(Html.fromHtml("You were not able to confirm K<small><sup>+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore12 == 3) {
                TextView textView66 = this.txtcat1;
                textView66.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore12 == 5) {
                TextView textView67 = this.txtcat1;
                textView67.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else {
                TextView textView68 = this.txtcat1;
                textView68.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
            }
        } else if (index.equals("Na+")) {
            if (gotScore12 == 0) {
                TextView textView69 = this.txtcat1;
                textView69.setText(Html.fromHtml("You were not able to confirm Na<small><sup>+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore12 == 3) {
                TextView textView70 = this.txtcat1;
                textView70.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore12 == 5) {
                TextView textView71 = this.txtcat1;
                textView71.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else {
                TextView textView72 = this.txtcat1;
                textView72.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
            }
        } else if (!index.equals("NH4+")) {
            Toast.makeText(this, "Please Try Again!", Toast.LENGTH_SHORT).show();
        } else if (gotScore12 == 0) {
            TextView textView73 = this.txtcat1;
            textView73.setText(Html.fromHtml("You were not able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else if (gotScore12 == 3) {
            TextView textView74 = this.txtcat1;
            textView74.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result1 + "after 2 tries, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else if (gotScore12 == 5) {
            TextView textView75 = this.txtcat1;
            textView75.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result1 + "after 1 try, which gives you " + gotScore12 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else {
            TextView textView76 = this.txtcat1;
            textView76.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result1 + "after 3 tries, which gives you " + gotScore12 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
        }
    }

    public void getCationIndex2(String index, int gotScore22) {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        if (index.equals("Ag+")) {
            if (gotScore22 == 0) {
                TextView textView = this.txtcat2;
                textView.setText(Html.fromHtml("You were not able to confirm Ag<small><sup>+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore22 == 3) {
                TextView textView2 = this.txtcat2;
                textView2.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore22 == 5) {
                TextView textView3 = this.txtcat2;
                textView3.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView4 = this.txtcat2;
                textView4.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Pb2+")) {
            if (gotScore22 == 0) {
                TextView textView5 = this.txtcat2;
                textView5.setText(Html.fromHtml("You were not able to confirm Pb<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore22 == 3) {
                TextView textView6 = this.txtcat2;
                textView6.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore22 == 5) {
                TextView textView7 = this.txtcat2;
                textView7.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView8 = this.txtcat2;
                textView8.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Hg22+")) {
            if (gotScore22 == 0) {
                TextView textView9 = this.txtcat2;
                textView9.setText(Html.fromHtml("You were not able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore22 == 3) {
                TextView textView10 = this.txtcat2;
                textView10.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore22 == 5) {
                TextView textView11 = this.txtcat2;
                textView11.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView12 = this.txtcat2;
                textView12.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Cr3+")) {
            if (gotScore22 == 0) {
                TextView textView13 = this.txtcat2;
                textView13.setText(Html.fromHtml("You were not able to confirm Cr<small><sup>3+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore22 == 3) {
                TextView textView14 = this.txtcat2;
                textView14.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore22 == 5) {
                TextView textView15 = this.txtcat2;
                textView15.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView16 = this.txtcat2;
                textView16.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Mn2+")) {
            if (gotScore22 == 0) {
                TextView textView17 = this.txtcat2;
                textView17.setText(Html.fromHtml("You were not able to confirm Mn<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore22 == 3) {
                TextView textView18 = this.txtcat2;
                textView18.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore22 == 5) {
                TextView textView19 = this.txtcat2;
                textView19.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView20 = this.txtcat2;
                textView20.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Fe3+")) {
            if (gotScore22 == 0) {
                TextView textView21 = this.txtcat2;
                textView21.setText(Html.fromHtml("You were not able to confirm Fe<small><sup>3+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore22 == 3) {
                TextView textView22 = this.txtcat2;
                textView22.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore22 == 5) {
                TextView textView23 = this.txtcat2;
                textView23.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView24 = this.txtcat2;
                textView24.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Bi3+")) {
            if (gotScore22 == 0) {
                TextView textView25 = this.txtcat2;
                textView25.setText(Html.fromHtml("You were not able to confirm Bi<small><sup>3+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore22 == 3) {
                TextView textView26 = this.txtcat2;
                textView26.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore22 == 5) {
                TextView textView27 = this.txtcat2;
                textView27.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView28 = this.txtcat2;
                textView28.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Ba2+")) {
            if (gotScore22 == 0) {
                TextView textView29 = this.txtcat2;
                textView29.setText(Html.fromHtml("You were not able to confirm Ba<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore22 == 3) {
                TextView textView30 = this.txtcat2;
                textView30.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore22 == 5) {
                TextView textView31 = this.txtcat2;
                textView31.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView32 = this.txtcat2;
                textView32.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Co2+")) {
            if (gotScore22 == 0) {
                TextView textView33 = this.txtcat2;
                textView33.setText(Html.fromHtml("You were not able to confirm Co<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore22 == 3) {
                TextView textView34 = this.txtcat2;
                textView34.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore22 == 5) {
                TextView textView35 = this.txtcat2;
                textView35.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView36 = this.txtcat2;
                textView36.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Ca2+")) {
            if (gotScore22 == 0) {
                TextView textView37 = this.txtcat2;
                textView37.setText(Html.fromHtml("You were not able to confirm Ca<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore22 == 3) {
                TextView textView38 = this.txtcat2;
                textView38.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore22 == 5) {
                TextView textView39 = this.txtcat2;
                textView39.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView40 = this.txtcat2;
                textView40.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Sr2+")) {
            if (gotScore22 == 0) {
                TextView textView41 = this.txtcat2;
                textView41.setText(Html.fromHtml("You were not able to confirm Sr<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore22 == 3) {
                TextView textView42 = this.txtcat2;
                textView42.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore22 == 5) {
                TextView textView43 = this.txtcat2;
                textView43.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView44 = this.txtcat2;
                textView44.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Mg2+")) {
            if (gotScore22 == 0) {
                TextView textView45 = this.txtcat2;
                textView45.setText(Html.fromHtml("You were not able to confirm Mg<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 3) {
                TextView textView46 = this.txtcat2;
                textView46.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 5) {
                TextView textView47 = this.txtcat2;
                textView47.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView48 = this.txtcat2;
                textView48.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Ni2+")) {
            if (gotScore22 == 0) {
                TextView textView49 = this.txtcat2;
                textView49.setText(Html.fromHtml("You were not able to confirm Ni<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 3) {
                TextView textView50 = this.txtcat2;
                textView50.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 5) {
                TextView textView51 = this.txtcat2;
                textView51.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView52 = this.txtcat2;
                textView52.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Cu2+")) {
            if (gotScore22 == 0) {
                TextView textView53 = this.txtcat2;
                textView53.setText(Html.fromHtml("You were not able to confirm Cu<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 3) {
                TextView textView54 = this.txtcat2;
                textView54.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 5) {
                TextView textView55 = this.txtcat2;
                textView55.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView56 = this.txtcat2;
                textView56.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Cd2+")) {
            if (gotScore22 == 0) {
                TextView textView57 = this.txtcat2;
                textView57.setText(Html.fromHtml("You were not able to confirm Cd<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 3) {
                TextView textView58 = this.txtcat2;
                textView58.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 5) {
                TextView textView59 = this.txtcat2;
                textView59.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView60 = this.txtcat2;
                textView60.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Zn2+")) {
            if (gotScore22 == 0) {
                TextView textView61 = this.txtcat2;
                textView61.setText(Html.fromHtml("You were not able to confirm Zn<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 3) {
                TextView textView62 = this.txtcat2;
                textView62.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore22 == 5) {
                TextView textView63 = this.txtcat2;
                textView63.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView64 = this.txtcat2;
                textView64.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("K+")) {
            if (gotScore22 == 0) {
                TextView textView65 = this.txtcat2;
                textView65.setText(Html.fromHtml("You were not able to confirm K<small><sup>+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore22 == 3) {
                TextView textView66 = this.txtcat2;
                textView66.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore22 == 5) {
                TextView textView67 = this.txtcat2;
                textView67.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else {
                TextView textView68 = this.txtcat2;
                textView68.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
            }
        } else if (index.equals("Na+")) {
            if (gotScore22 == 0) {
                TextView textView69 = this.txtcat2;
                textView69.setText(Html.fromHtml("You were not able to confirm Na<small><sup>+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore22 == 3) {
                TextView textView70 = this.txtcat2;
                textView70.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore22 == 5) {
                TextView textView71 = this.txtcat2;
                textView71.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else {
                TextView textView72 = this.txtcat2;
                textView72.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
            }
        } else if (!index.equals("NH4+")) {
            Toast.makeText(this, "Please Try Again!", Toast.LENGTH_SHORT).show();
        } else if (gotScore22 == 0) {
            TextView textView73 = this.txtcat2;
            textView73.setText(Html.fromHtml("You were not able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else if (gotScore22 == 3) {
            TextView textView74 = this.txtcat2;
            textView74.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result2 + "after 2 tries, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else if (gotScore22 == 5) {
            TextView textView75 = this.txtcat2;
            textView75.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result2 + "after 1 try, which gives you " + gotScore22 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else {
            TextView textView76 = this.txtcat2;
            textView76.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result2 + "after 3 tries, which gives you " + gotScore22 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
        }
    }

    public void getCationIndex3(String index, int gotScore32) {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        if (index.equals("Ag+")) {
            if (gotScore32 == 0) {
                TextView textView = this.txtcat3;
                textView.setText(Html.fromHtml("You were not able to confirm Ag<small><sup>+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore32 == 3) {
                TextView textView2 = this.txtcat3;
                textView2.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore32 == 5) {
                TextView textView3 = this.txtcat3;
                textView3.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView4 = this.txtcat3;
                textView4.setText(Html.fromHtml("You were able to confirm Ag<small><sup>+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Pb2+")) {
            if (gotScore32 == 0) {
                TextView textView5 = this.txtcat3;
                textView5.setText(Html.fromHtml("You were not able to confirm Pb<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore32 == 3) {
                TextView textView6 = this.txtcat3;
                textView6.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore32 == 5) {
                TextView textView7 = this.txtcat3;
                textView7.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView8 = this.txtcat3;
                textView8.setText(Html.fromHtml("You were able to confirm Pb<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Hg22+")) {
            if (gotScore32 == 0) {
                TextView textView9 = this.txtcat3;
                textView9.setText(Html.fromHtml("You were not able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore32 == 3) {
                TextView textView10 = this.txtcat3;
                textView10.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else if (gotScore32 == 5) {
                TextView textView11 = this.txtcat3;
                textView11.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group A.", 0));
            } else {
                TextView textView12 = this.txtcat3;
                textView12.setText(Html.fromHtml("You were able to confirm Hg<small><sub>2</sub><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group A.", 0));
            }
        } else if (index.equals("Cr3+")) {
            if (gotScore32 == 0) {
                TextView textView13 = this.txtcat3;
                textView13.setText(Html.fromHtml("You were not able to confirm Cr<small><sup>3+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore32 == 3) {
                TextView textView14 = this.txtcat3;
                textView14.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore32 == 5) {
                TextView textView15 = this.txtcat3;
                textView15.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView16 = this.txtcat3;
                textView16.setText(Html.fromHtml("You were able to confirm Cr<small><sup>3+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Mn2+")) {
            if (gotScore32 == 0) {
                TextView textView17 = this.txtcat3;
                textView17.setText(Html.fromHtml("You were not able to confirm Mn<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore32 == 3) {
                TextView textView18 = this.txtcat3;
                textView18.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore32 == 5) {
                TextView textView19 = this.txtcat3;
                textView19.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + this.gotScore2 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView20 = this.txtcat3;
                textView20.setText(Html.fromHtml("You were able to confirm Mn<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + this.gotScore2 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Fe3+")) {
            if (gotScore32 == 0) {
                TextView textView21 = this.txtcat3;
                textView21.setText(Html.fromHtml("You were not able to confirm Fe<small><sup>3+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore32 == 3) {
                TextView textView22 = this.txtcat3;
                textView22.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore32 == 5) {
                TextView textView23 = this.txtcat3;
                textView23.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView24 = this.txtcat3;
                textView24.setText(Html.fromHtml("You were able to confirm Fe<small><sup>3+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Bi3+")) {
            if (gotScore32 == 0) {
                TextView textView25 = this.txtcat3;
                textView25.setText(Html.fromHtml("You were not able to confirm Bi<small><sup>3+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore32 == 3) {
                TextView textView26 = this.txtcat3;
                textView26.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else if (gotScore32 == 5) {
                TextView textView27 = this.txtcat3;
                textView27.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group B.", 0));
            } else {
                TextView textView28 = this.txtcat3;
                textView28.setText(Html.fromHtml("You were able to confirm Bi<small><sup>3+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group B.", 0));
            }
        } else if (index.equals("Ba2+")) {
            if (gotScore32 == 0) {
                TextView textView29 = this.txtcat3;
                textView29.setText(Html.fromHtml("You were not able to confirm Ba<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore32 == 3) {
                TextView textView30 = this.txtcat3;
                textView30.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore32 == 5) {
                TextView textView31 = this.txtcat3;
                textView31.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView32 = this.txtcat3;
                textView32.setText(Html.fromHtml("You were able to confirm Ba<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Co2+")) {
            if (gotScore32 == 0) {
                TextView textView33 = this.txtcat3;
                textView33.setText(Html.fromHtml("You were not able to confirm Co<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore32 == 3) {
                TextView textView34 = this.txtcat3;
                textView34.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore32 == 5) {
                TextView textView35 = this.txtcat3;
                textView35.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView36 = this.txtcat3;
                textView36.setText(Html.fromHtml("You were able to confirm Co<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Ca2+")) {
            if (gotScore32 == 0) {
                TextView textView37 = this.txtcat3;
                textView37.setText(Html.fromHtml("You were not able to confirm Ca<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore32 == 3) {
                TextView textView38 = this.txtcat3;
                textView38.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore32 == 5) {
                TextView textView39 = this.txtcat3;
                textView39.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView40 = this.txtcat3;
                textView40.setText(Html.fromHtml("You were able to confirm Ca<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Sr2+")) {
            if (gotScore32 == 0) {
                TextView textView41 = this.txtcat3;
                textView41.setText(Html.fromHtml("You were not able to confirm Sr<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore32 == 3) {
                TextView textView42 = this.txtcat3;
                textView42.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else if (gotScore32 == 5) {
                TextView textView43 = this.txtcat3;
                textView43.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group C.", 0));
            } else {
                TextView textView44 = this.txtcat3;
                textView44.setText(Html.fromHtml("You were able to confirm Sr<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group C.", 0));
            }
        } else if (index.equals("Mg2+")) {
            if (gotScore32 == 0) {
                TextView textView45 = this.txtcat3;
                textView45.setText(Html.fromHtml("You were not able to confirm Mg<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 3) {
                TextView textView46 = this.txtcat3;
                textView46.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 5) {
                TextView textView47 = this.txtcat3;
                textView47.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView48 = this.txtcat3;
                textView48.setText(Html.fromHtml("You were able to confirm Mg<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Ni2+")) {
            if (gotScore32 == 0) {
                TextView textView49 = this.txtcat3;
                textView49.setText(Html.fromHtml("You were not able to confirm Ni<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 3) {
                TextView textView50 = this.txtcat3;
                textView50.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 5) {
                TextView textView51 = this.txtcat3;
                textView51.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView52 = this.txtcat3;
                textView52.setText(Html.fromHtml("You were able to confirm Ni<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Cu2+")) {
            if (gotScore32 == 0) {
                TextView textView53 = this.txtcat3;
                textView53.setText(Html.fromHtml("You were not able to confirm Cu<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 3) {
                TextView textView54 = this.txtcat3;
                textView54.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 5) {
                TextView textView55 = this.txtcat3;
                textView55.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView56 = this.txtcat3;
                textView56.setText(Html.fromHtml("You were able to confirm Cu<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Cd2+")) {
            if (gotScore32 == 0) {
                TextView textView57 = this.txtcat3;
                textView57.setText(Html.fromHtml("You were not able to confirm Cd<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 3) {
                TextView textView58 = this.txtcat3;
                textView58.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 5) {
                TextView textView59 = this.txtcat3;
                textView59.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView60 = this.txtcat3;
                textView60.setText(Html.fromHtml("You were able to confirm Cd<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("Zn2+")) {
            if (gotScore32 == 0) {
                TextView textView61 = this.txtcat3;
                textView61.setText(Html.fromHtml("You were not able to confirm Zn<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 3) {
                TextView textView62 = this.txtcat3;
                textView62.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else if (gotScore32 == 5) {
                TextView textView63 = this.txtcat3;
                textView63.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group D.", 0));
            } else {
                TextView textView64 = this.txtcat3;
                textView64.setText(Html.fromHtml("You were able to confirm Zn<small><sup>2+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group D.", 0));
            }
        } else if (index.equals("K+")) {
            if (gotScore32 == 0) {
                TextView textView65 = this.txtcat3;
                textView65.setText(Html.fromHtml("You were not able to confirm K<small><sup>+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore32 == 3) {
                TextView textView66 = this.txtcat3;
                textView66.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore32 == 5) {
                TextView textView67 = this.txtcat3;
                textView67.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else {
                TextView textView68 = this.txtcat3;
                textView68.setText(Html.fromHtml("You were able to confirm K<small><sup>+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
            }
        } else if (index.equals("Na+")) {
            if (gotScore32 == 0) {
                TextView textView69 = this.txtcat3;
                textView69.setText(Html.fromHtml("You were not able to confirm Na<small><sup>+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore32 == 3) {
                TextView textView70 = this.txtcat3;
                textView70.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else if (gotScore32 == 5) {
                TextView textView71 = this.txtcat3;
                textView71.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
            } else {
                TextView textView72 = this.txtcat3;
                textView72.setText(Html.fromHtml("You were able to confirm Na<small><sup>+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
            }
        } else if (!index.equals("NH4+")) {
            Toast.makeText(this, "Please Try Again!", Toast.LENGTH_SHORT).show();
        } else if (gotScore32 == 0) {
            TextView textView73 = this.txtcat3;
            textView73.setText(Html.fromHtml("You were not able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else if (gotScore32 == 3) {
            TextView textView74 = this.txtcat3;
            textView74.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result3 + "after 2 tries, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else if (gotScore32 == 5) {
            TextView textView75 = this.txtcat3;
            textView75.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result3 + "after 1 try, which gives you " + gotScore32 + " points. Based on the flowcharts for the analysis, it is from Group E.", 0));
        } else {
            TextView textView76 = this.txtcat3;
            textView76.setText(Html.fromHtml("You were able to confirm NH<small><sub>4</sub><sup>+</sup></small> through" + this.result3 + "after 3 tries, which gives you " + gotScore32 + " point. Based on the flowcharts for the analysis, it is from Group E.", 0));
        }
    }
}