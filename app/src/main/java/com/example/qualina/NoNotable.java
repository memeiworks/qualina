package com.example.qualina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NoNotable extends AppCompatActivity {

    Button btncheckresult;
    String current_cation;
    int current_score;
    ImageView imgflask;
    String notable_res, player, result;
    TextView txtplayer, txtpreresult, txtscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_notable);
        bindViews();
        this.result = getIntent().getStringExtra("Result");
        this.player = getIntent().getStringExtra("Current Player");
        this.current_score = getIntent().getIntExtra("Current Score", 0);
        this.current_cation = getIntent().getStringExtra("Current Cation");
        this.notable_res = getIntent().getStringExtra("Notable Result");
        this.txtplayer.setText(this.player);
        TextView textView = this.txtscore;
        textView.setText("SCORE: " + this.current_score + "/15");
        if (this.result.equals("Nothing")) {
            getCationIndex(this.current_cation);
        }
    }

    public void bindViews() {
        this.txtplayer = (TextView) findViewById(R.id.tb_player);
        this.txtscore = (TextView) findViewById(R.id.tb_score);
        this.txtpreresult = (TextView) findViewById(R.id.txtpreresult);
        this.btncheckresult = (Button) findViewById(R.id.btnCheckResult);
        this.imgflask = (ImageView) findViewById(R.id.imgflask);
    }

    public void getCationIndex(String index) {
        if (index.equals("wA")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("yB")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("bC")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("cD")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("pE")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("rF")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("bG")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("yH")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("yI")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("wJ")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("wK")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("wL")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("cM")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("mN")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("wO")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("yP")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("wQ")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("vR")) {
            getNotableResult(this.notable_res);
        } else if (index.equals("yS")) {
            getNotableResult(this.notable_res);
        } else {
            Toast.makeText(this, "Please Try Again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void getNotableResult(String notable_res2) {
        if (notable_res2.equals("Sample Tested")) {
            this.imgflask.setImageResource(R.drawable.sample_tested_icon);
            this.txtpreresult.setText(R.string.text_sample_tested);
            this.btncheckresult.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent toCheckResult = new Intent(NoNotable.this, CheckResultActivity.class);
                    toCheckResult.putExtra("Result", "Nothing");
                    toCheckResult.putExtra("Current Score", NoNotable.this.current_score);
                    toCheckResult.putExtra("Current Player", NoNotable.this.player);
                    NoNotable.this.startActivity(toCheckResult);
                }
            });
        } else if (notable_res2.equals("Other Groups")) {
            this.imgflask.setImageResource(R.drawable.sample_tested_icon);
            this.txtpreresult.setText(R.string.sample_tested_groups);
            this.btncheckresult.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent toCheckResult = new Intent(NoNotable.this, CheckResultActivity.class);
                    toCheckResult.putExtra("Result", "Nothing");
                    toCheckResult.putExtra("Current Score", NoNotable.this.current_score);
                    toCheckResult.putExtra("Current Player", NoNotable.this.player);
                    NoNotable.this.startActivity(toCheckResult);
                }
            });
        } else if (notable_res2.equals("No Notable")) {
            this.imgflask.setImageResource(R.drawable.no_notable_icon);
            this.txtpreresult.setText(R.string.text_no_notable_sample);
            this.btncheckresult.setText(R.string.str_return);
            this.btncheckresult.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    NoNotable.this.finish();
                }
            });
        } else if (notable_res2.equals("No Notable2")) {
            this.imgflask.setImageResource(R.drawable.sample_tested_icon);
            this.txtpreresult.setText(R.string.sample_beingtested);
            this.btncheckresult.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent toCheckResult = new Intent(NoNotable.this, CheckResultActivity.class);
                    toCheckResult.putExtra("Result", "Nothing");
                    toCheckResult.putExtra("Current Score", NoNotable.this.current_score);
                    toCheckResult.putExtra("Current Player", NoNotable.this.player);
                    NoNotable.this.startActivity(toCheckResult);
                }
            });
        } else {
            this.imgflask.setImageResource(R.drawable.sample_tested_icon);
            this.txtpreresult.setText(R.string.sample_beingtested);
            this.btncheckresult.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent toCheckResult = new Intent(NoNotable.this, CheckResultActivity.class);
                    toCheckResult.putExtra("Result", "Nothing");
                    toCheckResult.putExtra("Current Score", NoNotable.this.current_score);
                    toCheckResult.putExtra("Current Player", NoNotable.this.player);
                    NoNotable.this.startActivity(toCheckResult);
                }
            });
        }
    }

}