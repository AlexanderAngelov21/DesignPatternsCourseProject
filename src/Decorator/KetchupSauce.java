package Decorator;

import Factory.Burger;

public class KetchupSauce extends SauceDecorator {
    private Burger burger;

    public KetchupSauce(Burger burger) {
        this.burger = burger;
        description = burger.getDescription() + " with Ketchup Sauce";
        cost = burger.getCost() + 0.49;
    }
}