package com.promo.engine.service.impl;

import com.promo.engine.domain.ActivePromotionsItems;
import com.promo.engine.service.PromotionEnginerProcessorService;

import java.util.HashMap;
import java.util.Map;

public class PromotionEnginerProcessorServiceImpl implements PromotionEnginerProcessorService {
    public long applyPromotionsToCartItems(HashMap<Character, Integer> cartItems,
                                           HashMap<Character, Long> perUnitPrice,
                                           HashMap<Character, ActivePromotionsItems> activePromotions) {
        int count = 0;
        long total = 0;
        for (Map.Entry<Character, Integer> s : cartItems.entrySet()) {

            Character skuId = s.getKey();
            Integer quantity = s.getValue();

            Long pricePerUnit = perUnitPrice.get(skuId);

            ActivePromotionsItems activePromotionsItems = activePromotions.get(skuId);
            if (count < 2) {
                if (quantity == activePromotionsItems.getQuantity()) {
                    if (count < 2) {
                            total = total + activePromotionsItems.getPrice();
                            count++;
                    }
                } else if (quantity > activePromotionsItems.getQuantity()) {
                    if (count < 2) {

                        while (quantity >= activePromotionsItems.getQuantity()) {
                            total = total + activePromotionsItems.getPrice();
                            quantity = quantity - activePromotionsItems.getQuantity();
                        }

                        if (quantity < activePromotionsItems.getQuantity()) {
                            total = total + perUnitPrice.get(skuId) * quantity;
                        }
                        count++;
                    }
                } else {
                    total = total + perUnitPrice.get(skuId);
                }

            } else {
                total = total + perUnitPrice.get(skuId) * quantity;
            }

        }
        return total;
    }
}
