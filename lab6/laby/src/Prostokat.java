public class Prostokat {
    private double width, height;

    public Prostokat() {
        width = 123.45;
        height = 432.45;
    }

    public Prostokat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void print() {
        System.out.println("Prostokąt ma szerokość: " + width + " i wysokość: " + height);
    }

    public double calcArea() {
        return width * height;
    }

    public double calcPerimeter() {
        return 2 * width + 2 * height;
    }

}
