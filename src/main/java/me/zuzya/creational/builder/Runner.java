package me.zuzya.creational.builder;

import me.zuzya.core.hero.AbstractHero;
import me.zuzya.core.hero.AgilityHero;
import me.zuzya.core.hero.Hero;
import me.zuzya.core.hero.IntelligenceHero;
import me.zuzya.core.accessories.Buf;
import me.zuzya.core.accessories.Curse;
import me.zuzya.core.accessories.Power;

public class Runner {

    public Hero buildAgilityHero() {

        AbstractHero.Builder agilityBuilder = AgilityHero.builder;

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

        AbstractHero.Builder agilityBuilder = IntelligenceHero.builder;

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
