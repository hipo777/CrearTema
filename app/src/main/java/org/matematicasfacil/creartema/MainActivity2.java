package org.matematicasfacil.creartema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Tema2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnMapa = findViewById(R.id.buttonMapa);
        CalendarView miCalendario = findViewById(R.id.calendarView);

        // Obtén una instancia del calendario actual
        Calendar instanciaCalendario = Calendar.getInstance();

        // Obtén la fecha actual en milisegundos
        long fechaActual = instanciaCalendario.getTimeInMillis();

        // Actualiza la fecha seleccionada en el CalendarView
        miCalendario.setDate(fechaActual);

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irMapa = new Intent(getBaseContext(), MainActivity3.class);
                startActivity(irMapa);
            }
        });
    }
}