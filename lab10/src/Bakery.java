import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private String name;
    private List<Product> products;

    public Bakery(String name) {
        this.name = name;
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (name == product.getName()) {
                return product;
            }
        }
        return null;
    }

    public void info() {
        System.out.println("Informacje o piekarni:");
        System.out.println("Nazwa: " + name);
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}
