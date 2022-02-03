package com.example.ejercicio002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity implements View.OnClickListener{
    private TextView tv1;
    private EditText ed1;
    private EditText ed2;
    private Button bt1;
    private String name;
    private String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        bt1 = (Button) findViewById(R.id.bt1);


        bt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bt1){
            name = ed1.getText().toString();
            pass = ed2.getText().toString();
            String n = "willy";
            String p = "willy";

            if(name.equals(n) && pass.equals(p)){

                Toast.makeText(getApplicationContext(),"Inicio Correcto", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, Bienvenido.class);
                Bundle params = new Bundle();
                params.putString("llavenombre", name);
                intent.putExtras(params);
                startActivity(intent);
            }else{
                Toast.makeText(getApplicationContext(),"Usuario o Contraseña Incorrectos",Toast.LENGTH_LONG).show();
            }
        }

    }
}