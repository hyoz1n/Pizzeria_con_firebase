package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import Pizzas.Pizzas;

public class Gestion_act extends AppCompatActivity {
    private EditText nom, precio, local;
    private Button guardar;

    FirebaseDatabase firebase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);

        nom = findViewById(R.id.idName);
        precio = findViewById(R.id.idPrice);
        local = findViewById(R.id.idLocal);
        guardar = findViewById(R.id.btnAdd);

        obtenerDataBase();

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pizzas p = new Pizzas();
                p.setId(UUID.randomUUID().toString());
                p.setNombre(nom.getText().toString());
                p.setPrecio(precio.getText().toString());
                p.setLocalizacion(local.getText().toString());
                databaseReference.child("Pizzas").child(p.getId()).setValue(p);
                Toast.makeText(getBaseContext(), "Has añadido una pizza", Toast.LENGTH_LONG).show();
            }
        });

    }
    public void obtenerDataBase(){
        FirebaseApp.initializeApp(this);
        firebase = FirebaseDatabase.getInstance();
        databaseReference = firebase.getReference();
    }

}