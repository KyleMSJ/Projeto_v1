package com.example.projetov_1.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetov_1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChatsEsperandoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChatsEsperandoFragment extends Fragment {

    public ChatsEsperandoFragment() {
        // Required empty public constructor
    }

    public static ChatsEsperandoFragment newInstance(String param1, String param2) {
        ChatsEsperandoFragment fragment = new ChatsEsperandoFragment();
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
        final View view = inflater.inflate(R.layout.fragment_chats_esperando, container, false);

        view.findViewById(R.id.mensagens).setOnClickListener(v -> {

            Navigation.findNavController(view).navigate(R.id.action_menu_waiting_to_menu_message);
        });
        // Inflate the layout for this fragment
        return view;
    }
}
