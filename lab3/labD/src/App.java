import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Zad 4");
        // TablicaLiczb tablica = new TablicaLiczb(10);
        // tablica.generateNumbers();
        // tablica.printNumbers();
        // tablica.printPerfectNumbers();

        // System.out.println("Zad 8");
        // Tablica tab = new Tablica(5);
        // tab.enterToArray();
        // tab.printArray();
        // tab.printStartWithLetter(0);

        System.out.println("Zad 9");
        Macierz matrix = new Macierz(3);
        Scanner sc = new Scanner(System.in);
        int choise = -1;
        do {
            System.out.println(
                    "Podaj opcję:\n1. Macierz wypełniona liczbami 0 i 1.\n2. Macierz wypełniona liczbami od 1 do 50");
            choise = sc.nextInt();
        } while (!(choise == 1 || choise == 2));
        switch (choise) {
            case 1:
                matrix.fillMatrix();
                break;
            case 2:
                matrix.fillMatrix(50);
                break;
        }
        matrix.printMatrix();
        matrix.printMaxRowSum();
        sc.close();

    }
}
