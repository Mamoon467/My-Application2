package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvfirst, tvway, tvsecond, tvway2, tvthird, tvway3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvsecond = findViewById(R.id.btnsecond);
        tvthird = findViewById(R.id.btnthird);
        tvway = findViewById(R.id.btnway);
        tvway2 = findViewById(R.id.btnway2);
        tvway3 = findViewById(R.id.btnway3);
        tvthird.setOnClickListener(this);
        tvfirst = findViewById(R.id.btnfirst);
        tvfirst.setOnClickListener(this);
        tvsecond.setOnClickListener(this);
        tvfirst.setOnClickListener(this);
        tvway.setOnClickListener(this);
        tvway2.setOnClickListener(this);
        tvway3.setOnClickListener(this);
        onClick(new View(this));
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnsecond) {
            Toast.makeText(this, "Android App", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.btnthird) {
            Toast.makeText(this, "Learn BY Zesingn tech", Toast.LENGTH_SHORT).show();


        } else if (view.getId() == R.id.btnfirst) {
            Toast.makeText(this, "Learn By PVT LTD", Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.btnway) {
            Toast.makeText(this, "C++", Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.btnway2) {
            Toast.makeText(this, "JAVA", Toast.LENGTH_SHORT).show();

        } else if (view.getId() ==R.id.btnway3) {
            Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show();

        }
    }
}