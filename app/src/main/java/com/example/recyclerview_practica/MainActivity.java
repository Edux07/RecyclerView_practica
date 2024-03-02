package com.example.recyclerview_practica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("Edu", "Sariteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));
        itemList.add(new Item("Sari", "Eduteamo@amordemivida.com", R.drawable.corason));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),itemList));

    }
}