package com.example.projetov_1.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.projetov_1.R;

public class FormCadastroNome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro_nome);

        buttonProximo();
        fazerLogin();
    }

    private void buttonProximo(){

        Button btn_proximo = findViewById(R.id.btn_proximo);

        btn_proximo.setOnClickListener(v -> {
            Intent i = new Intent(FormCadastroNome.this, FormCadastroEmail.class);
            startActivity(i);
        });
    }

    private void fazerLogin(){

        Button btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(v -> {
            Intent i = new Intent(FormCadastroNome.this, FormLogin.class);
            startActivity(i);
        });
    }
}