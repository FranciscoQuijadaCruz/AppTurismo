package com.example.dell.aplicacionturismo;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Tinaco extends AppCompatActivity implements OnMapReadyCallback{
    private GyroscopeObserver GyroscopeObserver;
    private GoogleMap mMap;

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GyroscopeObserver = new GyroscopeObserver();
        GyroscopeObserver.setMaxRotateRadian(Math.PI/9);

        setContentView(R.layout.activity_info);

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


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapita);
        mapFragment.getMapAsync(this);



        imagen = (ImageView) findViewById(R.id.imgPrincipal);
        imagen.setImageResource(R.drawable.tinaco);
        imagen1 = (ImageView) findViewById(R.id.imgPrincipalUno);
        imagen1.setImageResource(R.drawable.tinaco1);
        imagen2 = (ImageView) findViewById(R.id.imgPrincipalDos);
        imagen2.setImageResource(R.drawable.tinaco2);
        imagen3 = (ImageView) findViewById(R.id.imgPrincipalTres);
        imagen3.setImageResource(R.drawable.tinaco3);
        imagen4 = (ImageView) findViewById(R.id.imgPrincipalCuatro);
        imagen4.setImageResource(R.drawable.tinaco4);



        PanoramaImageView piv = (PanoramaImageView)findViewById(R.id.imagePanorama);
        piv.setGyroscopeObserver(GyroscopeObserver);
        piv.setImageResource(R.drawable.panoramatinaco);
        piv.setImageBitmap(decodeSampledBitmapFromResource(getResources(), R.drawable.panoramatinaco, 100, 100));



        titulo.setText("Plaza de la Independencia\n'El Tinaco'");
        descripción.setText("Es la plaza más concurrida y céntrica de la ciudad, y se le conoce por el tinaco, una estructura que funcionó como portadora de agua potable de la ciudad.\n\nEl tinaco fue construido desde la fundación de Empalme en el año de 1907 y es el símbolo de la ciudad, mide aproximadamente 35 metros de altura y 10 metros de diámetro.\n\nEn 1950 hace su aparición RRHH, quien toma el control del agua potable en Empalme, deshaciéndose la empresa ferrocarrilera de este servicio, dejando el tinaco como regulador de presión.");
        descripcion2.setText("El tinaco en su cimentación tiene una viga de 48'' de altura y de 120 m de longitud que en el cruce de ellas está sentado el tinaco, por eso, aunque no lo crean tiene movimiento oscilatorio.\n\nCircunda al tinaco una plaza con diferentes tipos de árboles, como laureles de la india (yucatecos), tres tipos de palmeras, cuenta con un parque recreativo para niños, un kiosco que ofrece variedad de productos, una gran explana que también sirve como cancha de basketball. Cuenta con un jardín de niños dentro de la cuadra (Benito Juárez)." );
        descripcion3.setText("Cuenta con monumentos conmemorativos dentro de la plaza, por ejemplo, uno dedicado a Miguel Hidalgo justo al inferior del Tinaco, y otros monumentos como de Ignacio Zaragoza, ciudades hermanas, memorial de Alfredo Jiménez Mota, y el de empalmenses ilustres.\n\nEs también el centro de eventos especiales y culturales de la ciudad, como el Festival Cultural HISAR, en homenaje al compositor del Corrido de Empalme Hilario Sánchez Rubio, la Feria de las Flores, eventos religiosos, funciones de box o partidos de basketball, etc.");

    }
    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }
    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }
    @Override
    protected void onResume() {
        super.onResume();
        GyroscopeObserver.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        GyroscopeObserver.unregister();
    }

    @Override
    public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMinZoomPreference(15.0f);

        LatLng tinaco = new LatLng(27.959164383884897, -110.81891324433282);
        mMap.addMarker(new MarkerOptions().position(tinaco).title("Plaza de la Independencia (El Tinaco)").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tinaco,12));

    }
}
