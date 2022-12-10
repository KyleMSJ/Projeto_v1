package com.example.projetov_1.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.projetov_1.Model.FormCadastroNome;
import com.example.projetov_1.Model.FormLogin;
import com.example.projetov_1.Model.FormTelaInicial;
import com.example.projetov_1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChatsMensagensFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChatsMensagensFragment extends Fragment {

    public ChatsMensagensFragment() {
        // Required empty public constructor
    }

    public static ChatsMensagensFragment newInstance(String param1, String param2) {
        ChatsMensagensFragment fragment = new ChatsMensagensFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_chats_mensagens, container, false);

        view.findViewById(R.id.esperando).setOnClickListener(v -> {

            Navigation.findNavController(view).navigate(R.id.action_menu_message_to_menu_waiting);
        });
        // Inflate the layout for this fragment
        return view;
    }

}