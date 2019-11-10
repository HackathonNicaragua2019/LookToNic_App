package com.example.login_f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void mapa(View View){
        Intent i = new Intent(this, Mapa.class);
        startActivity(i);
    }

    public void taxi(View View){
        Intent a = new Intent(this, taxi_servicio.class);
        startActivity(a);
    }

    public void hoteles(View View){
        Intent b = new Intent(this, hoteles.class);
        startActivity(b);
    }

    public void comida(View View){
        Intent c = new Intent(this, comida.class);
        startActivity(c);
    }

    public void guia(View View){
        Intent d = new Intent(this,guia.class);
        startActivity(d);
    }








}
