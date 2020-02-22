package me.zuzya.creational.factory.pattern;

import me.zuzya.creational.core.hero.AgilityHero;
import me.zuzya.creational.core.hero.IntelligenceHero;
import me.zuzya.creational.core.hero.LightAgilityHero;
import me.zuzya.creational.core.hero.LightIntelligenceHero;

public class LightHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new LightAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new LightIntelligenceHero();
    }
}
