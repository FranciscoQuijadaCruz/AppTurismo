package com.example.dell.aplicacionturismo;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

public class Chaplin extends AppCompatActivity {
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
        imagen.setImageResource(R.drawable.chaplin1);
        imagen1 = (ImageView) findViewById(R.id.imgPrincipalUno);
        imagen1.setImageResource(R.drawable.chaplin2);
        imagen2 = (ImageView) findViewById(R.id.imgPrincipalDos);
        imagen2.setImageResource(R.drawable.chaplin3);
        imagen3 = (ImageView) findViewById(R.id.imgPrincipalTres);
        imagen3.setImageResource(R.drawable.chaplin4);
        imagen4 = (ImageView) findViewById(R.id.imgPrincipalCuatro);
        imagen4.setImageResource(R.drawable.chaplin5);

        titulo.setText("Boda de Charles Chaplin\ncon Lita Grey");
        descripción.setText("Charles Spencer Chaplin (1889-1977) fue un actor, humorista, compositor, productor, guionista, director, escritor y editor inglés, considerado el más importante actor de la época y el más legendario del cine mudo, gracias a sus papel de Charlot en diversas películas del cine mudo.\n\nEn 1924 Charles Chaplin comenzó un romance con Lillita MacMurray, de la cual el famoso actor lo apodó Lita Grey, una joven de dieciocho años, donde el actor le había puesto esperanzas en Hollywood, dando papeles en películas, entre ellas, un papel secundario en 'The Kid'.");
        descripcion2.setText("No fue hasta un 24 de noviembre de 1924, mientras en una de las visitas a Empalme (aún perteneciente a la comisaría de Guaymas) debido a que sus amígos trabajaban en el ferrocarril. En una de esas, los amigos invitaron al actor y su novia a que de una vez se casaran. Y así fue, en la casa habitación del juez Ignacio Haro, efectuaron el matrimonio Chaplin-MacMurray." );
        descripcion3.setText("No obstante, dos años después, Lita dejó a Chaplin. La actríz acusaba al actor de cometer adulterio con una gran cantidad de mujeres, donde presentó una demanda de divorcio, junto con otras acusaciones como acoso, pervesión sexual, etc. Al actor le costó 825,000 dolares el acuerdo de divorcio. Este matrimonio dejó dos hijos, de los cuales Lita se los llevó al momento de la separación.");

    }
}
