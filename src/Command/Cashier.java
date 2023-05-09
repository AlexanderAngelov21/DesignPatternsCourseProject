package Command;

public class Cashier {
    public void takeOrder(Order order) {
        if (order.getSauceType().isEmpty()) {
            System.out.println("Cashier: Taking order for " + order.getBurgerType() + " burger.");
        } else {
            System.out.println("Cashier: Taking order for " + order.getBurgerType() + " burger with " + order.getSauceType() + " sauce.");
        }
    }
}