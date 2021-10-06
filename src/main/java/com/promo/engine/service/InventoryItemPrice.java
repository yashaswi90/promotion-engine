package com.promo.engine.service;

import java.util.HashMap;

public interface InventoryItemPrice {

    void registeredItemPrice(HashMap<Character, Long> perUnitPrice);
    void registeredItemPrice(Character skuid, Long price);
    HashMap<Character, Long> getItemPrice();
}
