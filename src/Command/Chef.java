package Command;

import Factory.Burger;

public final class Chef {

    private OrderCommand orderCommand;
    private static Chef instance;
    public Chef() {
    }
    public static Chef getInstance() {
        if (instance == null) {
            instance = new Chef();
        }
        return instance;
    }

    public void setOrderCommand(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void serveBurger(Burger burger) {
        if (orderCommand != null){
            orderCommand.execute();
            System.out.println("Serving: " + burger.getDescription());
        }
        else {
            System.out.println("Грешка: Поръчката не е инициализирана.");
        }
    }

}
