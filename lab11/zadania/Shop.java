import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Shop implements Serializable, PrintInfo {
    private String name;
    private String address;
    private String city;
    private List<Product> products;

    public Shop(String name, String address, String city, List<Product> products) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.products = products;
    }

    public Shop(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void info() {
        System.out.println("Sklep.");
        System.out.println("Sklep o nazwie: " + name + ", mieści się: " + address + ", w miejśie: " + city);
    }

}
