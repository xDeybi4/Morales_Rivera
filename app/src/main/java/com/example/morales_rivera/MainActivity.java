package com.example.morales_rivera;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int codigoRequerido=1;

    String nombre;
    String apellido;
    String base;
    String exponente;
    String numero;
    String potencia;

    private TextView tvNombre;
    private TextView tvApellido;
    private TextView tvBase;
    private TextView tvExponente;
    private TextView tvFactorial;
    private TextView tvPotencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNombre=findViewById(R.id.tvNombrePrimera);
        tvApellido=findViewById(R.id.tvApellidoPrimera);
        tvBase=findViewById(R.id.tvBasePrimera);
        tvExponente=findViewById(R.id.tvExponentePrimera);
        tvFactorial=findViewById(R.id.tvFactorialPrimera);
        tvPotencia=findViewById(R.id.tvPotenciaPrimera);

    }

    public void onClickSiguiente(View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
        //Retornar Datos
    }

    public void onClickMostrarResultados(View view){
        tvNombre.setText(nombre.toUpperCase(Locale.ROOT));
        tvApellido.setText(apellido.toUpperCase(Locale.ROOT));
        tvBase.setText(base);
        tvExponente.setText(exponente);


    }

    public double factorial(double numero){
        double factorial = 1;

        while ( numero!=0) {
            factorial=factorial*numero; numero--;
        }
        return factorial;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //Obtener los datos regresados desde la ventana hija.

        if (requestCode == codigoRequerido && resultCode == RESULT_OK) {
            String informacion;
            informacion=data.getDataString();
            String[] datos=informacion.split(",");

            nombre=datos[0];
            apellido=datos[1];
            base=datos[2];
            exponente=datos[3];
            numero=datos[4];


        }
    }

}