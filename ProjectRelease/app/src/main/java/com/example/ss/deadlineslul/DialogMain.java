package com.example.ss.deadlineslul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DialogMain extends AppCompatActivity {


    private final static String FILE_NAME = "content.txt";
    private final static String FILE_NAME2= "content2.txt";
    final String LOG_TAG = "myLogs";


    //Search
    List<String> Search = new ArrayList<>();
    char cur,cur2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dialog_main);
        add();
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



        ListView lvMain = findViewById(R.id.lvOk);
        MyAdapter myAdapter = new MyAdapter(DialogMain.this, Names, Pictures);
        lvMain.setAdapter(myAdapter);


        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Search.clear();
                String work = openText();
                String buf = "";
                char[] chArray = work.toCharArray();
                for (int i = 0; i < work.length() - 2; i++) {
                    if (chArray[i] == '!') {
                        cur = chArray[i + 1];
                        cur2 = chArray[i + 2];
                        if (cur == '0' && cur2 == '1') {
                            buf="01";
                        }
                        if (cur == '0' && cur2 == '2') {
                            buf="02";
                        }
                        if (cur == '0' && cur2 == '3') {
                            buf="03";
                        }
                        if (cur == '0' && cur2 == '4') {
                            buf="04";
                        }
                        if (cur == '0' && cur2 == '5') {
                            buf="05";
                        }
                        if (cur == '0' && cur2 == '6') {
                            buf="06";
                        }
                        if (cur == '0' && cur2 == '7') {
                            buf="07";
                        }
                        if (cur == '0' && cur2 == '8') {
                            buf="08";
                        }
                        if (cur == '0' && cur2 == '9') {
                            buf="09";
                        }
                        if (cur == '1' && cur2 == '0') {
                            buf="10";
                        }
                        if (cur == '1' && cur2 == '1') {
                            buf="11";
                        }
                        if (cur == '1' && cur2 == '2') {
                            buf="12";
                        }
                        if (cur == '1' && cur2 == '3') {
                            buf="13";
                        }
                        if (cur == '1' && cur2 == '4') {
                            buf="14";
                        }
                        if (cur == '1' && cur2 == '5') {
                            buf="15";
                        }
                        if (cur == '1' && cur2 == '6') {
                            buf="16";
                        }
                        if (cur == '1' && cur2 == '7') {
                            buf="17";
                        }

                    }
                }

                if (position + 1 <= 9) {
                    base = "0" + String.valueOf(position + 1);
                } else {
                    base = String.valueOf(position + 1);
                }
                if(buf.equals(base)){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Данное растение уже существует", Toast.LENGTH_SHORT);
                    toast.show();
                    base="00";
                }
                else {
                    String vizov="";
                    if(position==0) vizov="Картофель";
                    if(position==1) vizov="Свекла";
                    if(position==2) vizov="Морковь";
                    if(position==3) vizov="Редис";
                    if(position==4) vizov="Смородина";
                    if(position==5) vizov="Помидоры";
                    if(position==6) vizov="Малина";
                    if(position==7) vizov="Огурцы";
                    if(position==8) vizov="Перец";
                    if(position==9) vizov="Капуста";
                    if(position==10) vizov="Кабачки";
                    if(position==11) vizov="Лук";
                    if(position==12) vizov="Клубника";
                    if(position==13) vizov="Земляника";
                    if(position==14) vizov="Яблоня";
                    if(position==15) vizov="Слива";
                    if(position==16) vizov="Груша";
                    Toast toastvizov = Toast.makeText(getApplicationContext(),
                            "Вы выбрали "+vizov, Toast.LENGTH_SHORT);
                    toastvizov.show();
                TextView TextView2 = findViewById(R.id.textView2);
                EditText EditText = findViewById(R.id.editText);
                if (position == 4) {
                    TextView2.setText("Введите кол-во кустов");
                    EditText.setHint("Кол-во кустов");
                } else if (position == 16 || position == 15 || position == 14) {
                    TextView2.setText("Введите кол-во деревьев");
                    EditText.setHint("Кол-во деревьев");
                } else {
                    TextView2.setText("Введите площадь посева");
                    EditText.setHint("Площадь посева(м²)");
                    }
                }
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


    //mainList
    List<String> x=new ArrayList<>();

    public void add() {
        x.add("Картофель");
        x.add("Свекла");
        x.add("Морковь");
        x.add("Редис");
        x.add("Смородина");
        x.add("Помидоры");
        x.add("Малина");
        x.add("Огурцы");
        x.add("Перец");
        x.add("Капуста");
        x.add("Кабачки");
        x.add("Лук");
        x.add("Клубника");
        x.add("Земляника");
        x.add("Яблоня");
        x.add("Слива");
        x.add("Груша");
    }

    @Override
    public void onBackPressed() {
        Intent intentback=new Intent(DialogMain.this,Dialog.class);
        startActivity(intentback);
    }







    public void Clickable(View view){
        Intent intent=new Intent(DialogMain.this,Dialog.class);
        startActivity(intent);
    }

    String base="00";
    public void Saveon(View view){
        if(base=="00"){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Выберите валидное растение", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            EditText editText = findViewById(R.id.editText);

            String text = editText.getText().toString();
            if (text == " " || text == "" || text == "  " || text == null) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Поле ввода пустое", Toast.LENGTH_SHORT);
                toast.show();
            } else if (text.length() > 4) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Cлишком большое число", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                String obmen = "!" + base + "#" + text + ";";
                char[] chArray = obmen.toCharArray();
                if (chArray[obmen.length() - 2] == '#') {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Поле ввода пустое", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    saveText(obmen);
                    saveTextChange("1");
                    Clickable(findViewById(R.id.button2));
                }
            }
        }
    }
    //Методы обработки текстовых файлов
    public String openText(){

        FileInputStream fin = null;
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            return text;
        }
        catch(IOException ex) {

            boolean kostil=true;
            return FILE_NAME;
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
    public void saveText(String obmen){
        FileOutputStream fos = null;
        try {

            String text = openText()+obmen;
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


}
