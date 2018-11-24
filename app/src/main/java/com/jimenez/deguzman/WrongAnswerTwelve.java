package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class WrongAnswerTwelve extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wronganswertwelve);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WrongAnswerTwelve.this, RoundThirteen.class);
                WrongAnswerTwelve.this.startActivity(intent);
                WrongAnswerTwelve.this.finish();
            }
        }, 1500);
    }
}
