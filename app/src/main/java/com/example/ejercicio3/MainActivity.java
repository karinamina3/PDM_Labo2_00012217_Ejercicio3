package com.example.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout red, green, blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout red = findViewById(R.id.red);
        LinearLayout green = findViewById(R.id.green);
        LinearLayout blue = findViewById(R.id.blue);

        red.setOnClickListener(this);
        green.setOnClickListener(this);
        blue.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
