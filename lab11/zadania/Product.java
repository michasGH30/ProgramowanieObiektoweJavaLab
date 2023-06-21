import java.io.Serializable;

public class Product implements Serializable, PrintInfo {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public void info() {
        System.out.println("Produkt.");
        System.out.println("Produtk nazywa się: " + name);
        System.out.println("Koszuje: " + price + " zł");
    }
}
