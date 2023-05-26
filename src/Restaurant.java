public class Restaurant {
    private static Restaurant restaurant;

    private Restaurant() {
    }

    public static Restaurant getRestaurant() {
        if (restaurant == null) {
            restaurant = new Restaurant();
        }
        return restaurant;
    }

    public void serveTheBurger(String burgerType, String sauce) {
        System.out.println("Serving " + burgerType + " burger with " + sauce);
    }
}
