public class Prostokat {
    private int x, y, szerokosc, wysokosc;

    public Prostokat(int x_p, int y_p, int s, int w) {
        x = x_p;
        y = y_p;
        szerokosc = s;
        wysokosc = w;
    }

    public Prostokat() {
        x = 1;
        y = 2;
        szerokosc = 10;
        wysokosc = 15;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void wypisz() {
        System.out.println("Prostokąt o wierzchołku: x = " + x + ", y = " + y + ", szerokości = " + szerokosc
                + ", wysokości = " + wysokosc);
    }

    public int obliczPole() {
        return wysokosc * szerokosc;
    }

    public int obliczObwod() {
        return wysokosc * 2 + szerokosc * 2;
    }

    public boolean wiekszy(Prostokat p) {
        if (obliczPole() > p.obliczPole()) {
            System.out.println("Nasz prostokąt jest większy");
            return true;
        }
        System.out.println("Podany prostokąt jest większy");
        return false;
    }

    public boolean punktWewnatrz(int xp, int yp) {
        if (xp > x && x + szerokosc > xp) {
            if (yp > y && y + wysokosc > yp) {
                System.out.println("Punkt x = " + xp + " y = " + y + " znajduje się na naszym prostokącie");
                return true;
            }
        }
        System.out.println("Punkt x = " + xp + " y = " + y + " nie znajduje się na naszym prostokącie");
        return false;
    }

    public boolean punktWewnatrzKlasa(Punkt p) {
        if (p.getX() > x && x + szerokosc > p.getX()) {
            if (p.getY() > y && y + wysokosc > p.getY()) {
                System.out
                        .println("Punkt x = " + p.getX() + " y = " + p.getY() + " znajduje się na naszym prostokącie");
                return true;
            }
        }
        System.out
                .println("Punkt x = " + p.getX() + " y = " + p.getY() + " nie znajduje się na naszym prostokącie");
        return false;
    }
}
