package com.example.projetov_1.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetov_1.R;

public class VisualizarPerfilFragment extends Fragment {

    public VisualizarPerfilFragment() {
        // Required empty public constructor
    }

    public static VisualizarPerfilFragment newInstance(String param1, String param2) {
        VisualizarPerfilFragment fragment = new VisualizarPerfilFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_visualizar_perfil, container, false);

        view.findViewById(R.id.voltar).setOnClickListener(v -> {

            Navigation.findNavController(view).navigate(R.id.action_menu_visualizar_perfil_to_menu_match);
        });

        return view;
    }
}