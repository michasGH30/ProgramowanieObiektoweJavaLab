import java.util.Scanner;

public class Osoba {
    private String nazwisko;
    private int rok, miesiac, dzien;
    private int numer;
    private double pensja;

    public Osoba(String n, int r, int m, int d, int num, double p) {
        nazwisko = n;
        rok = r;
        miesiac = m;
        dzien = d;
        numer = num;
        pensja = p;
    }

    public Osoba() {
        nazwisko = "nazwisko";
        rok = 2000;
        miesiac = 1;
        dzien = 1;
        numer = 1;
        pensja = 1.0;
    }

    public Osoba(Osoba o) {
        nazwisko = o.nazwisko;
        rok = o.rok;
        miesiac = o.miesiac;
        dzien = o.dzien;
        numer = o.numer;
        pensja = o.pensja;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRok() {
        return rok;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public int getDzien() {
        return dzien;
    }

    public int getNumer() {
        return numer;
    }

    public double getPensja() {
        return pensja;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public void losowe() {
        nazwisko = "nazwisko" + (int) (Math.random() * 100.0);
        ;
        rok = (int) (Math.random() * 38.0 + 1980.0);
        miesiac = (int) (Math.random() * 11.0 + 1.0);
        switch (miesiac) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dzien = (int) (Math.random() * 30.0 + 1.0);
                break;
            case 2:
                dzien = (int) (Math.random() * 27.0 + 1.0);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dzien = (int) (Math.random() * 29.0 + 1.0);
        }
        numer = (int) (Math.random() * 99.0 + 1.0);
        pensja = (int) (Math.random() * 5000.0 + 3000.0);
    }

    public void wypisz() {
        System.out.println("Osoba o nazwisku: " + nazwisko + ", data urodzenia: " + dzien + "/" + miesiac + "/" + rok
                + ", Numer = " + numer + ", Pensja: " + pensja);
    }

    public void podaj_dane() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwisko: ");
        nazwisko = sc.nextLine();
        System.out.println("Podaj rok urodzenia: ");
        rok = sc.nextInt();
        do {
            System.out.println("Podaj miesiąć urodzenia: ");
            miesiac = sc.nextInt();
        } while (miesiac < 1 || miesiac > 12);

        boolean poprawny = false;
        do {
            System.out.println("Podaj dzień urodzenia: ");
            dzien = sc.nextInt();
            if (dzien >= 1) {
                switch (miesiac) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (dzien <= 31)
                            poprawny = true;
                        break;
                    case 2:
                        if (dzien <= 28)
                            poprawny = true;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dzien <= 30)
                            poprawny = true;
                }
            }
        } while (!poprawny);

        System.out.println("Podaj numer ID: ");
        numer = sc.nextInt();
        System.out.println("Podaj pensję: ");
        pensja = sc.nextDouble();
        sc.close();
    }
}
