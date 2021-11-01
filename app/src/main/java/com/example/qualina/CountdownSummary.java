package com.example.qualina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CountdownSummary extends AppCompatActivity {

    Button btnplayagain;
    String cation1, cation2, cation3;
    TextView txtendtime, lblsummary, gotcat1, gotcat2, gotcat3, lbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown_summary);
        bindViews();

    }

    public void bindViews(){
        txtendtime = findViewById(R.id.txtendtime);
        lblsummary = findViewById(R.id.lblSummary);
        gotcat1 = findViewById(R.id.gotcat1);
        gotcat2 = findViewById(R.id.gotcat2);
        gotcat3 = findViewById(R.id.gotcat3);
        lbl = findViewById(R.id.lbl);
    }
}