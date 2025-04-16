package SaveOrder;

public class PlaceOrder{
    private Order order;

    public PlaceOrder(Order order){
        this.order = order;
    }

    public void placeOrder(String product){
        order.order(product);
    }
}
