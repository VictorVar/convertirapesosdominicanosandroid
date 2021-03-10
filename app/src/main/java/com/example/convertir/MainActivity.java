package com.example.convertir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton radiodolar, radioeuro, radiolibra, radiofranco, radioyen, radiohongkones;
    TextView resultado;
    EditText convertir;
    Button btnconvertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiodolar= findViewById(R.id.radiodolar);
        radioeuro= findViewById(R.id.radioeuro);
        radiolibra= findViewById(R.id.radiolibra);
        radiofranco= findViewById(R.id.radiofranco);
        radioyen= findViewById(R.id.radioyen);
        radiohongkones= findViewById(R.id.radiohongkones);
        resultado= findViewById(R.id.resultado);
        convertir= findViewById(R.id.convertir);
        btnconvertir= findViewById(R.id.btnconvertir);
    }
   public void elpepe (View v){
        if(radiodolar.isChecked()){
            int valor=Integer.parseInt(convertir.getText().toString());
            int r = valor * 57;
            resultado.setText("La conversion de dolares a pesos son: "+r);

        }
       if(radioeuro.isChecked()){
           int valor=Integer.parseInt(convertir.getText().toString());
           int r = valor * 68;
           resultado.setText("La conversion de euros a pesos son: "+r);
   }
       if(radiolibra.isChecked()){
           int valor=Integer.parseInt(convertir.getText().toString());
           int r = valor * 80;
           resultado.setText("La conversion de libras esterlinas a pesos son: "+r);
       }
       if(radiofranco.isChecked()){
           int valor=Integer.parseInt(convertir.getText().toString());
           int r = valor * 62;
           resultado.setText("La conversion de franco suizo a pesos son: "+r);
       }
       if(radioyen.isChecked()){
           double valor=Double.parseDouble(convertir.getText().toString());
           double r = valor * 0.53;
           resultado.setText("La conversion de yen japonés a pesos son: "+r);
       }
       if(radiohongkones.isChecked()){
           int valor=Integer.parseInt(convertir.getText().toString());
           int r = valor * 7;
           resultado.setText("La conversion de dolar hongkonés a pesos son: "+r);
       }
    }}