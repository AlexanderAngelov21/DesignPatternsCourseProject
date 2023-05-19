package Command;

public class Chef {
    public void cookOrder(OrderCommand order) {
        order.execute();
    }
}