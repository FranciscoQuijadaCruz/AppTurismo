package com.example.dell.aplicacionturismo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivityGastronomia extends Activity {
    android.widget.ListView list;
    String[] datos = {"Maríscos El Puente","Tacos Don Marcos","Viva Empalme","Restaurant Alexander"};
    Integer[] imgs = {R.drawable.mariscoseplista, R.drawable.donmarcoslista, R.drawable.vivaemplista, R.drawable.alexanderlista};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        TextView titulo;
        titulo = (TextView) findViewById(R.id.lbTituloX);
        titulo.setText("Gastronomía");

        CustomList adapter=new CustomList(this, datos, imgs);
        list=(android.widget.ListView)findViewById(R.id.lista);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent elpuente=new Intent(ListActivityGastronomia.this,MariscosP.class);
                    startActivity(elpuente);
                }
                else if(position==1){
                    Intent donmarcos=new Intent(ListActivityGastronomia.this,DonMarcos.class);
                    startActivity(donmarcos);
                }
                else if(position==2){
                    Intent viva=new Intent(ListActivityGastronomia.this,VivaEmp.class);
                    startActivity(viva);
                }
                else if(position==3){
                    Intent alexander=new Intent(ListActivityGastronomia.this,Alexander.class);
                    startActivity(alexander);
                }
            }
        });




    }


    public void llamar(View ver) {
        Intent intent1 = new Intent(ListActivityGastronomia.this, ListActivityGastronomia.class);
        startActivity(intent1);
    }


}