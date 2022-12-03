package com.example.projetov_1.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.projetov_1.R;

public class FormCadastroEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro_email);

        buttonConfirmaCadastro();
        fazerLogin();
    }

    private void buttonConfirmaCadastro(){

        Button btn_confirma = findViewById(R.id.btn_ConfirmarCadastro);

        btn_confirma.setOnClickListener(v -> {
            Intent i = new Intent(FormCadastroEmail.this, FormLogin.class);
            startActivity(i);
        });
    }

    private void fazerLogin(){

        Button btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(v -> {
            Intent i = new Intent(FormCadastroEmail.this, FormLogin.class);
            startActivity(i);
        });
    }
}