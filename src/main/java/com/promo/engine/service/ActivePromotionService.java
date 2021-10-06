package com.promo.engine.service;

import com.promo.engine.domain.ActivePromotionsItems;

import java.util.HashMap;

public interface ActivePromotionService {
    boolean addActivePromotion(String ch, ActivePromotionsItems promotionsItems);
    boolean addAllActivePromotion(HashMap<String, ActivePromotionsItems> activePromotions);

    HashMap<String, ActivePromotionsItems> getActivePromotions();
}
