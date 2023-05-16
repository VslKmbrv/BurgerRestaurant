package Command;

import Decorator.GarlicSauceDecorator;
import Decorator.KetchupDecorator;
import Factory.Burger;

public class AddSauceCommand implements OrderCommand {
    private Burger burger;

    public AddSauceCommand(Burger burger) {
        this.burger = burger;
    }

    public void execute() {
        burger = new KetchupDecorator(burger);
        burger = new GarlicSauceDecorator(burger);
    }

    @Override
    public void undo() {

    }
}
