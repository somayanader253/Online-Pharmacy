package com.example.onlinepharmacy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patient extends AppCompatActivity {
    Button doctor;
    Button pharmacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
        doctor = findViewById(R.id.doctor);
        pharmacy = findViewById(R.id.pharmacies);

        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Patient.this, Doctor.class);
                startActivity(intent);
            }
        });

        pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentp = new Intent(Patient.this, Pharmacies.class);
                startActivity(intentp);
            }
        });
    }
}