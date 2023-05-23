package Command;

public class OrderInvoker {
    private OrderCommand orderCommand;

    public void setOrderCommand(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void invoke() {
        orderCommand.execute();
    }
}