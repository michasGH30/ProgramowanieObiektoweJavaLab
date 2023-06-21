import java.util.ArrayList;
import java.util.List;

public class Garage {
    private String address;
    private int numberOfPlaces;
    private int count;
    private List<Car> list = new ArrayList<>();

    public Garage(String address, int numberOfPlaces) {
        this.address = address;
        this.numberOfPlaces = numberOfPlaces;
        count = 0;
    }

    public Garage() {
        address = "Siedlce, ul. 3 Maja 70";
        numberOfPlaces = 3;
        count = 0;
    }

    public void carEnter(Car car) {
        if (count + 1 <= numberOfPlaces) {
            System.out.println("Do garażu wjeżdża samochód: ");
            car.info();
            count++;
            list.add(car);
        } else {
            System.out.println("Garaż nie pomieści więcej samochodów.");
        }
    }

    public Car carOut(double distance, double pricePerLitr) throws Exception {
        if (count - 1 > -1) {
            System.out.println(
                    "Z garażu wyjeżdża samochód w trasę: " + distance + ", przy cenie za litr paliwa: " + pricePerLitr
                            + " zł. Bedzie go to kosztowało: ");
            count--;
            Car toReturn = list.get(count);
            System.out.println(toReturn.calcFare(distance, pricePerLitr) + " zł");
            list.remove(count);
            return toReturn;

        } else {
            System.out.println("Garaż jest pusty.");
            throw new Exception();
        }

    }

    public void info() {
        System.out.println("Garaż mieści się pod adresem: " + address + ", posiada maksymalnie: " + numberOfPlaces
                + ", miejsc, obecnie znajdują się w nim: " + count + ", samochodów o numeracj rejestracyjnych: ");
        for (Car car : list) {
            System.out.println(car.getRegistrationNumber());
        }
    }
}
