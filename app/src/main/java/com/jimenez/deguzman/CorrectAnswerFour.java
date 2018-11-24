package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class CorrectAnswerFour extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correctanswerfour);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(CorrectAnswerFour.this, RoundFive.class);
                CorrectAnswerFour.this.startActivity(intent);
                CorrectAnswerFour.this.finish();
            }
        }, 1500);
    }
}
