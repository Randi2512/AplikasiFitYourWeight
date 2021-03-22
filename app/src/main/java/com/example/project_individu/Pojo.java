package com.example.project_individu;

public class Pojo {
    private  String itemNama;
    private int itemImage;
    private String itemKet;


    public Pojo(String itemnama, int itemImage, String itemKet){
        this.setItemNama(itemnama);
        this.setItemImage(itemImage);
        this.setItemKet(itemKet);
    }

    public String getItemNama() {
        return itemNama;
    }

    public void setItemNama(String itemNama) {
        this.itemNama = itemNama;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemKet() {
        return itemKet;
    }

    public void setItemKet(String itemKet) {
        this.itemKet = itemKet;
    }
}

