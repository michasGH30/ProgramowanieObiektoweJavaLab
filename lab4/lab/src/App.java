import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    // zad 4,8,9
    public static void main(String[] args) {
        // zad4();
        // zad8();
        zad9();
    }

    public static void zad4() {
        System.out.println("Uczelnia - zad 4");
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2;
        try {
            String nazwisko;
            System.out.println("Podaj nazwisko:");
            nazwisko = sc.next();
            if (nazwisko.length() < 3)
                throw new IllegalArgumentException("Podałeś za krótkie nazwisko!!!");
            int wiek;
            System.out.println("Podaj wiek studenta:");
            wiek = sc.nextInt();
            if (wiek < 17 || wiek > 80)
                throw new IllegalArgumentException("Z tym wiekiem nie możesz studiować!!!");
            float ocena1;
            System.out.println("Podaj ocenę 1:");
            ocena1 = sc.nextFloat();
            if (ocena1 < 2 || ocena1 > 5)
                throw new IllegalArgumentException("Podałeś ocenę poza zakresem!!!");
            float ocena2;
            System.out.println("Podaj ocenę 2:");
            ocena2 = sc.nextFloat();
            if (ocena2 < 2 || ocena2 > 5)
                throw new IllegalArgumentException("Podałeś ocenę poza zakresem!!!");
            s2 = new Student();

        } catch (InputMismatchException e) {
            System.out.println("Podałeś złe dane!!!");
            s2 = new Student();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            s2 = new Student();
        }

        System.out.println("Średnia ważona studenta 1 z wagami 0.5, 0.75: " + s1.avg(0.5f, 0.75f));
        System.out.println("Średnia ważona studenta 2 z wagami 0.5, 0.75: " + s2.avg(0.5f, 0.75f));

        sc.close();
    }

    public static void zad8() {
        System.out.println("Stos ze String'ami - zad 8");
        Scanner sc = new Scanner(System.in);
        Stos stack = new Stos(2);
        try {
            System.out.println("Czy chcesz usunąć coś ze stosu: 1 - Tak, 2 - Nie");
            int choise = sc.nextInt();
            if (choise == 1)
                stack.pop();
            System.out.println("Ile chcesz dodać wyrazów, masz do dyspozycji " + stack.getLength() + " miejsc");
            int len = sc.nextInt();
            if (len < 1)
                throw new IllegalArgumentException("Ilość elementów, które chcesz podać musi być większa niż 1!!!");

            for (int i = 0; i < len; i++) {
                System.out.println("Podaj napis do dodania:");
                String item = sc.next();
                stack.push(item);
            }

        } catch (InputMismatchException e) {
            System.out.println("Nie podałeś napisu!!!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    public static void zad9() {
        Wielomian wielomian = new Wielomian(1);
        wielomian.print();
        try {
            System.out.println("Wynik: " + wielomian.calculate(2.5f));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Wielomian wielomian2 = new Wielomian(2);
        wielomian2.print();

        Wielomian wielomian3 = wielomian.add(wielomian2);
        Wielomian wielomian4 = wielomian.substract(wielomian2);
        wielomian3.print();
        wielomian4.print();

        Wielomian wielomian5 = wielomian.multiply(wielomian2); // prawdopodobnie działa
        wielomian5.print();

    }

}
