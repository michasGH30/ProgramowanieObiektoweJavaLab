import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String name;
    private String surname;
    private String area;
    private List<Order> orders;

    public Supplier(String name, String surname, String area) {
        this.name = name;
        this.surname = surname;
        this.area = area;
        orders = new ArrayList<Order>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void info() {
        System.out.println("Informacje o dostawcy:");
        System.out.println("Imie: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Teren miasta: " + area);
        System.out.println("Zamówienia:");
        for (Order order : orders) {
            System.out.println(order.getProduct().getName() + " " + order.getCount());

        }
    }
}
