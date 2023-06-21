public class Hydroplan extends Vehicle implements Swim, Fly {

    public Hydroplan(String name, int velocity) {
        super(name, velocity);
    }

    @Override
    public void fly() {
        System.out.println("Hydroplan o nazwie: " + super.getName() + " leci z prędkością: " + super.getVelocity());
    }

    @Override
    public void swim() {
        System.out.println("Hydroplan o nazwie: " + super.getName() + " płynie z prędkością: " + super.getVelocity());
    }

}
