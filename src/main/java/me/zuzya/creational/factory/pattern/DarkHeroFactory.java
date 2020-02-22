package me.zuzya.creational.factory.pattern;

import me.zuzya.creational.core.hero.AgilityHero;
import me.zuzya.creational.core.hero.DarkAgilityHero;
import me.zuzya.creational.core.hero.DarkIntelligenceHero;
import me.zuzya.creational.core.hero.IntelligenceHero;

public class DarkHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new DarkAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new DarkIntelligenceHero();
    }
}
