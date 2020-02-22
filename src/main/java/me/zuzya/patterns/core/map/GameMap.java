package me.zuzya.patterns.core.map;

import lombok.Data;

@Data
public class GameMap {

    private ItemShop itemShop;

    public GameMap(ItemShop itemShop) {

        this.itemShop = itemShop;
    }

}
