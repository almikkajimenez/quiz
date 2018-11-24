package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class CorrectAnswerThree extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correctanswerthree);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(CorrectAnswerThree.this, RoundFour.class);
                CorrectAnswerThree.this.startActivity(intent);
                CorrectAnswerThree.this.finish();
            }
        }, 1500);
    }
}