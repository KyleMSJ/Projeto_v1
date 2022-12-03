package com.example.projetov_1.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.projetov_1.R;

public class FormLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        entrar();
    }

    private void entrar(){

        Button btn_entrar = findViewById(R.id.btn_entrar);

        btn_entrar.setOnClickListener(v -> {
            Intent i = new Intent(FormLogin.this, FormTelaInicial.class);
            startActivity(i);
        });
    }
}