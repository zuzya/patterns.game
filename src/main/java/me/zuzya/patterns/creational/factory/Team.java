package me.zuzya.patterns.creational.factory;

import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;

public class Team {

    private AgilityHero agilityHero;

    private IntelligenceHero intelligenceHero;

    public Team(AgilityHero agilityHero, IntelligenceHero intelligenceHero) {

        this.agilityHero = agilityHero;
        this.intelligenceHero = intelligenceHero;
    }
}
