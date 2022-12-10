package com.example.projetov_1.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.projetov_1.R;

import org.w3c.dom.Text;

public class FormLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        entrar();
        cadastrar();
    }

    private void entrar(){

        Button btn_entrar = findViewById(R.id.btn_entrar);

        btn_entrar.setOnClickListener(v -> {
            Intent i = new Intent(FormLogin.this, FormTelaInicial.class);
            startActivity(i);
        });
    }

    private void cadastrar(){

        TextView cadastrar = findViewById(R.id.cadastrar_novo);

        cadastrar.setOnClickListener(v -> {
            Intent i = new Intent(FormLogin.this, FormCadastroNome.class);
            startActivity(i);
        });
    }
}