package Command;

public class TakeOrderCommand implements OrderCommand {
    private String burgerType;
    private String sauceType;

    public TakeOrderCommand(String burgerType, String sauceType) {
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
            System.out.println("Cashier: Taking order for " + burgerType + " burger.");
        } else {
            System.out.println("Cashier: Taking order for " + burgerType + " burger with " + sauceType + " sauce.");
        }
    }
}