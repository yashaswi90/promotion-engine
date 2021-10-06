package com.promo.engine.domain;

public class ActivePromotionsItems {

    private long price;
    private String skuId;
    private int quantity;

    public ActivePromotionsItems(long price, String skuId, int quantity) {
        this.price = price;
        this.skuId = skuId;
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
