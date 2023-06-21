import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Credit implements Serializable, PrintInfo {
    private Shop shop;
    private Client client;
    private Bank bank;
    private List<Product> products;
    private List<Integer> counts;

    public List<Float> getPricesToPay() {
        return pricesToPay;
    }

    private List<Float> pricesToPay;
    private int installment;

    public Credit(Shop shop, Client client, Bank bank, List<Product> products, List<Integer> count,
            List<Float> priceToPay, int installment) {
        this.shop = shop;
        this.client = client;
        this.bank = bank;
        this.products = products;
        this.counts = count;
        this.pricesToPay = priceToPay;
        this.installment = installment;
    }

    public Credit(Shop shop, Client client, Bank bank, int installment) {
        this.shop = shop;
        this.client = client;
        this.bank = bank;
        this.installment = installment;
        products = new ArrayList<>();
        counts = new ArrayList<>();
        pricesToPay = new ArrayList<>();
    }

    public Shop getShop() {
        return shop;
    }

    public Client getClient() {
        return client;
    }

    public Bank getBank() {
        return bank;
    }

    public void addProduct(String productName, int count) throws Exception {
        Product tempProduct = shop.getProduct(productName);
        if (tempProduct == null)
            throw new Exception(productName + " - takiego produktu nie w tym sklepie.");
        products.add(tempProduct);
        counts.add(count);
        pricesToPay.add(tempProduct.getPrice() * count);
    }

    @Override
    public void info() {
        System.out.println("Kredyt.");
        System.out.println("Kredyt został udzielony na: " + products.size() + " produktów.");
        System.out.println("Produkty zostały zakupione w sklepie o nazwie: " + shop.getName());
        System.out.println("Kredytu idzielił bank o nazwie: " + bank.getName());
        System.out.println("Kredyt wziął: ");
        client.info();
        System.out.println("Kredyt jest spłacany przez: " + installment + " rat");
    }

}
