package com.example.ejercicio002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {

    private TextView t;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        t = (TextView) findViewById(R.id.bienvenido);

        if(savedInstanceState != null){
            nome = savedInstanceState.getString("nombre");

        }else{
            nome = "bienvenido";
        }

        Bundle args = getIntent().getExtras();
        nome = args.getString("llavenombre");

        t.setText("Bienvenido "+ nome);

    }
    protected void onSaveInstanceState(Bundle datos){
        super.onSaveInstanceState(datos);
        datos.putString("nombre", nome);
    }
}