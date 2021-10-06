package com.promo.engine.service;

import com.promo.engine.domain.ActivePromotionsItems;

import java.util.HashMap;

public interface ActivePromotionService {
    boolean addActivePromotion(Character ch, ActivePromotionsItems promotionsItems);
    boolean addAllActivePromotion(HashMap<Character, ActivePromotionsItems> activePromotions);

    HashMap<Character, ActivePromotionsItems> getActivePromotions();
}
