package com.example.morales_rivera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSiguiente(View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
        //Retornar Datos
    }


}