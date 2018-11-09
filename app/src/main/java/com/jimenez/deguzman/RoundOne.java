package com.jimenez.deguzman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RoundOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roundone);
    }

    public void correctans (View v) {
        Intent i = new Intent(this, CorrectAnswer.class);
        startActivity(i);
    }

    public void wrongans (View v) {
        Intent i = new Intent(this, WrongAnswer.class);
        startActivity(i);
    }
}
