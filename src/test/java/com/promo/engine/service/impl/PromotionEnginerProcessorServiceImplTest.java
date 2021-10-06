package com.promo.engine.service.impl;

import com.promo.engine.domain.ActivePromotionsItems;
import com.promo.engine.service.ActivePromotionService;
import com.promo.engine.service.InventoryItemPrice;
import com.promo.engine.service.PromotionEnginerProcessorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class PromotionEnginerProcessorServiceImplTest {

    private PromotionEnginerProcessorService underTest;
    HashMap<Character, ActivePromotionsItems> activePromotions=new HashMap<>();
    HashMap<Character, Long> perUnitPrice=new HashMap<>();

    @Before
    public void setUp(){

        InventoryItemPrice inventoryItemPrice = new InventoryItemPriceServiceImpl();
        inventoryItemPrice.registeredItemPrice('A', 50L);
        inventoryItemPrice.registeredItemPrice('B', 30L);
        inventoryItemPrice.registeredItemPrice('C', 20L);
        inventoryItemPrice.registeredItemPrice('D', 15L);
        perUnitPrice=inventoryItemPrice.getItemPrice();

        ActivePromotionService promotionService =new ActivePromotionServiceImpl();
        promotionService.addActivePromotion('A', new ActivePromotionsItems(130, 'A', 3));
        promotionService.addActivePromotion('B', new ActivePromotionsItems(45, 'B', 2));
        promotionService.addActivePromotion('C', new ActivePromotionsItems(30, 'C', 1));
        promotionService.addActivePromotion('D', new ActivePromotionsItems(30, 'D', 1));
        activePromotions =promotionService.getActivePromotions();

        underTest=new PromotionEnginerProcessorServiceImpl();
    }
    @Test
    public void shouldApplyPromotions(){

        HashMap<Character, Integer> items = new HashMap<>();
        items.put('A', 3);
        items.put('B', 5);
        items.put('C', 1);
        items.put('D', 1);

        long total = underTest.applyPromotionsToCartItems(items, perUnitPrice, activePromotions);

        Assert.assertEquals(total,285L);
    }

}