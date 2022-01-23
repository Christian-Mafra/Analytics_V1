package com.example.analytics.helper;

import android.widget.ImageView;

import com.example.analytics.R;

public class Fluxograma {
    private String passo;
    private String exp;
    private String txtAzul;
    private String txtAmarelo;
    private int img;


    public class CloretosInsoluvris extends Fluxograma{

        public String getPasso(int i) {
                passo = "Passo "+i;
                return passo;
        }

        public String getTxtAzul(int i) {
            if(i==1){
                txtAzul = "Adicione 2mL de HCl 3 molar";
            }
            if(i==2){
                txtAzul = "Promova a separação entre o sobrenadante e o precipitado";
            }
            if(i==3){
                txtAzul = "Ao sobrenadante, adicione 3 gotas de K2CrO4 3 molar";
            }
            if(i==4){
                txtAzul = "Passo 4";
            }

            return exp;
        }

        public String getExp(int i) {
            if(i==1){
                exp = "Os cátions do Grupo 1 são identificados pela adição do ácido clorídrico diluído," +
                        " já que a Ag+, Pb2+ e Hg22+ formam precipitado ao entrar em contato com o íon cloreto," +
                        " independentemente do valor de pH.";
            }
            if(i==2){
                exp = "Ao observe a formação de um sólido branco, promova a centrifugação. " +
                        "Separe e reserve o sobrenadante em um tubo, pois neste pode conter cátions dos grupos 2, 3, 4 e 5.\n \n " +
                        "Ao precipitado, promova a lavangem com 4 gotas de água e 2 gotas de HCl 3,0 molar Ao precipitado, " +
                        "adicione água destilada aquecida e agite ultilizando um balão de vidro.\n \n Novamente, " +
                        "leve a mistura para a centrífuga e separe o sobrenadante do precipidado.";
            }
            if(i==3){
                exp = "Apesar de serem considerados insolúveis ao cloreto, entre eles há uma diferença discrepante nos valores de Kps," +
                        " fazendo com que o cloreto de chumbo (II) se solubilize primeiro quando adicionado água deionizada quente.";
            }
            if(i==4){
                exp = "Passo 4";
            }

            return exp;
        }

        public int getImg(int i) {
            if(i==1){
                img = R.drawable.cloretoprata;
            }
            if(i==2){
                img = R.drawable.centrifuga;
            }
            if(i==3){
                img = R.drawable.dicrtomatodechumbo;
            }
            if(i==4){
                img = R.drawable.cloretoprata;
            }

            return img;
        }
        public String getTxtAmarelo(int i) {
            if(i==1){
                txtAmarelo = "Formou um precipitado branco?";
            }
            if(i==3){
                txtAmarelo = "Formou um precipitado amarelo?";
            }

            return txtAmarelo;
        }





    }

}
