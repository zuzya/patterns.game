package me.zuzya.creational.factorymethod;

public class IntelligenceHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new IntelligenceHero();
    }
}
