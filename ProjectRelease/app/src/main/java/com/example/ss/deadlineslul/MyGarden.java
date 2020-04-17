package com.example.ss.deadlineslul;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyGarden extends AppCompatActivity {
    final String LOG_TAG = "myLogs";
    int currentweek=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_garden);
        //int currentweek=0;
        checkFirstStart();
        String week=openTextWeek();
        //checkforupdates();
        database();
        udobrenie();
        posadka();
        sbor();
        make();
        checkforupdates();
        decrypt();
        char[] chArray=week.toCharArray();
        for(int i=0;i<chArray.length;i++){
            currentweek*=10;
            currentweek+=Character.getNumericValue(chArray[i]);
        }
        if(currentweek==18){
            defolt(w18);
        }
        if(currentweek==19){
            defolt(w19);
        }
        if(currentweek==20){
            defolt(w20);
        }
        if(currentweek==21){
            defolt(w21);
        }
        if(currentweek==22){
            defolt(w22);
        }
        if(currentweek==23){
            defolt(w23);
        }
        if(currentweek==24){
            defolt(w24);
        }
        if(currentweek==25){
            defolt(w25);
        }
        if(currentweek==26){
            defolt(w26);
        }
        if(currentweek==27){
            defolt(w27);
        }
        if(currentweek==28){
            defolt(w28);
        }
        if(currentweek==29){
            defolt(w29);
        }
        if(currentweek==30){
            defolt(w30);
        }
        if(currentweek==31){
            defolt(w31);
        }
        if(currentweek==32){
            defolt(w32);
        }
        if(currentweek==33){
            defolt(w33);
        }
        if(currentweek==34){
            defolt(w34);
        }
        if(currentweek==35){
            defolt(w35);
        }
        if(currentweek==36){
            defolt(w36);
        }
        if(currentweek==37){
            defolt(w37);
        }
        if(currentweek==38){
            defolt(w38);
        }
        if(currentweek==39){
            defolt(w39);
        }
        if(currentweek==40){
            defolt(w40);
        }
        if(currentweek==41){
            defolt(w41);
        }
        if(currentweek==42){
            defolt(w42);
        }
        //defolt(w18);
        /*
        database();
        udobrenie();
        posadka();
        sbor();
        make();
        checkforupdates();
        */



        /*ListView lvMain = findViewById(R.id.lvMain);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,w18 );
        lvMain.setAdapter(adapter);


        lvMain.setOnItemClickListener(new AdapterView.OnItemClic kListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        */


        ListView lvMain = findViewById(R.id.List);
        lvMain.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view,
                                           int position, long id) {
                update(position);
                nubmerupdate();
                decrypt();
                if(currentweek==18){
                    set(w18.size());
                }
                if(currentweek==19){
                    set(w19.size());
                }
                if(currentweek==20){
                    set(w20.size());
                }
                if(currentweek==21){
                    set(w21.size());
                }
                if(currentweek==22){
                    set(w22.size());
                }
                if(currentweek==23){
                    set(w23.size());
                }
                if(currentweek==24){
                    set(w24.size());
                }
                if(currentweek==25){
                    set(w25.size());
                }
                if(currentweek==26){
                    set(w26.size());
                }
                if(currentweek==27){
                    set(w27.size());
                }
                if(currentweek==28){
                    set(w28.size());
                }
                if(currentweek==29){
                    set(w29.size());
                }
                if(currentweek==30){
                    set(w30.size());
                }
                if(currentweek==31){
                    set(w31.size());
                }
                if(currentweek==32){
                    set(w32.size());
                }
                if(currentweek==33){
                    set(w33.size());
                }
                if(currentweek==34){
                    set(w34.size());
                }
                if(currentweek==35){
                    set(w35.size());
                }
                if(currentweek==36){
                    set(w36.size());
                }
                if(currentweek==37){
                    set(w37.size());
                }
                if(currentweek==38){
                    set(w38.size());
                }
                if(currentweek==39){
                    set(w39.size());
                }
                if(currentweek==40){
                    set(w40.size());
                }
                if(currentweek==41){
                    set(w41.size());
                }
                if(currentweek==42){
                    set(w42.size());
                }
                return true;
            }
        });
        /*
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                update(position);
                nubmerupdate();
                decrypt();
                if(currentweek==18){
                    set(w18.size());
                }
                if(currentweek==19){
                    set(w19.size());
                }
                if(currentweek==20){
                    set(w20.size());
                }
                if(currentweek==21){
                    set(w21.size());
                }
                if(currentweek==22){
                    set(w22.size());
                }
                if(currentweek==23){
                    set(w23.size());
                }
                if(currentweek==24){
                    set(w24.size());
                }
                if(currentweek==25){
                    set(w25.size());
                }
                if(currentweek==26){
                    set(w26.size());
                }
                if(currentweek==27){
                    set(w27.size());
                }
                if(currentweek==28){
                    set(w28.size());
                }
                if(currentweek==29){
                    set(w29.size());
                }
                if(currentweek==30){
                    set(w30.size());
                }
                if(currentweek==31){
                    set(w31.size());
                }
                if(currentweek==32){
                    set(w32.size());
                }
                if(currentweek==33){
                    set(w33.size());
                }
                if(currentweek==34){
                    set(w34.size());
                }
                if(currentweek==35){
                    set(w35.size());
                }
                if(currentweek==36){
                    set(w36.size());
                }
                if(currentweek==37){
                    set(w37.size());
                }
                if(currentweek==38){
                    set(w38.size());
                }
                if(currentweek==39){
                    set(w39.size());
                }
                if(currentweek==40){
                    set(w40.size());
                }
                if(currentweek==41){
                    set(w41.size());
                }
                if(currentweek==42){
                    set(w42.size());
                }

            }
        });
        */
        lvMain.setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                Log.d(LOG_TAG, "scrollState = " + scrollState);
            }

            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
            }
        });


    }

    String ww18;
    String ww19;
    String ww20;
    String ww21;
    String ww22;
    String ww23;
    String ww24;
    String ww25;
    String ww26;
    String ww27;
    String ww28;
    String ww29;
    String ww30;
    String ww31;
    String ww32;
    String ww33;
    String ww34;
    String ww35;
    String ww36;
    String ww37;
    String ww38;
    String ww39;
    String ww40;
    String ww41;
    String ww42;

    public void checkforupdates(){
        String str=openTextChange();
        if(str.contains("1")){
            numbersbuild();
            numbersset();
           decrypt();
            //test();
            saveTextChange("0");
        }
    }

    public void numbersbuild(){
        ww18="00000000000000000000000000000000000000000000000000";
        ww19="00000000000000000000000000000000000000000000000000";
        ww20="00000000000000000000000000000000000000000000000000";
        ww21="00000000000000000000000000000000000000000000000000";
        ww22="00000000000000000000000000000000000000000000000000";
        ww23="00000000000000000000000000000000000000000000000000";
        ww24="00000000000000000000000000000000000000000000000000";
        ww25="00000000000000000000000000000000000000000000000000";
        ww26="00000000000000000000000000000000000000000000000000";
        ww27="00000000000000000000000000000000000000000000000000";
        ww28="00000000000000000000000000000000000000000000000000";
        ww29="00000000000000000000000000000000000000000000000000";
        ww30="00000000000000000000000000000000000000000000000000";
        ww31="00000000000000000000000000000000000000000000000000";
        ww32="00000000000000000000000000000000000000000000000000";
        ww33="00000000000000000000000000000000000000000000000000";
        ww34="00000000000000000000000000000000000000000000000000";
        ww35="00000000000000000000000000000000000000000000000000";
        ww36="00000000000000000000000000000000000000000000000000";
        ww37="00000000000000000000000000000000000000000000000000";
        ww38="00000000000000000000000000000000000000000000000000";
        ww39="00000000000000000000000000000000000000000000000000";
        ww40="00000000000000000000000000000000000000000000000000";
        ww41="00000000000000000000000000000000000000000000000000";
        ww42="00000000000000000000000000000000000000000000000000";
    }
    public void numbersset(){
        String input=ww18+";"+ww19+";"+ww20+";"+ww21+";"+ww22+";"+ww23+";"+ww24+";"+ww25+";"+ww26+";"
                +ww27+";"+ww28+";"+ww29+";"+ww30+";"+ww31+";"+ww32+";"+ww33
                +";"+ww34+";"+ww35+";"+ww36+";"+ww37+";"+ww38+";"+ww39+";"+ww40+";"+ww41+";"+ww42+";";
        saveTextNum(input);
    }
    public void nubmerupdate(){
        String input="";
        for(int i=18;i<43;i++){
            input+=output.get(i-18)+";";
        }
        saveTextNum(input);
    }
    public void test(){
        for(int i=18;i<43;i++){
            output.add("00000000000000000000000000000000000000000000000000");
        }
    }
    ArrayList<String> output=new ArrayList<>();
    public void decrypt(){
        output.clear();
        String input=openTextNum();
        char[] chArray=input.toCharArray();
        int index=0;
        int undex=0;
        for(int i=18;i<43;i++){
            String buffer="";
            while(chArray[index]!=';'){
                index++;
            }
            for(int j=undex;j<index;j++){
                buffer+=chArray[j];
            }
            index++;
            undex=index;
            output.add(buffer);
            buffer="";
        }

    }
    public void set(int size){
        String buffer =output.get(currentweek-18);
        char[] chArray=buffer.toCharArray();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=Character.getNumericValue(chArray[i]);
        }
        if(currentweek==18) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w18, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==19) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w19, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==20) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w20, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==21) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w21, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==22) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w22, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==23) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w23, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==24) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w24, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==25) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w25, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==26) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w26, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==27) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w27, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==28) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w28, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==29) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w29, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==30) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w30, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==31) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w31, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==32) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w32, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==33) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w33, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==34) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w34, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==35) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w35, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==36) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w36, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==37) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w37, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==38) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w38, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==39) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w39, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==40) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w40, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==41) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w41, a);
            lvMain.setAdapter(myAdapter);
        }
        if(currentweek==42) {
            ListView lvMain = findViewById(R.id.List);
            MySecondAdapter myAdapter = new MySecondAdapter(MyGarden.this, w42, a);
            lvMain.setAdapter(myAdapter);
        }


    }
    public void update(int position){
        String buffer=output.get(currentweek-18);
        char[] chArray=buffer.toCharArray();
        if(chArray[position]=='0'){
            chArray[position]='1';
        }
        else chArray[position]='0';
        buffer=chArray.toString();
        output.set(currentweek-18,buffer);
        nubmerupdate();
        decrypt();
    }

    //Hope that's worth it

    List<String> x=new ArrayList<>();
    String[] databasemain = new String[18];
    String[] databaseudob=new String[18];
    String[] databaseposadka=new String[18];
    String[] databasesbor=new String[18];
    String sornyak="Удалите сорняки";

    public void database() {
        databasemain[0]="test";
        databasemain[1]="Необходимо полить картофель";
        databasemain[2]="Необходимо полить свеклу";
        databasemain[3]="Необходимо полить морковь";
        databasemain[4]="Необходимо полить редис";
        databasemain[5]="Необходимо полить смородину 1 раз ";
        databasemain[6]="Необходимо полить помидоры";
        databasemain[7]="Необходимо полить малину";
        databasemain[8]="Необходимо полить огурцы 2 разв ";
        databasemain[9]="Необходимо полить перец";
        databasemain[10]="Необходимо полить капусту";
        databasemain[11]="Необходимо полить кабачки";
        databasemain[12]="Необходимо полить лук";
        databasemain[13]="Необходимо полить клубнику";
        databasemain[14]="Необходимо полить землянику";
        databasemain[15]="Необходимо полить яблоню(и)";
        databasemain[16]="Необходимо полить сливу(ы)";
        databasemain[17]="Необходимо полить грушу(и)";
    }

    public void udobrenie(){
        databaseudob[0]="test";
        databaseudob[1]="Необходимо удобрить картофель";
        databaseudob[2]="Необходимо удобрить свеклу";
        databaseudob[3]="Необходимо удобрить морковь";
        databaseudob[4]="Необходимо удобрить редис";
        databaseudob[5]="Необходимо удобрить смородину";
        databaseudob[6]="Необходимо удобрить помидоры";
        databaseudob[7]="Необходимо удобрить малину";
        databaseudob[8]="Необходимо удобрить огурцы";
        databaseudob[9]="Необходимо удобрить перец";
        databaseudob[10]="Необходимо удобрить капусту";
        databaseudob[11]="Необходимо удобрить кабачки";
        databaseudob[12]="Необходимо удобрить лук";
        databaseudob[13]="Необходимо удобрить клубнику";
        databaseudob[14]="Необходимо удобрить землянику";
        databaseudob[15]="Необходимо удобрить яблоню(и)";
        databaseudob[16]="Необходимо удобрить сливу(ы)";
        databaseudob[17]="Необходимо удобрить грушу(и)";
    }

    public void posadka() {
        databaseposadka[0]="test";
        databaseposadka[1]="Необходимо высадить картофель";
        databaseposadka[2]="Необходимо высадить свеклу";
        databaseposadka[3]="Необходимо высадить морковь";
        databaseposadka[4]="Необходимо высадить редис";
        databaseposadka[5]="Необходимо высадить смородину";
        databaseposadka[6]="Необходимо высадить помидоры";
        databaseposadka[7]="Необходимо высадить малину";
        databaseposadka[8]="Необходимо высадить огурцы";
        databaseposadka[9]="Необходимо высадить перец";
        databaseposadka[10]="Необходимо высадить капусту";
        databaseposadka[11]="Необходимо высадить кабачки";
        databaseposadka[12]="Необходимо высадить лук";
        databaseposadka[13]="Необходимо высадить клубнику";
        databaseposadka[14]="Необходимо высадить землянику";
        databaseposadka[15]="Необходимо высадить яблоню(и)";
        databaseposadka[16]="Необходимо высадить сливу(ы)";
        databaseposadka[17]="Необходимо высадить грушу(и)";
    }

    public void sbor(){
        databasesbor[0]="test";
        databasesbor[1]="Сбор картофеля";
        databasesbor[2]="Сбор свеклы";
        databasesbor[3]="Сбор моркови";
        databasesbor[4]="Сбор редиса";
        databasesbor[5]="Сбор смородины";
        databasesbor[6]="Сбор помидоров";
        databasesbor[7]="Сбор малины";
        databasesbor[8]="Сбор огурцов";
        databasesbor[9]="Сбор перца";
        databasesbor[10]="Сбор капусты";
        databasesbor[11]="Сбор кабачков";
        databasesbor[12]="Сбор лука";
        databasesbor[13]="Сбор клубники";
        databasesbor[14]="Сбор земляники";
        databasesbor[15]="Сбор яблок";
        databasesbor[16]="Сбор слив";
        databasesbor[17]="Сбор груш";
    }



    //OmegaLUL

    List<String> w18 =new ArrayList<>();
    List<String> w19 =new ArrayList<>();
    List<String> w20 =new ArrayList<>();
    List<String> w21 =new ArrayList<>();
    List<String> w22 =new ArrayList<>();
    List<String> w23 =new ArrayList<>();
    List<String> w24 =new ArrayList<>();
    List<String> w25 =new ArrayList<>();
    List<String> w26 =new ArrayList<>();
    List<String> w27 =new ArrayList<>();
    List<String> w28 =new ArrayList<>();
    List<String> w29 =new ArrayList<>();
    List<String> w30 =new ArrayList<>();
    List<String> w31 =new ArrayList<>();
    List<String> w32 =new ArrayList<>();
    List<String> w33 =new ArrayList<>();
    List<String> w34 =new ArrayList<>();
    List<String> w35 =new ArrayList<>();
    List<String> w36 =new ArrayList<>();
    List<String> w37 =new ArrayList<>();
    List<String> w38 =new ArrayList<>();
    List<String> w39 =new ArrayList<>();
    List<String> w40 =new ArrayList<>();
    List<String> w41 =new ArrayList<>();
    List<String> w42 =new ArrayList<>();

    public void make(){
        int cur=0;
        String main=openText();
        char[] chArray=main.toCharArray();
        for(int i=0;i<main.length()-1;i++){
            if(chArray[i]=='!' &&(chArray[i+1]=='0' || chArray[i+1]=='1') && chArray[i+3]=='#'){
                if(chArray[i+1]=='0'){
                    cur=Character.getNumericValue(chArray[i+2]);
                    w18.add(databasemain[cur]);
                    w19.add(databasemain[cur]);
                    w20.add(databasemain[cur]);
                    w21.add(databasemain[cur]);
                    w22.add(databasemain[cur]);
                    w23.add(databasemain[cur]);
                    w24.add(databasemain[cur]);
                    w25.add(databasemain[cur]);
                    w26.add(databasemain[cur]);
                    w27.add(databasemain[cur]);
                    w28.add(databasemain[cur]);
                    w29.add(databasemain[cur]);
                    w30.add(databasemain[cur]);
                    w31.add(databasemain[cur]);
                    w32.add(databasemain[cur]);
                    w33.add(databasemain[cur]);
                    w34.add(databasemain[cur]);
                    w35.add(databasemain[cur]);
                    w36.add(databasemain[cur]);
                    w37.add(databasemain[cur]);
                    w38.add(databasemain[cur]);
                    w39.add(databasemain[cur]);
                    w40.add(databasemain[cur]);
                    w41.add(databasemain[cur]);
                    w42.add(databasemain[cur]);
                }
                else {
                    cur=10+Character.getNumericValue(chArray[i+2]);
                    if(cur!=15 && cur!=16 && cur!=17) {
                        w18.add(databasemain[cur]);
                        w19.add(databasemain[cur]);
                        w20.add(databasemain[cur]);
                        w21.add(databasemain[cur]);
                        w22.add(databasemain[cur]);
                        w23.add(databasemain[cur]);
                        w24.add(databasemain[cur]);
                        w25.add(databasemain[cur]);
                        w26.add(databasemain[cur]);
                        w27.add(databasemain[cur]);
                        w28.add(databasemain[cur]);
                        w29.add(databasemain[cur]);
                        w30.add(databasemain[cur]);
                        w31.add(databasemain[cur]);
                        w32.add(databasemain[cur]);
                        w33.add(databasemain[cur]);
                        w34.add(databasemain[cur]);
                        w35.add(databasemain[cur]);
                        w36.add(databasemain[cur]);
                        w37.add(databasemain[cur]);
                        w38.add(databasemain[cur]);
                        w39.add(databasemain[cur]);
                        w40.add(databasemain[cur]);
                        w41.add(databasemain[cur]);
                        w42.add(databasemain[cur]);
                    }
                    else{
                        w18.add(databasemain[cur]);
                        //w19.add(databasemain[cur]);
                        w20.add(databasemain[cur]);
                       // w21.add(databasemain[cur]);
                        w22.add(databasemain[cur]);
                       // w23.add(databasemain[cur]);
                        w24.add(databasemain[cur]);
                       // w25.add(databasemain[cur]);
                        w26.add(databasemain[cur]);
                       // w27.add(databasemain[cur]);
                        w28.add(databasemain[cur]);
                       // w29.add(databasemain[cur]);
                        w30.add(databasemain[cur]);
                       // w31.add(databasemain[cur]);
                        w32.add(databasemain[cur]);
                       // w33.add(databasemain[cur]);
                        w34.add(databasemain[cur]);
                       //w35.add(databasemain[cur]);
                        w36.add(databasemain[cur]);
                       // w37.add(databasemain[cur]);
                        w38.add(databasemain[cur]);
                      // w39.add(databasemain[cur]);
                        w40.add(databasemain[cur]);
                       // w41.add(databasemain[cur]);
                        w42.add(databasemain[cur]);
                    }
                }
                if(cur==1){
                    w18.add(databaseposadka[1]);
                    w19.add(databaseposadka[1]);
                    w39.add(databasesbor[1]);
                    w40.add(databasesbor[1]);
                    w41.add(databasesbor[1]);
                    w42.add(databasesbor[1]);
                    w20.add(databaseudob[1]);
                    w20.add(sornyak);
                    w20.add("Окучить Картофель");
                   // w19.add(databaseudob[1]);
                    w25.add(databaseudob[1]);
                    w25.add(sornyak);
                    w31.add(databaseudob[1]);
                    w31.add(sornyak);
                    w31.add("Окучить картофель");
                    w37.add(databaseudob[1]);
                    w37.add(sornyak);
                   // w35.add(databaseudob[1]);
                }
                if(cur==2){
                    w18.add(databaseposadka[2]);
                    w19.add(databaseposadka[2]);
                    w39.add(databasesbor[2]);
                    w40.add(databasesbor[2]);
                    w41.add(databasesbor[2]);
                    w42.add(databasesbor[2]);
                    w25.add(databaseudob[2]);
                    w25.add(sornyak);
                    w31.add(databaseudob[2]);
                    w31.add(sornyak);
                    w37.add(databaseudob[2]);
                    w37.add(sornyak);
                }
                if(cur==3){
                    w18.add(databaseposadka[3]);
                    w19.add(databaseposadka[3]);
                    w39.add(databasesbor[3]);
                    w40.add(databasesbor[3]);
                    w41.add(databasesbor[3]);
                    w42.add(databasesbor[3]);
                    w23.add(databaseudob[3]);
                    w25.add(sornyak);
                    w31.add(sornyak);
                    w37.add(sornyak);

                }
                if(cur==4){
                    w18.add(databaseposadka[4]);
                    w19.add(databaseposadka[4]);
                    w39.add(databasesbor[4]);
                    w40.add(databasesbor[4]);
                    w41.add(databasesbor[4]);
                    w42.add(databasesbor[4]);
                    w25.add(databaseudob[4]);
                    w31.add(databaseudob[4]);
                    w25.add(sornyak);
                    w31.add(sornyak);
                    w37.add(sornyak);

                }
                if(cur==5){
                    w18.add(databaseposadka[5]);
                    w19.add(databaseposadka[5]);
                    w39.add(databasesbor[5]);
                    w40.add(databasesbor[5]);
                    w41.add(databasesbor[5]);
                    w42.add(databasesbor[5]);
                    w25.add(databaseudob[5]);
                    w25.add(sornyak);
                    w31.add(databaseudob[5]);
                    w31.add(sornyak);
                    w37.add(databaseudob[5]);
                    w37.add(sornyak);
                }
                if(cur==6){
                    w18.add(databaseposadka[6]);
                    w19.add(databaseposadka[6]);
                    w39.add(databasesbor[6]);
                    w40.add(databasesbor[6]);
                    w41.add(databasesbor[6]);
                    w42.add(databasesbor[6]);
                    w25.add(databaseudob[6]);
                    w25.add(sornyak);
                    w31.add(databaseudob[6]);
                    w31.add(sornyak);
                    w37.add(databaseudob[6]);
                    w37.add(sornyak);
                }
                if(cur==7){
                    w18.add(databaseposadka[7]);
                    w19.add(databaseposadka[7]);
                    w39.add(databasesbor[7]);
                    w40.add(databasesbor[7]);
                    w41.add(databasesbor[7]);
                    w42.add(databasesbor[7]);
                    w25.add(databaseudob[7]);
                    w25.add(sornyak);
                    w31.add(databaseudob[7]);
                    w31.add(sornyak);
                    w37.add(databaseudob[7]);
                    w37.add(sornyak);
                }
                if(cur==8){
                    w18.add(databaseposadka[8]);
                    w19.add(databaseposadka[8]);
                    w39.add(databasesbor[8]);
                    w40.add(databasesbor[8]);
                    w41.add(databasesbor[8]);
                    w42.add(databasesbor[8]);
                    w25.add(databaseudob[8]);
                    w25.add(sornyak);
                    w31.add(databaseudob[8]);
                    w31.add(sornyak);
                    w37.add(databaseudob[8]);
                    w37.add(sornyak);
                }
                if(cur==9){
                    w18.add(databaseposadka[9]);
                    w19.add(databaseposadka[9]);
                    w39.add(databasesbor[9]);
                    w40.add(databasesbor[9]);
                    w41.add(databasesbor[9]);
                    w42.add(databasesbor[9]);
                    w25.add(databaseudob[9]);
                    w25.add(sornyak);
                    w31.add(databaseudob[9]);
                    w31.add(sornyak);
                    w37.add(databaseudob[9]);
                    w37.add(sornyak);
                }
                if(cur==10){
                    w18.add(databaseposadka[10]);
                    w19.add(databaseposadka[10]);
                    w39.add(databasesbor[10]);
                    w40.add(databasesbor[10]);
                    w41.add(databasesbor[10]);
                    w42.add(databasesbor[10]);
                    w25.add(databaseudob[10]);
                    w25.add(sornyak);
                    w31.add(databaseudob[10]);
                    w31.add(sornyak);
                    w37.add(databaseudob[10]);
                    w37.add(sornyak);
                }
                if(cur==11){
                    w18.add(databaseposadka[11]);
                    w19.add(databaseposadka[11]);
                    w39.add(databasesbor[11]);
                    w40.add(databasesbor[11]);
                    w41.add(databasesbor[11]);
                    w42.add(databasesbor[11]);
                    w25.add(databaseudob[11]);
                    w25.add(sornyak);
                    w31.add(databaseudob[11]);
                    w31.add(sornyak);
                    w37.add(databaseudob[11]);
                    w37.add(sornyak);
                }
                if(cur==12){
                    w18.add(databaseposadka[12]);
                    w19.add(databaseposadka[12]);
                    w39.add(databasesbor[12]);
                    w40.add(databasesbor[12]);
                    w41.add(databasesbor[12]);
                    w42.add(databasesbor[12]);
                    w25.add(databaseudob[12]);
                    w25.add(sornyak);
                    w31.add(databaseudob[12]);
                    w31.add(sornyak);
                    w37.add(databaseudob[12]);
                    w37.add(sornyak);
                }
                if(cur==13){
                    w18.add(databaseposadka[13]);
                    w19.add(databaseposadka[13]);
                    w39.add(databasesbor[13]);
                    w40.add(databasesbor[13]);
                    w41.add(databasesbor[13]);
                    w42.add(databasesbor[13]);
                    w25.add(databaseudob[13]);
                    w25.add("Обрезать Усы");
                    w25.add(sornyak);
                    w31.add("Обрезать Усы");
                    w37.add("Обрезать Усы");
                    w31.add(sornyak);
                    w37.add(sornyak);

                }
                if(cur==14){
                    w18.add(databaseposadka[14]);
                    w19.add(databaseposadka[14]);
                    w39.add(databasesbor[14]);
                    w40.add(databasesbor[14]);
                    w41.add(databasesbor[14]);
                    w42.add(databasesbor[14]);
                    w25.add(databaseudob[14]);
                    w25.add("Обрезать Усы");
                    w25.add(sornyak);
                    w31.add("Обрезать Усы");
                    w37.add("Обрезать Усы");
                    w31.add(sornyak);
                    w37.add(sornyak);

                }
                if(cur==15){
                    w18.add(databaseposadka[15]);
                    w19.add(databaseposadka[15]);
                    w39.add(databasesbor[15]);
                    w40.add(databasesbor[15]);
                    w41.add(databasesbor[15]);
                    w42.add(databasesbor[15]);
                    w25.add(databaseudob[15]);
                    w37.add(databaseudob[15]);
                }
                if(cur==16){
                    w18.add(databaseposadka[16]);
                    w19.add(databaseposadka[16]);
                    w39.add(databasesbor[16]);
                    w40.add(databasesbor[16]);
                    w41.add(databasesbor[16]);
                    w42.add(databasesbor[16]);
                    w25.add(databaseudob[16]);
                    w37.add(databaseudob[16]);
                }
                if(cur==17){
                    w18.add(databaseposadka[17]);
                    w19.add(databaseposadka[17]);
                    w39.add(databasesbor[17]);
                    w40.add(databasesbor[17]);
                    w41.add(databasesbor[17]);
                    w42.add(databasesbor[17]);
                    w25.add(databaseudob[17]);
                    w37.add(databaseudob[17]);
                }
            }
        }
    }


    public void Intenthere(View view){
        String top="";
        top=ChangeString(top,current);
        String bottom="";
        bottom=ChangeStringd(bottom,current);
        String gogo="";
        gogo+=top;
        gogo+="!";
        gogo+=bottom;
        saveTextBuffer(gogo);
        String Buffer="";
        Buffer+=current;
        saveTextWeek(Buffer);
        Intent intent = new Intent(MyGarden.this,MyGarden_2.class);
        startActivity(intent);
    }

    public void defolt(List<String> w) {
        set(w.size());
        String visible="";
        visible+=currentweek+" Неделя";
        String dvisible="hahaha";
        current=currentweek;
        TextView TextViewTop=findViewById(R.id.textViewfirst);
        TextView TextViewBottom=findViewById(R.id.textViewsecond);
        String top="";
        top=ChangeString(top,current);
        TextViewTop.setText(top);
        String bottom="";
        bottom=ChangeStringd(bottom,current);
        TextViewBottom.setText((bottom));
    }

    public static String ChangeString(String visible,int current) {
        visible=current+" Неделя";
        return visible;
    }

    public static String ChangeStringd(String dvisible,int current){
        if(current==18){
            dvisible="30.04.18 - 06.05.18";
        }
        else if(current==19){
            dvisible="07.05.18 - 13.05.18";
        }
        else if(current==20){
            dvisible="14.05.18 - 20.05.18";
        }
        else if(current==21){
            dvisible="21.05.18 - 27.05.18";
        }
        else if(current==22){
            dvisible="28.05.18 - 03.06.18";
        }
        else if(current==23){
            dvisible="04.06.18 - 10.06.18";
        }
        else if(current==24){
            dvisible="11.06.18 - 17.06.18";
        }
        else if(current==25){
            dvisible="18.06.18 - 24.06.18";
        }
        else if(current==26){
            dvisible="25.06.18 - 01.07.18";
        }
        else if(current==27){
            dvisible="02.07.18 - 08.07.18";
        }
        else if(current==28){
            dvisible="09.07.18 - 15.07.18";
        }
        else if(current==29){
            dvisible="16.07.18 - 22.07.18";
        }
        else if(current==30){
            dvisible="23.07.18 - 29.07.18";
        }
        else if(current==31){
            dvisible="30.07.18 - 05.08.18";
        }
        else if(current==32){
            dvisible="06.08.18 - 12.08.18";
        }
        else if(current==33){
            dvisible="13.08.18 - 19.08.18";
        }
        else if(current==34){
            dvisible="20.08.18 - 26.08.18";
        }
        else if(current==35){
            dvisible="27.08.18 - 02.09.18";
        }
        else if(current==36){
            dvisible="03.09.18 - 09.09.18";
        }
        else if(current==37){
            dvisible="10.09.18 - 16.09.18";
        }
        else if(current==38){
            dvisible="17.096.18 - 23.09.18";
        }
        else if(current==39){
            dvisible="01.10.18 - 07.10.18";
        }
        else if(current==40){
            dvisible="08.10.18 - 14.10.18";
        }
        else if(current==41){
            dvisible="15.10.18 - 21.10.18";
        }
        else if(current==42){
            dvisible="22.10.18 - 29.10.18";
        }
        return dvisible;
    }

    String visible="18 Неделя";
    String dvisible="01.05.18";
    int current=18;

    public void Next(View view){
        current++;
        if(current==43){
            current=18;
        }
        currentweek++;
        if(currentweek==43){
            currentweek=18;
        }
        TextView TextViewTop=findViewById(R.id.textViewfirst);
        TextView TextViewBottom=findViewById(R.id.textViewsecond);
        String top="";
        top=ChangeString(top,current);
        TextViewTop.setText(top);
        String bottom="";
        bottom=ChangeStringd(bottom,current);
        TextViewBottom.setText((bottom));
        ListView List = findViewById(R.id.List);
        if(currentweek==18){
            set(w18.size());
        }
        if(currentweek==19){
            set(w19.size());
        }
        if(currentweek==20){
            set(w20.size());
        }
        if(currentweek==21){
            set(w21.size());
        }
        if(currentweek==22){
            set(w22.size());
        }
        if(currentweek==23){
            set(w23.size());
        }
        if(currentweek==24){
            set(w24.size());
        }
        if(currentweek==25){
            set(w25.size());
        }
        if(currentweek==26){
            set(w26.size());
        }
        if(currentweek==27){
            set(w27.size());
        }
        if(currentweek==28){
            set(w28.size());
        }
        if(currentweek==29){
            set(w29.size());
        }
        if(currentweek==30){
            set(w30.size());
        }
        if(currentweek==31){
            set(w31.size());
        }
        if(currentweek==32){
            set(w32.size());
        }
        if(currentweek==33){
            set(w33.size());
        }
        if(currentweek==34){
            set(w34.size());
        }
        if(currentweek==35){
            set(w35.size());
        }
        if(currentweek==36){
            set(w36.size());
        }
        if(currentweek==37){
            set(w37.size());
        }
        if(currentweek==38){
            set(w38.size());
        }
        if(currentweek==39){
            set(w39.size());
        }
        if(currentweek==40){
            set(w40.size());
        }
        if(currentweek==41){
            set(w41.size());
        }
        if(currentweek==42){
            set(w42.size());
        }
        /*
        if(current==18){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w18 );
        List.setAdapter(adapter);
        }
        if(current==19){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w19);
            List.setAdapter(adapter);
        }
        if(current==20){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w20 );
            List.setAdapter(adapter);
        }
        if(current==21){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w21);
            List.setAdapter(adapter);
        }
        if(current==22){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w22);
            List.setAdapter(adapter);
        }
        if(current==23){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w23);
            List.setAdapter(adapter);
        }
        if(current==24){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w24);
            List.setAdapter(adapter);
        }
        if(current==25){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w25 );
            List.setAdapter(adapter);
        }
        if(current==26){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w26);
            List.setAdapter(adapter);
        }
        if(current==27){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w27 );
            List.setAdapter(adapter);
        }
        if(current==28){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w28 );
            List.setAdapter(adapter);
        }
        if(current==29){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w29);
            List.setAdapter(adapter);
        }
        if(current==30){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w30 );
            List.setAdapter(adapter);
        }
        if(current==31){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w31);
            List.setAdapter(adapter);
        }
        if(current==32){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w32 );
            List.setAdapter(adapter);
        }
        if(current==33){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w33 );
            List.setAdapter(adapter);
        }
        if(current==34){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w34 );
            List.setAdapter(adapter);
        }
        if(current==35){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w35 );
            List.setAdapter(adapter);
        }
        if(current==36){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w36 );
            List.setAdapter(adapter);
        }
        if(current==37){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w37);
            List.setAdapter(adapter);
        }
        if(current==38){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w38 );
            List.setAdapter(adapter);
        }
        if(current==39){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w39 );
            List.setAdapter(adapter);
        }
        if(current==40){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w40 );
            List.setAdapter(adapter);
        }
        if(current==41){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w41);
            List.setAdapter(adapter);
        }
        if(current==42){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w42);
            List.setAdapter(adapter);
        }
        */
    }
    public void Prev(View view){
        current--;
        if(current==17){
            current=42;
        }
        currentweek--;
        if(currentweek==17){
            currentweek=42;
        }
        TextView TextViewTop=findViewById(R.id.textViewfirst);
        TextView TextViewBottom=findViewById(R.id.textViewsecond);
        String top="";
        top=ChangeString(top,current);
        TextViewTop.setText(top);
        String bottom="";
        bottom=ChangeStringd(bottom,current);
        TextViewBottom.setText((bottom));
        ListView List = findViewById(R.id.List);
        if(currentweek==18){
            set(w18.size());
        }
        if(currentweek==19){
            set(w19.size());
        }
        if(currentweek==20){
            set(w20.size());
        }
        if(currentweek==21){
            set(w21.size());
        }
        if(currentweek==22){
            set(w22.size());
        }
        if(currentweek==23){
            set(w23.size());
        }
        if(currentweek==24){
            set(w24.size());
        }
        if(currentweek==25){
            set(w25.size());
        }
        if(currentweek==26){
            set(w26.size());
        }
        if(currentweek==27){
            set(w27.size());
        }
        if(currentweek==28){
            set(w28.size());
        }
        if(currentweek==29){
            set(w29.size());
        }
        if(currentweek==30){
            set(w30.size());
        }
        if(currentweek==31){
            set(w31.size());
        }
        if(currentweek==32){
            set(w32.size());
        }
        if(currentweek==33){
            set(w33.size());
        }
        if(currentweek==34){
            set(w34.size());
        }
        if(currentweek==35){
            set(w35.size());
        }
        if(currentweek==36){
            set(w36.size());
        }
        if(currentweek==37){
            set(w37.size());
        }
        if(currentweek==38){
            set(w38.size());
        }
        if(currentweek==39){
            set(w39.size());
        }
        if(currentweek==40){
            set(w40.size());
        }
        if(currentweek==41){
            set(w41.size());
        }
        if(currentweek==42){
            set(w42.size());
        }
        /*
        if(current==18){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w18 );
            List.setAdapter(adapter);
        }
        if(current==19){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w19);
            List.setAdapter(adapter);
        }
        if(current==20){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w20 );
            List.setAdapter(adapter);
        }
        if(current==21){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w21);
            List.setAdapter(adapter);
        }
        if(current==22){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w22);
            List.setAdapter(adapter);
        }
        if(current==23){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w23);
            List.setAdapter(adapter);
        }
        if(current==24){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w24);
            List.setAdapter(adapter);
        }
        if(current==25){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w25 );
            List.setAdapter(adapter);
        }
        if(current==26){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w26);
            List.setAdapter(adapter);
        }
        if(current==27){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w27 );
            List.setAdapter(adapter);
        }
        if(current==28){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w28 );
            List.setAdapter(adapter);
        }
        if(current==29){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w29);
            List.setAdapter(adapter);
        }
        if(current==30){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w30 );
            List.setAdapter(adapter);
        }
        if(current==31){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w31);
            List.setAdapter(adapter);
        }
        if(current==32){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w32 );
            List.setAdapter(adapter);
        }
        if(current==33){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w33 );
            List.setAdapter(adapter);
        }
        if(current==34){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w34 );
            List.setAdapter(adapter);
        }
        if(current==35){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w35 );
            List.setAdapter(adapter);
        }
        if(current==36){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w36 );
            List.setAdapter(adapter);
        }
        if(current==37){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w37);
            List.setAdapter(adapter);
        }
        if(current==38){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w38 );
            List.setAdapter(adapter);
        }
        if(current==39){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w39 );
            List.setAdapter(adapter);
        }
        if(current==40){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w40 );
            List.setAdapter(adapter);
        }
        if(current==41){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w41);
            List.setAdapter(adapter);
        }
        if(current==42){
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack,R.id.TextBlack,w42);
            List.setAdapter(adapter);
        }
        */
    }


    //Метод для возврата значения

    private final static String FILE_NAME = "content.txt";
    private final static String FILE_NAMEBUFFER = "contentbuffer.txt";

    public String openText(){

        FileInputStream fin = null;
        TextView textView = (TextView) findViewById(R.id.textView);
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            return text;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            String kostil="Slomalos";
            return kostil;
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

    @Override
    public void onBackPressed() {
        String Buffer="";
        Buffer+=current;
        saveTextWeek(Buffer);
        Intent intentback=new Intent(MyGarden.this,MainActivity.class);
        startActivity(intentback);
        finish();
    }

// 3 мильярда лошадиных сил
    public void saveTextBuffer(String obmen){
        FileOutputStream fos = null;
        try {

            String text=obmen;
            fos = openFileOutput(FILE_NAMEBUFFER, MODE_PRIVATE);
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


    //Старт 18 неделя
    //Конец 42 неделя

    private final static String FILE_NAMEWEEK = "contentweek.txt";

    public String openTextWeek(){

        FileInputStream fin = null;
        TextView textView = (TextView) findViewById(R.id.textView);
        try {
            fin = openFileInput(FILE_NAMEWEEK);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            return text;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            String kostil="Slomalos";
            return kostil;
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

    public void saveTextWeek(String obmen){
        FileOutputStream fos = null;
        try {

            String text=obmen;
            fos = openFileOutput(FILE_NAMEWEEK, MODE_PRIVATE);
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




    private void checkFirstStart() {

        SharedPreferences sp2 = getSharedPreferences("hasVisited2",
                Context.MODE_PRIVATE);
        boolean hasVisited = sp2.getBoolean("hasVisited2", false);

        if (!hasVisited) {
            saveTextWeek("18");
            saveTextNum(";;;;;;;;;;;;;;;;;;;;;;;;;");
            SharedPreferences.Editor e = sp2.edit();
            e.putBoolean("hasVisited2", true);
            e.commit();
        } else {

        }
    }
    private final static String FILE_NAMECHANGE = "contentchange.txt";

    public String openTextChange(){

        FileInputStream fin = null;
        try {
            fin = openFileInput(FILE_NAMECHANGE);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            return text;
        }

        catch(IOException ex) {

            boolean kostil=true;
            return FILE_NAMECHANGE;
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                boolean kostil=true;
            }
        }
    }
    public void saveTextChange(String obmen){
        FileOutputStream fos = null;
        try {

            String text = obmen;
            fos = openFileOutput(FILE_NAMECHANGE, MODE_PRIVATE);
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
    private final static String FILE_NAMENUM = "contentnum.txt";

    public String openTextNum(){

        FileInputStream fin = null;
        try {
            fin = openFileInput(FILE_NAMENUM);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            return text;
        }

        catch(IOException ex) {

            boolean kostil=true;
            return FILE_NAMENUM;
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                boolean kostil=true;
            }
        }
    }
    public void saveTextNum(String obmen){
        FileOutputStream fos = null;
        try {

            String text = obmen;
            fos = openFileOutput(FILE_NAMENUM, MODE_PRIVATE);
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






}


