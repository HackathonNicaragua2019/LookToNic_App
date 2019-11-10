package com.example.login_f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void llamar(View View){
        Intent i = new Intent(this, registro.class);
        startActivity(i);
    }


    public void menu(View View){
        Intent p = new Intent(this, menu.class);
        startActivity(p);
    }
}
