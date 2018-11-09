package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;

public class CorrectAnswer extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correctanswer);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(CorrectAnswer.this, RoundTwo.class);
                CorrectAnswer.this.startActivity(intent);
                CorrectAnswer.this.finish();
            }
        }, 1500);
    }
}
