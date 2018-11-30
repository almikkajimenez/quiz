package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;
import android.widget.TextView;

public class WrongAnswer extends AppCompatActivity {

    Intent intent;
    Integer point,round;
    String answer;
    TextView correct_ans;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();
        point = intent.getIntExtra("points",0);
        round = intent.getIntExtra("round",0);
        answer = intent.getStringExtra("answer");
        setContentView(R.layout.wronganswer);
        correct_ans = (TextView)findViewById(R.id.correct_ans2);
        correct_ans.setText(answer);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WrongAnswer.this, Round.class);
                intent.putExtra("points", point);
                intent.putExtra("round", round);
                WrongAnswer.this.startActivity(intent);
                WrongAnswer.this.finish();
            }
        }, 1500);
    }
}
