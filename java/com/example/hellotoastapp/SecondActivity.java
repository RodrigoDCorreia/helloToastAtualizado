package com.example.hellotoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int count = intent.getShortExtra(MainActivity.EXTRA_COUNT, (short) 0);

        TextView textView = findViewById(R.id.text_counter);
        textView.setText(Integer.toString(count));

    }
}