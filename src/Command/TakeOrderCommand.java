package Command;

public class TakeOrderCommand implements OrderCommand {
    private Cashier cashier;
    private String burgerType;
    private String sauceType;

    public TakeOrderCommand(Cashier cashier, String burgerType, String sauceType) {
        this.cashier = cashier;
        this.burgerType = burgerType;
        this.sauceType = sauceType;
    }

    @Override
    public void execute() {
        cashier.takeOrder(burgerType, sauceType);
    }
}
