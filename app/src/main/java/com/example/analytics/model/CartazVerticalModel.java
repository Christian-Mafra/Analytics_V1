package com.example.analytics.model;

import android.widget.ImageView;

public class CartazVerticalModel {
    private int imageViewCartazVertical;
    private String nomeCartazVertical;

    public CartazVerticalModel(int imageViewCartazVertical, String nomeCartazVertical) {
        this.imageViewCartazVertical = imageViewCartazVertical;
        this.nomeCartazVertical = nomeCartazVertical;
    }

    public int getImageViewCartazVertical() {
        return imageViewCartazVertical;
    }

    public void setImageViewCartazVertical(int imageViewCartazVertical) {
        this.imageViewCartazVertical = imageViewCartazVertical;
    }

    public String getNomeCartazVertical() {
        return nomeCartazVertical;
    }

    public void setNomeCartazVertical(String nomeCartazVertical) {
        this.nomeCartazVertical = nomeCartazVertical;
    }
}
