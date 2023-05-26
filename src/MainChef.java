public class MainChef implements Chef{

    @Override
    public void makeBurger(String burgerType) {
        BurgerInterface burger = BurgerFactory.createBurger(burgerType);
        System.out.println("Making "+burger.getBurgerName());
    }
}
