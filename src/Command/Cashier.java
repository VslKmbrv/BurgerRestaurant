package Command;

import Factory.Burger;
import Factory.BurgerFactory;

public final class Cashier {

    public void takeOrder(String burgerType) {
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.createBurger(burgerType,  boolean withGarlicSauce, boolean withKetchup);
        AddSauceCommand addSauceCommand = new AddSauceCommand(burger);
        chef.setOrderCommand(addSauceCommand);
        chef.serveBurger(burger);
    }

}
