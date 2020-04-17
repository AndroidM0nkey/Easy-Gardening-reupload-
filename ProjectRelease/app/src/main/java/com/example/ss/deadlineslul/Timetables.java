package com.example.ss.deadlineslul;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Timetables extends AppCompatActivity {

    private final static String FILE_NAME = "content.txt";
    private final static String FILE_NAME2= "content2.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetables);
        //navremya();
    }



    //Запись в файл(костыль)
    public void saveText(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = (EditText) findViewById(R.id.editText);
            String text = textBox.getText().toString();
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            saveText2(findViewById(R.id.editText2));
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void saveText2(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = (EditText) findViewById(R.id.editText2);
            String text2 = textBox.getText().toString();

            fos = openFileOutput(FILE_NAME2, MODE_PRIVATE);
            fos.write(text2.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    // открытие файла(костыль)
    public void openText(View view){

        FileInputStream fin = null;
        TextView textView = (TextView) findViewById(R.id.textView);
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
    //Переменные для передачи
    public int A1=0;
    public int A2=0;
    public int B1=4;
    public int B2=5;
    public int C1=6;
    public int C2=7;
    //Промежуточный костыль
    public void navremya() {
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);
        if (B1 != 0)
        {
            editText3.setText(B1);
        }
        if (B2 != 0)
        {
            editText4.setText(B2);
        }
        if (A1 != 0)
        {
            editText5.setText(A1);
        }
        if (A2 != 0)
        {
            editText6.setText(A2);
        }

    }
    //Методы для клавиш
    public void Change(View view){
        Button changebutton = findViewById(R.id.buttonM);
        Button savebutton = findViewById(R.id.button);
        changebutton.setVisibility(View.GONE);
        savebutton.setVisibility(View.VISIBLE);


        Button d1=findViewById(R.id.buttonD1);
        Button d2=findViewById(R.id.buttonD2);
        Button d3=findViewById(R.id.buttonD3);
        d1.setVisibility(View.VISIBLE);
        d2.setVisibility(View.VISIBLE);
        d3.setVisibility(View.VISIBLE);


    }
    public void Change2(View view){
        Button changebutton = findViewById(R.id.buttonM);
        Button savebutton = findViewById(R.id.button);
        changebutton.setVisibility(View.VISIBLE);
        savebutton.setVisibility(View.GONE);


        Button d1=findViewById(R.id.buttonD1);
        Button d2=findViewById(R.id.buttonD2);
        Button d3=findViewById(R.id.buttonD3);
        d1.setVisibility(View.GONE);
        d2.setVisibility(View.GONE);
        d3.setVisibility(View.GONE);
    }



    //Работаю с массивами

    public int[][] main=new int[10][3];   //[Номер растения][Возраст/Площадь посадки]
    //Плоцадь - 1
    //Возраст - 2






    public void add(View view){

    }



}





