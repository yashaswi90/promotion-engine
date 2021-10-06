package com.promo.engine.service.impl;

import com.promo.engine.domain.ActivePromotionsItems;
import com.promo.engine.service.ActivePromotionService;

import java.util.HashMap;

public class ActivePromotionServiceImpl implements ActivePromotionService {
    HashMap<Character, ActivePromotionsItems> activePromotions=new HashMap<>();


    @Override
    public boolean addActivePromotion(Character ch, ActivePromotionsItems promotionsItems) {
        activePromotions.put(ch,promotionsItems);
        return true;
    }

    @Override
    public boolean addAllActivePromotion(HashMap<Character, ActivePromotionsItems> activePromotions) {
        activePromotions.putAll(activePromotions);
        return true;
    }

    @Override
    public HashMap<Character, ActivePromotionsItems> getActivePromotions() {
        return activePromotions;
    }
}
