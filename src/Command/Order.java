package Command;

public class Order {
    private String burgerType;
    private String sauceType;

    public Order(String burgerType, String sauceType) {
        this.burgerType = burgerType;
        this.sauceType = sauceType;
    }

    public String getBurgerType() {
        return burgerType;
    }

    public String getSauceType() {
        return sauceType;
    }
}
