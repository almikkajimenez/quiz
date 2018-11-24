package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class WrongAnswerEleven extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wronganswereleven);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WrongAnswerEleven.this, RoundTwelve.class);
                WrongAnswerEleven.this.startActivity(intent);
                WrongAnswerEleven.this.finish();
            }
        }, 1500);
    }
}
