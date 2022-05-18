package com.example.pantallebienvenidaa;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo del boton para pasar del boton registrar a la pantalla del registro
    public void siguienteR (View view){
        Intent siguienteR = new Intent(this, pantallaRegistro.class);
        startActivity(siguienteR);
    }

    //Metodo del boton para pasar del boton registrar a la pantalla de iniciar sesión
    public void siguienteIS (View view) {
        Intent siguienteIS = new Intent(this, pantallaIniciarSesion.class);
        startActivity(siguienteIS);
    }

}