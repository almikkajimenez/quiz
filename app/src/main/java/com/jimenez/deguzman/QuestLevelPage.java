package com.jimenez.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;

public class QuestLevelPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questlevel);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(QuestLevelPage.this, Round.class);
                intent.putExtra("points", 0);
                intent.putExtra("round", 1);
                QuestLevelPage.this.startActivity(intent);
                QuestLevelPage.this.finish();
            }
        }, 3000);
    }
}
