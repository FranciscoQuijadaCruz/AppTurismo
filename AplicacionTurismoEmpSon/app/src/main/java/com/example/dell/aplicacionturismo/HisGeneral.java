package com.example.dell.aplicacionturismo;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

public class HisGeneral extends AppCompatActivity {
    MapView MapView;
    GoogleMap GoogleMap;

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);

        TextView titulo;
        TextView descripción, descripcion2, descripcion3;

        ImageView imagen;
        ImageView imagen1;
        ImageView imagen2;
        ImageView imagen3;
        ImageView imagen4;

        titulo = (TextView) findViewById(R.id.lbTitulo);
        descripción = (TextView) findViewById(R.id.lbDescripcion);
        //descripción.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        descripcion2 = (TextView) findViewById(R.id.lbDescripcion2);
        //descripcion2.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        descripcion3 = (TextView) findViewById(R.id.lbDescripcion3);
        //descripcion3.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);


        imagen = (ImageView) findViewById(R.id.imgPrincipal);
        imagen.setImageResource(R.drawable.gral1);
        imagen1 = (ImageView) findViewById(R.id.imgPrincipalUno);
        imagen1.setImageResource(R.drawable.gral2);
        imagen2 = (ImageView) findViewById(R.id.imgPrincipalDos);
        imagen2.setImageResource(R.drawable.gral3);
        imagen3 = (ImageView) findViewById(R.id.imgPrincipalTres);
        imagen3.setImageResource(R.drawable.gral4);
        imagen4 = (ImageView) findViewById(R.id.imgPrincipalCuatro);
        imagen4.setImageResource(R.drawable.gral5);

        titulo.setText("Historia General");
        descripción.setText("FUNDACIÓN:\n\nEmpalme fue fundado un 15 de septiembre de 1905 por la influencia del cambio de ruta, con la salida de la punta de fierro hacia el sur, en el kilómetro 9 del antiguo ferrocarril de Sonora. Su nombre se deriva de la unión de dios vías: 'Junction', que traducido al español es Empalme.\nEn el crisol social se fundieron idiosincrasias de las familias llegadas de Estados Unidos de Norteamérica, B.C.S, Sinaloa, Nayarit, Jalisco, Durango, Chihuahua, y la sierra de Sonora.");
        descripcion2.setText("ANTECEDENTES POLÍTICOS:\n" +
                "\n" +
                "Empalme nació como Comisaría de Guaymas, siendo su primar comisario el Prof. Jesús Valencia. No fue hasta el 3 de mayo de 1937 que se logró la municipalidad, tras gestiones de ferrocarrileros, presidente de Guaymas Vicente Sanders, comisario de Empalme José Alcaraz Valdez, y el diputado local Marcelo Serna con el Congreso del Estado, siendo el primer presidente municipal, Miguel Verdugo Lujan.\n" +
                " Sin embargo, en 1940, el entonces gobernador, el general Anselmo Macías Valenzuela, lo regresó a la categoría de Comisaría de Guaymas.\n" +
                " Hasta el 3 de agosto de 1953, tras la iniciativa de un grupo de vecinos que se presentaron en el Congreso del Estado y con la ayuda del diputado por Álamos, Don Manuel S. Corbalá, volvió a obtener la municipalidad, siendo el comisario Enrique Romero Encinas el presidente del Consejo Municipal, hasta que se realizaron elecciones para elegir un presidente municipal, siendo victorioso C. Horacio Morales Apodaca." );
        descripcion3.setText("EMPALME EN LA REVOLUCIÓN:\n" +
                "\n" +
                "Empalme fue testigo de batallas de la revolución mexicana, donde el Ejército del Noroeste, comandados por el Gral. Álvaro Obregón, derrotaron al Ejército Federal, en las batallas de Tres Jitos y Batamotal, y así sitiarse en Guaymas.\n" +
                "Estas batallas son conocidas por la estrategia que manejó el Ejército del Noroeste, donde para no cruzar por las vías existentes que pasaban por Empalme donde estaba el ejército rival, construyeron una vía recta de 500 metros que partía de Maytorena hasta Cruz de Piedra.\n" +
                " Y debido a que en la zona donde se construyeron las vías lo cubrían los cerros al norte de Empalme, el ejército rival no se percató del hecho, así trasladándose con facilidad hasta Culiacán para derrotar al Ejército Federal.\n\n" +
                "PRIMER BOMBARDEO AÉREO CON FINES BÉLICOS EN EL MUNDO:\n\n" +
                "Se trata de un acontecimiento que sucedió en 1913 cuando las tropas de Obregón sitiaron al ejército federal en Guaymas, y para tumbar a los objetivos, se contrató a un aviador de origen frances, Diddier Masson junto con su biplano con motor Curtis, donde dicha nave se armó en estación Moreno por el mecánico Thomas J. Dean, además se cosiguió el arma por 300 dolares.\nLos objetívos a derrotar eran unos cañoneros federales localizados en el estero del Sabueso, localizado en Empalme. El biplano, ya situado en Empalme, despegó desde la colonia Pesqueira, detonando la primera bomba, donde solo rozó un cañonero, y al siguiente día logró impactar a uno, pero unos desperfectos imposibilitó la continuidad de la misión y ya cuando repararon el biplano, las fuerzas federales ya se habian ido.");

    }
}
