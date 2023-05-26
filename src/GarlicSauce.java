public class GarlicSauce extends BurgerDecorator {
    public GarlicSauce(BurgerInterface burger) {
        super(burger, "чеснов");
    }

    @Override
    public String getBurgerName() {
        return burger.getBurgerName() + " with " + addedSauce;
    }
}