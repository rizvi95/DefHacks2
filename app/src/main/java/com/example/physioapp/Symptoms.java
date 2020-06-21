package com.example.physioapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Symptoms extends AppCompatActivity {
    public static final String EXTRA_TEXT = "om.example.physioapp.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms);


        Button button_symptom = (Button) findViewById(R.id.button_symptoms);
        button_symptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonkeyLearn_Activity();
            }
        });
    }

    public void openMonkeyLearn_Activity() {
        EditText editText1 = (EditText) findViewById(R.id.textInputEditText);
        String symptoms_text = editText1.getText().toString();

        Intent intent = new Intent(this, MonkeyLearn_Activity.class);
        intent.putExtra(EXTRA_TEXT, symptoms_text);
        startActivity(intent);
    }
}