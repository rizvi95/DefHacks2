package com.example.physioapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Symptoms extends AppCompatActivity {

    private Button button_symptom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms);


        button_symptom = (Button) findViewById(R.id.button_symptoms);
        button_symptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymptoms();
            }
        });
    }

    public void openSymptoms() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}