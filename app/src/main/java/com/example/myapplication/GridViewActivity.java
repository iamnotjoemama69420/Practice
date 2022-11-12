package com.example.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class GridViewActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Test").setMessage("HI");
        //a builder can create and store two different


    }


}
