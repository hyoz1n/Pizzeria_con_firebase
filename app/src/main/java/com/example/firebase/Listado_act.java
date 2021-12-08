package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import Pizzas.Pizzas;

public class Listado_act extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Pizzas> listaPizzas = new ArrayList<>();
    Pizzas pizzasSelected;
    FirebaseDatabase firebase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        lista = findViewById(R.id.listaV);
        obtenerDataBase();


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pizzasSelected = (Pizzas) parent.getItemAtPosition(position);

            }
        });

        databaseReference.child("Pizzas").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot op : snapshot.getChildren()) {
                    Pizzas p = op.getValue(Pizzas.class);
                    listaPizzas.add(p);

                    ArrayAdapter adapt = new ArrayAdapter(getBaseContext(), android.R.layout.simple_list_item_1, listaPizzas);
                    lista.setAdapter(adapt);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
public void Eliminar(View view){
        Pizzas p = new Pizzas();
        p.setId(pizzasSelected.getId());
        databaseReference.child("Pizzas").child(p.getId()).removeValue();
        Toast.makeText(getBaseContext(), "Has eliminado de la database", Toast.LENGTH_LONG).show();
}

    public void obtenerDataBase(){
        FirebaseApp.initializeApp(this);
        firebase = FirebaseDatabase.getInstance();
        databaseReference = firebase.getReference();
    }

}