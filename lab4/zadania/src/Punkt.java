public class Punkt {
    private int x, y;

    public Punkt() {
        x = 1;
        y = 1;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setZero() {
        x = 0;
        y = 0;
    }

    public void move(int n, int m) {
        x += n;
        y += m;
    }

    public String toString() {
        return "Punkt ma współrzędne x: " + x + " y: " + y;
    }
}
