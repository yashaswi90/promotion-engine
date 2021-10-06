package com.promo.engine.service.impl;

import com.promo.engine.service.InventoryItemPrice;

import java.util.HashMap;

public class InventoryItemPriceServiceImpl implements InventoryItemPrice {
    HashMap<String, Long> perUnitPrice = new HashMap<>();

    @Override
    public void registeredItemPrice(HashMap<String, Long> unitPrice) {
        perUnitPrice.putAll(unitPrice);
    }

    @Override
    public void registeredItemPrice(String skuid, Long price) {
        perUnitPrice.put(skuid, price);
    }

    @Override
    public HashMap<String, Long> getItemPrice() {
        return perUnitPrice;
    }
}
