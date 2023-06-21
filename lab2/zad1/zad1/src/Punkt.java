public class Punkt {
    private int x;
    private int y;

    public Punkt(int xp, int yp) {
        x = xp;
        y = yp;
    }

    public Punkt() {
        x = 10;
        y = 10;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
