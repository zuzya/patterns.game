package me.zuzya.patterns.creational.builder;

import me.zuzya.patterns.core.hero.Hero;
import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;
import me.zuzya.patterns.core.accessories.Buf;
import me.zuzya.patterns.core.accessories.Curse;
import me.zuzya.patterns.core.accessories.Power;

public class Runner {

    public Hero buildAgilityHero() {

        Hero.Builder agilityBuilder = AgilityHero.builder;

        return agilityBuilder//
                .setName("Illidan")//
                .setSpeed(10)//
                .setHaste(10)//
                .setStamina(70)//
                .setManaReserv(30)//
                .setPower(new Power())//
                .addBuf(new Buf())//
                .build();
    }

    public Hero buildIntelligenceHero() {

        Hero.Builder agilityBuilder = IntelligenceHero.builder;

        return agilityBuilder//
                .setName("Gul'Dan")//
                .setSpeed(3)//
                .setHaste(5)//
                .setStamina(50)//
                .setManaReserv(100)//
                .setPower(new Power())//
                .addCurse(new Curse())//
                .build();
    }
}
