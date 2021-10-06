package com.promo.engine.domain;


public class Items {

    private int quantity;
    private char skuId;

    public Items(int quantity, char skuId) {
        this.quantity = quantity;
        this.skuId = skuId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getSkuId() {
        return skuId;
    }

    public void setSkuId(char skuId) {
        this.skuId = skuId;
    }
}
