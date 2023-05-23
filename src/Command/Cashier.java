package Command;

public class Cashier {
    public void takeOrder(String burgerType, String sauceType) {
        System.out.println("Cashier: Taking order for " + burgerType + " burger" + (sauceType.isEmpty() ? "" : " with " + sauceType + " sauce") + ".");
    }
}