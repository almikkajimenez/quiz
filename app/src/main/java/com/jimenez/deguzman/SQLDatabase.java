package com.jimenez.deguzman;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLDatabase extends SQLiteOpenHelper {

    public SQLDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table highscore(id integer primary key,points integer, name text)");
        db.execSQL("create table question(id integer primary key, question text, choice1 text, choice2 text, choice3 text, choice4 text, correct text, point integer)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is another name for Okra?', 'Blacksmiths Fingers', 'Dead Mans Fingers', 'Ladies Fingers', 'Pirates Fingers', 'Ladies Fingers', 100)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What country produces the most potatoes?', 'China', 'United States', 'Ireland', 'Russia', 'China', 200)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is chorizo?', 'Greek Sausage', 'Italian Sausage', 'Mexican Sausage', 'Spanish Sausage', 'Spanish Sausage', 300)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is table sugar?', 'Fructose', 'Glucose', 'Otiose', 'Sucrose', 'Sucrose', 500)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('By what name do we normally refer to the Chinese Gooseberry?', 'Kiwi Fruit', 'Mango', 'Passion Fruit', 'Star Fruit', 'Kiwi Fruit', 1000)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

}