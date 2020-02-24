package me.zuzya.patterns.core.map;

import java.util.HashMap;
import java.util.Map;

import me.zuzya.patterns.core.exception.BuingException;
import me.zuzya.patterns.core.accessories.Cataloged;
import me.zuzya.patterns.core.accessories.BaseItem;

public class ItemShop  {

    private Map<Cataloged, Integer> catalog;

    private Map<Cataloged, Integer> itemsBalance;

    public ItemShop() {

        this.catalog = new HashMap<>();
        this.itemsBalance = new HashMap<>();
    }

    public BaseItem buy(Cataloged cataloged, int money) throws BuingException {

        if (catalog.containsKey(cataloged)) {
            if (catalog.get(cataloged) <= money) {
                if (itemsBalance.get(cataloged) > 0) {
                    return new BaseItem(cataloged.getName());
                } else {
                    throw new BuingException("sorry, this kind of item is ended");
                }
            } else {
                throw new BuingException("not enough money!");
            }
        } else {
            throw new BuingException("not found this item!");
        }
    }
}
