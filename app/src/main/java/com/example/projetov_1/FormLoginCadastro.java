package com.example.projetov_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FormLoginCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

    }

    private void buttonLogin(){

        Button btn_entrar = findViewById(R.id.btn_entrar);

        btn_entrar.setOnClickListener(v -> {
            Intent i = new Intent(FormLoginCadastro.this, FormLogin.class);
            startActivity(i);
        });
    }

    private void buttonCadastrar(){

        Button btn_cadastrar = findViewById(R.id.btn_cadastrar);

        btn_cadastrar.setOnClickListener(v -> {
            Intent i = new Intent(FormLoginCadastro.this, FormCadastroNome.class);
            startActivity(i);
        });
    }
}
