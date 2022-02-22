package com.zeta007.datosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText name;
     Button btn;
     TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.nombreEt);
        btn=findViewById(R.id.buscarBtn);
        resultado=findViewById(R.id.mostrarTxt);

    }
// boton buscar
    public void buscar(View view) {

        DatabaseAcces databaseAcces=DatabaseAcces.getInstance(getApplicationContext());
        databaseAcces.open();

        String n=name.getText().toString();
        String address=databaseAcces.getAddress(n);
        resultado.setText(address);
        databaseAcces.close();
    }

}