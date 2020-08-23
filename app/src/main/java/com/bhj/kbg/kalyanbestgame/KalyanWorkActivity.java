package com.bhj.kbg.kalyanbestgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class KalyanWorkActivity extends AppCompatActivity {
     private TextView dateTimeDisplay;
     private Calendar calendar;
     private SimpleDateFormat dateFormat;
     private  String date;
     private Button singleGameButton;
     private  Button joriGameButton;
     private  Button panelGameButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalyan_work);
        /* start display date code */
        dateTimeDisplay = (TextView)findViewById(R.id.dateFieldID);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("MM/dd/yyyy    h:mm a");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);     /* End display date code */
        singleGameButton = (Button) findViewById((R.id.SingleButtonID));
        joriGameButton =(Button) findViewById((R.id.JoriButtonID));
        panelGameButton =(Button) findViewById((R.id.PanelButtonID));

        singleGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalyanWorkActivity.this, ResultActivity.class);
                intent.putExtra("single","Single Today Game");
                startActivity(intent);
            }
        });
        joriGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalyanWorkActivity.this, ResultActivity.class);
                intent.putExtra("jori","Jori Today  Game");
                startActivity(intent);
            }
        });
        panelGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalyanWorkActivity.this, ResultActivity.class);
                intent.putExtra("panel","Panel Today  Game");
                startActivity(intent);
            }
        });
    }
}