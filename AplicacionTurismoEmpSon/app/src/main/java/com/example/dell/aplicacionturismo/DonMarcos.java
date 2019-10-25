package com.example.dell.aplicacionturismo;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DonMarcos extends AppCompatActivity implements OnMapReadyCallback {
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
        imagen.setImageResource(R.drawable.donmarcos1);
        imagen1 = (ImageView) findViewById(R.id.imgPrincipalUnoG);
        imagen1.setImageResource(R.drawable.donmarcos2);
        imagen2 = (ImageView) findViewById(R.id.imgPrincipalDosG);
        imagen2.setImageResource(R.drawable.donmarcos3);

        titulo.setText("Tacos Dorados Don Marcos");
        descripción.setText("Desde 1925 toda una tradición en Empalme. Deliciosos tacos dorados acompañados de salsa hecha con la receta de la casa.");

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

        LatLng tacosdonmarcos = new LatLng(27.960185714465965, -110.81447058637188);
        mMap.addMarker(new MarkerOptions().position(tacosdonmarcos).title("Tacos Dorados Don Marcos").icon(BitmapDescriptorFactory.fromResource(R.drawable.gastronomia)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tacosdonmarcos,12));
    }

}
