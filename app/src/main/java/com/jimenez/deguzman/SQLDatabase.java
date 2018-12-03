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
        db.execSQL("create table highscore(id integer primary key, points integer, name text)");
        db.execSQL("create table question(id integer primary key, question text, choice1 text, choice2 text, choice3 text, choice4 text, correct text, point integer)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is another name for Okra?', 'Blacksmiths Fingers', 'Dead Mans Fingers', 'Ladies Fingers', 'Pirates Fingers', 'Ladies Fingers', 100)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What country produces the most potatoes?', 'China', 'United States', 'Ireland', 'Russia', 'China', 200)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is chorizo?', 'Greek Sausage', 'Italian Sausage', 'Mexican Sausage', 'Spanish Sausage', 'Spanish Sausage', 300)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is table sugar?', 'Fructose', 'Glucose', 'Otiose', 'Sucrose', 'Sucrose', 500)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('By what name do we normally refer to the Chinese Gooseberry?', 'Kiwi Fruit', 'Mango', 'Passion Fruit', 'Star Fruit', 'Kiwi Fruit', 1000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is the main ingredient in vichyssoise?', 'Lima Beans', 'Clams', 'Tomatoes', 'Potatoes', 'Potatoes', 2000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('Which fruit contains more Vitamin C than Oranges?', 'Lemon', 'Kiwi', 'Pineapple', 'Mandarin', 'Kiwi', 4000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is a “brioche”?', 'Type of Bun', 'Soup', 'Meat Dish', 'Pancake', 'Type of Bun', 8000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('Which fruit is slivovitz made from?', 'Apples', 'Bananas', 'Plums', 'Apricots', 'Plums', 16000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What is dry Vermouth?', 'Juice and Vodka', 'Wines', 'Hops', 'Apple Drink', 'Wines', 32000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What ingredients when added to Hollandaise make the sauce Bearnaise?', 'Lemon Thyme and Port Wine', 'Wine and Tarragon', 'Fish Fumet and basil', 'Blood Orange Juice', 'Wine and Tarragon', 64000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('What one ingredient must a fish or poultry dish to be called “Veronique”?', 'Eggs', 'Apples', 'Grapes', 'Mayonnaise', 'Grapes', 125000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('The sandwich known as the “Reuben” does not have which of the following ingredients?', 'Boiled Ham', 'Corned Beef', 'Sauerkraut', 'Swiss Cheese', 'Boiled Ham', 250000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('Which country does Feta Cheese come from?', 'Greece', 'Mexico', 'Philippines', 'Italy', 'Greece', 500000)");
        db.execSQL("INSERT INTO question (question, choice1, choice2, choice3, choice4, correct, point) VALUES ('Marzipan is made with what kind of nut?', 'Almond', 'Cashew', 'Walnut', 'Pecan', 'Almond', 1000000)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

}