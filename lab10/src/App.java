public class App {
    public static void main(String[] args) throws Exception {
        CityArea cityArea1 = new CityArea("Śródmieście");
        CityArea cityArea2 = new CityArea("Bemowo");

        Bakery bakery = new Bakery("Piekarnia pod Michałem");

        cityArea1.addShop(new Shop("Sklep 1", "Śródmieście 1", cityArea1.getName()));
        cityArea1.addShop(new Shop("Sklep 2", "Śródmieście 2", cityArea1.getName()));
        cityArea1.addShop(new Shop("Sklep 3", "Śródmieście 3", cityArea1.getName()));

        cityArea2.addShop(new Shop("Sklep 4", "Bemowo 1", cityArea2.getName()));
        cityArea2.addShop(new Shop("Sklep 5", "Bemowo 2", cityArea2.getName()));

        cityArea1.addSupplier(new Supplier("Adam", "Kowalski", cityArea1.getName()));
        cityArea1.addSupplier(new Supplier("Adam", "Nowak", cityArea1.getName()));

        cityArea2.addSupplier(new Supplier("Adam", "Koło", cityArea2.getName()));

        bakery.addProduct(new Product("Bułka kwadratowa", 1.23));
        bakery.addProduct(new Product("Chleb okrągły", 2.23));
        bakery.addProduct(new Product("Bułka okrągła", 1.32));
        bakery.addProduct(new Product("Chleb kwadratowy", 2.32));

        Order order = new Order(cityArea1.getShop("Sklep 1", "Śródmieście 1"),
                cityArea1.getSupplier("Adam", "Kowalski"));
        order.addOrder(bakery.getProduct("Bułka kwadratowa"), 10);

        cityArea1.getSupplier("Adam", "Kowalski").addOrder(order);
        cityArea1.getShop("Sklep 1", "Śródmieście 1").addProduct(order.getProduct(), order.getCount());

        cityArea1.info();

        cityArea1.getShop("Sklep 1", "Śródmieście 1").info();

        cityArea1.getSupplier("Adam", "Kowalski").info();

        bakery.info();

    }
}
