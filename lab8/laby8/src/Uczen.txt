public class Uczen extends Osoba {
    private float ocena1, ocena2, ocena3;
    private float waga1, waga2, waga3;

    public Uczen(String imie, String nazwisko, float ocean1, float ocena2, float ocena3, float waga1, float waga2,
            float waga3) {
        super(imie, nazwisko);
        this.ocena1 = ocean1;
        this.ocena2 = ocena2;
        this.ocena3 = ocena3;
        this.waga1 = waga1;
        this.waga2 = waga2;
        this.waga3 = waga3;
    }

    public float srednia() {
        return (ocena1 * waga1 + ocena2 * waga2 + ocena3 * waga3) / (waga1 + waga2 + waga3);
    }

    public String info() {
        return super.getImie() + " " + super.getNazwisko() + " " + srednia();
    }
}
