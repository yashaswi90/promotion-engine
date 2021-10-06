package com.promo.engine.service;

import com.promo.engine.domain.Items;

import java.util.HashMap;
import java.util.List;

public interface CartService {
    void addCartItems(HashMap<Character, Integer> cartItems);
    HashMap<Character, Integer> getCartItems();

}
