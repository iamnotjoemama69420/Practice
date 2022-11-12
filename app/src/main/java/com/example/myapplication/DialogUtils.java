package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class DialogUtils {

    @SuppressLint("UseCompatLoadingForDrawables")
    public static AlertDialog.Builder createBuilder(Context context,
                                                    String title,
                                                    String message,
                                                    String negativeButton,
                                                    DialogInterface.OnClickListener listener,
                                                    int iconID){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(message).setTitle(title);
        if (negativeButton != null){
            builder.setNegativeButton(negativeButton, listener);
        }
        if (iconID != 0){
            builder.setIcon(context.getDrawable(iconID));
        }
        return builder;
    }
}
