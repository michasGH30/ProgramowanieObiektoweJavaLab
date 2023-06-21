import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;
    private List<Integer> counts;
    private String name;
    private String address;
    private String areaName;

    public Shop(String name, String address, String areaName) {
        this.name = name;
        this.address = address;
        this.areaName = areaName;
        products = new ArrayList<Product>();
        counts = new ArrayList<Integer>();
    }

    public void addProduct(Product product, int count) {
        products.add(product);
        counts.add(count);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void info() {
        System.out.println("Informacje o sklepie:");
        System.out.println("Nazwa: " + name);
        System.out.println("Adres: " + address);
        System.out.println("Nazwa terenu miasta: " + areaName);
        System.out.println("Produkty:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getName() + " " + counts.get(i));
        }
    }

}
