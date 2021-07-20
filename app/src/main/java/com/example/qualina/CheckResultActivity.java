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

public class CheckResultActivity extends AppCompatActivity {

    Button btnGuess;
    String cation1, cation2, cation3, cation_step, color_result, current_cation;
    int current_score;
    ImageView imgflask;
    String player,result;
    TextView txtplayer, txtresult, txtscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_result);
        bindViews();
        result = getIntent().getStringExtra("Result");
        player = getIntent().getStringExtra("Current Player");
        current_score = getIntent().getIntExtra("Current Score", 0);
        current_cation = getIntent().getStringExtra("Current Cation");
        cation1 = getIntent().getStringExtra("Cation 1");
        cation2 = getIntent().getStringExtra("Cation 2");
        cation3 = getIntent().getStringExtra("Cation 3");
        cation_step = getIntent().getStringExtra("Cation Step");
        txtplayer.setText(player);
        TextView textView = txtscore;
        textView.setText("SCORE: " + current_score + "/15");
        if (result.equals("Nothing")) {
            imgflask.setImageResource(R.drawable.no_notable_icon);
            txtresult.setText(R.string.text_no_notable_sample);
            btnGuess.setText(R.string.str_return);
            btnGuess.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    finish();
                    Toast.makeText(CheckResultActivity.this, "Click BACK of your device to return to previous page.", Toast.LENGTH_SHORT).show();
                }
            });
            return;
        }
        getCationIndex(result);
        btnGuess.setText(R.string.guess_your_cation);
        btnGuess.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toGuess = new Intent(CheckResultActivity.this, GuessCation.class);
                toGuess.putExtra("Result", result);
                toGuess.putExtra("Current Player", player);
                toGuess.putExtra("Cation 1", cation1);
                toGuess.putExtra("Cation 2", cation2);
                toGuess.putExtra("Cation 3", cation3);
                toGuess.putExtra("Current Score", current_score);
                toGuess.putExtra("Current Cation", current_cation);
                toGuess.putExtra("Cation Step", cation_step);
                toGuess.putExtra("Color Result", color_result);
                startActivity(toGuess);
            }
        });
    }

    public void bindViews() {
        txtplayer = (TextView) findViewById(R.id.tb_player);
        txtscore = (TextView) findViewById(R.id.tb_score);
        txtresult = (TextView) findViewById(R.id.txtresult);
        btnGuess = (Button) findViewById(R.id.btnGuess);
        imgflask = (ImageView) findViewById(R.id.imgflask);
    }

    public void getCationIndex(String index) {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        if (index.equals("wA") || index.contentEquals(Html.fromHtml("Ag<small><sup>+</sup></small>", 0))) {
            this.txtresult.setText("Your sample produced WHITE precipitates/solids.");
            this.current_cation = String.valueOf(Html.fromHtml("Ag<small><sup>+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.white_res);
            this.color_result = " its white appearance, ";
        } else if (index.equals("yB") || index.contentEquals(Html.fromHtml("Pb<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText(Html.fromHtml("Your sample produced YELLOW precipitates (solids).", 0));
            this.current_cation = String.valueOf(Html.fromHtml("Pb<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.yellow_res);
            this.color_result = " its yellow appearance, ";
        } else if (index.equals("bC") || index.contentEquals(Html.fromHtml("Hg<small><sub>2</sub><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("Your residue appears to be BLACK GRAY or BLACK.");
            this.current_cation = String.valueOf(Html.fromHtml("Hg<small><sub>2</sub><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.black_res);
            this.color_result = " its black-gray or black appearance, ";
        } else if (index.equals("cD") || index.contentEquals(Html.fromHtml("Cr<small><sup>3+</sup></small>", 0))) {
            this.txtresult.setText("A BLUE color flash should be observed.");
            this.current_cation = String.valueOf(Html.fromHtml("Cr<small><sup>3+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.blue_flash_res);
            this.color_result = " its blue flash of color appearance in the liquid, ";
        } else if (index.equals("pE") || index.contentEquals(Html.fromHtml("Mn<small><sup>4+</sup></small>", 0))) {
            this.txtresult.setText("The solution turned PURPLE.");
            this.current_cation = String.valueOf(Html.fromHtml("Mn<small><sup>4+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.purple_res);
            this.color_result = " its PURPLE appearance, ";
        } else if (index.equals("rF") || index.contentEquals(Html.fromHtml("Fe<small><sup>3+</sup></small>", 0))) {
            this.txtresult.setText("The solution turned BLOOD-RED.");
            this.current_cation = String.valueOf(Html.fromHtml("Fe<small><sup>3+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.blood_red_res);
            this.color_result = " its blood-red appearance, ";
        } else if (index.equals("bG") || index.contentEquals(Html.fromHtml("Bi<small><sup>3+</sup></small>", 0))) {
            this.txtresult.setText("A BLACK precipitate/solid was produced.");
            this.current_cation = String.valueOf(Html.fromHtml("Bi<small><sup>3+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.black_res);
            this.color_result = " its black appearance, ";
        } else if (index.equals("yH") || index.contentEquals(Html.fromHtml("Ba<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("A YELLOW precipitate/solid was produced.");
            this.current_cation = String.valueOf(Html.fromHtml("Ba<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.yellow_res);
            this.color_result = " its yellow appearance, ";
        } else if (index.equals("yI") || index.contentEquals(Html.fromHtml("Co<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("A YELLOW precipitate/solid was produced.");
            this.current_cation = String.valueOf(Html.fromHtml("Co<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.yellow_res);
            this.color_result = " its yellow appearance, ";
        } else if (index.equals("wJ") || index.contentEquals(Html.fromHtml("Ca<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("A WHITE precipitate/solid was produced.");
            this.current_cation = String.valueOf(Html.fromHtml("Ca<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.white_res);
            this.color_result = " its white appearance, ";
        } else if (index.equals("wK") || index.contentEquals(Html.fromHtml("Sr<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("A WHITE precipitate/solid was produced.");
            this.current_cation = String.valueOf(Html.fromHtml("Sr<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.white_res);
            this.color_result = " its white appearance, ";
        } else if (index.equals("wL") || index.contentEquals(Html.fromHtml("Mg<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("A WHITE precipitate/solid was produced.");
            this.current_cation = String.valueOf(Html.fromHtml("Mg<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.white_res);
            this.color_result = " its white appearance, ";
        } else if (index.equals("cM") || index.contentEquals(Html.fromHtml("Ni<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("The solution turned CHERRY-RED.");
            this.current_cation = String.valueOf(Html.fromHtml("Ni<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.cherry_red_res);
            this.color_result = " its cherry-red appearance, ";
        } else if (index.equals("mN") || index.contentEquals(Html.fromHtml("Cu<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("The solution turned MAROON.");
            this.current_cation = String.valueOf(Html.fromHtml("Cu<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.maroon_res);
            this.color_result = " its maroon appearance, ";
        } else if (index.equals("wO") || index.equals("yP") || index.contentEquals(Html.fromHtml("Cd<small><sup>2+</sup></small>", 0))) {
            if (index.equals("wO")) {
                this.txtresult.setText("A WHITE precipitate/solid was produced.");
                this.current_cation = String.valueOf(Html.fromHtml("Cd<small><sup>2+</sup></small>", 0));
                this.imgflask.setImageResource(R.drawable.white_res);
                this.color_result = " its white appearance, ";
                return;
            }
            this.txtresult.setText("A YELLOW precipitate/solid was produced.");
            this.current_cation = String.valueOf(Html.fromHtml("Cd<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.yellow_res);
            this.color_result = " its yellow appearance, ";
        } else if (index.equals("wQ") || index.contentEquals(Html.fromHtml("Zn<small><sup>2+</sup></small>", 0))) {
            this.txtresult.setText("A WHITE precipitate/solid was produced.");
            this.current_cation = String.valueOf(Html.fromHtml("Zn<small><sup>2+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.white_res);
            this.color_result = " its white appearance, ";
        } else if (index.equals("vR") || index.contentEquals(Html.fromHtml("K<small><sup>+</sup></small>", 0))) {
            this.txtresult.setText("A REDISH-VIOLET flame lasted for 5 seconds or more was observed.");
            this.current_cation = String.valueOf(Html.fromHtml("K<small><sup>+</sup></small>", 0));
//            this.imgflask.setImageResource(R.drawable.reddish_violet_blue_filter_res);
            //To resize image
            this.color_result = " the appearance of a redish-violet flame that lasted for 5 seconds or more, ";
        } else if (index.equals("yS") || index.contentEquals(Html.fromHtml("Na<small><sup>+</sup></small>", 0))) {
            this.txtresult.setText("An intense YELLOW flame that lasted for 5 seconds or more was observed.");
            this.current_cation = String.valueOf(Html.fromHtml("Na<small><sup>+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.intense_yellow_res);
            this.color_result = " the appearance of an intense YELLOW flame that lasted for 5 seconds or more, ";
        } else if (index.equals("bT") || index.contentEquals(Html.fromHtml("NH<small><sub>4</sub><sup>+</sup></small>", 0))) {
            this.txtresult.setText("A uniform (not spotted) change from red to blue color of the litmus paper was observed.");
            this.current_cation = String.valueOf(Html.fromHtml("NH<small><sub>4</sub><sup>+</sup></small>", 0));
            this.imgflask.setImageResource(R.drawable.litmus_paper_nh4_res);
            this.color_result = " a uniform (not spotted) change from red to blue color of the litmus paper, ";
        } else {
            Toast.makeText(this, "Please Try Again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed() {
        Toast.makeText(this, "Please guess your cation.", Toast.LENGTH_SHORT).show();
    }
}