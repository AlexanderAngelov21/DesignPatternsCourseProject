package Decorator;

import Factory.Burger;

public class GarlicSauce extends SauceDecorator {
    private Burger burger;

    public GarlicSauce(Burger burger) {
        this.burger = burger;
        description = burger.getDescription() + ", Garlic Sauce";
        cost = burger.getCost() + 0.99;
    }
}