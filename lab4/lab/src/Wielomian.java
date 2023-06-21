import java.util.Random;

public class Wielomian {
    private int n;
    private float[] factors;

    public Wielomian(int n) {
        this.n = n;
        factors = new float[this.n + 1];
        Random rand = new Random();
        for (int i = 0; i < factors.length; i++) {
            factors[i] = rand.nextFloat() * 3.0f + 2.0f;
        }
    }

    public void print() {
        System.out.println("Współczynniki wielomianu:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print("a" + i + " = " + factors[i] + " ");
        }
        System.out.println();
    }

    public float calculate(float x) throws IllegalArgumentException {
        if (x > 120 || x < -100)
            throw new IllegalArgumentException("Podałeś argument większy niż 120 lub mniejszy niż -100!!!");
        float result = 0;
        for (int i = 0; i < factors.length; i++) {
            result += factors[i] * Math.pow(x, i);
        }
        return result;

    }

    public Wielomian add(Wielomian w) {
        int newn = Math.max(n, w.n);
        Wielomian result = new Wielomian(newn);
        for (int i = 0; i < Math.min(n, w.n) + 1; i++) {
            result.factors[i] = factors[i] + w.factors[i];
        }
        result.factors[Math.max(n, w.n)] = n > w.n ? factors[n] : w.factors[w.n];
        return result;
    }

    public Wielomian substract(Wielomian w) {
        int newn = Math.max(n, w.n);
        Wielomian result = new Wielomian(newn);
        for (int i = 0; i < Math.min(n, w.n) + 1; i++) {
            result.factors[i] = factors[i] - w.factors[i];
        }
        result.factors[Math.max(n, w.n)] = n > w.n ? factors[n] : w.factors[w.n];
        return result;
    }

    public Wielomian multiply(Wielomian w) {
        int stopienWyniku = n + w.n;
        Wielomian result = new Wielomian(stopienWyniku);

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w.n + 1; j++) {
                result.factors[i + j] += this.factors[i] * w.factors[j];
            }
        }

        return result;
    }
}
