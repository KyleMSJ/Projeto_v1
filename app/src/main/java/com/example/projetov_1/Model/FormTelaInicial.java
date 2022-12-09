package com.example.projetov_1.Model;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.projetov_1.R;
import com.example.projetov_1.databinding.ActivityFormTelaInicialBinding;
import com.example.projetov_1.databinding.ActivityMainBinding;

public class FormTelaInicial extends AppCompatActivity {
    private ActivityFormTelaInicialBinding binding;
    private NavHostFragment navHostFragment;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormTelaInicialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initNavigation();
    }

    private void initNavigation(){
        navHostFragment =
                (NavHostFragment) getSupportFragmentManager().
                        findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigation,navController);
    }
}
