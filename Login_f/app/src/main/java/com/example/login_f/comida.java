package com.example.login_f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class comida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
    }

    public void mapa_macdonald(View View){
        Intent  hh  = new Intent(this, mapa_de_macdonald.class);
        startActivity(hh);
    }

    public void detalles_macdonald(View View){
        Intent  hl  = new Intent(this, Detalles_mcdonald.class);
        startActivity(hl);
    }


}
