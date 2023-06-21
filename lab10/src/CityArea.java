import java.util.ArrayList;
import java.util.List;

public class CityArea {
    private List<Shop> shops;
    private List<Supplier> suppliers;
    private String name;

    public CityArea(String name) {
        this.name = name;
        shops = new ArrayList<Shop>();
        suppliers = new ArrayList<Supplier>();
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public Shop getShop(String name, String address) {
        for (Shop shop : shops) {
            if (name == shop.getName() && address == shop.getAddress()) {
                return shop;
            }
        }
        return null;
    }

    public Supplier getSupplier(String name, String surname) {
        for (Supplier supplier : suppliers) {
            if (name == supplier.getName() && surname == supplier.getSurname()) {
                return supplier;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Informacje o Terenie Miasta:");
        System.out.println("Nazwa: " + name);
        System.out.println("Sklepy:");
        for (Shop shop : shops) {
            System.out.println(shop.getName());
        }
        System.out.println("Dostawcy:");
        for (Supplier supplier : suppliers) {
            System.out.println(supplier.getName() + " " + supplier.getSurname());
        }
    }

}
