public abstract class BurgerFactory {
    public static BurgerInterface createBurger(String type){
        if (type.equalsIgnoreCase("Royal")){
            return new Royal();
        } else if (type.equalsIgnoreCase("Classic")) {
            return new Classic();
        } else if (type.equalsIgnoreCase("Vegetarian")) {
            return new Vegetarian();
        }else {
            throw  new IllegalArgumentException("We don't have this burger on the menu!");
        }
    }
}