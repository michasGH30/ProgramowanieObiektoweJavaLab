public class Ulamek {
    private int licznik, mianownik;

    public Ulamek() {
        licznik = 1;
        mianownik = 2;
    }

    public Ulamek(int l, int m) {
        licznik = l;
        mianownik = m;
    }

    public void print() {
        System.out.println("Ułamek: " + licznik + "/" + mianownik);
    }

    public float calc() {
        return (float) licznik / mianownik;
    }

    public Ulamek substract(Ulamek u) {
        if (mianownik != u.mianownik)
            return new Ulamek(licznik * u.mianownik - u.licznik * mianownik, mianownik * u.mianownik);
        return new Ulamek(licznik - u.licznik, mianownik);
    }

    public Ulamek multiply(Ulamek u) {
        return new Ulamek(licznik * u.licznik, mianownik * u.mianownik);
    }

    public boolean isBigger(Ulamek u) {
        if (calc() > u.calc())
            return true;
        return false;
    }

    public int NWD(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else if (b > a) {
                b -= a;
            }
        }
        return a;
    }

    public Ulamek skroc() {
        return new Ulamek(licznik / NWD(licznik, mianownik), mianownik / NWD(licznik, mianownik));
    }

}
