import java.util.Scanner;

public class Tablica {
    private int n;
    private int len;
    private String[] arr;

    public Tablica(int n) {
        len = 0;
        this.n = n;
        arr = new String[this.n];
    }

    public void enterToArray() {
        System.out.println("Podaj wyrazy:");
        Scanner sc = new Scanner(System.in);
        while (len < n) {
            arr[len] = sc.next();
            len++;
        }
        sc.close();
    }

    public void printArray() {
        System.out.println("Wypisuje tablicę:");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public void printStartWithLetter(int number) {
        System.out.println("Wypisuje wyrazy zaczynające się z wielkich liter:");
        for (String s : arr) {
            if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
                System.out.println(s);
            }
        }
    }
}
