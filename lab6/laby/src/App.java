import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // zad4();
        // zad5();
        // zad7();
    }

    public static void zad4() {
        ArmstrongNumbers.writeToFileFromRange(140, 420);
    }

    public static void zad5() {
        FileReader reader = null;

        try {
            reader = new FileReader("zad7.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(reader);
        double foo;
        double boo;

        List<Prostokat> list = new ArrayList<>();

        while (sc.hasNextDouble()) {
            try {
                foo = sc.nextDouble();
                if (foo < 0)
                    throw new LessThanZeroException("Podana szerokość jest ujemna");
                boo = sc.nextDouble();
                if (boo < 0)
                    throw new LessThanZeroException("Podana wysokość jest ujemna");
                Prostokat p = new Prostokat(foo, boo);
                list.add(p);
            } catch (NoSuchElementException e) {
                System.out.println(
                        "Niewystarczająca ilość danych w pliku, utworzenie obiektu klasy Prostokąt z domyslnymi parametrami.");
                Prostokat p = new Prostokat();
                list.add(p);
            } catch (LessThanZeroException e) {
                System.out.println("Obsługa ujemnych wartości długości.");
                Prostokat p = new Prostokat();
                list.add(p);
            }
        }

        for (Prostokat prostokat : list) {
            System.out.println("Pole prostokąta: " + prostokat.calcArea());
            System.out.println("Obwód prostokąta: " + prostokat.calcPerimeter());
        }

        sc.close();
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void zad7() {
        TablicaLiczb t1 = new TablicaLiczb(100);
        TablicaLiczb t2 = new TablicaLiczb(100);
        t1.enter();
        t2.enter();

        // t1.print();
        // t2.print();

        // t1.writeToFile(t2);
        t1.writeToFileMap(t2);

        TablicaLiczb.maxCount();
    }
}
