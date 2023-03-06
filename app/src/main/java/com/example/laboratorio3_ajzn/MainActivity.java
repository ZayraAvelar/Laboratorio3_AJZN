package com.example.laboratorio3_ajzn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    //se crea la variable para el numero aleatorio
    private static int aleatorio;

    //creamos la variable que mostrara el numero
    private TextView generado;

    private Button botonGenerar;

    //se declara la variable log
    private static final String Log_Tag = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asignamos el objeto TextView que tenemos
        generado = (TextView) findViewById(R.id.txtNumero);

        //asignamos valor a la variable para generar un numero aleatorio
        aleatorio = (int) (Math.random() * 3 + 1);

        //se asigna al boton creado el mostrar Frase
        botonGenerar = (Button) findViewById(R.id.Generar);

        botonGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sirve ´para apturar el numero aleatorio
                String numero;

                //se genera el numero aleatorio
                aleatorio = (int) (Math.random() * 3 + 1);

                //se cambia el valor de entero a String
                numero = String.valueOf(aleatorio);

                //se cambia el valor de texto que tenia el TextView
                generado.setText(numero);
            }
        });

    }

    /**
     * @param view
     */
    public void launchSecondActivity(View view) {
        //se activa el segundo activity
        Intent intent = new Intent(this, ActivitySecond.class);

        //permite mostar el activity
        startActivity(intent);
    }

    /**
     *
     */
    public static int getNumAleatorio() {
        return aleatorio;
    }
}

