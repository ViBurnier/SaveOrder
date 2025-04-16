package SaveOrder;

public class OrderSave implements Order {
    private SaveOrder saveOrder;

    public OrderSave(SaveOrder saveOrder){
        this.saveOrder = saveOrder;
    }

    @Override
    public void order(String product) {
        saveOrder.save(product);
    }
}
