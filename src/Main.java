public class Main {

    public static void main(String[] args) {
        Chef chef = new MainChef();
        Cashier cashier = new Cashier(chef);

        cashier.Order("Royal","garlic sauce");
        cashier.Order("Classic","garlic sauce");
        cashier.Order("Vegetarian","ketchup");
        cashier.Order("Classic","no sauce");
        cashier.Order("Royal","no sauce");
        cashier.Order("Vegetarian","no sauce");

    }
}
