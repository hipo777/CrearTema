package org.matematicasfacil.creartema;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = findViewById(R.id.btn1);
        Button boton2 = findViewById(R.id.btn2);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTheme(R.style.Theme_CrearTema);
                recreate();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTheme(R.style.Theme_CrearTema2);
                recreate();
            }
        });
    }

}
