public class Order {
    private Shop shop;
    private Supplier supplier;
    private Product product;
    private int count;

    public Order(Shop shop, Supplier supplier) {
        this.shop = shop;
        this.supplier = supplier;

    }

    public void addOrder(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }

}
