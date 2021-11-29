package com.example.analytics.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.analytics.R;
import com.example.analytics.activitys.DownloadActivity;
import com.example.analytics.activitys.FragmentsActivity;


public class PerfilFragment extends Fragment {
    private Button button5, button8;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        iniciacao(view);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FragmentsActivity.class);
                intent.putExtra("fragments",7);
                getContext().startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DownloadActivity.class);
                getContext().startActivity(intent);
            }
        });


        return view;
    }
    public void iniciacao(View view){
        button5 = view.findViewById(R.id.button5);
        button8 = view.findViewById(R.id.button8);
    }
}