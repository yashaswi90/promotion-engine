package com.promo.engine.service.impl;

import com.promo.engine.service.CartService;

import java.util.HashMap;

public class CartServiceImpl implements CartService {
    HashMap<Character, Integer> cartItems = new HashMap<>();

    @Override
    public void addCartItems(HashMap<Character, Integer> ci) {
        cartItems.putAll(ci);
    }

    @Override
    public HashMap<Character, Integer> getCartItems() {
        return cartItems;
    }
}
