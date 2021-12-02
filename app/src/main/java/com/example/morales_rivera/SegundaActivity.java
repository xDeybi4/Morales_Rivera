package com.example.morales_rivera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        this.etNombre=findViewById(R.id.etNombre);
        this.etBase=findViewById(R.id.etBase);
    }

    public void onClickSiguiente(View view){
        String nombre=etNombre.getText().toString();
        String base=etBase.getText().toString();

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