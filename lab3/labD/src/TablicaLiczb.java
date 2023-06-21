public class TablicaLiczb {
    private int n;
    Liczba[] arr;

    public TablicaLiczb(int n) {
        this.n = n;
        arr = new Liczba[this.n];
    }

    public void generateNumbers() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Liczba();
        }
    }

    public void printNumbers() {
        System.out.println("Wypisje liczby:");
        for (Liczba liczba : arr) {
            System.out.println(liczba.getLiczba());
        }
    }

    public void printPerfectNumbers() {
        System.out.println("Wypisuje liczby doskonałe:");
        for (Liczba liczba : arr) {
            if (liczba.isPerfect()) {
                System.out.println("Liczba " + liczba.getLiczba() + " jest doskonała");
            }
        }
    }
}
