package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_ex1).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Ch3Ex1Activity.class)));
        findViewById(R.id.btn_ex2).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Ch3Ex2Activity.class)));
        findViewById(R.id.btn_ex3).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Ch3Ex3Activity.class)));
    }
}