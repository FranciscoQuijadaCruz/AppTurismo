package com.example.dell.aplicacionturismo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListActivityHistoria extends Activity {
    android.widget.ListView list;
    String[] datos = new String[]{"Historia general","La ciudad ferrocarrilera","Casamiento de Charles Chaplin","Empalmenses famosos"};
    Integer[] imgs = {R.drawable.hisgrallista, R.drawable.ferrocarrillista, R.drawable.charleslista, R.drawable.temiblelista};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        TextView titulo;
        titulo = (TextView) findViewById(R.id.lbTituloX);
        titulo.setText("Historia");
        CustomList adapter=new CustomList(this, datos, imgs);
        list=(android.widget.ListView)findViewById(R.id.lista);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent historia=new Intent(ListActivityHistoria.this,HisGeneral.class);
                    startActivity(historia);
                }
                else if(position==1){
                    Intent ferro=new Intent(ListActivityHistoria.this,Ferrocarril.class);
                    startActivity(ferro);
                }
                else if(position==2){
                    Intent chaplin=new Intent(ListActivityHistoria.this,Chaplin.class);
                    startActivity(chaplin);
                }
                else if(position==3){
                    Intent peloteros=new Intent(ListActivityHistoria.this,ListActivityPersonajes.class);
                    startActivity(peloteros);
                }
            }




        });




    }


    public void llamar(View ver) {
        Intent intent1 = new Intent(ListActivityHistoria.this, ListActivityHistoria.class);
        startActivity(intent1);
    }


}