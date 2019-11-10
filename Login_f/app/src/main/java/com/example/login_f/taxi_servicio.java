package com.example.login_f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class taxi_servicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi_servicio);
    }

    public void ventana_de_taxi(View View){
        Intent gt = new Intent(this, ventanaTAXI.class);
        startActivity(gt);
    }


}
