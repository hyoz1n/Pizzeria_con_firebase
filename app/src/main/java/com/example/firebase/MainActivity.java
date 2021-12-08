package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    private Button botonGestion;
    private Button botonListado;
    private Button botonArma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonGestion = (Button) findViewById(R.id.botonG);
        botonListado = (Button) findViewById(R.id.botonL);
        botonArma = (Button) findViewById(R.id.botonA);
    }
    public void Gestion(View view)
    {
        Intent i = new Intent(this, Gestion_act.class);
        startActivity(i);
    }
    public void Lista(View view)
    {
        Intent i = new Intent(this, Listado_act.class);
        startActivity(i);
    }
    public void Arma(View view)
    {
        Intent i = new Intent(this, Arma_pizza_act.class);
        startActivity(i);
    }
    public void Facebook(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com//"));
        startActivity(i);
    }
    public void Twitter(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.Twitter.com//"));
        startActivity(i);
    }
    public void Instagram(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.Instagram.com//"));
        startActivity(i);
    }
    public void Youtube(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.Youtube.com//"));
        startActivity(i);
    }
}