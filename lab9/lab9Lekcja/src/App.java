public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Toyota", "Supra", 5, 2.0, 20.4, "AA AAA");
        Car car2 = new Car("BMW", "M3", 5, 2.5, 13.4, "BB BBB");
        Car car3 = new Car("Volskwagen", "Passat", 5, 1.9, 9.4, "CC CCC");
        Car car4 = new Car("Honda", "Civic", 5, 2.0, 14.8, "DD DDD");

        Person person = new Person();
        person.addCar(car1.getRegistrationNumber());
        person.addCar(car2.getRegistrationNumber());
        person.addCar(car3.getRegistrationNumber());
        person.addCar(car4.getRegistrationNumber());
        person.info();
        person.removeCar(car3.getRegistrationNumber());
        person.removeCar("DDD");
        person.info();

        Person person2 = new Person("Tomasz", "Koło", "Warszawa ul. Secemiścka 9/21");
        person2.removeCar(car1.getRegistrationNumber());
        person2.addCar(car3.getRegistrationNumber());
        person2.addCar(car4.getRegistrationNumber());
        person2.info();

        Garage garage = new Garage();
        garage.carEnter(car1);
        garage.carEnter(car2);
        garage.carEnter(car3);
        garage.carEnter(car4);

        try {
            garage.carOut(12, 5.4).info();
            garage.carOut(54.5, 7.56).info();
            garage.carOut(120.34, 3.54).info();
            garage.carOut(1.5, 20.0).info();
        } catch (Exception e) {
        }

        garage.info();
    }
}
