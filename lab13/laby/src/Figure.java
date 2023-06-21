public abstract class Figure {
    private float area;
    private int length;

    public Figure() {
        length = 10;
    }

    public float getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract void info();

    public abstract void calcArea();

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

}