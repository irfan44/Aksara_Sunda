package com.example.aksarasunda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu_ngalagena extends AppCompatActivity {
    Button btnngalagena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ngalagena);

        btnngalagena = (Button) findViewById(R.id.soal_ng);
        btnngalagena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_ngalagena.class);
                startActivity(i);
            }
        });
    }
}
