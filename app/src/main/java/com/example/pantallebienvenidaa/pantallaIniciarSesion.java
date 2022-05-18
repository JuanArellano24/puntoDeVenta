package com.example.pantallebienvenidaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pantallaIniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_iniciar_sesion);
    }
    public void siguieteP (View view){
        Intent siguienteP = new Intent(this, pantallaPerfil.class);
        startActivity(siguienteP);

    }
}