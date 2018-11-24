package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class CorrectAnswerTwo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correctanswertwo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(CorrectAnswerTwo.this, RoundThree.class);
                CorrectAnswerTwo.this.startActivity(intent);
                CorrectAnswerTwo.this.finish();
            }
        }, 1500);
    }
}
