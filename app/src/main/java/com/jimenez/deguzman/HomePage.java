package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }

    public void start (View v){
        Intent i = new Intent(this, QuestLevelPage.class);
        startActivity(i);
    }

    public void highscore (View v){
        Intent i = new Intent(this, HighScores.class);
        startActivity(i);
    }
}
