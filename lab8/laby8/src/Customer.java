public class Customer extends Person {
    private double priceToPay;

    public Customer() {
        super();
        priceToPay = 123.45;
    }

    public Customer(String name, String surname, double priceToPay) {
        super(name, surname);
        this.priceToPay = priceToPay;
    }

    public void print() {
        System.out.println(
                "Imię: " + getName() + ", Nazwisko: " + getSurname() + ", Kwota do zapłaty: " + priceToPay);
    }
}
