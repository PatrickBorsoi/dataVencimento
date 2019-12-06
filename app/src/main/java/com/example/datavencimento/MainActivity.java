package com.example.datavencimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button Adicionar = (Button) findViewById(R.id.adicionar);

    public void TelaAdicionar(View view){
        Intent intent = new Intent(this, Adicionar.class);
        startActivity(intent);
    }
}
