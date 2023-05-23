package Singleton;

import Command.Cashier;
import Command.Chef;
import Command.CookOrderCommand;
import Command.OrderInvoker;
import Command.TakeOrderCommand;
import Factory.Burger;
import Factory.Kitchen;

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
        OrderInvoker orderInvoker = new OrderInvoker();

        // TakeOrderCommand
        orderInvoker.setOrderCommand(new TakeOrderCommand(cashier, burgerType, sauceType));
        orderInvoker.invoke();

        Burger burger = Kitchen.makeBurger(burgerType);
        if (!sauceType.isEmpty()) {
            burger = Kitchen.addSauce(burger, sauceType);
        }

        // CookOrderCommand
        orderInvoker.setOrderCommand(new CookOrderCommand(chef, burgerType, sauceType, burger));
        orderInvoker.invoke();

        chef.cookOrder(burgerType, sauceType, burger);
    }
}