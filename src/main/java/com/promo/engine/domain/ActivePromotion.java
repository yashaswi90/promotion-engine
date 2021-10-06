package com.promo.engine.domain;

import java.util.HashMap;
import java.util.List;

public class ActivePromotion {
    private long price;
    private HashMap<String,Integer> skuIdWithQuantity;

    public ActivePromotion(long price, HashMap<String, Integer> skuIdWithQuantity) {
        this.price = price;
        this.skuIdWithQuantity = skuIdWithQuantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public HashMap<String, Integer> getSkuIdWithQuantity() {
        return skuIdWithQuantity;
    }

    public void setSkuIdWithQuantity(HashMap<String, Integer> skuIdWithQuantity) {
        this.skuIdWithQuantity = skuIdWithQuantity;
    }

}
