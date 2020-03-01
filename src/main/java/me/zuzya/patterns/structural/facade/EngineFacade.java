package me.zuzya.patterns.structural.facade;

import me.zuzya.patterns.core.accessories.ItemType;
import me.zuzya.patterns.core.engine.GameEngine;
import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;

public class EngineFacade {

    GameEngine gameEngine;

    public void goGame() {

        AgilityHero hero = new AgilityHero();
        IntelligenceHero right = new IntelligenceHero();

        gameEngine.giveItemToHero(ItemType.CHEST, hero);
        gameEngine.giveItemToHero(ItemType.CHEST, right);
        gameEngine.fightHeroes(hero, right);
    }
}
