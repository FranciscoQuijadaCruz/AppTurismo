package com.example.dell.aplicacionturismo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Construccion extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView titulo;
        TextView descripción;
        ImageView imagen;
        titulo = (TextView) findViewById(R.id.lbTitulo);
        descripción = (TextView) findViewById(R.id.lbDescripcion);
        imagen = (ImageView) findViewById(R.id.imgPrincipal);
//        imagen.setImageResource(R.drawable.tinaco);
//        titulo.setText("Plaza de la Independencia\n'El Tinaco'");
//        descripción.setText("Es la plaza más concurrida y céntrica de la ciudad, y se le conoce por el tinaco, una estructura que funcionó como portadora de agua potable de la ciudad.\n\nEl tinaco fue construido desde la fundación de Empalme en el año de 1907 y es el símbolo de la ciudad, mide aproximadamente 35 metros de altura y 10 metros de diámetro.\n\nEn 1950 hace su aparición RRHH, quien toma el control del agua potable en Empalme, deshaciéndose la empresa ferrocarrilera de este servicio, dejando el tinaco como regulador de presión.\n\nEl tinaco en su cimentación tiene una viga de 48'' de altura y de 120 m de longitud que en el cruce de ellas está sentado el tinaco, por eso, aunque no lo crean tiene movimiento oscilatorio.\n\nCircunda al tinaco una plaza con diferentes tipos de árboles, como laureles de la india (yucatecos), tres tipos de palmeras, cuenta con un parque recreativo para niños, un kiosco que ofrece variedad de productos, una explanada donde se lleva eventos importantes, entre ellos, las fiestas patrias, además también funciona como una cancha de basketball. Cuenta con un jardín de niños dentro de la cuadra (Benito Juárez).\n\nCuenta con monumentos conmemorativos dentro de la plaza, por ejemplo, uno dedicado a Miguel Hidalgo justo al inferior del Tinaco, y otros monumentos como de Ignacio Zaragoza, ciudades hermanas, memorial de Alfredo Jiménez Mota, empalmenses ilustres.\n\n" );

    }

}
