package me.zuzya.creational.factory.pattern;

import me.zuzya.creational.core.AgilityHero;
import me.zuzya.creational.core.IntelligenceHero;

public interface AbstractHeroFactory {

    AgilityHero createAgilityHero();

    IntelligenceHero createIntelligenceHero();

}
