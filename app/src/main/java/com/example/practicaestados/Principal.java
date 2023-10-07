package com.example.practicaestados;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bumptech.glide.Glide;



public class Principal extends AppCompatActivity {

    Spinner splista;
    List<String> Milista = new ArrayList<>(Arrays.asList("Estado de México", "Durango", "Chihuahua", "Jalisco", "Zacatecas", "Puebla"));

    ImageView imagen;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);
        imagen = findViewById(R.id.foto);


        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Milista);
        splista.setAdapter(adaptador);

        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();


                if (valor.equals("Zacatecas")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1cL4JOovVQJ-43stCLAWkeile2Au8_nwQ").into(imagen);
                }else if (valor.equals("Puebla")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1WshPC3yvyc3HSKatKjIpu8DyIuwj94zr").into(imagen);
                }else if (valor.equals("Jalisco")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1rCl7K8w0Pg-9aUX_oFFmHqXqEYe1vHFt").into(imagen);
                }else if (valor.equals("Chihuahua")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1I26AfrKLkCvVWn6lwiYuyvtacqVlPpFE").into(imagen);
                }else if (valor.equals("Durango")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1xQH6A5JTYMvXwZgqvfmd1Q5joYW5k4pz").into(imagen);
                }else if (valor.equals("Estado de México")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1RWmSadiQnPUVxvdNf6byYRio0mupOfAK").into(imagen);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}