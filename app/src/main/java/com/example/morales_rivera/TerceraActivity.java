package com.example.morales_rivera;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class TerceraActivity extends AppCompatActivity {


    private EditText etNombre;
    private EditText etBase;

    private EditText etApellido;
    private EditText etExponente;
    private EditText etNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        etNombre = findViewById(R.id.etNombreTercera);

        String nombre = getIntent().getStringExtra("key_nombre");
        etNombre.setText(nombre.toUpperCase(Locale.ROOT));

        etBase = findViewById(R.id.etBaseTercera);

        String base = getIntent().getStringExtra("key_base");
        etBase.setText(base);

        etApellido=findViewById(R.id.etApellidoTercera);
        etExponente=findViewById(R.id.etExponenteTercera);
        etNumero=findViewById(R.id.etNumeroTercera);

    }

    public void onClickCerrar(View view){
        String apellido=etApellido.getText().toString();
        String exponente=etExponente.getText().toString();
        String numero=etNumero.getText().toString();



        if(!apellido.matches("") && !exponente.matches("") && !numero.matches("")){
            String[] lista=new String[3];
            lista[0]=apellido;
            lista[1]=exponente;
            lista[2]=numero;
            // Regresar el item seleccionado.

            Intent intent=new Intent();
            intent.setData(Uri.parse(apellido));
            intent.setData(Uri.parse(exponente));
            intent.setData(Uri.parse(numero));

            setResult(Activity.RESULT_OK, intent);

            finish();
        }else{
            Toast.makeText(this, "Rellenar campos obligatorios.", Toast.LENGTH_LONG).show();
        }
    }
}