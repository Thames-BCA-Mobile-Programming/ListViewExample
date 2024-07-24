package com.example.listviewexample;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    final Context context;
    final ArrayList<PersonModel> personModelArrayList;

    public MyAdapter(Context context, ArrayList<PersonModel> personModelArrayList) {
        this.context = context;
        this.personModelArrayList = personModelArrayList;
    }


    @Override
    public int getCount() {
        return personModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return personModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        PersonModel personModel = personModelArrayList.get(position);

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView nameTv = convertView.findViewById(R.id.tvName);
        TextView ageTv = convertView.findViewById(R.id.tvAge);
//
        imageView.setImageResource(personModel.images);
        nameTv.setText(personModel.name);
        ageTv.setText(String.valueOf(personModel.age));
        return convertView;

    }
}
