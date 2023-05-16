package Factory;

public class BurgerFactory {

    public static Burger createBurger(String type, boolean withGarlicSauce, boolean withKetchup) {
        if (type.equals("Royal")) {
            return new RoyalBurger();
        } else if (type.equals("Classic")) {
            return new ClassicBurger();
        } else if (type.equals("Vegetarian")) {
            return new VegetarianBurger();
        } else {
            throw new IllegalArgumentException("Invalid burger type");
        }

    }

}
