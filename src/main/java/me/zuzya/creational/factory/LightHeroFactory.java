package me.zuzya.creational.factory;

import me.zuzya.creational.factorymethod.AgilityHero;
import me.zuzya.creational.factorymethod.IntelligenceHero;

public class LightHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new LightAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new LightIntelligenceHero();
    }
}
