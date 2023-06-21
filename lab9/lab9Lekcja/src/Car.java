public class Car {
    private String marka;
    private String model;
    private int doorsCount;
    private double engineCapacity;
    private double avgCombustion;
    private String registrationNumber;
    private static int ID;

    public Car(String marka, String model, int doorsCount, double engineCapacity, double avgCombustion,
            String registrationNumber) {
        this.marka = marka;
        this.model = model;
        this.doorsCount = doorsCount;
        this.engineCapacity = engineCapacity;
        this.avgCombustion = avgCombustion;
        this.registrationNumber = registrationNumber;
        ID++;
    }

    public Car() {
        marka = "Opel";
        model = "Corsa";
        doorsCount = 5;
        engineCapacity = 1.2;
        avgCombustion = 13;
        registrationNumber = "AA AAAA";
        ID++;
    }

    public double calcCombustion(double distance) {
        return avgCombustion * distance / 100.0;
    }

    public double calcFare(double distance, double pricePerLitr) {
        return pricePerLitr * calcCombustion(distance);
    }

    public void info() {
        System.out.println("Samochód o marce " + marka + ", model: " + model + ", posiada drzwi: " + doorsCount
                + ", średnio spala: " + avgCombustion + "l na 100 km, ma pojemność silnika: " + engineCapacity
                + "l, jego, numer rejestracyjny to: " + registrationNumber + ", ma ID: " + ID);
    }

    public int getID() {
        return ID;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

}
