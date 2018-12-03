package com.jimenez.deguzman;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Congratulatory extends AppCompatActivity {

    Intent intent;
    Integer point;
    EditText name;
    TextView score;
    SQLDatabase SQL;
    SQLiteDatabase SQLDatabase;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congratulatory);
        intent = getIntent();
        point = intent.getIntExtra("points",0);
        name = (EditText)findViewById(R.id.user_name);
        score = (TextView)findViewById(R.id.total_score);
        score.setText(String.valueOf(point));
    }

    public void submit (View v){
        SQL= new SQLDatabase(Congratulatory.this,"SQLDB",null,1);
        SQLDatabase = SQL.getReadableDatabase();
        SQLDatabase.execSQL("INSERT INTO highscore(points,name)VALUES ("+point+" , '" + name.getText().toString() + "')");
        Intent i = new Intent(this, HomePage.class);
        startActivity(i);
        finish();
    }


}
