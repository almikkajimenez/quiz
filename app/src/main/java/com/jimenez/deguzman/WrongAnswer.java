package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;

public class WrongAnswer extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wronganswer);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WrongAnswer.this, RoundTwo.class);
                WrongAnswer.this.startActivity(intent);
                WrongAnswer.this.finish();
            }
        }, 1500);
    }
}
