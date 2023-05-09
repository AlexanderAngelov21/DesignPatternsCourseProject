package Command;

import Factory.Burger;
import Factory.Kitchen;

public class Chef {
    public void cookOrder(Order order) {
        if (order.getSauceType().isEmpty()) {
            System.out.println("Chef: Received order for " + order.getBurgerType() + " burger.");
        } else {
            System.out.println("Chef: Received order for " + order.getBurgerType() + " burger with " + order.getSauceType() + " sauce.");
        }
        Burger burger = Kitchen.makeBurger(order.getBurgerType());
        System.out.println("Chef: Made " + burger.getDescription());
        if (!order.getSauceType().isEmpty()) {
            burger = Kitchen.addSauce(burger, order.getSauceType());
            System.out.println("Chef: Added " + order.getSauceType() + " sauce to burger");
        }
        System.out.println("Chef: Preparing " + burger.getDescription());
        System.out.println("Chef: Order ready!");
        System.out.println("Chef: Total cost is $" + burger.getCost());
    }
}