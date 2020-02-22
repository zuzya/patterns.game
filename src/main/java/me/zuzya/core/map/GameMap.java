package me.zuzya.core.map;

import lombok.Data;

@Data
public class GameMap {

    private ItemShop itemShop;

    public GameMap(ItemShop itemShop) {

        this.itemShop = itemShop;
    }

}
