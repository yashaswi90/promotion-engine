package com.promo.engine.service;

import com.promo.engine.domain.ActivePromotionsItems;

import java.util.HashMap;

public interface PromotionEnginerProcessorService {
    public long applyPromotionsToCartItems(HashMap<String, Integer> cartItems,
                                           HashMap<String, Long> perUnitPrice,
                                           HashMap<String, ActivePromotionsItems> activePromotions);
}
