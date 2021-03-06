package me.zuzya.patterns.creational.factory;

import me.zuzya.patterns.creational.factory.pattern.AbstractHeroFactory;
import me.zuzya.patterns.creational.factory.pattern.DarkHeroFactory;
import me.zuzya.patterns.creational.factory.pattern.LightHeroFactory;
import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;

public class Runner {

    public Team createHero(String heroType, String side) {

        AbstractHeroFactory factory;

        if ("dark".equals(side)) {
            factory = new DarkHeroFactory();
        } else {
            factory = new LightHeroFactory();
        }

        AgilityHero agilityHero = factory.createAgilityHero();
        IntelligenceHero intelligenceHero = factory.createIntelligenceHero();

        return new Team(agilityHero, intelligenceHero);
    }
}
