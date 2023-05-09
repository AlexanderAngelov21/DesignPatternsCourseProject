package Singleton;

import Command.Cashier;
import Command.Chef;
import Command.Order;

public class Restaurant {
    private static Restaurant instance = null;
    private Cashier cashier;
    private Chef chef;

    private Restaurant() {
        cashier = new Cashier();
        chef = new Chef();
    }

    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public void open() {
        System.out.println("Restaurant: Opening for business!");
    }

    public void close() {
        System.out.println("Restaurant: Closing for the day!");
    }

    public void takeOrder(String burgerType, String sauceType) {
        Order order = new Order(burgerType, sauceType);
        cashier.takeOrder(order);
        chef.cookOrder(order);
    }
}