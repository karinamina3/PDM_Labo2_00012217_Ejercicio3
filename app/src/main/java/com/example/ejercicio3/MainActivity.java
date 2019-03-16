package com.example.ejercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout red, green, blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorNew = (int) (Math.random() * 420);
                red.setBackgroundColor(Color.rgb(colorNew, 0, 0));
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorNew = (int) (Math.random() * 420);
                green.setBackgroundColor(Color.rgb(0,colorNew,0));
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorNew = (int) (Math.random() * 420);
                blue.setBackgroundColor(Color.rgb(0,0,colorNew));
            }
        });
    }
}
