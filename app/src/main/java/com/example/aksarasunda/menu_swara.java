package com.example.aksarasunda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class menu_swara extends AppCompatActivity {
    Button btnswara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_swara);

        btnswara = (Button) findViewById(R.id.soal_swara);
        btnswara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_swara.class);
                startActivity(i);
            }
        });
    }
}
