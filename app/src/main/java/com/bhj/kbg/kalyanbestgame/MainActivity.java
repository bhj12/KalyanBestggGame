package com.bhj.kbg.kalyanbestgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  public   Button dailyFreeGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dailyFreeGameButton = (Button) findViewById(R.id.KalyanBestGameID);

dailyFreeGameButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent myIntent;
        myIntent = new Intent(MainActivity.this, KalyanWorkActivity.class);
        startActivity(myIntent);
    }
});



    }



}