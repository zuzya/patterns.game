package me.zuzya.patterns.core.map;

import lombok.Data;
import me.zuzya.patterns.core.hero.Hero;

@Data
public class GameMap {

    private ItemShop itemShop;

    public GameMap(ItemShop itemShop) {

        this.itemShop = itemShop;
    }



}
