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

public class Ferrocarril extends AppCompatActivity {
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
        imagen.setImageResource(R.drawable.ferro1);
        imagen1 = (ImageView) findViewById(R.id.imgPrincipalUno);
        imagen1.setImageResource(R.drawable.ferro2);
        imagen2 = (ImageView) findViewById(R.id.imgPrincipalDos);
        imagen2.setImageResource(R.drawable.ferro3);
        imagen3 = (ImageView) findViewById(R.id.imgPrincipalTres);
        imagen3.setImageResource(R.drawable.ferro5);
        imagen4 = (ImageView) findViewById(R.id.imgPrincipalCuatro);
        imagen4.setImageResource(R.drawable.ferro4);

        titulo.setText("La ciudad ferrocarrilera");
        descripción.setText("El nacimiento de la ciudad de Empalme, está indisolublemente ligada a la instalación de los Talleres Generales del ferrocarril. Incluso, más allá de considerar al ferrocarril como el origen del nacimiento de la ciudad, las actividades en torno a tan vital medio de transporte han alcanzado el nivel de proveer identidad al municipio y sus gentes, así Empalme y ferrocarril, han recorrido la historia de la mano. \nEn los inicios del presente siglo, 1905 el ferrocarril de Sonora LTD, pasó a manos del FC Cananea Rio Yaqui y Pacifico, y esta empresa decidió sacar la punta de fierro hacia el sur, resultando inoperante los talleres ubicados en el barrio de Punta Arena en el puerto de Guaymas, quedando este como ramal y proyectándose los talleres generales que los ubicaron en los terrenos propiedad de la familia de la Huerta e Iberri, los proyectos de este, se dibujaron en la ciudad de Tucson, Arizona, al inicio de la construcción, se hizo lo mismo con el pueblo, a lo que los Norte-Americanos le llamaron “Junction” que traducido al español es “empalme y etimológicamente quiere decir “junción de dos vías”.");
        descripcion2.setText("Al terminar la segunda guerra mundial, el gobierno federal invirtió todo su presupuesto a las carreteras, dejando atrás la espina dorsal que representó para nuestro país el ferrocarril, desde la época porfiriana, aunado a esto el ferrocarril Sud Pacífico de México, perdió el interés por esta empresa yaque no era prioritaria para ella lo que en la guerra significo a los Estados Unidos estratégicamente, la costa occidental de México.\n" +
                "\n" +
                "Así en diciembre 11 de 1951, el Sud Pacifico de México, subsidiario del Southern Pacific Lines le vendió al gobierno el ferrocarril, comprando este el 51% de las acciones y el resto agricultores y hombres de empresa de la costa del pacifico, formándose así el Ferrocarril de Pacifico S.A. de C.V. a partir del 5 de marzo de 1952.\n" +
                "\n" +
                "Así se inicio la rehabilitación de la vía de Nogales a Guadalajara, cambiándose el riel de 60 libras por yarda a 90,100 y 112 libras por yarda.\n" +
                "\n" +
                "Se inicio también el cambio de fuerza tractiva, de vapor a diesel eléctrica llegando las primeras locomotoras en 1953, eran locomotoras de patio camino de 1600 HP tipo RDS 5, de la fábrica “American Locomotiva de Estados Unidos”.\n" );
        descripcion3.setText("\n" +
                "Los talleres de locomotoras tuvieron que remodelarse para adaptarlos a este tipo de locomotoras, e inexplicablemente el primero que cayó fue “la casa redonda” llevándose la piedra labrada con que estaban construidos sus muros hacia el centro de la república, ignorándose el destino que tuvieron.\n" +
                "\n" +
                "La desaparición de la casa redonda para muchos de nosotros, siendo una incongruencia, ya que los principales talleres ferrocarrileros de América y del mundo tienen casa redonda con su mesa giratoria.\n" +
                "\n" +
                "Lo anterior es una semblanza del cuartel general de los ferrocarriles, Cananea del Río Yaqui y Pacifico, Sud Pacific de México, ferrocarriles del Pacifico S.A de C. V. y ahora región Pacifico de los FF.CC. Nacionales de México.\n" +
                "\n" +
                "Como se puede observar la ubicación de los talleres generales de los ferrocarriles antes mencionados dio origen a la formación de nuestro pueblo, Empalme Sonora.\n");

    }
}
