package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> ListArrayList;
    ArrayAdapter<String> listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        ListArrayList = new ArrayList<>();
        ListArrayList.add(" ");
        ListArrayList.add("Red");
        ListArrayList.add("Orange");
        ListArrayList.add("Yellow");
        ListArrayList.add("Gren");
        ListArrayList.add("Blue");
        ListArrayList.add("Pin");
        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ListArrayList);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this, "Number "+position +"= "+ListArrayList.get(position),  Toast.LENGTH_SHORT).show();
            }
        });
    }
}