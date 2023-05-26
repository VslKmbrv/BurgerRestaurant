public class KetchupSauce extends BurgerDecorator{
    public KetchupSauce(BurgerInterface burger) {
        super(burger, "ketchup");
    }

    @Override
    public String getBurgerName() {
        return burger.getBurgerName() + " with " + addedSauce;
    }
}
