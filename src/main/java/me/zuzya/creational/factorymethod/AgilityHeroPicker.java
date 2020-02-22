package me.zuzya.creational.factorymethod;

public class AgilityHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new AgilityHero();
    }
}
