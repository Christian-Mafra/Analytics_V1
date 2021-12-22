package com.example.analytics.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.analytics.R;
import com.example.analytics.model.ShortbookModel;

import java.util.List;

public class AdapterShortBook extends RecyclerView.Adapter<AdapterShortBook.MyViewHolder> {
    private List<ShortbookModel> listShortbook;

    public AdapterShortBook(List<ShortbookModel> listShortbook) {
        this.listShortbook = listShortbook;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_shortbook,parent,false);
        return new AdapterShortBook.MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ShortbookModel shortbookModel = this.listShortbook.get(position);
        holder.imageView.setImageResource(shortbookModel.getFoto());
        holder.txt.setText(shortbookModel.getNome());
        holder.desc.setText(shortbookModel.getDesc());
    }

    @Override
    public int getItemCount() {
        return this.listShortbook.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView txt, desc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView6);
            txt = itemView.findViewById(R.id.textView13);
            desc = itemView.findViewById(R.id.textView15);
        }
    }
}
