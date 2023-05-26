public abstract class BurgerDecorator implements BurgerInterface{

    protected BurgerInterface burger;
    protected String addedSauce;

    public BurgerDecorator(BurgerInterface burger, String sauce) {
        this.burger = burger;
        this.addedSauce = sauce;
    }
}
