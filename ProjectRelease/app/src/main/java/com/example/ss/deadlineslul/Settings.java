package com.example.ss.deadlineslul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

public class Settings extends AppCompatActivity {
    final String LOG_TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ListView lvMain = findViewById(R.id.lvMain3);
        MyAdapter myAdapter = new MyAdapter(Settings.this, Names, Pictures);
        lvMain.setAdapter(myAdapter);


        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Intent intent=new Intent(Settings.this,Spravka.class);
                String buf="";
                buf+=(position+1);
                intent.putExtra("Pos",buf);
                startActivity(intent);
            }
        });


        lvMain.setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                Log.d(LOG_TAG, "scrollState = " + scrollState);
            }

            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
            }
        });
    }
    String[] Names={"Картофель","Свекла","Морковь","Редис","Смородина","Помидоры","Малина","Огурцы","Перец","Капуста","Кабачки","Лук","Клубника","Земляника","Яблоня","Слива","Груша"};
    int [] Pictures={R.drawable.p1p,
            R.drawable.p4p,
            R.drawable.p3p,
            R.drawable.p2p,
            R.drawable.p5p,
            R.drawable.p6p,
            R.drawable.p7p,
            R.drawable.p8p,
            R.drawable.p9p,
            R.drawable.p10p,
            R.drawable.p11p,
            R.drawable.p12p,
            R.drawable.p13p,
            R.drawable.p14p,
            R.drawable.p15p,
            R.drawable.p16p,
            R.drawable.p17p,
    };



}