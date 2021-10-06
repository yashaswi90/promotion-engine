package com.promo.engine;

import com.promo.engine.domain.ActivePromotionsItems;
import com.promo.engine.service.ActivePromotionService;
import com.promo.engine.service.CartService;
import com.promo.engine.service.InventoryItemPrice;
import com.promo.engine.service.PromotionEnginerProcessorService;
import com.promo.engine.service.impl.ActivePromotionServiceImpl;
import com.promo.engine.service.impl.CartServiceImpl;
import com.promo.engine.service.impl.InventoryItemPriceServiceImpl;
import com.promo.engine.service.impl.PromotionEnginerProcessorServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class PromotionEngineApplication {
    public static void main(String[] args) {

        HashMap<String, Long> perUnitPrice = new HashMap<>();
        InventoryItemPrice inventoryItemPrice = new InventoryItemPriceServiceImpl();
        inventoryItemPrice.registeredItemPrice("A", 50L);
        inventoryItemPrice.registeredItemPrice("B", 30L);
        inventoryItemPrice.registeredItemPrice("C", 20L);
        inventoryItemPrice.registeredItemPrice("D", 15L);
        perUnitPrice=inventoryItemPrice.getItemPrice();


        HashMap<String, Integer> items = new HashMap<>();
        items.put("A", 3);
        items.put("B", 5);
        items.put("C", 1);
        items.put("D", 1);
        CartService cartService = new CartServiceImpl();
        cartService.addCartItems(items);

        HashMap<String, Integer> cartItems = cartService.getCartItems();

        ActivePromotionService promotionService =new ActivePromotionServiceImpl();
        promotionService.addActivePromotion("A", new ActivePromotionsItems(130, "A", 3));
        promotionService.addActivePromotion("B", new ActivePromotionsItems(45, "B", 2));
        promotionService.addActivePromotion("C", new ActivePromotionsItems(30, "C", 1));
        promotionService.addActivePromotion("D", new ActivePromotionsItems(30, "D", 1));
        HashMap<String, ActivePromotionsItems> activePromotions =promotionService.getActivePromotions();


        PromotionEnginerProcessorService processorService=new PromotionEnginerProcessorServiceImpl();

        System.out.println(processorService.applyPromotionsToCartItems(cartItems, perUnitPrice, activePromotions));


    }


}
