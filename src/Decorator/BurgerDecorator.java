package Decorator;

import Factory.Burger;

public abstract class BurgerDecorator implements Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        super();
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription();
    }
}
