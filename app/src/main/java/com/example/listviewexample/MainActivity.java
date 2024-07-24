package com.example.listviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

    ArrayList<PersonModel> personModelArrayList = new ArrayList<>();
    ListView myListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Lugia",20));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
        personModelArrayList.add(new PersonModel(R.drawable.ic_launcher_background,"Mario",22));
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, items);
//
//        ListView listView = findViewById(R.id.listView);
//
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, ""+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
//            }
//        });

        myListView = findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this,personModelArrayList);
        myListView.setAdapter(myAdapter);
    }
}