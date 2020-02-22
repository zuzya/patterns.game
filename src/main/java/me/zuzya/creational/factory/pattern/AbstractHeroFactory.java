package me.zuzya.creational.factory.pattern;

import me.zuzya.creational.core.hero.AgilityHero;
import me.zuzya.creational.core.hero.IntelligenceHero;

public interface AbstractHeroFactory {

    AgilityHero createAgilityHero();

    IntelligenceHero createIntelligenceHero();

}
