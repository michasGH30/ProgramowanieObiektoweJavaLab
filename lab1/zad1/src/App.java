import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // zad2
        // System.out.println("Witaj");

        // zad3
        // int a = 5;
        // System.out.println("a = " + a + ", a^3 = " + (int) Math.pow(a, 3) + ",
        // a^(0.5) = " + Math.sqrt(a));
        // System.out
        // .println("a + 1 = " + (int) (a + 1) + ", a^3 = " + (int) Math.pow(a + 1, 3) +
        // ", a^(0.5) = "
        // + Math.sqrt(a + 1));

        // zad4
        // float a = (float) 125.25;
        // float b = (float) -23.12;
        // if (a > b) {
        // System.out.println(a + " jest większa niż " + b);
        // } else {
        // System.out.println(b + " jest większa niż " + a);
        // }

        // zad5
        // for (int i = 0; i < 10; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // System.out.println("Mój program w Javie");
        // }

        // zad6
        // System.out.print("a/b ");
        // for (int i = 1; i <= 10; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.print('\n');

        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= 10; j++) {
        // if (j == 1) {
        // System.out.print(i + " ");
        // } else {
        // System.out.print(i * j + " ");
        // }

        // }
        // System.out.print('\n');
        // }

        Scanner sc = new Scanner(System.in);

        // zad 3 scanner
        System.out.println("Podaj liczbę:");
        int a = sc.nextInt();
        System.out.println("a = " + a + ", a^3 = " + (int) Math.pow(a, 3) + ",a^(0.5)= " + Math.sqrt(a));
        System.out
                .println("a + 1 = " + (int) (a + 1) + ", a^3 = " + (int) Math.pow(a + 1, 3) +
                        ", a^(0.5) = "
                        + Math.sqrt(a + 1));

        // zad4 scanner
        // System.out.println("Podaj a:");
        // float a = sc.nextFloat();
        // System.out.println("Podaj b:");
        // float b = sc.nextFloat();
        // if (a > b) {
        // System.out.println(a + " jest większa niż " + b);
        // } else {
        // System.out.println(b + " jest większa niż " + a);
        // }

        sc.close();

    }
}
