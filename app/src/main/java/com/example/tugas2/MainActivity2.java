package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void btnhome2(View view) {
        Intent c = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(c);
    }

    public void btnbiodata2(View view) {
        Intent d = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(d);
    }
}