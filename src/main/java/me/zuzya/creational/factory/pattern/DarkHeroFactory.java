package me.zuzya.creational.factory.pattern;

import me.zuzya.core.hero.AgilityHero;
import me.zuzya.core.hero.DarkAgilityHero;
import me.zuzya.core.hero.DarkIntelligenceHero;
import me.zuzya.core.hero.IntelligenceHero;

public class DarkHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new DarkAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new DarkIntelligenceHero();
    }
}
