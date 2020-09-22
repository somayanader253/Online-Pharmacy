package com.example.onlinepharmacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Pharmacies extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.list_view);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dawaee Pharmacy");
        arrayList.add("Al-Eraqi Pharmacy");
        arrayList.add("El Ezaby Pharmacy");
        arrayList.add("Ezz Eldeen Pharmacies");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}