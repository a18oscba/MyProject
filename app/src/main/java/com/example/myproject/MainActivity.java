package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<TravelNations> travelList;
    ArrayAdapter<TravelNations> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        travelList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, R.layout.list_item_textview, travelList);

        ListView listView = findViewById(R.id.travelList);
        listView.setAdapter(adapter);
    }
}