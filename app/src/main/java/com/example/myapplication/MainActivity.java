package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    String dogUrl = "https://i.imgur.com/tGbaZCY.jpg";
    String myDog = "https://i.ibb.co/HTz9FwJ/dog.jpg";
    String catUrl = "https://cdn2.thecatapi.com/images/au.jpg";
    Button Upload;
    ImageView imageView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.e);
        Button dog1 = findViewById(R.id.myDog);
        Button dog2 = findViewById(R.id.dogurl);
        Button cat = findViewById(R.id.kat);
        Upload = findViewById(R.id.upload);
        EditText userInput = findViewById(R.id.emotional_damage);
        dog1.setOnClickListener(v -> intoImage(dogUrl));
        dog2.setOnClickListener(v -> intoImage(myDog));
        cat.setOnClickListener(v -> intoImage(catUrl));
        Upload.setOnClickListener(v -> {
            String text = userInput.getText().toString();
            Glide.with(MainActivity.this).load(text).placeholder(R.drawable.ic_baseline_assignment_late_24).circleCrop().into(imageView);
        });
        Glide.with(this).load(dogUrl).circleCrop().into(imageView);
    }


    private void intoImage(String url) {
        ImageView imageView = findViewById(R.id.e);
        Glide.with(this).
                load(url).
                placeholder(R.drawable.ic_baseline_assignment_late_24).
                circleCrop().into(imageView);
    }
}//this a change