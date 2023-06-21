public class Square extends Figure {

    public Square() {
        super();
    }

    @Override
    public void info() {
        calcArea();
        System.out.println("Kwadrat o długości: " + super.getLength() + ", i polu: " + super.getArea());
    }

    @Override
    public void calcArea() {
        super.setArea(super.getLength() * super.getLength());
    }

}
