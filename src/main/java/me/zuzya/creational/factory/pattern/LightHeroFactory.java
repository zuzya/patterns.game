package me.zuzya.creational.factory.pattern;

import me.zuzya.creational.core.AgilityHero;
import me.zuzya.creational.core.IntelligenceHero;
import me.zuzya.creational.core.LightAgilityHero;
import me.zuzya.creational.core.LightIntelligenceHero;

public class LightHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new LightAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new LightIntelligenceHero();
    }
}
