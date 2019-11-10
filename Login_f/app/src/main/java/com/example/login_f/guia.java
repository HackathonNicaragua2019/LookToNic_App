package com.example.login_f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class guia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);
    }

    public void guias(View View){
        Intent fa = new Intent(this, registro_de_guias.class);
        startActivity(fa);
    }
}
