package com.example.datavencimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Adicionar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar);
    }

    public void TelaPagaIsso(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
