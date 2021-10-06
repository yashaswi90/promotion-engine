package com.promo.engine.service.impl;

import com.promo.engine.service.CartService;

import java.util.HashMap;

public class CartServiceImpl implements CartService {
    HashMap<String, Integer> cartItems = new HashMap<>();

    @Override
    public void addCartItems(HashMap<String, Integer> ci) {
        cartItems.putAll(ci);
    }

    @Override
    public HashMap<String, Integer> getCartItems() {
        return cartItems;
    }
}
