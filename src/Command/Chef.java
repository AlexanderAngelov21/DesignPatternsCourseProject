package Command;
import Factory.Burger;

public class Chef {
    public void cookOrder(String burgerType, String sauceType, Burger burger) {
        System.out.println("Chef: Making " + burger.getDescription());
        if (!sauceType.isEmpty()) {
            System.out.println("Chef: Adding " + sauceType + " sauce to burger");
        }
        System.out.println("Chef: Order for " + burger.getDescription() + " is ready!");
        System.out.println("Chef: Total cost is $" + burger.getCost());

    }
}