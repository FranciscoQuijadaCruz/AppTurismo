package com.example.dell.aplicacionturismo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_mapa,btn_sitios,btn_nat,btn_gas, btn_his;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_mapa = (ImageButton) findViewById(R.id.btnMapa);
        btn_sitios = (ImageButton) findViewById(R.id.btnPunto);
        btn_nat = (ImageButton) findViewById(R.id.btnNaturaleza);
        btn_gas = (ImageButton) findViewById(R.id.btnGastronomia);
        btn_his = (ImageButton) findViewById(R.id.btnHistoria);

        btn_sitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), ListActivityLugares.class);
                startActivity(i1);
            }
        });

        btn_nat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),ListActivityNaturaleza.class);
                startActivity(i1);
            }
        });

        btn_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(i1);
            }
        });

        btn_gas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),ListActivityGastronomia.class);
                startActivity(i1);
            }
        });

        btn_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),ListActivityHistoria.class);
                startActivity(i1);
            }
        });
    }
}
