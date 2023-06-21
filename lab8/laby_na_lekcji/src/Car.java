public class Car extends Vehicle implements Drive {

    private String brand;
    private int mileage;

    public Car(String name, int velocity, String brand, int mileage) {
        super(name, velocity);
        this.brand = brand;
        this.mileage = mileage;
    }

    @Override
    public void drive(int distance) throws Exception {
        if (distance < 0)
            throw new Exception("Droga nie może być ujemna!!!.");
        System.out.println("Samochód o nazwie: " + super.getName() + " i marce: " + brand + " przjechał: " + distance
                + "km z prędkością: "
                + super.getVelocity() + ", jego przebieg wynosi teraz: " + (mileage + distance));
        mileage += distance;
    }
}
