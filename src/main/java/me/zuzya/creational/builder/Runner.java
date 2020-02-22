package me.zuzya.creational.builder;

import me.zuzya.creational.core.hero.*;
import me.zuzya.creational.core.other.Buf;
import me.zuzya.creational.core.other.Item;
import me.zuzya.creational.core.other.Power;

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
                .addItem(new Item())//
                .build();
    }
}
