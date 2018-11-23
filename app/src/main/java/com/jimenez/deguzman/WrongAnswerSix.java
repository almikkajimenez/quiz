package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class WrongAnswerSix extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wronganswersix);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WrongAnswerSix.this, RoundSeven.class);
                WrongAnswerSix.this.startActivity(intent);
                WrongAnswerSix.this.finish();
            }
        }, 1500);
    }
}
