package me.zuzya.creational.factory.pattern;

import me.zuzya.core.hero.AgilityHero;
import me.zuzya.core.hero.IntelligenceHero;
import me.zuzya.core.hero.LightAgilityHero;
import me.zuzya.core.hero.LightIntelligenceHero;

public class LightHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new LightAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new LightIntelligenceHero();
    }
}
