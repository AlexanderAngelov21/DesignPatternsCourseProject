package Factory;

import Decorator.GarlicSauce;
import Decorator.KetchupSauce;

public class Kitchen {
    public static Burger makeBurger(String burgerType) {
        Burger burger = null;
        if (burgerType.equals("royal")) {
            burger = new RoyalBurger();
        } else if (burgerType.equals("classic")) {
            burger = new ClassicBurger();
        } else if (burgerType.equals("vegetarian")) {
            burger = new VegetarianBurger();
        }
        return burger;
    }

    public static Burger addSauce(Burger burger, String sauceType) {
        if (sauceType.equals("garlic")) {
            return new GarlicSauce(burger);
        } else if (sauceType.equals("ketchup")) {
            return new KetchupSauce(burger);
        } else {
            return burger;
        }
    }
}