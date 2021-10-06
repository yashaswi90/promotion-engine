package com.promo.engine.service.impl;

import com.promo.engine.service.InventoryItemPrice;

import java.util.HashMap;

public class InventoryItemPriceServiceImpl implements InventoryItemPrice {
    HashMap<Character, Long> perUnitPrice = new HashMap<>();

    @Override
    public void registeredItemPrice(HashMap<Character, Long> unitPrice) {
        perUnitPrice.putAll(unitPrice);
    }

    @Override
    public void registeredItemPrice(Character skuid, Long price) {
        perUnitPrice.put(skuid, price);
    }

    @Override
    public HashMap<Character, Long> getItemPrice() {
        return perUnitPrice;
    }
}
