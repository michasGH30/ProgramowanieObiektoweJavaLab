public class Train extends Vehicle implements Drive {

    public Train(String name, int velocity) {
        super(name, velocity);

    }

    @Override
    public void drive(int distance) throws Exception {
        if (distance < 0)
            throw new Exception("Droga nie może być ujemna!!!.");
        System.out.println("Pociąg o nazwie: " + super.getName() + " jedzie z prędkością: " + super.getVelocity());
    }

}
