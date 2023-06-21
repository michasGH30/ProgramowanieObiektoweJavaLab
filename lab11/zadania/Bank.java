import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bank implements Serializable, PrintInfo {
    private String name;
    private List<Shop> shops;

    public Bank(String name, List<Shop> shops) {
        this.name = name;
        this.shops = shops;
    }

    public Bank(String name) {
        this.name = name;
        shops = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    public List<Shop> getShops() {
        return shops;
    }

    @Override
    public void info() {
        System.out.println("Bank.");
        System.out.println("Bank ma nazwę: " + name);
        System.out.println("Bank ma podpisaną umowę z: " + shops.size() + ", sklepami");
    }

}
