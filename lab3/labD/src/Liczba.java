import java.util.Random;

public class Liczba {
    private int liczba, a, b;

    public Liczba() {
        Random rand = new Random();
        liczba = rand.nextInt(1, 100);
    }

    public Liczba(int a, int b) {
        this.a = a;
        this.b = b;
        Random rand = new Random();
        liczba = rand.nextInt(a, b);
    }

    public int getLiczba() {
        return liczba;
    }

    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i < liczba; i++) {
            if (liczba % i == 0) {
                sum += i;
            }
        }
        if (sum == liczba) {
            return true;
        }
        return false;
    }

}
