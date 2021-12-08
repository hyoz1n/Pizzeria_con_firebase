package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import Pizzas.Ingredientes;
import Pizzas.TiposPizzas;

public class Arma_pizza_act extends AppCompatActivity {
    private Spinner Tpizzas;
    private Spinner Tingre;
    private Button result;
    private TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arma_pizza);
        Tpizzas = (Spinner) findViewById(R.id.idTP);
        Tingre = (Spinner) findViewById(R.id.idIngre);
        result = (Button) findViewById(R.id.btnCalculate);
        total = (TextView) findViewById(R.id.tvResult);
        TiposPizzas tp = new TiposPizzas();
        String[] ListaTP = tp.getPizzas();
        ArrayAdapter adapTP = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ListaTP);
        Tpizzas.setAdapter(adapTP);
        Ingredientes in = new Ingredientes();
        String[] ListaIngre = in.getIngredientes();
        ArrayAdapter adapIngre = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ListaIngre);
        Tingre.setAdapter(adapIngre);
    }
    public void Calcular(View view){
        TiposPizzas tp = new TiposPizzas();
        if(Tpizzas.getSelectedItem().toString().equals("Pizza Napolitana") &&
        Tingre.getSelectedItem().toString().equals("Tocino")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(12500, 350));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Napolitana") &&
                Tingre.getSelectedItem().toString().equals("Extra Queso")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(12500, 500));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Napolitana") &&
                Tingre.getSelectedItem().toString().equals("Champiñón")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(12500, 250));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Napolitana") &&
                Tingre.getSelectedItem().toString().equals("Salame")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(12500, 300));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Napolitana") &&
                Tingre.getSelectedItem().toString().equals("Albahaca")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(12500, 450));
        }
        if(Tpizzas.getSelectedItem().toString().equals("Pizza Predilecta") &&
                Tingre.getSelectedItem().toString().equals("Tocino")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(13800, 350));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Predilecta") &&
                Tingre.getSelectedItem().toString().equals("Extra Queso")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(13800, 500));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Predilecta") &&
                Tingre.getSelectedItem().toString().equals("Champiñón")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(13800, 250));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Predilecta") &&
                Tingre.getSelectedItem().toString().equals("Salame")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(13800, 300));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Predilecta") &&
                Tingre.getSelectedItem().toString().equals("Albahaca")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(13800, 450));
        }
        if(Tpizzas.getSelectedItem().toString().equals("Pizzas Vegana") &&
                Tingre.getSelectedItem().toString().equals("Tocino")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(15600, 350));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizzas Vegana") &&
                Tingre.getSelectedItem().toString().equals("Extra Queso")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(15600, 500));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizzas Vegana") &&
                Tingre.getSelectedItem().toString().equals("Champiñón")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(15600, 250));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizzas Vegana") &&
                Tingre.getSelectedItem().toString().equals("Salame")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(15600, 300));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizzas Vegana") &&
                Tingre.getSelectedItem().toString().equals("Albahaca")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(15600, 450));
        }
        if(Tpizzas.getSelectedItem().toString().equals("Pizza Selecta") &&
                Tingre.getSelectedItem().toString().equals("Tocino")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(18600, 350));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Selecta") &&
                Tingre.getSelectedItem().toString().equals("Extra Queso")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(18600, 500));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Selecta") &&
                Tingre.getSelectedItem().toString().equals("Champiñón")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(18600, 250));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Selecta") &&
                Tingre.getSelectedItem().toString().equals("Salame")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(18600, 300));
        }else if(Tpizzas.getSelectedItem().toString().equals("Pizza Selecta") &&
                Tingre.getSelectedItem().toString().equals("Albahaca")){
            total.setText("El precio es:" + tp.resultadoFinalPizza(18600, 450));
        }
    }
}