package com.jimenez.deguzman;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Round extends AppCompatActivity {

    TextView question, choice1, choice2, choice3, choice4, round_name, points;
    SQLDatabase SQL;
    SQLiteDatabase SQLDatabase;
    Cursor c;
    Intent intent;
    Integer point, round, round_next;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SQL= new SQLDatabase(Round.this,"SQLDB",null,1);
        SQLDatabase = SQL.getReadableDatabase();
        intent = getIntent();
        point = intent.getIntExtra("points",0);
        round = intent.getIntExtra("round",0);
        round_next = round + 1;
        c = SQLDatabase.rawQuery("SELECT * FROM question WHERE id = ?", new String[] {String.valueOf(round)});
        if(c!=null && c.getCount()>0) {
            c.moveToFirst();
            setContentView(R.layout.question);
            question = (TextView) findViewById(R.id.question_content);
            round_name = (TextView) findViewById(R.id.Round_Name);
            points = (TextView) findViewById(R.id.points_val);
            choice1 = (TextView) findViewById(R.id.choice1);
            choice2 = (TextView) findViewById(R.id.choice2);
            choice3 = (TextView) findViewById(R.id.choice3);
            choice4 = (TextView) findViewById(R.id.choice4);
            answer = c.getString(c.getColumnIndex("correct"));
            question.setText(c.getString(c.getColumnIndex("question")));
            choice1.setText(c.getString(c.getColumnIndex("choice1")));
            choice2.setText(c.getString(c.getColumnIndex("choice2")));
            choice3.setText(c.getString(c.getColumnIndex("choice3")));
            choice4.setText(c.getString(c.getColumnIndex("choice4")));
            round_name.setText("Round " + round);
            points.setText(String.valueOf(point));
        }
        else {
            Intent i = new Intent(this, Congratulatory.class);
            i.putExtra("points", point);
            startActivity(i);
            finish();
        }
    }

    public void choice1btn (View v){
        if(c.getString(c.getColumnIndex("choice1")).equals(c.getString(c.getColumnIndex("correct")))){
            Intent i = new Intent(this, CorrectAnswer.class);
            i.putExtra("points", point+c.getInt(c.getColumnIndex("point")));
            i.putExtra("round", round_next);
            i.putExtra("answer", answer);
            startActivity(i);
            finish();
        }
        else{
            Intent i = new Intent(this, WrongAnswer.class);
            i.putExtra("points", point);
            i.putExtra("round", round_next);
            i.putExtra("answer", answer);
            startActivity(i);
            finish();
        }

    }

    public void choice2btn (View v){
        if(c.getString(c.getColumnIndex("choice2")).equals(c.getString(c.getColumnIndex("correct")))){
            Intent i = new Intent(this, CorrectAnswer.class);
            i.putExtra("points", point+c.getInt(c.getColumnIndex("point")));
            i.putExtra("round", round_next);
            i.putExtra("answer", answer);
            startActivity(i);
            finish();
        }
        else{
            Intent i = new Intent(this, WrongAnswer.class);
            i.putExtra("points", point);
            i.putExtra("round", round_next);
            i.putExtra("answer", answer);
            startActivity(i);
            finish();
        }

    }

    public void choice3btn (View v){
        if(c.getString(c.getColumnIndex("choice3")).equals(c.getString(c.getColumnIndex("correct")))){
            Intent i = new Intent(this, CorrectAnswer.class);
            i.putExtra("points", point+c.getInt(c.getColumnIndex("point")));
            i.putExtra("round", round_next);
            i.putExtra("answer", answer);
            startActivity(i);
            finish();
        }
        else{
            Intent i = new Intent(this, WrongAnswer.class);
            i.putExtra("points", point);
            i.putExtra("round", round_next);
            i.putExtra("answer", answer);
            startActivity(i);
            finish();
        }

    }

    public void choice4btn (View v){
        if(c.getString(c.getColumnIndex("choice4")).equals(c.getString(c.getColumnIndex("correct")))){
            Intent i = new Intent(this, CorrectAnswer.class);
            i.putExtra("points", point+c.getInt(c.getColumnIndex("point")));
            i.putExtra("round", round_next);
            i.putExtra("answer", answer);
            startActivity(i);
            finish();
        }
        else{
            Intent i = new Intent(this, WrongAnswer.class);
            i.putExtra("points", point);
            i.putExtra("round", round_next);
            i.putExtra("answer", answer);
            startActivity(i);
            finish();
        }

    }


}
