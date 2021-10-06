package com.promo.engine.service.impl;

import com.promo.engine.domain.ActivePromotionsItems;
import com.promo.engine.service.ActivePromotionService;

import java.util.HashMap;

public class ActivePromotionServiceImpl implements ActivePromotionService {
    HashMap<String, ActivePromotionsItems> activePromotions=new HashMap<>();


    @Override
    public boolean addActivePromotion(String ch, ActivePromotionsItems promotionsItems) {
        activePromotions.put(ch,promotionsItems);
        return true;
    }

    @Override
    public boolean addAllActivePromotion(HashMap<String, ActivePromotionsItems> activePromotions) {
        activePromotions.putAll(activePromotions);
        return true;
    }

    @Override
    public HashMap<String, ActivePromotionsItems> getActivePromotions() {
        return activePromotions;
    }
}
