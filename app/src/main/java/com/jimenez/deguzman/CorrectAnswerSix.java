package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class CorrectAnswerSix extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correctanswersix);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(CorrectAnswerSix.this, RoundSeven.class);
                CorrectAnswerSix.this.startActivity(intent);
                CorrectAnswerSix.this.finish();
            }
        }, 1500);
    }
}
