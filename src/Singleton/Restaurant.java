package Singleton;

import Command.Cashier;
import Command.Chef;
import Factory.Burger;
import Factory.BurgerFactory;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private static Restaurant instance;
    private Chef chef = new Chef();
    private Cashier cashier = new Cashier();
    private List<Burger> orders;

    private Restaurant(){
        orders = new ArrayList<>();
    }

    public static Restaurant getInstance(){
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public void takeOrder(String burgerType, boolean withGarlicSauce, boolean withKetchup){
        cashier.takeOrder(burgerType);
        Burger burger = BurgerFactory.createBurger(burgerType, withGarlicSauce, withKetchup);
        orders.add(burger);
    }

    public void serverBurger(Burger burger){
        chef.serveBurger(burger);
    }

    public void serveBurgers() {
        Chef chef = new Chef();
        for (Burger burger : orders) {
            chef.serveBurger(burger);
        }
    }
}
