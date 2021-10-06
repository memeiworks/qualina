package com.example.qualina;


import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameIntro extends AppCompatActivity {

    Toolbar toolbar;
    TextView txtname;
    EditText edtname;
    ImageView img_cat;
    String playerName, extra;
    Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_intro);
        bindViews();
        setSupportActionBar(toolbar);

        getPlayerName();
        btnstart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toUnknownCode = new Intent(GameIntro.this, UnknownSampleCode.class);
                toUnknownCode.putExtra("Current Player", GameIntro.this.playerName);
                GameIntro.this.startActivity(toUnknownCode);
            }
        });
    }

    public void getPlayerName() {
        edtname.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int id, KeyEvent event) {
                if (id != 6) {
                    return false;
                }
                GameIntro gameIntro = GameIntro.this;
                gameIntro.hideSoftKeyboard(gameIntro.edtname);
                playerName = edtname.getText().toString();
                btnstart.setVisibility(View.VISIBLE);
                edtname.setVisibility(View.GONE);
                img_cat.setVisibility(View.VISIBLE);
                txtname.setText("Hello, \n" + playerName);
                return true;
            }
        });
    }

    private void hideSoftKeyboard(EditText input) {
        ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(input.getWindowToken(), 0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.cations_group_list, menu);
        return true;

    }

    public void setSupportActionBar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id != R.id.home) {
            switch (id) {
                case R.id.groupA:
                    Intent toGroupA = new Intent(GameIntro.this,CationGroupViewer.class);
                    toGroupA.putExtra("Group Cations","Group A");
                    startActivity(toGroupA);
                    return true;
                case R.id.groupB:
                    Intent toGroupB = new Intent(GameIntro.this,CationGroupViewer.class);
                    toGroupB.putExtra("Group Cations","Group B");
                    startActivity(toGroupB);
                    return true;
                case R.id.groupC:
                    Intent toGroupC = new Intent(GameIntro.this,CationGroupViewer.class);
                    toGroupC.putExtra("Group Cations","Group C");
                    startActivity(toGroupC);
                    return true;
                case R.id.groupD:
                    Intent toGroupD = new Intent(GameIntro.this,CationGroupViewer.class);
                    toGroupD.putExtra("Group Cations","Group D");
                    startActivity(toGroupD);
                    return true;
                case R.id.groupE:
                    Intent toGroupE = new Intent(GameIntro.this,CationGroupViewer.class);
                    toGroupE.putExtra("Group Cations","Group E");
                    startActivity(toGroupE);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        } else {
            finish();
            startActivity(getIntent());
            return true;
        }
    }

    public void bindViews(){
        toolbar = findViewById(R.id.toolbar);
        txtname = findViewById(R.id.txtName);
        edtname = findViewById(R.id.edt_player_name);
        img_cat = findViewById(R.id.img_cat);
        btnstart = findViewById(R.id.btn_start);
    }
}