public class Pracownik extends Osoba {
    private float pobory1, podobry2, pobory3;
    private float waga1, waga2;

    public Pracownik(String imie, String nazwisko, float pobory1, float podobry2, float pobory3, float waga1,
            float waga2) {
        super(imie, nazwisko);
        this.pobory1 = pobory1;
        this.podobry2 = podobry2;
        this.pobory3 = pobory3;
        this.waga1 = waga1;
        this.waga2 = waga2;
    }

    public float srednia() {
        return 10.0f;
    }

    public String napis() {
        return super.getNazwisko() + " " + srednia();
    }
}
