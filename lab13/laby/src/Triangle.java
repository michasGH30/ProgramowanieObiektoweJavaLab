public class Triangle extends Figure {

    public Triangle() {
        super();
    }

    @Override
    public void info() {
        calcArea();
        System.out.println("Trójkąt o długości: " + super.getLength() + ", i polu: " + super.getArea());
    }

    @Override
    public void calcArea() {
        super.setArea((float) (Math.pow(super.getLength(), 2) * Math.sqrt(3) / 4));
    }

}
