package com.example.morales_rivera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        //etApellido=findViewById(R.id.et)

    }

    public void onClickCerrar(View view){

        if(!nombre.matches("") && !base.matches("")){
            Intent intent=new Intent(this, TerceraActivity.class);

            //Enviar información desde otra activity
            intent.putExtra("key_nombre", nombre);
            intent.putExtra("key_base", base);


            this.startActivity(intent);
        }else{
            Toast.makeText(this, "Rellenar campos obligatorios.", Toast.LENGTH_LONG).show();
        }
    }
}