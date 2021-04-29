package com.example.oneaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View V){
        String [] frases = {
                "A vida é como o vento, esta sempre ao meu lado",
                "A morte nunca me encontra",
                "Talvez a beleza que se vê não é nada mais que a forma de sua virtude",
                "Um por todos e todos ao meus comando",
                "A morte mais rapida é aqueela que existe em uma vida",
        };

        int posicaoSorteada = new Random().nextInt(frases.length);

            TextView texto = (TextView) findViewById(R.id.textViewResultado);
                String fraseDoDia = frases[posicaoSorteada];
                texto.setText(fraseDoDia);
    }

}