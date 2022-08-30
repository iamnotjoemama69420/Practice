package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
int count;
ArrayList<?> e;
Activity mActivity;

    public Adapter(int count, ArrayList<?> s, Activity mActivity) {
        this.count = count;
        e = s;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int position) {
        return e.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") View newView = mActivity.getLayoutInflater().inflate((XmlPullParser) convertView, parent, false);
        return newView;
    }
}
