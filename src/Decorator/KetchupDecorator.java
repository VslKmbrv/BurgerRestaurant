package Decorator;

import Factory.Burger;

public class KetchupDecorator extends BurgerDecorator {
    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + " with ketchup";
    }
}
