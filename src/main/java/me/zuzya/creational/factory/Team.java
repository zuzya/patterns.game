package me.zuzya.creational.factory;

import me.zuzya.core.hero.AgilityHero;
import me.zuzya.core.hero.IntelligenceHero;

public class Team {

    private AgilityHero agilityHero;

    private IntelligenceHero intelligenceHero;

    public Team(AgilityHero agilityHero, IntelligenceHero intelligenceHero) {

        this.agilityHero = agilityHero;
        this.intelligenceHero = intelligenceHero;
    }
}
