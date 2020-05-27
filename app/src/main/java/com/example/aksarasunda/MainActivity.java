package com.example.aksarasunda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ngalagena (View view){
        Intent intent = new Intent(MainActivity.this, menu_ngalagena.class);
        startActivity(intent);
    }

    public void swara (View view){
        Intent intent = new Intent(MainActivity.this, menu_swara.class);
        startActivity(intent);
    }

    public void angka (View view){
        Intent intent = new Intent(MainActivity.this, menu_angka.class);
        startActivity(intent);
    }

    public void rarangken (View view){
        Intent intent = new Intent(MainActivity.this, menu_rarangken.class);
        startActivity(intent);
    }


}
