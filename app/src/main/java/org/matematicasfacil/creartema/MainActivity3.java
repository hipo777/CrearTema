package org.matematicasfacil.creartema;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MainActivity3 extends AppCompatActivity implements OnMapReadyCallback {

    private MapView miMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Tema1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        miMapa = findViewById(R.id.mapView);
        miMapa.onCreate(savedInstanceState);
        miMapa.getMapAsync(this);

        // Inicializa el servicio de Google Maps
        MapsInitializer.initialize(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }
    @Override
    protected void onResume() {
        super.onResume();
        miMapa.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        miMapa.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        miMapa.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        miMapa.onLowMemory();
    }
}