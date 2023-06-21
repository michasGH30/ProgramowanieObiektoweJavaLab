public class Circle extends Figure {

    public Circle() {
        super();
    }

    @Override
    public void info() {
        calcArea();
        System.out.println("Koło o długości: " + super.getLength() + ", i polu: " + super.getArea());
    }

    @Override
    public void calcArea() {
        super.setArea((float) (Math.PI * Math.pow(super.getLength(), 2)));
    }

}
