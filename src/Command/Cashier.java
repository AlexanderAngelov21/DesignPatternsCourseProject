package Command;

public class Cashier {
    public void takeOrder(OrderCommand order) {
        order.execute();
    }
}