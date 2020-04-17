package com.example.ss.deadlineslul;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkFirstStart();
    }
    public void Click1(View view) {
        Intent intent1 =new Intent(MainActivity.this,Dialog.class);
        startActivity(intent1);
    }
    public void Click2(View view) {
        Intent intent2 =new Intent(MainActivity.this,MyGarden.class);
        startActivity(intent2);
    }
    public void Click3(View view) {
        Intent intent3 =new Intent(MainActivity.this,Information.class);
        startActivity(intent3);
    }
    public void Click4(View view) {
        Intent intent4 =new Intent(MainActivity.this,ComingSoon.class);
        startActivity(intent4);
    }
    public void Click5(View view) {
        Intent intent5 =new Intent(MainActivity.this,Settings.class);
        startActivity(intent5);

    }

    private void checkFirstStart() {

        SharedPreferences sp = getSharedPreferences("hasVisited",
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа (Если вход первый то вернет false)
        boolean hasVisited = sp.getBoolean("hasVisited", false);

        if (!hasVisited) {
            // Сработает если Вход первый
            saveTextBuffer("");
            helper(current);
            //Ставим метку что вход уже был
            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", true);
            e.commit(); //После этого hasVisited будет уже true и будет означать, что вход уже был

            //Ниже запускаем активность которая нужна при первом входе

        } else {

            //Сработает если вход в приложение уже был
            //Ниже запускаем активность которая нужна при последующих входах
        }
    }

    private final static String FILE_NAME = "content.txt";

    public void saveTextBuffer(String obmen){
        FileOutputStream fos = null;
        try {

            String text=obmen;
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
        }
        catch(IOException ex) {
            boolean kostil=true;
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){
                boolean kostil=true;
            }
        }
    }



    int current = 0;
    public void helper(int current){
        TextView TextHint=findViewById(R.id.HintText);
        Button first = findViewById(R.id.button3);
        Button second = findViewById(R.id.button4);
        Button third = findViewById(R.id.button5);
        Button fourth= findViewById(R.id.button6);
        if(current==0){
            //setAll invis;
            TextHint.setVisibility(View.VISIBLE);

            first.setVisibility(View.GONE);
            second.setVisibility(View.GONE);
            third.setVisibility(View.GONE);
            fourth.setVisibility(View.GONE);
            TextHint.setText("Вас приветствует программа Easy-Gardening.\n" +
                    "Сейчас будет краткое обучение работе с программой.");
        }
        if(current ==1){
            TextHint.setText("В главном меню вам предложено перейти во вкладки\n" +
                    "-Мой сад\n" +
                    "-Расписание\n" +
                    "-О программе\n" +
                    "-Справочник\n");
        }
        if(current==2){
            TextHint.setText("В вкладке \"Мой сад\" вы вносите информацию о растениях, которые\n" +
                    "вы выращивайте.\n" +
                    "\n" +
                    "В вкладке \"Расписание\" вы можете просмотреть список дел, которые\n" +
                    "необходимо выполнить.\n" +
                    "\n" +
                    "В вкладке \"Справочник\" вам будет предложена полезная информация о растениях.");
        }
        if(current==3){
            TextHint.setVisibility(View.GONE);
            first.setVisibility(View.VISIBLE);
            second.setVisibility(View.VISIBLE);
            third.setVisibility(View.VISIBLE);
            fourth.setVisibility(View.VISIBLE);
        }
    }
    public void Next(View view){
       current++;
       helper(current);
    }


    @Override
    public void onBackPressed(){
        finishAffinity();
    }
}
