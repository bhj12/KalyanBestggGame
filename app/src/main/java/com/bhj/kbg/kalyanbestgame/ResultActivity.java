package com.bhj.kbg.kalyanbestgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView headingTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
// code started for getting valued to display on textView
        Intent intent = getIntent();
        Bundle signMarks = getIntent().getExtras();
        headingTextView = (TextView)findViewById(R.id.ResultViewNameID);

        if (intent.hasExtra("single")) {



            headingTextView.setText("Single Kalyan Best Game");

        } else if (intent.hasExtra("jori")) {



            headingTextView.setText("Jori Kalyan Best Game");
        } else if (intent.hasExtra("panel")) {

            headingTextView.setText("Panel Kalyan  Best Game");
        }

    }
}