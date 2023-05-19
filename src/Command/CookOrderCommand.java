package Command;

import Factory.Burger;
import Factory.Kitchen;

public class CookOrderCommand implements OrderCommand {
    private String burgerType;
    private String sauceType;

    public CookOrderCommand(String burgerType, String sauceType) {
        this.burgerType = burgerType;
        this.sauceType = sauceType;
    }

    public String getBurgerType() {
        return burgerType;
    }

    public String getSauceType() {
        return sauceType;
    }

    @Override
    public void execute() {
        if (sauceType.isEmpty()) {
            System.out.println("Chef: Received order for " + burgerType + " burger.");
        } else {
            System.out.println("Chef: Received order for " + burgerType + " burger with " + sauceType + " sauce.");
        }
        Burger burger = Kitchen.makeBurger(burgerType);
        System.out.println("Chef: Making " + burger.getDescription());
        if (!sauceType.isEmpty()) {
            burger = Kitchen.addSauce(burger, sauceType);
            System.out.println("Chef: Adding " + sauceType + " sauce to burger");
        }
        System.out.println("Chef: Order for " + burger.getDescription() + " is ready!");
        System.out.println("Chef: Total cost is $" + burger.getCost());
    }
}