import java.util.Scanner;

public class Klient {
    private String name, surname;

    public Klient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        name = sc.next();
        System.out.println("Podaj nazwisko:");
        surname = sc.next();
        sc.close();
    }
}
