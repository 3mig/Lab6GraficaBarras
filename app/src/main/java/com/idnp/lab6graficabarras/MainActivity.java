package com.idnp.lab6graficabarras;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float[] datos={20.7f,
                46.6f, 28.6f, 14.5f, 23.4f,
                27.4f, 32.9f, 28.3f, 29, 34.8f,
                32.9f, 16.7f, 18, 27.5f};
        int[] colores={Color.parseColor("#EC7063"),
                Color.parseColor("#ABB2B9"),
                Color.parseColor("#D2B4DE"),
                Color.parseColor("#E59866"),
                Color.parseColor("#F9E79F"),
                Color.parseColor("#DAF7A6"),
                Color.parseColor("#E59866"),
                Color.parseColor("#AED6F1"),
                Color.parseColor("#16A085"),
                Color.parseColor("#5F6A6A"),
                Color.parseColor("#2471A3"),
                Color.parseColor("#B7950B"),
                Color.parseColor("#F1948A"),
                Color.parseColor("#17A589")};

        linearLayout=(LinearLayout)findViewById(R.id.linearLayout);
        linearLayout.addView(new GraficaBarras(this,datos.length,datos,colores));
    }
}
