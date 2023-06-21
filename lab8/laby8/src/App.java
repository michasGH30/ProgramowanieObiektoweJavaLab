import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // zad1();
        zad2();
    }

    public static void zad1() {
        Random random = new Random(System.nanoTime());
        int choice = random.nextInt(2);
        System.out.println(choice);
        Customer customer = null;
        Employee employee = null;

        String name, surname;

        try (BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in))) {
            if (choice == 0) {
                System.out.println("Podaj imię klienta:");
                name = inputStream.readLine();
                System.out.println("Podaj nazwisko klienta:");
                surname = inputStream.readLine();
                customer = new Customer(name, surname, random.nextDouble() * 123.56 + 12.34);

                System.out.println("Podaj imię pracownika:");
                name = inputStream.readLine();
                System.out.println("Podaj nazwisko pracownika:");
                surname = inputStream.readLine();
                employee = new Employee(name, surname, random.nextInt(10), random.nextDouble() * 1234.56 + 12.34);
            } else {
                System.out.println("Podaj imię pracownika:");
                name = inputStream.readLine();
                System.out.println("Podaj nazwisko pracownika:");
                surname = inputStream.readLine();
                employee = new Employee(name, surname, random.nextInt(10), random.nextDouble() * 1234.56 + 12.34);

                System.out.println("Podaj imię klienta:");
                name = inputStream.readLine();
                System.out.println("Podaj nazwisko klienta:");
                surname = inputStream.readLine();
                customer = new Customer(name, surname, random.nextDouble() * 123.56 + 12.34);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        customer.print();
        employee.print();
        System.out.println("Utworzono: " + Person.getID() + " obiektów");
    }

    public static void zad2() {
        Uczen uczen = new Uczen("Adam", "Nowak", 3.5f, 4.0f, 5.5f, 0.5f, 0.3f, 0.2f);
        Pracownik pracownik = new Pracownik("Adam", "Nowak", 2000.3f, 3123.56f, 1290.78f, 0.4f, 0.6f);

        System.out.println("Średnia: " + uczen.srednia());
        System.out.println("Pracownik: " + pracownik.srednia());

        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.bin"));
            objectOutputStream.writeObject(uczen);
            objectOutputStream.writeObject(pracownik);
            objectOutputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ObjectInputStream objectInputStream;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("data.bin"));
            Uczen uczen2 = (Uczen) objectInputStream.readObject();
            Pracownik pracownik2 = (Pracownik) objectInputStream.readObject();
            System.out.println("Średnia: " + uczen2.srednia());
            System.out.println("Pracownik: " + pracownik2.srednia());
            objectInputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
