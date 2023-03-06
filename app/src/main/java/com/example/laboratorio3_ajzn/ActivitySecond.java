package com.example.laboratorio3_ajzn;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySecond extends AppCompatActivity {

    int aleatorio = MainActivity.getNumAleatorio();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imagenAutor = ((ImageView) findViewById(R.id.imagen));
        TextView autor = ((TextView) findViewById(R.id.nombre));
        TextView frase = ((TextView) findViewById(R.id.frase));

        switch (aleatorio){

            case 2:
                imagenAutor.setImageResource(R.drawable.gandhi);
                autor.setText(R.string.autor_frase2);
                frase.setText(R.string.frase2);

                break;

            case 3:
                imagenAutor.setImageResource(R.drawable.john);
                autor.setText(R.string.autor_frase3);
                frase.setText(R.string.frase3);

                break;

            case 1:
                imagenAutor.setImageResource(R.drawable.lao);
                autor.setText(R.string.autor_rase1);
                frase.setText(R.string.frase1);

                break;
        }


    }
}
