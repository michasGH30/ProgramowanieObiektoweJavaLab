public class Plane extends Vehicle implements Fly {

    public Plane(String name, int velocity) {
        super(name, velocity);

    }

    @Override
    public void fly() {
        System.out.println("Samolot o nazwie: " + super.getName() + ", leci z prędkością: " + super.getVelocity());
    }

}
