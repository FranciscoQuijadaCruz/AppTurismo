package com.example.dell.aplicacionturismo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListActivityNaturaleza extends Activity {
    android.widget.ListView list;
    String[] datos = new String[]{"Playa el Cochorit","Reserva El Sahuaral","Bahía de Empalme (Puente Douglas)","Piedra Volada"};
    Integer[] imgs = {R.drawable.cochoritlista, R.drawable.sahuarallista, R.drawable.bahialista, R.drawable.piedralista};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        TextView titulo;
        titulo = (TextView) findViewById(R.id.lbTituloX);
        titulo.setText("Patrimonios de la Naturaleza");

        CustomList adapter=new CustomList(this, datos, imgs);
        list=(android.widget.ListView)findViewById(R.id.lista);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent cochorit=new Intent(ListActivityNaturaleza.this,Cochorit.class);
                    startActivity(cochorit);
                }
                else if(position==1){
                    Intent sahuaral=new Intent(ListActivityNaturaleza.this,Sahuaral.class);
                    startActivity(sahuaral);
                }
                else if(position==2){
                    Intent bahia=new Intent(ListActivityNaturaleza.this,Bahia.class);
                    startActivity(bahia);
                }
                else if(position==3){
                    Intent piedra=new Intent(ListActivityNaturaleza.this,Piedra.class);
                    startActivity(piedra);
                }
            }
        });




    }


    public void llamar(View ver) {
        Intent intent1 = new Intent(ListActivityNaturaleza.this, ListActivityNaturaleza.class);
        startActivity(intent1);
    }


}