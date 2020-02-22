package me.zuzya.patterns.creational.factory.pattern;

import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.DarkAgilityHero;
import me.zuzya.patterns.core.hero.DarkIntelligenceHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;

public class DarkHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new DarkAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new DarkIntelligenceHero();
    }
}
