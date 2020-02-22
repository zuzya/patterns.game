package me.zuzya.creational.factory;

import me.zuzya.creational.factorymethod.AgilityHero;
import me.zuzya.creational.factorymethod.IntelligenceHero;

public interface AbstractHeroFactory {

    AgilityHero createAgilityHero();

    IntelligenceHero createIntelligenceHero();

}
