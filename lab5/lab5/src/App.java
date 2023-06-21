import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // zad2();
        // zad4();
        zad5();
    }

    public static void zad2() {
        Ulamek u;
        Ulamek u2;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Podaj licznik 1 ułamka:");
            int l1 = sc.nextInt();
            System.out.println("Podaj mianownik 1 ułamka:");
            int m1 = sc.nextInt();
            if (m1 == 0)
                throw new ArithmeticException("Mianownik nie może być 0");
            u = new Ulamek(l1, m1);
            if (u.calc() < -1.0)
                throw new LessThanMinusOne("Komunikat");

        } catch (InputMismatchException e) {
            System.out.println("Podałeś zły typ danych!!");
            u = new Ulamek(2, 4);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            u = new Ulamek(2, 4);
        } catch (LessThanMinusOne e) {
            System.out.println(e.getMessage());
            u = new Ulamek();
            System.exit(-1);
        }

        try {
            System.out.println("Podal licznik 2 ułamka:");
            int l2 = sc.nextInt();
            System.out.println("Podaj mianownik 2 ułamka:");
            int m2 = sc.nextInt();
            if (m2 == 0)
                throw new ArithmeticException("Mianownik nie może być 0");
            u2 = new Ulamek(l2, m2);
            if (u2.calc() < -1.0)
                throw new LessThanMinusOne("Komunikat");
        } catch (InputMismatchException e) {
            System.out.println("Podałeś zły typ danych!!");
            u2 = new Ulamek(2, 4);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            u2 = new Ulamek(2, 4);
        } catch (LessThanMinusOne e) {
            System.out.println(e.getMessage());
            u2 = new Ulamek();
            System.exit(-1);
        }
        u.print();
        u2.print();

        Ulamek u3 = u.substract(u2);
        u3.print();

        Ulamek u4 = u.multiply(u2);
        u4.print();

        Ulamek u5 = u.skroc();
        u5.print();

        System.out.println(u.isBigger(u2));

        sc.close();
    }

    public static void zad4() {
        Wektor w;
        Wektor w2;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Podaj x wektora 1:");
            float x = sc.nextFloat();
            System.out.println("Podaj y wektora 1:");
            float y = sc.nextFloat();
            System.out.println("Podaj z wektora 1:");
            float z = sc.nextFloat();
            if (z == 0)
                throw new ZNotZeroException("Podałeś z równe 0");
            w = new Wektor(x, y, z);
        } catch (InputMismatchException e) {
            System.out.println("Podałeś zły typ danych");
            w = new Wektor();
        } catch (ZNotZeroException e) {
            System.out.println(e.getMessage());
            w = new Wektor();
        }

        try {
            System.out.println("Podaj x wektora 2:");
            float x = sc.nextFloat();
            System.out.println("Podaj y wektora 2:");
            float y = sc.nextFloat();
            System.out.println("Podaj z wektora 2:");
            float z = sc.nextFloat();
            if (z == 0)
                throw new ZNotZeroException("Podałeś z równe 0");
            w2 = new Wektor(x, y, z);
        } catch (InputMismatchException e) {
            System.out.println("Podałeś zły typ danych");
            w2 = new Wektor();
        } catch (ZNotZeroException e) {
            System.out.println(e.getMessage());
            w2 = new Wektor();
        }

        w.print();
        w2.print();

        System.out.println(w.scalarMultiply(w2));
        Wektor w3 = w.vectorMultiply(w2);
        w3.print();
    }

    public static void zad5() {
        Czas c;
        Czas c2;
        Scanner sc = new Scanner(System.in);

        c = new Czas("12 h 36 m");
        System.out.println(c);
        try {
            System.out.println("Podaj godziny czasu 1:");
            int h = sc.nextInt();
            if (h > 24 || h < 0)
                throw new CzasException("Podałeś złą godzinę w czasie 1.");
            System.out.println("Podaj minuty czasu 1:");
            int m = sc.nextInt();
            if (m > 60 || m < 0)
                throw new CzasException("Podałeś złą minutę w czasie 1.");
            c = new Czas(h, m);
        } catch (InputMismatchException e) {
            System.out.println("Podałeś zły typ danych.");
            c = new Czas();
        } catch (CzasException e) {
            System.out.println(e.getMessage());
            c = new Czas();
        }

        try {
            System.out.println("Podaj godziny czasu 2:");
            int h = sc.nextInt();
            if (h > 24 || h < 0)
                throw new CzasException("Podałeś złą godzinę w czasie 2.");
            System.out.println("Podaj minuty czasu 2:");
            int m = sc.nextInt();
            if (m > 60 || m < 0)
                throw new CzasException("Podałeś złą minutę w czasie 2.");
            c2 = new Czas(h, m);
        } catch (InputMismatchException e) {
            System.out.println("Podałeś zły typ danych.");
            c2 = new Czas();
        } catch (CzasException e) {
            System.out.println(e.getMessage());
            c2 = new Czas();
        }

        System.out.println("Suma czasów: " + c.add(c2));
        System.out.println("Różnica czasów: " + c.substract(c2));
        System.out.println("Czas 1 pomnozony przez 10: " + c.multiply(10));

        Czas[] arr = new Czas[2];
        arr[0] = new Czas(3, 12);
        arr[1] = new Czas(4, 12);
        c.sumOfTimes(arr);
        System.out.println(c);
        sc.close();
    }
}
