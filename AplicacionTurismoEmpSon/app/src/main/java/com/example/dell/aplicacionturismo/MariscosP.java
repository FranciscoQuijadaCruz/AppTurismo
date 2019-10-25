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
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MariscosP extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);

        TextView titulo;
        TextView descripción, descripcion2, descripcion3;

        ImageView imagen;
        ImageView imagen1;
        ImageView imagen2;


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapitaGas);
        mapFragment.getMapAsync(this);

        titulo = (TextView) findViewById(R.id.lbTituloG);
        descripción = (TextView) findViewById(R.id.lbDescripcionG);
        //descripción.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);

        imagen = (ImageView) findViewById(R.id.imgPrincipalG);
        imagen.setImageResource(R.drawable.puente1);
        imagen1 = (ImageView) findViewById(R.id.imgPrincipalUnoG);
        imagen1.setImageResource(R.drawable.puente2);
        imagen2 = (ImageView) findViewById(R.id.imgPrincipalDosG);
        imagen2.setImageResource(R.drawable.puente3);

        titulo.setText("Mariscos El Puente");
        descripción.setText("Los maríscos mas frescos y lo mejor de los platillos del mar.");

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMinZoomPreference(15.0f);

        LatLng mariscospuente = new LatLng(27.95966176695252, -110.82197008390428);
        mMap.addMarker(new MarkerOptions().position(mariscospuente).title("Mariscos el Puente").icon(BitmapDescriptorFactory.fromResource(R.drawable.gastronomia)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mariscospuente,12));
    }

}
