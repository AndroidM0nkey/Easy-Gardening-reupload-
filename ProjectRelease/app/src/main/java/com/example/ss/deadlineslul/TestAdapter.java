package com.example.ss.deadlineslul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_adapter);
        String[] countryNames = {"Australia", "Brazil", "China", "France", "Germany", "India", "Ireland", "Italy"
                , "Mexico", "Poland", "Russia", "Spain", "US"};
        int[] countryFlags = {R.drawable.background,
                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,

                R.drawable.background,
        };

        List<String> z = new ArrayList<>();
        z.add("test");
        z.add("more");
        z.add("moretest");
        ListView lvMain = findViewById(R.id.ListTest);
        MyAdapter myAdapter = new MyAdapter(TestAdapter.this, countryNames, countryFlags);
        lvMain.setAdapter(myAdapter);
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listview_item,R.id.TheTextview,countryNames);
      //  lvMain.setAdapter(adapter);
    }
}
