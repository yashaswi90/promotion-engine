package com.promo.engine.service;

import com.promo.engine.domain.ActivePromotionsItems;

import java.util.HashMap;

public interface PromotionEnginerProcessorService {
    public long applyPromotionsToCartItems(HashMap<Character, Integer> cartItems,
                                           HashMap<Character, Long> perUnitPrice,
                                           HashMap<Character, ActivePromotionsItems> activePromotions);
}
