package me.zuzya.patterns.creational.factory.pattern;

import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;
import me.zuzya.patterns.core.hero.LightAgilityHero;
import me.zuzya.patterns.core.hero.LightIntelligenceHero;

public class LightHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new LightAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new LightIntelligenceHero();
    }
}
