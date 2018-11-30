package com.jimenez.deguzman;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HighScores extends AppCompatActivity {

    SQLDatabase SQL;
    SQLiteDatabase SQLDatabase;
    TextView scores;
    String score_total = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highscores);
        SQL= new SQLDatabase(HighScores.this, "SQLDB", null, 1);
        SQLDatabase = SQL.getReadableDatabase();
        Cursor c = SQLDatabase.rawQuery("SELECT * FROM highscore WHERE id<=?", new String[] {"10"});
        scores = (TextView)findViewById(R.id.scores);
        while(c.moveToNext()) {
            score_total = score_total + c.getString(c.getColumnIndex("name")) + " --------- "+  c.getString(c.getColumnIndex("points"))+"\n";
        }
        scores.setText(score_total);
    }

    public void clear (View v){
        SQL= new SQLDatabase(HighScores.this, "SQLDB", null, 1);
        SQLDatabase = SQL.getReadableDatabase();
        SQLDatabase.execSQL("DELETE FROM highscore");
        Intent i = new Intent(this, HighScores.class);
        startActivity(i);
        finish();
    }
}
