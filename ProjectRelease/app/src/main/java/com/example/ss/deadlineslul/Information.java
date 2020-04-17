package com.example.ss.deadlineslul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        TextView TextTop = findViewById(R.id.TextTop);
        TextView TextMid = findViewById(R.id.TextMid);
        TextView TextBottom = findViewById(R.id.TextBottom);
        TextTop.setText("О программе");
        TextMid.setText("Программа Easy-Gardening версия 1.0 Release");
        TextBottom.setText("\n" +
                "Разработчик: Степанов Семён Евгеньевич\n" +
                "По любым вопросам/предложениям stepanov-se@mail.ru");
    }
}
