package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class CorrectAnswerFive extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correctanswerfifth);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(CorrectAnswerFive.this, RoundSix.class);
                CorrectAnswerFive.this.startActivity(intent);
                CorrectAnswerFive.this.finish();
            }
        }, 1500);
    }
}
