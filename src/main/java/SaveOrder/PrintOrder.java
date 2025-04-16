package SaveOrder;

public class PrintOrder {

    public static void main(String[] args) {
        SaveOrder saveOrder = new SaveToDataBase();

        OrderSave salvar = new OrderSave(saveOrder);

        PlaceOrder fazerPedido = new PlaceOrder(salvar);
        fazerPedido.placeOrder("Nvidia5090");

    }

}
