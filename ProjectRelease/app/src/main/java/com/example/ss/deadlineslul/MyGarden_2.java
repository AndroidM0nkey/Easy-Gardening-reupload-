package com.example.ss.deadlineslul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyGarden_2 extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_garden_2);
        StringPlacer();
        make();
        show();
        //w18.add("Органическое удобрение(250 г)(/Сульфат Аммония(250 г)/Аммиачная селитра(150 г)");




        ListView lvMain = findViewById(R.id.ListMat);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listblack2,R.id.TextBlack,w18);
        //lvMain.setAdapter(adapter);


        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {

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

    public void intented(View view){
        Intent intented = new Intent(MyGarden_2.this,MyGarden.class);
        startActivity(intented);
        finish();
    }

    int current = 0; //test==0

    public void StringPlacer() {
        String buffer = openTextBUFFER();
        char[] chArray = buffer.toCharArray();
        String curbuf = "";
        curbuf += chArray[0];
        curbuf += chArray[1];
        current = Integer.parseInt(curbuf);
        String first = "";
        String second = "";
        int ibuf = 0;
        while(chArray[ibuf]!='!'){
            first+=chArray[ibuf];
            ibuf++;
        }
        ibuf++;
        for (int i = ibuf; i < chArray.length; i++) {
            second += chArray[i];
        }
        TextView firstView = findViewById(R.id.textViewtop);
        firstView.setText(first);
        TextView secondView = findViewById(R.id.textViewbottom);
        secondView.setText(second);

    }

    public void show(){
        ListView List = findViewById(R.id.ListMat);
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

    }

    //РAHAHA THATS MY CODE


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



    private final static String FILE_NAMEBUFFER = "contentbuffer.txt";

    public String openTextBUFFER(){

        FileInputStream fin = null;
        TextView textView = (TextView) findViewById(R.id.textView);
        try {
            fin = openFileInput(FILE_NAMEBUFFER);
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

    public void make(){
        int cur=0;
        String main=openText();
        char[] chArray=main.toCharArray();
        for(int i=0;i<main.length()-1;i++){
            if(chArray[i]=='!' &&(chArray[i+1]=='0' || chArray[i+1]=='1') && chArray[i+3]=='#'){
                if(chArray[i+1]=='0'){
                    cur=Character.getNumericValue(chArray[i+2]);
                }
                else {
                    cur=10+Character.getNumericValue(chArray[i+2])+1;
                }
                if(cur==1){
                    w20.add("Cульфат или хлорид калия/Суперфосфат/Калийное удобрение");

                    w25.add("Cульфат или хлорид калия/Суперфосфат/Калийное удобрение");

                    w31.add("Cульфат или хлорид калия/Суперфосфат/Калийное удобрение");

                    w37.add("Cульфат или хлорид калия/Суперфосфат/Калийное удобрение");
                }
                if(cur==2){
                    w25.add("Азотные/Калийные удобрения");

                    w31.add("Азотные/Калийные удобрения");

                    w37.add("Азотные/Калийные удобрения");
                }
                if(cur==3){
                    w23.add("Сульфат калия/Суферфосфат/Мочевина");
                }
                if(cur==4){
                    w25.add("Фосфорные/Калийные удобрения");

                    w31.add("Фосфорные/Калийные удобрения");

                    w37.add("Фосфорные/Калийные удобрения");
                }
                if(cur==5){
                    w25.add("Фосфорные/Калийные удобрения");

                    w31.add("Фосфорные/Калийные удобрения");

                    w37.add("Фосфорные/Калийные удобрения");
                }
                if(cur==6){
                    w25.add("Фосфорные/Калийные удобрения");

                    w31.add("Фосфорные/Калийные удобрения");

                    w37.add("Фосфорные/Калийные удобрения");
                }
                if(cur==7){
                    w25.add("Азотные удобрения/Древесная зола");

                    w31.add("Азотные удобрения/Древесная зола");

                    w37.add("Азотные удобрения/Древесная зола");
                }
                if(cur==8){
                    w25.add("Минеральные/Органические удобрения");

                    w31.add("Минеральные/Органические удобрения");

                    w37.add("Минеральные/Органические удобрения");
                }
                if(cur==9){
                    w25.add("Фосфорные/Калийные удобрения");

                    w31.add("Фосфорные/Калийные удобрения");

                    w37.add("Органические удобрения");
                }
                if(cur==10){
                    w25.add("Органические удобрения");

                    w31.add("Фосфорные/Калийные удобрения");

                    w37.add("Органические удобрения");
                }
                if(cur==11){
                    w25.add("Органические удобрения + Древестная зола");

                    w31.add("Органические удобрения + Древестная зола");

                    w37.add("Органические удобрения + Древестная зола");
                }
                if(cur==12){
                    w25.add("Органические удобрения");

                    w31.add("Фосфорные/Калийные удобрения");

                    w37.add("Фосфорные/Калийные удобрения");
                }
                if(cur==13){
                    w25.add("Органические удобрения");
                }
                if(cur==14){
                    w25.add("Органические удобрения");
                }
                if(cur==15){
                    w25.add("Азотные удобрения");

                    w37.add("Калийные удобрения");
                }
                if(cur==16){
                    w25.add("Азотные удобрения");

                    w37.add("Калийные удобрения");
                }
                if(cur==17){
                    w25.add("Азотные удобрения");

                    w37.add("Калийные удобрения");
                }
                if(cur==18){
                    w25.add("Азотные удобрения");

                    w37.add("Калийные удобрения");
                }
            }
        }
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(MyGarden_2.this,MyGarden.class);
        startActivity(intent);
        finish();
    }

    private final static String FILE_NAME = "content.txt";

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
}
