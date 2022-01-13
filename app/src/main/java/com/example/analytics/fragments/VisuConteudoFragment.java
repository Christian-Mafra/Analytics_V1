package com.example.analytics.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.analytics.R;
import com.example.analytics.adapter.AdapterCartazVertical;
import com.example.analytics.adapter.AdapterCartazVerticalMaisConteudo;
import com.example.analytics.model.CartazVerticalModel;

import java.util.ArrayList;
import java.util.List;

public class VisuConteudoFragment extends Fragment {
    private RecyclerView recyclerMaisConteudos;
    private List<CartazVerticalModel> maisDetalhes = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_visu_conteudo, container, false);

        recyclerMaisConteudos = view.findViewById(R.id.recyclerMaisConteudos);
        //Configurar adapter
        preparaMaisConteudo();
        AdapterCartazVerticalMaisConteudo adapterContinueEstudando = new AdapterCartazVerticalMaisConteudo(maisDetalhes,getContext());

        //Configurar RecyclerView
//      LinearLayoutManager layoutManagerA = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager layoutManagerA = new GridLayoutManager(getContext(),2);
        recyclerMaisConteudos.setLayoutManager(layoutManagerA);
        recyclerMaisConteudos.setHasFixedSize(true);
        recyclerMaisConteudos.setAdapter(adapterContinueEstudando);

        return view;
    }
    public void preparaMaisConteudo(){
        CartazVerticalModel h = new CartazVerticalModel(R.drawable.cloretosinsoluveisroteiro,"Cloretos Insoluveis","sd,cmds.,c");
        this.maisDetalhes.add(h);
        h = new CartazVerticalModel(R.drawable.sulfetosinsoluveisemmeioacidoroteiro,"Sulfetos Insoluveis em Meio Ácido","kdfmdlkf");
        this.maisDetalhes.add(h);
        h = new CartazVerticalModel(R.drawable.sulfetosinsoluveisemmeiobasicoroteiro,"Sulfetos Insoluveis em Meio Básico","sdlkfmdksfm");
        this.maisDetalhes.add(h);
        h = new CartazVerticalModel(R.drawable.carbonatosinsoluveisroteiro,"Carbonatos Insoluveis","sdkmfvkdsmlf");
        this.maisDetalhes.add(h);
        h = new CartazVerticalModel(R.drawable.cationssoluveisroteiro,"Cations Soluveis","ldskfdslkfm");
        this.maisDetalhes.add(h);
        h = new CartazVerticalModel(R.drawable.cloretosinsoluveisroteiro,"Cloretos Insoluveis","kdsflvmdflkvm");
        this.maisDetalhes.add(h);
    }
}