public class Cashier implements CashierInterface{
    private Chef chef;
    public Cashier(Chef chef){
        this.chef = chef;
    }
    @Override
    public void Order(String burgerType, String sauce) {
        chef.makeBurger(burgerType);
        Restaurant.getRestaurant().serveTheBurger(burgerType, sauce);
    }
}
