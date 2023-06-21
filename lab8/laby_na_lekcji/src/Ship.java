public class Ship extends Vehicle implements Swim {

    public Ship(String name, int velocity) {
        super(name, velocity);

    }

    @Override
    public void swim() {
        System.out.println("Statek o nazwie: " + super.getName() + ", płynie z prędkością: " + super.getVelocity());
    }

}
