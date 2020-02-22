package me.zuzya.creational.factory.pattern;

import me.zuzya.core.hero.AgilityHero;
import me.zuzya.core.hero.IntelligenceHero;

public interface AbstractHeroFactory {

    AgilityHero createAgilityHero();

    IntelligenceHero createIntelligenceHero();

}
