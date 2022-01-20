package com.example.analytics.fragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.analytics.R;


public class FluxogramaInterativoFragment extends Fragment {
    private CardView btnSim, btnNao;
    private CardView cardAzul, cardAmarelo, cardRoxo;
    int i =1;
    private TextView txtpasso, txtAzul, txtAmarelo, txtSaibaMais, txtRoxo;

    private void iniciar(View view){
        //Btn


        //CardView
        cardAzul = view.findViewById(R.id.cardAzul);



        //Text
        txtAzul = view.findViewById(R.id.txtAzul);
        txtAmarelo = view.findViewById(R.id.txtAmarelo);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_fluxograma_interativo, container, false);
        btnSim = view.findViewById(R.id.btnSim);
        btnNao = view.findViewById(R.id.btnNao);
        iniciar(view);



        btnSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==1){
                    //trocarCartão(2);
                    txtpasso.setText("Passo 2");
                    /*txtRoxo.setText("Ao observe a formação de um sólido branco, promova a " +
                            "centrifugação. Reserve o sobrenadante, pois nest e" +
                            "pode conter cátions dos grupos I, II, III, IV e V. Ao precipitado, " +
                            "promova a lavangem com 4 gotas de água e 2 gotas de HCl 3,0 mol/L" +
                            "Ao precipitado, adicione água destilada aquecida e agite ultilizando um balão de vidro. Novamente, leve a mistura para a centrífuga e separe o sobrenadante do precipidado.");
                    */
                    i=2;
                }else{
                    if(i==2){
                        //trocarCartão(1);
                        txtpasso.setText("Passo 3");
                        txtAzul.setText("No sobrenadante, goteje K2CrO4");
                        txtAmarelo.setText("Formou precipitado amarelo?");
                        i=3;
                    }
                }


            }
        });

        return view;
    }

    /*public void trocarCartão(int i){
        if(i==1){
            cardAzul.setVisibility(View.VISIBLE);
            cardAmarelo.setVisibility(View.VISIBLE);
            cardRoxo.setVisibility(View.GONE);
        }
        if(i==2){
            cardAzul.setVisibility(View.GONE);
            cardAmarelo.setVisibility(View.GONE);
            cardRoxo.setVisibility(View.VISIBLE);
        }
    }*/

}