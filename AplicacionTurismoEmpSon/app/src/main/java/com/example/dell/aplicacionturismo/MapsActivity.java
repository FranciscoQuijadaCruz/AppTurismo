package com.example.dell.aplicacionturismo;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener
{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    private Marker tinacoMap, muferMap, placitaMap, parquecitoMap, cochoritMap, sahuaralMap, bahiaMap, piedraMap, puenteMap, donMap, vivaMap, aleMap;

    @Override
    public boolean onMarkerClick(final Marker marker) {

        if (marker.equals(tinacoMap))
        {
            Intent tinaco=new Intent(MapsActivity.this, Tinaco.class);
            startActivity(tinaco);
        }
        else if (marker.equals(muferMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Mufer.class);
            startActivity(tinaco);
        }
        else if (marker.equals(placitaMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Plazita.class);
            startActivity(tinaco);
        }
        else if (marker.equals(parquecitoMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Parquecito.class);
            startActivity(tinaco);
        }
        else if (marker.equals(cochoritMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Cochorit.class);
            startActivity(tinaco);
        }
        else if (marker.equals(sahuaralMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Sahuaral.class);
            startActivity(tinaco);
        }
        else if (marker.equals(bahiaMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Bahia.class);
            startActivity(tinaco);
        }
        else if (marker.equals(piedraMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Piedra.class);
            startActivity(tinaco);
        }
        else if (marker.equals(puenteMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,MariscosP.class);
            startActivity(tinaco);
        }
        else if (marker.equals(donMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,DonMarcos.class);
            startActivity(tinaco);
        }
        else if (marker.equals(vivaMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,VivaEmp.class);
            startActivity(tinaco);
        }
        else if (marker.equals(aleMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Alexander.class);
            startActivity(tinaco);
        }
        return false;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMinZoomPreference(12.0f);

        LatLng tinaco = new LatLng(27.959164383884897, -110.81891324433282);
        googleMap.setOnMarkerClickListener(this);
        tinacoMap = mMap.addMarker(new MarkerOptions().position(tinaco).title("Plaza de la Independencia (El Tinaco)").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));
       mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tinaco,12));

        LatLng mufer = new LatLng(27.95930327323009, -110.81589265280273);
        muferMap=mMap.addMarker(new MarkerOptions().position(mufer).title("Museo Ferrocarrilero (MUFER)").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mufer,12));

        LatLng placita = new LatLng(27.95995207015841, -110.81276841721466);
        placitaMap=mMap.addMarker(new MarkerOptions().position(placita).title("Plaza de los Jubilados").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(placita,12));

        LatLng parquecito = new LatLng(27.95669209864441, -110.81295080743084);
        parquecitoMap=mMap.addMarker(new MarkerOptions().position(parquecito).title("Parque Benito Juárez").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parquecito,12));


        LatLng cochorit = new LatLng(27.91714681534708, -110.77376795795841);
        cochoritMap=mMap.addMarker(new MarkerOptions().position(cochorit).title("Playa del Cochorit").icon(BitmapDescriptorFactory.fromResource(R.drawable.naturaleza)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cochorit,12));

        LatLng sahuaral = new LatLng(27.966420683133492, -110.79027579409015);
        sahuaralMap=mMap.addMarker(new MarkerOptions().position(sahuaral).title("El Sahuaral").icon(BitmapDescriptorFactory.fromResource(R.drawable.naturaleza)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sahuaral,12));

        LatLng bahia = new LatLng(27.955037278956965, -110.82666826402026);
        bahiaMap=mMap.addMarker(new MarkerOptions().position(bahia).title("Bahía de Empalme").icon(BitmapDescriptorFactory.fromResource(R.drawable.naturaleza)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bahia,12));

        LatLng piedravolada = new LatLng(27.990890051409664, -110.80519853180466);
        piedraMap=mMap.addMarker(new MarkerOptions().position(piedravolada).title("Piedra Volada").icon(BitmapDescriptorFactory.fromResource(R.drawable.naturaleza)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(piedravolada,12));

        LatLng mariscospuente = new LatLng(27.95966176695252, -110.82197008390428);
        puenteMap=mMap.addMarker(new MarkerOptions().position(mariscospuente).title("Mariscos el Puente").icon(BitmapDescriptorFactory.fromResource(R.drawable.gastronomia)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mariscospuente,12));

        LatLng tacosdonmarcos = new LatLng(27.960185714465965, -110.81447058637188);
        donMap=mMap.addMarker(new MarkerOptions().position(tacosdonmarcos).title("Tacos Dorados Don Marcos").icon(BitmapDescriptorFactory.fromResource(R.drawable.gastronomia)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tacosdonmarcos,12));

        LatLng vivaempalme = new LatLng(27.959953886235738, -110.81964206509458);
        vivaMap=mMap.addMarker(new MarkerOptions().position(vivaempalme).title("Viva Empalme").icon(BitmapDescriptorFactory.fromResource(R.drawable.gastronomia)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(vivaempalme,12));

        LatLng alexander = new LatLng(27.959803630341412, -110.81537342293232);
        aleMap=mMap.addMarker(new MarkerOptions().position(alexander).title("Restaurant Alexander").icon(BitmapDescriptorFactory.fromResource(R.drawable.gastronomia)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(alexander,12));


    }


}
