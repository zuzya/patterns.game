package me.zuzya.creational.core.hero;

import me.zuzya.creational.core.other.Buf;
import me.zuzya.creational.core.other.Curse;
import me.zuzya.creational.core.other.Item;
import me.zuzya.creational.core.other.Power;

import java.util.ArrayList;
import java.util.List;

public class AbstractHero implements Hero {

    private String name;

    private int speed;

    private int haste;

    private int stamina;

    private int life = stamina;

    private int manaReserv;

    private int mana = manaReserv;

    private Power power;

    private List<Item> items;

    private List<Buf> buffs;

    private List<Curse> curses;

    /**
     * Builder
     */
    public static Builder builder = new Builder();

    public static class Builder {

        private AbstractHero hero;

        public Builder() {

            hero = new AbstractHero();
            hero.items = new ArrayList<Item>();
            hero.buffs = new ArrayList<Buf>();
            hero.curses = new ArrayList<Curse>();
        }

        public AbstractHero build() {

            return hero;
        }

        public Builder setName(String name) {

            hero.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {

            hero.speed = speed;
            return this;
        }

        public Builder setHaste(int haste) {

            hero.haste = haste;
            return this;
        }

        public Builder setStamina(int stamina) {

            hero.stamina = stamina;
            return this;
        }

        public Builder setManaReserv(int manaReserv) {

            hero.manaReserv = manaReserv;
            return this;
        }

        public Builder setPower(Power power) {

            hero.power = power;
            return this;
        }

        public Builder addItem(Item item) {

            hero.items.add(item);
            return this;
        }

        public Builder addBuf(Buf buf) {

            hero.buffs.add(buf);
            return this;
        }

        public Builder addCurse(Curse curse) {

            hero.curses.add(curse);
            return this;
        }

    }

}
