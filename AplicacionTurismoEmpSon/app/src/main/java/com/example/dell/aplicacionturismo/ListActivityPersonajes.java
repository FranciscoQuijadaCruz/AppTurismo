package com.example.dell.aplicacionturismo;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class ListActivityPersonajes extends Activity {

    android.widget.ListView list;

    String[] datos = new String[]{"José Luis Castillo",
            "Hilario Sanchez Rubio",
            "Hernan 'Tyson' Marquez",
            "Miguel 'Pilo' Gaspar",
            "Ronaldo 'Ronnie' Camacho",
            "Angel Castro",
            "Saúl Villegas",
            "Roberto Chiapa Aguirre","Lauro Luciano Espinoza Urías"};
    Integer[] imgs = {R.drawable.temiblecastillo, R.drawable.hilario, R.drawable.tyson,R.drawable.pilo, R.drawable.ronnie,R.drawable.castro,R.drawable.saulv,R.drawable.chiapa,R.drawable.cangrejo};

    String[] datos2 = new String[]{"Fue un boxeador nacido el 14 de diciembre de 1973 Campeón Mundial Peso Ligero por el C.M.B. tras una innesperada victoria ante Steve Johnson. Su record es de 58-8-1 con 48 ganadas por la vía del K.O.",


            "Compositor, poeta y cantante (1927-2006). Durante su labor como telegrafísta para el Ferrocarril, hacía en sus tiempos libres lo que mas le gustaba: componer y escribir poemas. Su pasión por la música lo llevo a cantar en distíntas partes de la republica, incluyendo en la prestigiosa radio X.E.W, no obstante, lo que llevaría a la posteridad es su más famosa composición '¡Viva Empalme!' dedicada al lugar que vió nacer, siendo interpretada por muchos artistas, siendo la versión más famosa la de Ramón Ayala y Sus Bravos del Norte.\n En su honor, cada año se realiza el festival cultural Hilario Sanchez Rubio, donde se presentan artistas de talla regional, nacional, incluso internacional. ",

            "Nacido el 4 de septiembre de 1988), es un boxeador profesional mexicano. Ha sido campeón de peso mosca de la Asociación Mundial de Boxeo. Se le recuerda por su épica pelea donde derrotó a Luis 'Nica' Concepción por el titulo mundial de peso mosca por la A.M.B.",


            "(1929-2012) Miembro del Salón de la Fama del Beisbol Mexicano. El popular “Pilo” Gaspar fue un verdadero genio a la defensiva, y por esto fue reconocido internacionalmente como uno de los mejores receptores del béisbol mexicano, bateador consistente y seguro."
                    ,


            "Miembro del Salón de la Fama del Beisbol Mexicano, Rolando 'Ronnie' Camacho, quien nació un 26 de octubre de 1935, es una leyenda del beisbol mexicano, recordado por su poderoso bat, poseedor de numerosos records, los mas conocidos, la triple corona en la actual L.M.P. que ganó con Rieleros de Empalme, y en L.M.B. el de más cuadrangulares en una temporada, que lo comparte con Bob Darwin. \n",

            " (1917-1983) Miembro del Salón de la Fama del Beisbol Mexicano, fue uno de los peloteros más elegantes tanto a la ofensiva como a la defensiva, tenía un swing perfecto. Era increíble cómo un swing tan perfecto podía unirse al poder y conectar aquellos grandes cañonazos. En su época fue el mejor, todavía a principios de los setenta se discutía quién era el mejor, si él o Héctor Espino. Castro ganó la triple corona de bateo en 1951 jugando con los Azules de Veracruz. Fue campeón bateador con .354, jonronero con 21 y productor con 79 carreras impulsadas. También fue el manager campeón, pero el título de le acredita a Jorge Pasquel ya que él mandaba muchas jugadas de su palco o del mismo dugout; tipo Alejo Peralta con los Tigres capitalinos. Su total de jonrones fue 229 y un promedio de por vida de .306.",

            "(1937-) Miembro del Salón de la Fama del Beisbol Mexicano, iniciando su carrera como pitcher, es considerado uno de los bateadores más poderosos de la época, incluso a la par de figuras como Hector Espino y Ronnie Camacho.En 1964 cuando jugaba para los Sultanes de Monterrey empató el récord de más jonrones con caja llena en días consecutivos con dos (2 y 3 de mayo) ante los Pericos de Puebla.",

            "(1935-2014) Miembro de las Fuerzas Armadas Mexicanas, y General de División, fue un piloto aviador, conocido por servír durante 36 años como Piloto Aviador de la Fuerza Aérea Mexicana Del Estado Mayor Presidencial, donde transportó a varios presidentes de México, desde Gustavo Díaz Ordaz, hasta Ernesto Zedillo.",

    "Ciudadano empalmense, mejor conocido como 'Cangrejo', tiene la habilidad de correr 'hacia atras' en exigentes actividades, como el correr maratones en su peculiar forma o bajar o subir en enormes edificaciones como la Torre Latinoamericana, o las piramides de Teotihuacán, y buscará recorrer en su peculiar forma el Burj Khalifa. Ha roto 23 records."};

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_dos);


        CustomListP adapter=new CustomListP(this, datos, imgs, datos2);
        list=(android.widget.ListView)findViewById(R.id.lista);
        list.setAdapter(adapter);

    }


    public void llamar(View ver) {
        Intent intent1 = new Intent(ListActivityPersonajes.this, ListActivityPersonajes.class);
        startActivity(intent1);
    }


}