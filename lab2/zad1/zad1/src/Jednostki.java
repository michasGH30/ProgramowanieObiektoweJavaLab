public class Jednostki {
    private double dlugosc;
    private double waga;
    private double waluta;

    public Jednostki(double dlugosc, double waga, double waluta) {
        this.dlugosc = dlugosc;
        this.waga = waga;
        this.waluta = waluta;
    }

    public Jednostki() {
        this.dlugosc = 100;
        this.waga = 100;
        this.waluta = 100;
    }

    public Jednostki(Jednostki j) {
        this.dlugosc = j.dlugosc;
        this.waga = j.waga;
        this.waluta = j.waluta;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public void setWaluta(double waluta) {
        this.waluta = waluta;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public double getWaga() {
        return waga;
    }

    public double getWaluta() {
        return waluta;
    }

    public void wypisz() {
        System.out.println("dl = " + this.dlugosc + " waga = " + this.getWaga() + " waluta = " + this.getWaluta());
    }

    public void naCale() {
        this.dlugosc *= 0.3937;
    }

    public void naFunty() {
        this.waga /= 0.45359237;
    }

    public void naEuro() {
        this.waluta *= 0.213;
    }

}
