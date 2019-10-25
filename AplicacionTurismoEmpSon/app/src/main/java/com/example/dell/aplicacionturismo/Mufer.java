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

public class Mufer extends AppCompatActivity implements OnMapReadyCallback {
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
        imagen.setImageResource(R.drawable.mufer);
        imagen1 = (ImageView) findViewById(R.id.imgPrincipalUno);
        imagen1.setImageResource(R.drawable.mufer1);
        imagen2 = (ImageView) findViewById(R.id.imgPrincipalDos);
        imagen2.setImageResource(R.drawable.mufer2);
        imagen3 = (ImageView) findViewById(R.id.imgPrincipalTres);
        imagen3.setImageResource(R.drawable.mufer3);
        imagen4 = (ImageView) findViewById(R.id.imgPrincipalCuatro);
        imagen4.setImageResource(R.drawable.mufer4);
        PanoramaImageView piv = (PanoramaImageView)findViewById(R.id.imagePanorama);
        piv.setGyroscopeObserver(GyroscopeObserver);
        piv.setImageResource(R.drawable.muferpan);
        piv.setImageBitmap(decodeSampledBitmapFromResource(getResources(), R.drawable.muferpan, 100, 100));

        titulo.setText("Museo Ferrocarrilero\n'MUFER'");
        descripción.setText("Museo fundado el 20 de noviembre de 1997 y que funciona en un coche que funcionó como exprés con el número 1047. El MUFER se ha dedicado al rescate, la conservación y la clasificación del patrimonio ferrocarrilero. Rescata la historia de la estación de Empalme del ramal Guaymas-Empalme." );
        descripcion2.setText("Cuenta con una réplica de la máquina locomotora 650 elaborada en los talleres del mismo ferrocarril. La construcción del Ferrocarril Sud-Pacífico que continuó el tendido de vías uniendo Nogales y Guadalajara.");
        descripcion3.setText("Se localiza en los jardines de la sede del sindicato ferrocarrilero en el centro de la ciudad y se ha convertido en exitoso centro de tertulias literarias y de la crónica del acontecer empalmense.");
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

        LatLng mufer = new LatLng(27.95930327323009, -110.81589265280273);
        mMap.addMarker(new MarkerOptions().position(mufer).title("Museo Ferrocarrilero (MUFER)").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mufer,12));

    }

}
