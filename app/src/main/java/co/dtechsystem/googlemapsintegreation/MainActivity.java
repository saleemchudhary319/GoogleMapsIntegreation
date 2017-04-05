package co.dtechsystem.googlemapsintegreation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    {

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
        @Override
        public void onMapReady (GoogleMap map){
        map.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
    }
    }
