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

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Bahia extends AppCompatActivity implements OnMapReadyCallback {
    private GyroscopeObserver GyroscopeObserver;
    private GoogleMap mMap;

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        GyroscopeObserver = new GyroscopeObserver();
        GyroscopeObserver.setMaxRotateRadian(Math.PI/9);

        TextView titulo;
        TextView descripción, descripcion2, descripcion3;

        ImageView imagen;
        ImageView imagen1;
        ImageView imagen2;
        ImageView imagen3;
        ImageView imagen4;


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapita);
        mapFragment.getMapAsync(this);

        titulo = (TextView) findViewById(R.id.lbTitulo);
        descripción = (TextView) findViewById(R.id.lbDescripcion);
        //descripción.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        descripcion2 = (TextView) findViewById(R.id.lbDescripcion2);
        //descripcion2.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        descripcion3 = (TextView) findViewById(R.id.lbDescripcion3);
        //descripcion3.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);


        imagen = (ImageView) findViewById(R.id.imgPrincipal);
        imagen.setImageResource(R.drawable.bahia1);
        imagen1 = (ImageView) findViewById(R.id.imgPrincipalUno);
        imagen1.setImageResource(R.drawable.bahia3);
        imagen2 = (ImageView) findViewById(R.id.imgPrincipalDos);
        imagen2.setImageResource(R.drawable.bahia4);
        imagen3 = (ImageView) findViewById(R.id.imgPrincipalTres);
        imagen3.setImageResource(R.drawable.bahia5);
        imagen4 = (ImageView) findViewById(R.id.imgPrincipalCuatro);
        imagen4.setImageResource(R.drawable.bahia6);
        PanoramaImageView piv = (PanoramaImageView)findViewById(R.id.imagePanorama);
        piv.setGyroscopeObserver(GyroscopeObserver);
        piv.setImageResource(R.drawable.bahia2);
        piv.setImageBitmap(decodeSampledBitmapFromResource(getResources(), R.drawable.bahia2, 100, 100));



        titulo.setText("Bahía de Empalme");
        descripción.setText("Se trata de la bahía que lo compone el estero El Rancho, y el mar de Cortez, es un lugar especial para muchos que se dedican a la pesca, actividad económica importante para los empalmenses. También posée el famoso Puente Douglas, el tramo que une las ciudades de Empalme y Guaymas, y forma parte de la Carretera Internacionál México-Nogales.");
        descripcion2.setText("Un pequeño malecón de reciente creación en conjunto con estos muelles para embarcaciones menores, le da otro aspecto a la marisma \"Donde moja sus pies\" la colonia Bella Vista.\n" +
                "En su litoral se pueden pescar diversas especies como la lisa, cabrilla, pulpo, jaiba, tiburón, callo de hacha y el preciado camarón.");
        descripcion3.setText("Puente Douglas:\n En 1902 se construye un terraplén de 88.5 mt. que después se le conocería como Puente Douglas. A finales  del siglo pasado se construyó un puente alterno para separar el tráfico vehicular del ferroviario que todavia fluye por la añeja vía. Actualmente, el tramo vehicular del puente se encuentra en proceso de modernización.");
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
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMinZoomPreference(15.0f);

        LatLng bahia = new LatLng(27.955037278956965, -110.82666826402026);
        mMap.addMarker(new MarkerOptions().position(bahia).title("Bahía de Empalme").icon(BitmapDescriptorFactory.fromResource(R.drawable.naturaleza)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bahia,12));

    }

}
