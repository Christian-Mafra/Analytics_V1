package com.example.analytics.fragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.analytics.R;
import com.example.analytics.helper.Fluxograma;


public class FluxogramaInterativoFragment extends Fragment {

    private void iniciar(View view){
        //Constrain Layout
        constraintLayoutFora = view.findViewById(R.id.constraintLayoutFora);
        constraintLayoutdentro = view.findViewById(R.id.constraintLayoutDentro);


        //Btn
        btnSim = view.findViewById(R.id.btnSim);
        btnNao = view.findViewById(R.id.btnNao);
        btnPro = view.findViewById(R.id.btnProx);

        //Text
        txtAzul = view.findViewById(R.id.txtAzul);
        txtAmarelo = view.findViewById(R.id.txtAmarelo);
        txtExp = view.findViewById(R.id.txtExp);
        txtPasso = view.findViewById(R.id.txtPasso);

        //divider
        divider1 = view.findViewById(R.id.divider8);
        divider2 = view.findViewById(R.id.divider13);
        divider3 = view.findViewById(R.id.divider11);
        divider4 = view.findViewById(R.id.divider12);
        divider5 = view.findViewById(R.id.divider9);

        //Imagem
        img = view.findViewById(R.id.imageView7);
        imageButton4 = view.findViewById(R.id.imageButton4);
    }
    private String[] procedimentos;
    private ConstraintLayout constraintLayoutFora, constraintLayoutdentro;
    private CardView btnSim, btnNao, btnPro;
    private TextView txtPasso, txtAzul,txtExp, txtAmarelo;
    private View divider1,divider2,divider3,divider4,divider5;
    private ImageView img;
    private ImageButton imageButton4;
    int i =1;
    private Fluxograma.CloretosInsoluvris fluxogramaCloretos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_fluxograma_interativo, container, false);
        iniciar(view);
        fluxogramaCloretos = (Fluxograma.CloretosInsoluvris) new Fluxograma();

        txtPasso.setText(fluxogramaCloretos.getPasso(1));
        txtAzul.setText(fluxogramaCloretos.getTxtAzul(1));
        txtExp.setText(fluxogramaCloretos.getExp(1));
        img.setImageResource(fluxogramaCloretos.getImg(1));
        i=2;

        btnSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==2){
                    trocarCartão(2);
                    txtPasso.setText(fluxogramaCloretos.getPasso(2));
                    txtAzul.setText(fluxogramaCloretos.getTxtAzul(2));
                    txtExp.setText(fluxogramaCloretos.getExp(2));
                    img.setImageResource(fluxogramaCloretos.getImg(2));
                    i=i++;
                }else{
                    if(i==2){
                        //trocarCartão(1);
                        txtPasso.setText("Passo 3");
                        txtAzul.setText("No sobrenadante, goteje K2CrO4");
                        txtAmarelo.setText("Formou precipitado amarelo?");
                        i=3;
                    }
                }
            }
        });

        btnPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==3){
                    trocarCartão(1);
                    txtPasso.setText("Passo 3");
                    txtAzul.setText(fluxogramaCloretos.getTxtAzul(3));
                    txtAmarelo.setText("Formou precipitado amarelo?");
                    txtExp.setText("Ao observe a formação de um sólido branco, promova a centrifugação. " +
                            "Reserve o sobrenadante, pois neste pode conter cátions dos grupos 2, 3, 4 e 5. Ao precipitado, " +
                            "promova a lavangem com 4 gotas de água e 2 gotas de HCl 3,0 mol/L Ao precipitado, " +
                            "adicione água destilada aquecida e agite ultilizando um balão de vidro. Novamente, " +
                            "leve a mistura para a centrífuga e separe o sobrenadante do precipidado.");
                    img.setImageResource(R.drawable.dicrtomatodechumbo);
                    i=3;
                }else{
                    if(i==i){

                    }
                }

            }
        });

        return view;
    }

    public void trocarCartão(int i){
        if(i==1){
            divider1.setVisibility(View.VISIBLE);
            divider2.setVisibility(View.VISIBLE);
            divider3.setVisibility(View.VISIBLE);
            divider4.setVisibility(View.VISIBLE);
            divider5.setVisibility(View.GONE);
            imageButton4.setVisibility(View.VISIBLE);

            btnPro.setVisibility(View.GONE);
            btnNao.setVisibility(View.VISIBLE);
            btnSim.setVisibility(View.VISIBLE);

            constraintLayoutFora.setBackgroundResource(R.drawable.background_card_azul);
            constraintLayoutdentro.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.azul_escuro));
            //constraintLayoutFora.setDrawingCacheBackgroundColor(R.drawable.background_card_azul);

        }
        if(i==2){
            divider1.setVisibility(View.GONE);
            divider2.setVisibility(View.GONE);
            divider3.setVisibility(View.GONE);
            divider4.setVisibility(View.GONE);
            divider5.setVisibility(View.VISIBLE);
            imageButton4.setVisibility(View.GONE);

            btnPro.setVisibility(View.VISIBLE);
            btnNao.setVisibility(View.GONE);
            btnSim.setVisibility(View.GONE);

            constraintLayoutFora.setBackgroundResource(R.drawable.background_btnprox);
            //constraintLayoutFora.setDrawingCacheBackgroundColor(R.drawable.background_btnprox);
            constraintLayoutdentro.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.laranja_escuro));
        }
    }

}