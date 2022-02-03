package com.example.ejercicio002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {

    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        t = (TextView) findViewById(R.id.bienvenido);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("llavenombre");

        t.setText("Bienvenido "+ nome);

    }
}