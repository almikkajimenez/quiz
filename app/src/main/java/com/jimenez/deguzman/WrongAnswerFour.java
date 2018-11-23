package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class WrongAnswerFour extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wronganswerfour);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WrongAnswerFour.this, RoundFive.class);
                WrongAnswerFour.this.startActivity(intent);
                WrongAnswerFour.this.finish();
            }
        }, 1500);
    }
}
