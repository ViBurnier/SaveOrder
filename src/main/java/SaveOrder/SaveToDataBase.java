package SaveOrder;

public class SaveToDataBase implements SaveOrder{
    @Override
    public void save(String order) {
        System.out.println("salvando " + order + " no banco");
    }
}
