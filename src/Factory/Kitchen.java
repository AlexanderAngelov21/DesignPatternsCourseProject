package Factory;

import Decorator.GarlicSauce;
import Decorator.KetchupSauce;

public class Kitchen {
    public static Burger makeBurger(String burgerType) {
        Burger burger = null;
        if (burgerType.equals("royal")) {
            burger = new RoyalBurger();
            System.out.println("Kitchen: Making Royal Burger");
        } else if (burgerType.equals("classic")) {
            burger = new ClassicBurger();
            System.out.println("Kitchen: Making Classic Burger");
        } else if (burgerType.equals("vegetarian")) {
            burger = new VegetarianBurger();
            System.out.println("Kitchen: Making Vegetarian Burger");
        }
        return burger;
    }

    public static Burger addSauce(Burger burger, String sauceType) {
        if (sauceType.equals("garlic")) {
            System.out.println("Kitchen: Adding Garlic Sauce to burger");
            return new GarlicSauce(burger);
        } else if (sauceType.equals("ketchup")) {
            System.out.println("Kitchen: Adding Ketchup Sauce to burger");
            return new KetchupSauce(burger);
        } else {
            return burger;
        }
    }
}