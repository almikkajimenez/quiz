package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class WrongAnswerFourteen extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wronganswerfourteen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WrongAnswerFourteen.this, RoundFifteen.class);
                WrongAnswerFourteen.this.startActivity(intent);
                WrongAnswerFourteen.this.finish();
            }
        }, 1500);
    }
}
