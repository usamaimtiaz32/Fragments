package com.snovia.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentTwo extends Fragment {

    public FragmentTwo() {
        // Required empty public constructor
    }

    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        button = view.findViewById(R.id.btn_frgm2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Fragment Two Button", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}