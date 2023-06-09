package Command;

import Factory.Burger;
import Factory.Kitchen;

public class CookOrderCommand implements OrderCommand {
    private Chef chef;
    private String burgerType;
    private String sauceType;
    private Burger burger;

    public CookOrderCommand(Chef chef, String burgerType, String sauceType, Burger burger) {
        this.chef = chef;
        this.burgerType = burgerType;
        this.sauceType = sauceType;
        this.burger = burger;
    }

    @Override
    public void execute() {
       chef.cookOrder(burgerType,sauceType,burger);
    }
}