import Singleton.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance();
        restaurant.open();
        restaurant.takeOrder("royal", "garlic");
        restaurant.takeOrder("classic", "ketchup");
        restaurant.takeOrder("vegetarian", "");
        restaurant.close();
    }
}