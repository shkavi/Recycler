package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        List<Item> items= new ArrayList<Item>();
        items.add(new Item("Kaviraja SH","shkaviraja@gmail.com",R.drawable.a));
        items.add(new Item("Rashmika Mandanna","Rashmika@gmail.com",R.drawable.b));
        items.add(new Item("Samantha Prabhu","Samantha@gmail.com",R.drawable.c));
        items.add(new Item("Hrithik Roshan","Hrithik@gmail.com",R.drawable.d));
        items.add(new Item("Urvashi Rautela","Urvashi@gmail.com",R.drawable.e));
        items.add(new Item("Shashank SP","Shashank@gmail.com",R.drawable.f));
        items.add(new Item("Rohit Jha","Rohit@gmail.com",R.drawable.g));
        items.add(new Item("Keerthy Suresh","Keerthy@gmail.com",R.drawable.h));
        items.add(new Item("Katrina Kaif","Katrina@gmail.com",R.drawable.c));
        items.add(new Item("Ranbir Singh","Ranbir@gmail.com",R.drawable.d));
        items.add(new Item("Gauthami","Gauthami@gmail.com",R.drawable.e));
        items.add(new Item("SudeepKiccha","SudeepKiccha@gmail.com",R.drawable.f));
        items.add(new Item("Darshan","Darshan@gmail.com",R.drawable.g));
        items.add(new Item("SaiPallavai","SaiPallavai@gmail.com",R.drawable.h));



        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        recyclerView.setAdapter(new MyAdapterClass(getApplicationContext(),items));
    }
}