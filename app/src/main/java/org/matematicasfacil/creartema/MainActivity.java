package org.matematicasfacil.creartema;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "OnCreate Actividad 1", Toast.LENGTH_SHORT).show();
        // Actividad creada.

        Button boton1 = findViewById(R.id.btn1);
        Button boton2 = findViewById(R.id.btn2);

        boton1.setOnClickListener(v -> {
            recreate();
            setTheme(R.style.Tema1);
        });

        boton2.setOnClickListener(v -> {
            setTheme(R.style.Tema2);
            recreate();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart Actividad 1", Toast.LENGTH_SHORT).show();
        // Actividad inicializada.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume Actividad 1", Toast.LENGTH_SHORT).show();
        // Actividad visible.
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause Actividad 1", Toast.LENGTH_SHORT).show();
        // Para pausar o ajustar las operaciones que no deben continuar.
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop Actividad 1", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy Actividad 1", Toast.LENGTH_SHORT).show();
        // La actividad está terminando (debido a que el usuario la descarta por completo o a que se llama a finish()).
    }
}
