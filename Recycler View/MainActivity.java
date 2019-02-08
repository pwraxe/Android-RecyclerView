package com.example.akshay.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView progList = findViewById(R.id.programmingList);
        progList.setLayoutManager(new LinearLayoutManager(this));
        String lang[] = {"C","C++","Java SE","Java ME","Java EE","PHP","Ruby","Python","GO","JavaScript"};
        int price[] ={3000,4000,6000,6000,6000,3000,4000,8000,3000,10000};
        progList.setAdapter(new AdaptingList(lang,price));

    }
}
