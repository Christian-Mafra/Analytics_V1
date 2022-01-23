package com.example.analytics.helper;

import android.widget.ImageView;

import com.example.analytics.R;

public class Fluxograma {
    private String passo;
    private String exp;
    private String txtAzul;
    private String txtAmarelo;
    private int img;


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
                txtAzul = "Ao precipitado, adicione 8 gotas de NH4OH concentrado";
            }

            return txtAzul;
        }

        public String getExp(int i) {
            if(i==1){
                exp = "Os cátions do Grupo 1 são identificados pela adição do ácido clorídrico diluído," +
                        " já que a Ag+, Pb2+ e Hg22+ formam precipitado ao entrar em contato com o íon cloreto," +
                        " independentemente do valor de pH.";
            }
            if(i==2){
                exp = "Observando a formação de um sólido branco, promova a centrifugação. " +
                        "Separe o sobrenadante em um tubo e reserve, pois neste pode conter cátions dos grupos 2, 3, 4 e 5.\n \n " +
                        "Ao precipitado adicione água destilada aquecida e agite ultilizando um bastão de vidro.\n \n" +
                        "Novamente, leve a mistura para a centrífuga e separe o sobrenadante do precipidado.";
            }
            if(i==3){
                exp = "Nesta etapa, os íons Ag+ e Hg22+ já não compõe mais o sobrenadante, visto que estes mantem-se insolúveis " +
                        "à 100⁰C e são separados na centrifugação. \n\n" +
                        "Ao reagir o cromato de potássio com íons de chumbo, é formado o sólido cromato de chumbo (II) (PbCrO4) que possui cor amarela";
            }
            if(i==4){
                exp = "Ao adicionar NH4OH em uma mistura contendo o sal de cloreto de mercúrio (I), " +
                        "haverá uma reação de oxirredução, onde ocorre o desproporcionamento do Hg+, que se reduz a Hg0(l) e " +
                        "se oxida a HgNH2Cl(s), que é chamado de amidocloreto de mercúrio. Visualmente há a predominância da cor preta, " +
                        "entretanto, estes precipitados possuem cores destintas. O Hg0(l) apresenta coloração preta enquanto o " +
                        "amidocloreto de mercúrio (II) apresenta a coloração cinza.\n\n" +
                        "Diferente do mercúrio, a prata forma um complexo solúvel ao reagir com o hidróxido de amônia";
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
                img = R.drawable.hgzero;
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
            if(i==4){
                txtAmarelo = "Formou um precipitado preto?";
            }

            return txtAmarelo;
        }

}
