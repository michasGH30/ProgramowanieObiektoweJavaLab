import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {

        CreditDatabase creditDatabase = new CreditDatabase();

        Bank bank1 = new Bank("Pod Michałem");

        Shop shop1 = new Shop("Pod Adamem", "Warszawska 54/3", "Siedlce");
        Shop shop2 = new Shop("Pod Krzysiem", "Wrocławska 13", "Siedlce");
        Shop shop3 = new Shop("Pod Karolem", "Topolowa 32/1", "Warszawa");

        try {
            bank1.addShop(shop1);
            bank1.addShop(shop2);
            bank1.addShop(shop3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Product product1 = new Product("Bułka", 3.54f);
        Product product2 = new Product("Chleb", 3.25f);
        Product product3 = new Product("Masło", 6.45f);
        Product product4 = new Product("Ser", 9.12f);
        Product product5 = new Product("Mięso", 7.22f);

        try {
            shop1.addProduct(product1);
            shop1.addProduct(product2);
            shop1.addProduct(product3);

            shop2.addProduct(product1);
            shop2.addProduct(product4);
            shop2.addProduct(product5);

            shop3.addProduct(product1);
            shop3.addProduct(product2);
            shop3.addProduct(product3);
            shop3.addProduct(product4);
            shop3.addProduct(product5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Client client1 = new Client("Michał", "Żuk", "1234");
        Client client2 = new Client("Jakub", "Kowalski", "4321");

        Credit credit1 = new Credit(shop3, client2, bank1, 12);
        try {
            credit1.addProduct("Ser", 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Credit credit2 = new Credit(shop2, client1, bank1, 6);
        try {
            credit2.addProduct("Bułka", 5);
            credit2.addProduct("Masło", 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Credit credit3 = new Credit(shop1, client2, bank1, 3);
        try {
            credit3.addProduct("Bułka", 10);
            credit3.addProduct("Chleb", 6);
            credit3.addProduct("Masło", 11);
            credit3.addProduct("Coś niestworzonego", 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        creditDatabase.addCredit(credit1);
        creditDatabase.addCredit(credit2);
        creditDatabase.addCredit(credit3);

        try {
            System.out.println("Suma kredytów klientów sklepu: Pod Karolem: "
                    + creditDatabase.getSumOfCreditsByShopName("Pod Karolem"));
            System.out.println("Suma kredytów klientów sklepu: Nieistniejący: "
                    + creditDatabase.getSumOfCreditsByShopName("Nieistniejący"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Suma kredytów klientów sklepu, który znajduje się w miejscowości: Warszawa: "
                    + creditDatabase.getSumOfCreditsByShopCity("Warszawa"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Suma kredytów wziętych przez klienta od ID: 4321: "
                    + creditDatabase.getSumOfCreditsByClientID("4321"));
            System.out.println("Suma kredytów wziętych przez klienta od ID: 431: "
                    + creditDatabase.getSumOfCreditsByClientID("431"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Suma kredytów klientów sklepu, który znajduje się w miejscowości: Siedlce: "
                    + creditDatabase.getSumOfCreditsByShopCity("Siedlce"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Zapisuje do pliku.");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("credits.bin"));
            objectOutputStream.writeObject(creditDatabase);

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CreditDatabase creditDatabaseFromFile = null;

        System.out.println("Odczytuje z pliku.");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("credits.bin"));
            try {
                creditDatabaseFromFile = (CreditDatabase) objectInputStream.readObject();
                try {
                    System.out.println("Suma kredytów klientów sklepu, który znajduje się w miejscowości: Siedlce: "
                            + creditDatabaseFromFile.getSumOfCreditsByShopCity("Siedlce"));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
