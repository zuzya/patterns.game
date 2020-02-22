package me.zuzya.creational.factory;

import me.zuzya.creational.factorymethod.AgilityHero;
import me.zuzya.creational.factorymethod.IntelligenceHero;

public class DarkHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new DarkAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new DarkIntelligenceHero();
    }
}
