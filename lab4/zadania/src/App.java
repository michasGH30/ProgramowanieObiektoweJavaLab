import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        // a();
        // b();
        c();
    }

    public static void a() {
        Punkt p = new Punkt();
        System.out.println(p);
        p.move(1, 2);
        System.out.println(p);
    }

    public static void b() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość punktów:");
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nie podałeś liczby!.");
        }
        if (n <= 0) {
            throw new ArithmeticException("Rozmiar tablicy nie może być mniejszy od 0!.");
        } else {
            Punkt[] points = new Punkt[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                points[i] = new Punkt(rand.nextInt(10), rand.nextInt(10));
            }
            for (Punkt punkt : points) {
                System.out.println(punkt);
            }
        }
        sc.close();
    }

    public static void c() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość punktów:");
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nie podałeś liczby!.");
        }
        if (n <= 0) {
            throw new ArithmeticException("Rozmiar tablicy nie może być mniejszy od 0!.");
        } else {
            Punkt[] points = new Punkt[n];
            for (int i = 0; i < n; i++) {
                try {
                    System.out.println("Podaj współrzędne punktu:");
                    points[i] = new Punkt(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("Nie podałeś liczby!.");
                }
            }

            for (Punkt punkt : points) {
                try {
                    System.out.println("Podaj przesunięcie punktu:");
                    punkt.move(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("Nie podałeś liczby!.");
                }
            }

            for (Punkt punkt : points) {
                System.out.println(punkt);
            }
        }
        sc.close();
    }
}
