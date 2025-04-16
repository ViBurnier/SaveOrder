package SaveOrder;

public class SaveArchive implements SaveOrder{
    @Override
    public void save(String order) {
        System.out.println("salvando " + order + " em arquivo");
    }
}
