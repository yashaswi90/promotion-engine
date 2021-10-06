package com.promo.engine.service;

import java.util.HashMap;

public interface InventoryItemPrice {

    void registeredItemPrice(HashMap<String, Long> perUnitPrice);
    void registeredItemPrice(String skuid, Long price);
    HashMap<String, Long> getItemPrice();
}
