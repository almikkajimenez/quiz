package com.jimenez.deguzman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RoundTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roundtwo);
    }

    public void correctans (View v) {
        Intent i = new Intent(this, CorrectAnswerTwo.class);
        startActivity(i);
    }

    public void wrongans (View v) {
        Intent i = new Intent(this, WrongAnswerTwo.class);
        startActivity(i);
    }
}