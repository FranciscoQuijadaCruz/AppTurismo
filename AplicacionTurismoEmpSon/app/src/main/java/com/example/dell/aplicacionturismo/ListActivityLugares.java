package com.example.dell.aplicacionturismo;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivityLugares extends Activity {

    android.widget.ListView list;
    android.widget.ImageView ImageView;

    String[] datos = {"Plaza de la Independencia", "Museo Ferrocarrilero","Plaza de los Jubilados","Parque Benito Juarez"};

    Integer[] imgs = {R.drawable.tinacolista, R.drawable.muferlista, R.drawable.placitalista, R.drawable.parquelista};


 //   String[] descr = {"El Tinaco: ícono de la 'Ciudad Jardín'", "Toda la historia de la ciudad rielera en un solo lugar","Un lugar familiar y encantador"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

 //       ListView = (android.widget.ListView) findViewById(R.id.lista);
 //       ImageView = (android.widget.ImageView) findViewById(R.id.listview_image);

 //       ArrayAdapter<String> arraydp = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, datos);

 //       ListView.setAdapter(arraydp);
        TextView titulo;
        titulo = (TextView) findViewById(R.id.lbTituloX);
        titulo.setText("Lugares de Interés");


        CustomList adapter=new CustomList(this, datos, imgs);
        list=(ListView)findViewById(R.id.lista);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent tinaco=new Intent(ListActivityLugares.this, Tinaco.class);
                    startActivity(tinaco);
                }
                else if(position==1){
                    Intent mufer=new Intent(ListActivityLugares.this,Mufer.class);
                    startActivity(mufer);
                }
                else if(position==2){
                    Intent jubilados=new Intent(ListActivityLugares.this,Plazita.class);
                    startActivity(jubilados);
                }
                else if(position==3){
                    Intent parquecito=new Intent(ListActivityLugares.this,Parquecito.class);
                    startActivity(parquecito);
                }
            }
        });
    }


    public void llamar(View ver) {
        Intent intent1 = new Intent(ListActivityLugares.this, ListActivityLugares.class);
        startActivity(intent1);
    }


}