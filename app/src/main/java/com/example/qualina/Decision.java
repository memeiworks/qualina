package com.example.qualina;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Decision extends AppCompatActivity {

    Button btnDecision1, btnDecision2, btnDecision3;
    String cation1, cation2, cation3, cation_code, cation_step, current_cation;
    int current_score;
    ImageView imgflask;
    String player;
    TextView player_name, score;
    Intent toNotable, toResult, toloading;
    TextView txtCations, txtQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision);
        bindViews();

        player = getIntent().getStringExtra("Current Player");
        current_score = getIntent().getIntExtra("Current Score", 0);
        cation1 = getIntent().getStringExtra("Cation 1");
        cation2 = getIntent().getStringExtra("Cation 2");
        cation3 = getIntent().getStringExtra("Cation 3");
        String str = cation1 + cation2 + cation3;
        cation_code = str;
        txtCations.setText(str);
        current_cation = getIntent().getStringExtra("Current Cation");
        cation_step = getIntent().getStringExtra("Cation Step");
        score.setText("SCORE: " + current_score + "/15");
        player_name.setText(player);

        if (this.cation_step.equals("First")) {
            getCationIndex(cation1);
        } else if (this.cation_step.equals("Second")) {
            getCationIndex(cation2);
        } else if (this.cation_step.equals("Third")) {
            getCationIndex(cation3);
        } else {
            Toast.makeText(this, "OOPS! Something went wrong.", Toast.LENGTH_SHORT).show();
        }
    }

    public void bindViews() {
        btnDecision1 = findViewById(R.id.btnDecision1);
        btnDecision2 = findViewById(R.id.btnDecision2);
        btnDecision3 = findViewById(R.id.btnDecision3);
        txtQuestion = findViewById(R.id.txtquestion);
        txtCations = findViewById(R.id.txtCationCode);
        player_name = findViewById(R.id.tb_player);
        score = findViewById(R.id.tb_score);
        imgflask = findViewById(R.id.imgflask);
    }

    public void getCationIndex(final String index)  {
        if (index.equals("wA")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationWA(index);
                }
            });
        } else if (index.equals("yB")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationYB(index);
                }
            });
        } else if (index.equals("bC")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", Decision.this.current_score);
                    toNotable.putExtra("Current Player", Decision.this.player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationBC(index);
                }
            });
        } else if (index.equals("cD")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                   getcationCD(index);
                }
            });
        } else if (index.equals("pE")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationPE(index);
                }
            });
        } else if (index.equals("rF")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player",player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationRF(index);
                }
            });
        } else if (index.equals("bG")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationBG(index);
                }
            });
        } else if (index.equals("yH")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationYH(index);
                }
            });
        } else if (index.equals("yI")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                   startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationYI(index);
                }
            });
        } else if (index.equals("wJ")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
           btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                    Decision.this.toNotable.putExtra("Current Cation", index);
                    Decision.this.toNotable.putExtra("Result", "Nothing");
                    Decision.this.toNotable.putExtra("Notable Result", "None");
                    Decision.this.toNotable.putExtra("Current Score", current_score);
                    Decision.this.toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationWJ(index);
                }
            });
        } else if (index.equals("wK")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationwK(index);
                }
            });
        } else if (index.equals("wL")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                   getcationWL(index);
                }
            });
        } else if (index.equals("cM")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationCM(index);
                }
            });
        } else if (index.equals("mN")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationMN(index);
                }
            });
        } else if (index.equals("wO")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Decision.this.getcationWO(index);
                }
            });
        } else if (index.equals("yP")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationYP(index);
                }
            });
        } else if (index.equals("wQ")) {
            imgflask.setImageResource(R.drawable.flame_test);
            btnDecision1.setText(R.string.yes);
            btnDecision2.setText(R.string.no);
            btnDecision1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toNotable = new Intent(Decision.this, NoNotable.class);
                    toNotable.putExtra("Current Cation", index);
                    toNotable.putExtra("Result", "Nothing");
                    toNotable.putExtra("Notable Result", "None");
                    toNotable.putExtra("Current Score", current_score);
                    toNotable.putExtra("Current Player", player);
                    startActivity(toNotable);
                }
            });
            btnDecision2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getcationWQ(index);
                }
            });
        } else if (index.equals("vR")) {
            getcationVR(index);
        } else if (index.equals("yS")) {
            getcationYS(index);
        } else if (index.equals("bT")) {
            getcationBT(index);
        } else {
            Toast.makeText(this, "Please Try Again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void getcationYB(final String index) {
        txtQuestion.setText(R.string.what_next);
        imgflask.setImageResource(R.drawable.general_tube);
        btnDecision1.setText(R.string.precipitate_sample);
        btnDecision2.setVisibility(View.GONE);
        btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toloading = new Intent(Decision.this, LoadingScreen.class);
                startActivity(toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        btnDecision1.setText(R.string.transfer_cent_totube);
                        btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                txtQuestion.setText(R.string.cent_or_res);
                                btnDecision1.setText(R.string.residue);
                                btnDecision2.setVisibility(View.VISIBLE);
                                btnDecision2.setText(R.string.centrifugate);
                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        txtQuestion.setText(R.string.what_next);
                                        imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        btnDecision2.setVisibility(View.GONE);
                                        btnDecision1.setText(R.string.step_wash_cold);
                                        btnDecision1.setOnClickListener(new View.OnClickListener() {
                                            public void onClick(View v) {
                                                imgflask.setImageResource(R.drawable.heat_in_boil);
                                                btnDecision1.setText(R.string.step2);
                                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                    public void onClick(View v) {
                                                        toloading = new Intent(Decision.this, LoadingScreen.class);
                                                        startActivity(toloading);
                                                        handler.postDelayed(new Runnable() {
                                                            public void run() {
                                                                imgflask.setImageResource(R.drawable.general_tube);
                                                                txtQuestion.setText(R.string.cent_or_res);
                                                                btnDecision1.setText(R.string.residue);
                                                                btnDecision2.setVisibility(View.VISIBLE);
                                                                btnDecision2.setText(R.string.centrifugate);
                                                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                    public void onClick(View v) {
                                                                        toNotable = new Intent(Decision.this, NoNotable.class);
                                                                        toNotable.putExtra("Current Cation", index);
                                                                        toNotable.putExtra("Result", "Nothing");
                                                                        toNotable.putExtra("Notable Result", "Sample Tested");
                                                                        toNotable.putExtra("Current Score", current_score);
                                                                        toNotable.putExtra("Current Player", player);
                                                                        startActivity(Decision.this.toNotable);
                                                                    }
                                                                });
                                                                btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                    public void onClick(View v) {
                                                                        txtQuestion.setText(R.string.what_next);
                                                                        imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                        btnDecision1.setText(R.string.add_3d_1mki);
                                                                        btnDecision2.setVisibility(View.GONE);
                                                                        btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                            public void onClick(View v) {
                                                                                if (cation_step.equals("First")) {
                                                                                    toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                    toResult.putExtra("Result", "yB");
                                                                                    toResult.putExtra("Current Player", player);
                                                                                    toResult.putExtra("Cation 1", cation1);
                                                                                    toResult.putExtra("Cation 2", cation2);
                                                                                    toResult.putExtra("Cation 3", cation3);
                                                                                    toResult.putExtra("Current Score", current_score);
                                                                                    toResult.putExtra("Current Cation", index);
                                                                                    toResult.putExtra("Cation Step", cation_step);
                                                                                    startActivity(toResult);
                                                                                } else if (cation_step.equals("Second")) {
                                                                                    toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                    toResult.putExtra("Result", "yB");
                                                                                    toResult.putExtra("Current Player", player);
                                                                                    toResult.putExtra("Cation 1", cation1);
                                                                                    toResult.putExtra("Cation 2", cation2);
                                                                                    toResult.putExtra("Cation 3", cation3);
                                                                                    toResult.putExtra("Current Score", current_score);
                                                                                    toResult.putExtra("Current Cation", index);
                                                                                    toResult.putExtra("Cation Step", cation_step);
                                                                                    startActivity(toResult);
                                                                                } else {
                                                                                    toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                    toResult.putExtra("Result", "yB");
                                                                                    toResult.putExtra("Current Player", player);
                                                                                    toResult.putExtra("Cation 1", cation1);
                                                                                    toResult.putExtra("Cation 2", cation2);
                                                                                    toResult.putExtra("Cation 3", cation3);
                                                                                    toResult.putExtra("Current Score", current_score);
                                                                                    toResult.putExtra("Current Cation", index);
                                                                                    toResult.putExtra("Cation Step", cation_step);
                                                                                    startActivity(toResult);
                                                                                }
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        }, 2000);
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                                btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        toNotable = new Intent(Decision.this, NoNotable.class);
                                        toNotable.putExtra("Current Cation", index);
                                        toNotable.putExtra("Result", "Nothing");
                                        toNotable.putExtra("Notable Result", "Sample Tested");
                                        toNotable.putExtra("Current Player", player);
                                        toNotable.putExtra("Current Score", current_score);
                                        startActivity(toNotable);
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationWA(final String index) {
        txtQuestion.setText(R.string.what_next);
        imgflask.setImageResource(R.drawable.general_tube);
        btnDecision1.setText(R.string.precipitate_sample);
        btnDecision2.setVisibility(View.GONE);
        btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toloading = new Intent(Decision.this, LoadingScreen.class);
                startActivity(toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        btnDecision1.setText(R.string.transfer_cent_totube);
                        btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                txtQuestion.setText(R.string.cent_or_res);
                                btnDecision1.setText(R.string.residue);
                                btnDecision2.setVisibility(View.VISIBLE);
                                btnDecision2.setText(R.string.centrifugate);
                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        txtQuestion.setText(R.string.what_next);
                                        imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        btnDecision1.setText(R.string.step_wash_cold);
                                        btnDecision2.setVisibility(View.GONE);
                                        btnDecision1.setOnClickListener(new View.OnClickListener() {
                                            public void onClick(View v) {
                                                imgflask.setImageResource(R.drawable.heat_in_boil);
                                                btnDecision1.setText(R.string.step2);
                                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                    public void onClick(View v) {
                                                        toloading = new Intent(Decision.this, LoadingScreen.class);
                                                        startActivity(toloading);
                                                        handler.postDelayed(new Runnable() {
                                                            public void run() {
                                                                imgflask.setImageResource(R.drawable.general_tube);
                                                                txtQuestion.setText(R.string.cent_or_res);
                                                                btnDecision1.setText(R.string.residue);
                                                                btnDecision2.setVisibility(View.VISIBLE);
                                                                btnDecision2.setText(R.string.centrifugate);
                                                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                    public void onClick(View v) {
                                                                        txtQuestion.setText(R.string.what_next);
                                                                        imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                        btnDecision2.setVisibility(View.GONE);
                                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                                            btnDecision1.setText(Html.fromHtml("Wash it with 10 drops of HOT distilled water. Add 2 drops of 6 M NH<small><sub>3</sub></small>. Stir and Centrifuge.", 0));
                                                                            btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            txtQuestion.setText(R.string.cent_or_res);
                                                                                            btnDecision1.setText(R.string.residue);
                                                                                            btnDecision2.setVisibility(View.VISIBLE);
                                                                                            btnDecision2.setText(R.string.centrifugate);
                                                                                            btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    toNotable.putExtra("Current Cation", index);
                                                                                                    toNotable.putExtra("Result", "Nothing");
                                                                                                    toNotable.putExtra("Notable Result", "No Notable");
                                                                                                    toNotable.putExtra("Current Player", player);
                                                                                                    toNotable.putExtra("Current Score", current_score);
                                                                                                    startActivity(toNotable);
                                                                                                }
                                                                                            });
                                                                                            btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    txtQuestion.setText(R.string.what_next);
                                                                                                    imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                    btnDecision2.setVisibility(View.GONE);
                                                                                                    btnDecision1.setText(Html.fromHtml("Add 6 M HNO<small><sub>3</sub></small> dropwise with stirring.", 0));
                                                                                                    btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            imgflask.setImageResource(R.drawable.general_tube);
                                                                                                            btnDecision1.setText(R.string.step5_acidity_lptest);
                                                                                                            btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    imgflask.setImageResource(R.drawable.lp_bluetored);
                                                                                                                    txtQuestion.setText("The blue litmus paper turned red which means it is now acidic.");
                                                                                                                    btnDecision1.setText(R.string.next);
                                                                                                                    btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            if (cation_step.equals("First")) {
                                                                                                                                toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                toResult.putExtra("Result", "wA");
                                                                                                                                toResult.putExtra("Current Player", player);
                                                                                                                                toResult.putExtra("Cation 1", cation1);
                                                                                                                                toResult.putExtra("Cation 2", cation2);
                                                                                                                                toResult.putExtra("Cation 3", cation3);
                                                                                                                                toResult.putExtra("Current Score", current_score);
                                                                                                                                toResult.putExtra("Current Cation", index);
                                                                                                                                toResult.putExtra("Cation Step", cation_step);
                                                                                                                                startActivity(toResult);
                                                                                                                            } else if (cation_step.equals("Second")) {
                                                                                                                                toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                toResult.putExtra("Result", "wA");
                                                                                                                                toResult.putExtra("Current Player", player);
                                                                                                                                toResult.putExtra("Cation 1", cation1);
                                                                                                                                toResult.putExtra("Cation 2", cation2);
                                                                                                                                toResult.putExtra("Cation 3", cation3);
                                                                                                                                toResult.putExtra("Current Score", current_score);
                                                                                                                                toResult.putExtra("Current Cation", index);
                                                                                                                                toResult.putExtra("Cation Step", cation_step);
                                                                                                                                startActivity(toResult);
                                                                                                                            } else {
                                                                                                                                toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                toResult.putExtra("Result", "wA");
                                                                                                                                toResult.putExtra("Current Player", player);
                                                                                                                                toResult.putExtra("Cation 1", cation1);
                                                                                                                                toResult.putExtra("Cation 2", cation2);
                                                                                                                                toResult.putExtra("Cation 3", cation3);
                                                                                                                                toResult.putExtra("Current Score", current_score);
                                                                                                                                toResult.putExtra("Current Cation", index);
                                                                                                                                toResult.putExtra("Cation Step", cation_step);
                                                                                                                                startActivity(toResult);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    }
                                                                });
                                                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                    public void onClick(View v) {
                                                                        toNotable = new Intent(Decision.this, NoNotable.class);
                                                                        toNotable.putExtra("Current Cation", index);
                                                                        toNotable.putExtra("Result", "Nothing");
                                                                        toNotable.putExtra("Notable Result", "No Notable2");
                                                                        toNotable.putExtra("Current Player", player);
                                                                        toNotable.putExtra("Current Score", current_score);
                                                                        startActivity(Decision.this.toNotable);
                                                                    }
                                                                });
                                                            }
                                                        }, 2000);
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                                btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        toNotable = new Intent(Decision.this, NoNotable.class);
                                        toNotable.putExtra("Current Cation", index);
                                        toNotable.putExtra("Result", "Nothing");
                                        toNotable.putExtra("Notable Result", "Sample Tested");
                                        toNotable.putExtra("Current Player", player);
                                        toNotable.putExtra("Current Score", current_score);
                                        startActivity(toNotable);
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationBC(final String index) {
        txtQuestion.setText(R.string.what_next);
        imgflask.setImageResource(R.drawable.flame_test);
        btnDecision1.setText(R.string.precipitate_sample);
        btnDecision2.setVisibility(View.GONE);
        btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toloading = new Intent(Decision.this, LoadingScreen.class);
                startActivity(toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        btnDecision1.setText(R.string.transfer_cent_totube);
                        btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                txtQuestion.setText(R.string.cent_or_res);
                                btnDecision1.setText(R.string.residue);
                                btnDecision2.setVisibility(View.VISIBLE);
                                btnDecision2.setText(R.string.centrifugate);
                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        txtQuestion.setText(R.string.what_next);
                                        imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        btnDecision1.setText(R.string.step_wash_cold);
                                        btnDecision2.setVisibility(View.GONE);
                                        btnDecision1.setOnClickListener(new View.OnClickListener() {
                                            public void onClick(View v) {
                                                imgflask.setImageResource(R.drawable.heat_in_boil);
                                                btnDecision1.setText(R.string.step2);
                                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                    public void onClick(View v) {
                                                        toloading = new Intent(Decision.this, LoadingScreen.class);
                                                        startActivity(toloading);
                                                        handler.postDelayed(new Runnable() {
                                                            public void run() {
                                                                imgflask.setImageResource(R.drawable.general_tube);
                                                                txtQuestion.setText(R.string.cent_or_res);
                                                                btnDecision1.setText(R.string.residue);
                                                                btnDecision2.setVisibility(View.VISIBLE);
                                                                btnDecision2.setText(R.string.centrifugate);
                                                                btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                    public void onClick(View v) {
                                                                        txtQuestion.setText(R.string.what_next);
                                                                        imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                                            btnDecision1.setText(Html.fromHtml("Wash it with 10 drops of HOT distilled water. Add 2 drops of 6M NH<small><sub>3</sub></small>. Stir and Centrifuge.", 0));
                                                                            btnDecision2.setVisibility(View.GONE);
                                                                            btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    startActivity(toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            txtQuestion.setText(R.string.what_next);
                                                                                            btnDecision1.setText(R.string.residue);
                                                                                            btnDecision2.setVisibility(View.VISIBLE);
                                                                                            btnDecision2.setText(R.string.centrifugate);
                                                                                            btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    if (cation_step.equals("First")) {
                                                                                                        toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                        toResult.putExtra("Result", "bC");
                                                                                                        toResult.putExtra("Current Player", player);
                                                                                                        toResult.putExtra("Cation 1", cation1);
                                                                                                        toResult.putExtra("Cation 2", cation2);
                                                                                                        toResult.putExtra("Cation 3", cation3);
                                                                                                        toResult.putExtra("Current Score", current_score);
                                                                                                        toResult.putExtra("Current Cation", index);
                                                                                                        toResult.putExtra("Cation Step", cation_step);
                                                                                                        startActivity(toResult);
                                                                                                    } else if (cation_step.equals("Second")) {
                                                                                                        toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                        toResult.putExtra("Result", "bC");
                                                                                                        toResult.putExtra("Current Player", player);
                                                                                                        toResult.putExtra("Cation 1", cation1);
                                                                                                        toResult.putExtra("Cation 2", cation2);
                                                                                                        toResult.putExtra("Cation 3", cation3);
                                                                                                        toResult.putExtra("Current Score", current_score);
                                                                                                        toResult.putExtra("Current Cation", index);
                                                                                                        toResult.putExtra("Cation Step", cation_step);
                                                                                                       startActivity(toResult);
                                                                                                    } else {
                                                                                                        toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                        toResult.putExtra("Result", "bC");
                                                                                                        toResult.putExtra("Current Player", player);
                                                                                                        toResult.putExtra("Cation 1", cation1);
                                                                                                        toResult.putExtra("Cation 2", cation2);
                                                                                                        toResult.putExtra("Cation 3", cation3);
                                                                                                        toResult.putExtra("Current Score", current_score);
                                                                                                        toResult.putExtra("Current Cation", index);
                                                                                                        toResult.putExtra("Cation Step", cation_step);
                                                                                                        startActivity(toResult);
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    toNotable.putExtra("Current Cation", index);
                                                                                                    toNotable.putExtra("Result", "Nothing");
                                                                                                    toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                    toNotable.putExtra("Current Score",current_score);
                                                                                                    toNotable.putExtra("Current Player", player);
                                                                                                    startActivity(toNotable);
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    }
                                                                });
                                                                btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                    public void onClick(View v) {
                                                                        toNotable = new Intent(Decision.this, NoNotable.class);
                                                                        toNotable.putExtra("Current Cation", index);
                                                                        toNotable.putExtra("Result", "Nothing");
                                                                        toNotable.putExtra("Notable Result", "No Notable2");
                                                                        toNotable.putExtra("Current Player", player);
                                                                        toNotable.putExtra("Current Score", current_score);
                                                                        startActivity(toNotable);
                                                                    }
                                                                });
                                                            }
                                                        }, 2000);
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                                btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        toNotable = new Intent(Decision.this, NoNotable.class);
                                        toNotable.putExtra("Current Cation", index);
                                        toNotable.putExtra("Result", "Nothing");
                                        toNotable.putExtra("Notable Result", "Sample Tested");
                                        toNotable.putExtra("Current Player", player);
                                        toNotable.putExtra("Current Score", current_score);
                                        startActivity(toNotable);
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationCD(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 10 drops of 6 M NaOH and 2 drops of 3% H<small><sub>2</sub></small>O<small><sub>2</sub></small>. Stir thoroughly and allow the solution to settle for 2 minutes. Centrifuge.", 0));
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.btnDecision1.setText(R.string.set_aside_cent);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("To the residue: Add 10 drops of 6 M NaOH and 2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>. Stir thoroughly and allow the solution to settle for 2 minutes. Centrifuge.", 0));
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                public void run() {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.txtQuestion.setVisibility(View.VISIBLE);
                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                        }
                                                                                                                    });
                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.combine);
                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.getCB2centrifuge(index);
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            }, 2000);
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Other Groups");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getCB2centrifuge(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.heat_in_boil);
        this.btnDecision1.setText(R.string.step_heat_10_min);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                Decision.this.txtQuestion.setText(R.string.lp_bluetored);
                if (Build.VERSION.SDK_INT >= 24) {
                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 1 M NaHCO<small><sub>3</sub></small> dropwise until neutral. Discard any precipitate/solids.", 0));
                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                            Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                            Decision.this.btnDecision1.setText(R.string.step_take_2d_add_6mhci);
                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                                    Decision.this.txtQuestion.setText(R.string.lp_bluetored);
                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 1 drop of 3% H<small><sub>2</sub></small>O<small><sub>2</sub></small> and make sure to watch closely.", 0));
                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            if (Decision.this.cation_step.equals("First")) {
                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                Decision.this.toResult.putExtra("Result", "cD");
                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                Decision.this.startActivity(Decision.this.toResult);
                                            } else if (Decision.this.cation_step.equals("Second")) {
                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                Decision.this.toResult.putExtra("Result", "cD");
                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                Decision.this.startActivity(Decision.this.toResult);
                                            } else {
                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                Decision.this.toResult.putExtra("Result", "cD");
                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                Decision.this.startActivity(Decision.this.toResult);
                                            }
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            }
        });
    }

    public void getcationPE(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 10 drops of 6 M NaOH and 2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>. Stir thoroughly and allow the solution to settle for 2 minutes. Centrifuge.", 0));
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.btnDecision1.setText(R.string.set_aside_cent);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("To the residue: Add 10 drops of 6 M NaOH and 2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>. Stir thoroughly and allow the solution to settle for 2 minutes. Centrifuge.", 0));
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                public void run() {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.txtQuestion.setVisibility(View.VISIBLE);
                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.discard_centri);
                                                                                                                            Decision.this.btnDecision1.setText(R.string.step_add2ml_discard_centri);
                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.discard_residue);
                                                                                                                                    Decision.this.btnDecision1.setText(R.string.step_wash_res_discard_res);
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_to_do);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                            Decision.this.btnDecision2.setText(R.string.add_3d_1mkscn);
                                                                                                                                            Decision.this.btnDecision3.setText(R.string.add_10drops_6mnaoh);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Combine with 10 drops of the sample into a centrifuge tube and add a pinch of solid NaBiO<small><sub>3</sub></small> then centrifuge.", 0));
                                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "pE");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "pE");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            } else {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "pE");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            }, 2000);
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Other Groups");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationRF(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 10 drops of 6 M NaOH and 2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>. Stir thoroughly and allow the solution to settle for 2 minutes. Centrifuge.", 0));
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.btnDecision1.setText(R.string.set_aside_cent);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("To the residue: Add 10 drops of 6 M NaOH and 2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>. Stir thoroughly and allow the solution to settle for 2 minutes. Centrifuge.", 0));
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                public void run() {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.txtQuestion.setVisibility(View.VISIBLE);
                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.discard_centri);
                                                                                                                            Decision.this.btnDecision1.setText(R.string.step_add2ml_discard_centri);
                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.discard_residue);
                                                                                                                                    Decision.this.btnDecision1.setText(R.string.step_wash_res_discard_res);
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_to_do);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                            Decision.this.btnDecision2.setText(R.string.add_3d_1mkscn);
                                                                                                                                            Decision.this.btnDecision3.setText(R.string.add_10drops_6mnaoh);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.combine_10d_centtube);
                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "rF");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "rF");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            } else {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "rF");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            }, 2000);
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationBG(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 10 drops of 6 M NaOH and 2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>. Stir thoroughly and allow the solution to settle for 2 minutes. Centrifuge.", 0));
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.btnDecision1.setText(R.string.set_aside_cent);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("To the residue: Add 10 drops of 6 M NaOH and 2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>. Stir thoroughly and allow the solution to settle for 2 minutes. Centrifuge.", 0));
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                public void run() {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.discard_centri);
                                                                                                                            Decision.this.btnDecision1.setText(R.string.step_add2ml_discard_centri);
                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.discard_residue);
                                                                                                                                    Decision.this.btnDecision1.setText(R.string.step_wash_res_discard_res);
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_to_do);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("2 drops of 3%H<small><sub>2</sub></small>O<small><sub>2</sub></small>", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                            Decision.this.btnDecision2.setText(R.string.add_3d_1mkscn);
                                                                                                                                            Decision.this.btnDecision3.setText(R.string.add_10drops_6mnaoh);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Combine with 10 drops of the sample and add a pinch of solid SnCI<small><sub>2</sub></small> then centrifuge.", 0));
                                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                public void run() {
                                                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "bG");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "bG");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    } else {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "bG");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }, 2000);
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            }, 2000);
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationYH(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_5m_ammoxa);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Wash it 1 mL distilled water and transfer quantitatively to an evaporating dish while using concentrated HNO<small><sub>3</sub></small> to wash.", 0));
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of concentrated HNO<small><sub>3</sub></small> then heat to dryness under the fumehood over low heat.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Cool for 5 minutes then add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.heat_to_dry_again);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.btnDecision1.setText(R.string.transfer_quant_min_amounts_12mhci);
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M KNO<small><sub>2</sub></small> until precipitates/solids form. Centrifuge.", 0));
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                        public void run() {
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 15 M NH<small><sub>3</sub></small> dropwise until basic.", 0));
                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_redtoblue);
                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_redtoblue);
                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 15 drops of 3 M (NH<small><sub>4</sub></small>)<small><sub>2</sub></small>CO<small><sub>3</sub></small> then centrifuge. Discard the centrifugate.", 0));
                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                        public void run() {
                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Wash the residue with 10 drops of distilled water and add 6 M CH<small><sub>3</sub></small>COOH dropwise with stirring until dissolution.", 0));
                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add equal number of drops of 6 M CH<small><sub>3</sub></small>COOH in excess then dilute to 2 mL with distilled water.", 0));
                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of 0.1 M K<small><sub>2</sub></small>CrO<small><sub>4</sub></small>. Mix and Centrifuge.", 0));
                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                                            Decision.this.txtQuestion.setVisibility(View.VISIBLE);
                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yH");
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yH");
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yH");
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                        }
                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                }
                                                                                                                                                                            });
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    }, 2000);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationYI(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Wash it with 1 mL distilled water and transfer quantitatively to an evaporating dish while using concentrated HNO<small><sub>3</sub></small> to wash.", 0));
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of concentrated HNO<small><sub>3</sub></small> then heat to dryness under the fumehood over low heat.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Cool for 5 minutes then add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                            Decision.this.btnDecision1.setText(R.string.heat_to_dry_again);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.btnDecision1.setText(R.string.transfer_quant_min_amounts_12mhci);
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M KNO<small><sub>2</sub></small> until precipitates/solids form. Centrifuge", 0));
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                        public void run() {
                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yI");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yI");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    } else {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yI");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    }, 2000);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationWJ(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Wash it with 1 mL distilled water and transfer quantitatively to an evaporating dish while using concentrated HNO<small><sub>3</sub></small> to wash.", 0));
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of concentrated HNO<small><sub>3</sub></small> then heat to dryness under the fumehood over low heat.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Cool for 5 minutes then add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.heat_to_dry_again);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.btnDecision1.setText(R.string.transfer_quant_min_amounts_12mhci);
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M KNO<small><sub>2</sub></small> until precipitates/solids form. Centrifuge.", 0));
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                        public void run() {
                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 15 M NH<small><sub>3</sub></small> dropwise until basic.", 0));
                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_redtoblue);
                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_redtoblue);
                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 15 drops of 3 M (NH<small><sub>4</sub></small>)<small><sub>2</sub></small>CO<small><sub>3</sub></small> then centrifuge. Discard the centrifugate.", 0));
                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                        public void run() {
                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Wash the residue with 10 drops of distilled water and add 6 M CH<small><sub>3</sub></small>COOH dropwise with stirring until dissolution.", 0));
                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add equal number of drops of 6 M CH<small><sub>3</sub></small>COOH in excess then dilute to 2 mL with distilled water.", 0));
                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of 0.1 M K<small><sub>2</sub></small>CrO<small><sub>4</sub></small>. Mix and Centrifuge.", 0));
                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                                                                            Decision.this.txtQuestion.setVisibility(View.VISIBLE);
                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 15 M NH<small><sub>3</sub></small> until basic", 0));
                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_redtoblue);
                                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_redtoblue);
                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of 3 M (NH<small><sub>4</sub></small>)<small><sub>2</sub></small>CO<small><sub>3</sub></small> then centrifuge. Discard the centrifugate", 0));
                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.wash_10d_6mhci);
                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Dilute to 2 mL then add 10 drops of 1 M (NH<small><sub>4</sub></small>)<small><sub>2</sub></small>SO<small><sub>4</sub></small>. Let stand for 10 minutes and centrifuge.", 0));
                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                                                                                public void run() {
                                                                                                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 2 drops of 6 M NH<small><sub>3</sub></small>.", 0));
                                                                                                                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of 0.5 M (NH<small><sub>4</sub></small>)<small><sub>2</sub></small>C<small><sub>2</sub></small>O<small><sub>4</sub></small> then centrifuge.", 0));
                                                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                                                                                                                public void run() {
                                                                                                                                                                                                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wJ");
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wJ");
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wJ");
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }, 2000);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }, 2000);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                        }
                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                }
                                                                                                                                                                            });
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    }, 2000);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationwK(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Wash it with 1 mL distilled water and transfer quantitatively to an evaporating dish while using concentrated HNO<small><sub>3</sub></small> to wash.", 0));
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of concentrated HNO<small><sub>3</sub></small> then heat to dryness under the fumehood over low heat.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Cool for 5 minutes then add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.heat_to_dry_again);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.btnDecision1.setText(R.string.transfer_quant_min_amounts_12mhci);
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M KNO<small><sub>2</sub></small> until precipitates/solids form. Centrifuge.", 0));
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                        public void run() {
                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 15 M NH<small><sub>3</sub></small> dropwise until basic.", 0));
                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_redtoblue);
                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_redtoblue);
                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 15 drops of 3 M (NH<small><sub>4</sub></small>)<small><sub>2</sub></small>CO<small><sub>3</sub></small> then centrifuge. Discard the centrifugate.", 0));
                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                        public void run() {
                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Wash the residue with 10 drops of distilled water and add 6 M CH<small><sub>3</sub></small>COOH dropwise with stirring until dissolution.", 0));
                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add equal number of drops of 6 M CH<small><sub>3</sub></small>COOH in excess then dilute to 2 mL with distilled water.", 0));
                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of 0.1 M K<small><sub>2</sub></small>CrO<small><sub>4</sub></small>. Mix and Centrifuge.", 0));
                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 15 M NH<small><sub>3</sub></small> until basic.", 0));
                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_redtoblue);
                                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_redtoblue);
                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of 3 M (NH<small><sub>4</sub></small>)<small><sub>2</sub></small>CO<small><sub>3</sub></small> then centrifuge. Discard the centrifugate.", 0));
                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.wash_10d_6mhci);
                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Dilute to 2 mL then add 10 drops of 1 M (NH<small><sub>4</sub></small>)<small><sub>2</sub></small>SO<small><sub>4</sub></small>. Let stand for 10 minutes and centrifuge.", 0));
                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                                                                                public void run() {
                                                                                                                                                                                                                                                                                    Decision.this.txtQuestion.setVisibility(View.VISIBLE);
                                                                                                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                                            if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Result", "wK");
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                                            } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Result", "wK");
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Result", "wK");
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }, 2000);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                        }
                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                }
                                                                                                                                                                            });
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    }, 2000);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationWL(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.dissolve_transfer);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_to_do);
                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision2.setText(Html.fromHtml("Add NH<small><sub>3</sub></small>, acetic acid and N<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small>.", 0));
                                                                                                                                    Decision.this.btnDecision3.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> with stirring until basic.", 0));
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small>.", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 2 drops of 6 M CH<small><sub>3</sub></small>COOH to make it slightly acidic.", 0));
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_blue_slightred);
                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 0.2 - 0.3 g solid Na<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small> then heat for 10 minutes in a boiling water bath.", 0));
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.cool_1_min);
                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                                public void run() {
                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until basic.", 0));
                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.lp_redtoblue);
                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.lp_redtoblue);
                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 - 8 drops of 0.1 M Na<small><sub>2</sub></small>HPO<small><sub>4</sub></small>. Allow to stand for several minutes then centrifuge.", 0));
                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                public void run() {
                                                                                                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wL");
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wL");
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wL");
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }, 2000);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                }
                                                                                                                                                                            }, 2000);
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationCM(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.dissolve_transfer);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_to_do);
                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision2.setText(Html.fromHtml("Add NH<small><sub>3</sub></small>, acetic acid and N<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small>.", 0));
                                                                                                                                    Decision.this.btnDecision3.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> with stirring until basic.", 0));
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Place 1 drop of the solution into a centrifuge tube then add 6 M NH<small><sub>3</sub></small> with stirring until basic.", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.lp_redtoblue);
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.lp_redtoblue);
                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.add_10_15d_dime);
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "cM");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "cM");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            } else {
                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                Decision.this.toResult.putExtra("Result", "cM");
                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationMN(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.dissolve_transfer);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_to_do);
                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision2.setText(Html.fromHtml("Add NH<small><sub>3</sub></small>, acetic acid and N<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small>.", 0));
                                                                                                                                    Decision.this.btnDecision3.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> with stirring until basic.", 0));
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Place 1 drop of the solution into a centrifuge tube then add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.add_2d_6m_acetic);
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_blue_slightred);
                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 3 - 4 drops of 0.1 M K<small><sub>4</sub></small>Fe(CN)<small><sub>6</sub></small>.", 0));
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "mN");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "mN");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    } else {
                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "mN");
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationWO(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.dissolve_transfer);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_to_do);
                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision2.setText(Html.fromHtml("Add NH<small><sub>3</sub></small>, acetic acid and N<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small>.", 0));
                                                                                                                                    Decision.this.btnDecision3.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> with stirring until basic.", 0));
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 2 drops of 6 M CH<small><sub>3</sub></small>COOH to make it slightly acidic.", 0));
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_blue_slightred);
                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 0.2 - 0.3 g solid Na<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small> then heat for 10 minutes in a boiling water bath.", 0));
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.cool_1_min);
                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                                public void run() {
                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.add_50d_pasteur);
                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.wash_twice_10drops);
                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.discard_residue);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.add_6mhci_discard_res);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText("Add Potassium Hexacyanoferrate(II).");
                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Place 3 drops of the centrifugate then add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                            imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 2 drops of 6 M CH<small><sub>3</sub></small>COOH to make it slightly acidic.", 0));
                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                                                                                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.lp_blue_slightred);
                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of 0.1 M K<small><sub>4</sub></small>Fe(CN)<small><sub>6</sub></small>.", 0));
                                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                            if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Result", "wO");
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                            } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Result", "wO");
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Result", "wO");
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    });
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                }
                                                                                                                                                                            }, 2000);
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationYP(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                            Decision.this.btnDecision1.setText(R.string.dissolve_transfer);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_to_add);
                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision2.setText(Html.fromHtml("Add NH<small><sub>3</sub></small>, acetic acid and N<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small>.", 0));
                                                                                                                                    Decision.this.btnDecision3.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> with stirring until basic.", 0));
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 2 drops of 6 M CH<small><sub>3</sub></small>COOH to make it slightly acidic.", 0));
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_blue_slightred);
                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 0.2 - 0.3 g solid Na<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small> then heat for 10 minutes in a boiling water bath.", 0));
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.cool_1_min);
                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                                public void run() {
                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.add_50d_pasteur);
                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.wash_twice_10drops);
                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.discard_residue);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.add_6mhci_discard_res);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.add_sodium_sulfite);
                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Place 3 drops of the centrifugate then add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                            imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 5 drops of 0.2 M Na<small><sub>2</sub></small>S.", 0));
                                                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yP");
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yP");
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "yP");
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    });
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                }
                                                                                                                                                                            }, 2000);
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationWQ(final String index) {
        this.txtQuestion.setText(R.string.what_next);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 drops of concentrated HNO<small><sub>3</sub></small>.", 0));
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.heat_to_dry);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.btnDecision1.setText(R.string.dissolve_transfer);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_to_add);
                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision3.setVisibility(View.VISIBLE);
                                                                                                                                    Decision.this.btnDecision2.setText(Html.fromHtml("Add NH<small><sub>3</sub></small>, acetic acid and N<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small>.", 0));
                                                                                                                                    Decision.this.btnDecision3.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> with stirring until basic.", 0));
                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> until neutral.", 0));
                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision3.setVisibility(View.GONE);
                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                public void onClick(View v) {
                                                                                                                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                                                                                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 2 drops of 6 M CH<small><sub>3</sub></small>COOH to make it slightly acidic.", 0));
                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_blue_slightred);
                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 0.2 - 0.3 g solid Na<small><sub>2</sub></small>S<small><sub>2</sub></small>O<small><sub>3</sub></small> then heat for 10 minutes in a boiling water bath.", 0));
                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.cool_1_min);
                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                            Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                                                                                public void run() {
                                                                                                                                                                                    Decision.this.txtQuestion.setVisibility(View.VISIBLE);
                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.add_50d_pasteur);
                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                                                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                                                                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                                                                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                                                                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                                                                                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                                                                                                                                    Decision.this.btnDecision1.setText(R.string.add_6macetic);
                                                                                                                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.lp_bluetored);
                                                                                                                                                                                                                            Decision.this.txtQuestion.setText(R.string.lp_blue_slightred);
                                                                                                                                                                                                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 4 drops of 0.1 M K<small><sub>4</sub></small>Fe(CN)<small><sub>6</sub></small> under the fumehood.", 0));
                                                                                                                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wQ");
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wQ");
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Result", "wQ");
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    });
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }, 2000);
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                                                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                }
                                                                                                                                                                            }, 2000);
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    Decision.this.btnDecision3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                            Decision.this.toNotable.putExtra("Notable Result", "No Notable");
                                                                                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationVR(final String index) {
        this.txtQuestion.setText(R.string.what_to_do);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.flame_test);
                                                                                                    Decision.this.btnDecision1.setText(R.string.clean_pat_wire);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.discard_centri);
                                                                                                            Decision.this.btnDecision1.setText(R.string.evap_2d_cent_discard_solids);
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.flame_test);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.add_1d_input_wire);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.flame_test);
                                                                                                                            Decision.this.btnDecision1.setText(R.string.observe_flame_blue_filter);
                                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                public void onClick(View v) {
                                                                                                                                    if (Decision.this.cation_step.equals("First")) {
                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                        Decision.this.toResult.putExtra("Result", "vR");
                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                    } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                        Decision.this.toResult.putExtra("Result", "vR");
                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                    } else {
                                                                                                                                        Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                        Decision.this.toResult.putExtra("Result", "vR");
                                                                                                                                        Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                        Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                        Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                        Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                        Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                        Decision.this.startActivity(Decision.this.toResult);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationYS(final String index) {
        this.txtQuestion.setText(R.string.what_to_do);
        this.imgflask.setImageResource(R.drawable.general_tube);
        this.btnDecision1.setText(R.string.precipitate_sample);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                Decision decision = Decision.this;
                decision.startActivity(decision.toloading);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Decision.this.txtQuestion.setText(R.string.what_next);
                        Decision.this.btnDecision1.setText(R.string.transfer_cent_totube);
                        Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                Decision.this.btnDecision1.setText(R.string.residue);
                                Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                Decision.this.btnDecision2.setText(R.string.centrifugate);
                                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                        Decision.this.toNotable.putExtra("Current Cation", index);
                                        Decision.this.toNotable.putExtra("Result", "Nothing");
                                        Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                        Decision.this.toNotable.putExtra("Notable Result", "No Notable2");
                                        Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                        Decision.this.startActivity(Decision.this.toNotable);
                                    }
                                });
                                Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Decision.this.btnDecision2.setVisibility(View.GONE);
                                        Decision.this.txtQuestion.setText(R.string.what_next);
                                        Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Decision.this.btnDecision1.setText(Html.fromHtml("Add 6 M NH<small><sub>3</sub></small> dropwise until the solution is neutral.", 0));
                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v) {
                                                    imgflask.setImageResource(R.drawable.lp_redtored_blueto_blue);
                                                    Decision.this.txtQuestion.setText(R.string.lp_stay_red_stay_blue);
                                                    Decision.this.btnDecision1.setText(Html.fromHtml("Add 12 drops of 6 M NH<small><sub>3</sub></small> using a Pasteur pipet and Centrifuge.", 0));
                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                        public void onClick(View v) {
                                                            Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                            Decision.this.startActivity(Decision.this.toloading);
                                                            handler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                    Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                    Decision.this.btnDecision1.setText(R.string.residue);
                                                                    Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                    Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                            Decision.this.toNotable.putExtra("Current Cation", index);
                                                                            Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                            Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                            Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                            Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                            Decision.this.startActivity(Decision.this.toNotable);
                                                                        }
                                                                    });
                                                                    Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                            Decision.this.txtQuestion.setText(R.string.what_next);
                                                                            Decision.this.imgflask.setImageResource(R.drawable.drop_sol_sample);
                                                                            Decision.this.btnDecision1.setText(R.string.add_40d_ammox);
                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                public void onClick(View v) {
                                                                                    Decision.this.toloading = new Intent(Decision.this, LoadingScreen.class);
                                                                                    Decision.this.startActivity(Decision.this.toloading);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                                                                                            Decision.this.txtQuestion.setText(R.string.cent_or_res);
                                                                                            Decision.this.btnDecision1.setText(R.string.residue);
                                                                                            Decision.this.btnDecision2.setVisibility(View.VISIBLE);
                                                                                            Decision.this.btnDecision2.setText(R.string.centrifugate);
                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.toNotable = new Intent(Decision.this, NoNotable.class);
                                                                                                    Decision.this.toNotable.putExtra("Current Cation", index);
                                                                                                    Decision.this.toNotable.putExtra("Result", "Nothing");
                                                                                                    Decision.this.toNotable.putExtra("Current Score", Decision.this.current_score);
                                                                                                    Decision.this.toNotable.putExtra("Notable Result", "Sample Tested");
                                                                                                    Decision.this.toNotable.putExtra("Current Player", Decision.this.player);
                                                                                                    Decision.this.startActivity(Decision.this.toNotable);
                                                                                                }
                                                                                            });
                                                                                            Decision.this.btnDecision2.setOnClickListener(new View.OnClickListener() {
                                                                                                public void onClick(View v) {
                                                                                                    Decision.this.txtQuestion.setText(R.string.what_next);
                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.flame_test);
                                                                                                    Decision.this.btnDecision2.setVisibility(View.GONE);
                                                                                                    Decision.this.btnDecision1.setText(R.string.clean_pat_wire);
                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                        public void onClick(View v) {
                                                                                                            Decision.this.imgflask.setImageResource(R.drawable.discard_centri);
                                                                                                            Decision.this.btnDecision1.setText(R.string.evap_2d_cent_discard_solids);
                                                                                                            Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                public void onClick(View v) {
                                                                                                                    Decision.this.imgflask.setImageResource(R.drawable.flame_test);
                                                                                                                    Decision.this.btnDecision1.setText(R.string.add_1d_input_wire);
                                                                                                                    Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        public void onClick(View v) {
                                                                                                                            if (Decision.this.cation_step.equals("First")) {
                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                Decision.this.toResult.putExtra("Result", "yS");
                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                            } else if (Decision.this.cation_step.equals("Second")) {
                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                Decision.this.toResult.putExtra("Result", "yS");
                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                            } else {
                                                                                                                                Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                                                                                                                                Decision.this.toResult.putExtra("Result", "yS");
                                                                                                                                Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                                                                                                                                Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                                                                                                                                Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                                                                                                                                Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                                                                                                                                Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                                                                                                                                Decision.this.toResult.putExtra("Current Cation", index);
                                                                                                                                Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                                                                                                                                Decision.this.startActivity(Decision.this.toResult);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }, 2000);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }, 2000);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                }, 2000);
            }
        });
    }

    public void getcationBT(final String index) {
        this.txtQuestion.setText(R.string.what_to_add);
        this.imgflask.setImageResource(R.drawable.drop_sol_sample);
        this.btnDecision1.setText(R.string.place_10_make_6mnaoh_add2);
        this.btnDecision2.setVisibility(View.GONE);
        this.btnDecision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Decision.this.txtQuestion.setText(R.string.what_next);
                Decision.this.imgflask.setImageResource(R.drawable.general_tube);
                Decision.this.btnDecision1.setText(R.string.watchglass_lp);
                Decision.this.btnDecision1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if (Decision.this.cation_step.equals("First")) {
                            Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                            Decision.this.toResult.putExtra("Result", "bT");
                            Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                            Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                            Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                            Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                            Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                            Decision.this.toResult.putExtra("Current Cation", index);
                            Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                            Decision.this.startActivity(Decision.this.toResult);
                        } else if (Decision.this.cation_step.equals("Second")) {
                            Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                            Decision.this.toResult.putExtra("Result", "bT");
                            Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                            Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                            Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                            Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                            Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                            Decision.this.toResult.putExtra("Current Cation", index);
                            Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                            Decision.this.startActivity(Decision.this.toResult);
                        } else {
                            Decision.this.toResult = new Intent(Decision.this, CheckResultActivity.class);
                            Decision.this.toResult.putExtra("Result", "bT");
                            Decision.this.toResult.putExtra("Current Player", Decision.this.player);
                            Decision.this.toResult.putExtra("Cation 1", Decision.this.cation1);
                            Decision.this.toResult.putExtra("Cation 2", Decision.this.cation2);
                            Decision.this.toResult.putExtra("Cation 3", Decision.this.cation3);
                            Decision.this.toResult.putExtra("Current Score", Decision.this.current_score);
                            Decision.this.toResult.putExtra("Current Cation", index);
                            Decision.this.toResult.putExtra("Cation Step", Decision.this.cation_step);
                            Decision.this.startActivity(Decision.this.toResult);
                        }
                    }
                });
            }
        });
    }
}