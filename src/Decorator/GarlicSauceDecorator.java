package Decorator;

import Factory.Burger;

public class GarlicSauceDecorator extends BurgerDecorator {
    public GarlicSauceDecorator(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + " with garlic sauce";
    }
}
