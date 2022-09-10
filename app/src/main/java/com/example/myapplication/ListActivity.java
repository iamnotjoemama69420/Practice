package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListActivity extends Activity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        String[] data = {"", "s", "e", "q", "b"};
        CustomAdapter adapter = new CustomAdapter(data);        recyclerView = findViewById(R.id.recycleList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
//hw think of ways to pass data to next page
        //keep some of the data by getting a value from the recycleView in a variable and use intent to send data to next activity
    }
}
