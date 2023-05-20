package Singleton;

import Command.Cashier;
import Command.Chef;
import Command.CookOrderCommand;
import Command.OrderCommand;
import Command.TakeOrderCommand;

public class Restaurant {
    private static volatile Restaurant instance = null;
    private Cashier cashier;
    private Chef chef;

    private Restaurant() {
        cashier = new Cashier();
        chef = new Chef();
    }

    public static Restaurant getInstance() {
        if (instance == null) {
            synchronized (Restaurant.class) {
                if (instance == null) {
                    instance = new Restaurant();
                }
            }
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
        OrderCommand takeOrderCommand = new TakeOrderCommand(burgerType, sauceType);
        cashier.takeOrder(takeOrderCommand);

        OrderCommand cookOrderCommand = new CookOrderCommand(burgerType, sauceType);
        chef.cookOrder(cookOrderCommand);
    }
}