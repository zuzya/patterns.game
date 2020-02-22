package me.zuzya.patterns.creational.factory.pattern;

import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;

public interface AbstractHeroFactory {

    AgilityHero createAgilityHero();

    IntelligenceHero createIntelligenceHero();

}
