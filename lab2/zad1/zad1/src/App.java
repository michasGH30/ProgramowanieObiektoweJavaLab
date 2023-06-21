import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // System.out.println("Zad 1 - Jednostki");
        // Jednostki obiekt = new Jednostki(10, 100, 100);
        // obiekt.wypisz();
        // obiekt.setWaluta(100);
        // obiekt.wypisz();
        // obiekt.naCale();
        // obiekt.wypisz();

        // System.out.println("Zad 3 - Prostokąt");
        // Scanner sc = new Scanner(System.in);
        // Prostokat p = new Prostokat();

        // System.out.println("Podaj x:");
        // p.setX(sc.nextInt());
        // System.out.println("Podaj y:");
        // p.setY(sc.nextInt());
        // System.out.println("Podaj szerokość:");
        // p.setSzerokosc(sc.nextInt());
        // System.out.println("Podaj wysokość:");
        // p.setWysokosc(sc.nextInt());
        // p.wypisz();

        // System.out.println("Podaj x punktu: ");
        // Punkt pun = new Punkt();
        // pun.setX(sc.nextInt());
        // System.out.println("Podaj y punktu: ");
        // pun.setY(sc.nextInt());
        // p.punktWewnatrzKlasa(pun);
        // sc.close();

        System.out.println("Zad 6 - Osoba");
        Scanner sc = new Scanner(System.in);
        Osoba os = new Osoba();
        int wybor = 0;
        do {
            System.out.println("Chcesz dostać losową osobę(1) czy podać z klawiatury(2)");
            wybor = sc.nextInt();
        } while (!(wybor == 1 || wybor == 2));
        if (wybor == 1) {
            os.losowe();
            os.wypisz();
        } else if (wybor == 2) {
            os.podaj_dane();
            os.wypisz();
        }
        sc.close();
    }
}
