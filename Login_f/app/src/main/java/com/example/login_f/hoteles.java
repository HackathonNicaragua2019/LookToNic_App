package com.example.login_f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hoteles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);
    }

    public void crown (View View){
        Intent g = new Intent(this, detalles_crown.class);
        startActivity(g);
    }

    public void mapitawe (View View){
        Intent z = new Intent(this, Mapa.class);
        startActivity(z);
    }


}
