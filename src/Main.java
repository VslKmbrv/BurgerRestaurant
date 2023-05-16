import Command.Cashier;
import Command.Chef;
import Singleton.Restaurant;

public class Main {

    public static void main(String[] args) {
        // Създаване на инстанция на ресторанта
        Restaurant restaurant = Restaurant.getInstance();
        Chef chef = Chef.getInstance();
        Cashier cashier = new Cashier();

        // Взимане на поръчки
        restaurant.takeOrder("Royal", true, false);
        restaurant.takeOrder("Classic", false, true);
        restaurant.takeOrder("Vegetarian", false, false);
        restaurant.takeOrder("Royal", false, false);
        restaurant.takeOrder("Vegetarian", true, true);
        restaurant.takeOrder("Classic", false, false);



        // Сервиране на поръчките
        restaurant.serveBurgers();

        // Резултат:
        // Serving Royal Burger with ketchup with garlic sauce
        // Serving Classic Burger with ketchup with garlic sauce
        // Serving Vegetarian Burger with ketchup with garlic sauce
    }

}
