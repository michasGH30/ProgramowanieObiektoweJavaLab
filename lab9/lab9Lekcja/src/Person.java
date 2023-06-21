public class Person {
    private String name;
    private String surname;
    private String homeAddress;
    private int countOfCars;
    private String[] numbers;

    public Person(String name, String surname, String homeAddress) {
        this.name = name;
        this.surname = surname;
        this.homeAddress = homeAddress;
        countOfCars = -1;
        numbers = new String[3];
    }

    public Person() {
        name = "Michał";
        surname = "Żuk";
        homeAddress = "Siedlce, ul 3 Maja 49/301";
        countOfCars = -1;
        numbers = new String[3];
    }

    public void info() {
        System.out.println("Osoba ma imię: " + name + ", nazwisko: " + surname + ", mieszka pod adresem: " + homeAddress
                + ", posiada: " + (countOfCars + 1) + " samochodów: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null) {
                System.out.println(numbers[i]);
            }
        }
    }

    public void addCar(String registrationNumber) {
        if (countOfCars + 1 < 3) {
            numbers[countOfCars + 1] = registrationNumber;
            countOfCars++;
            System.out.println("Dodano samochód o numerze rejestracyjnym: " + registrationNumber);
        } else {
            System.out.println("Maksymalna ilość samochodów to 3.");
        }
    }

    public void removeCar(String registrationNumber) {
        if (countOfCars - 1 >= -1) {
            boolean isIn = false;
            for (int i = 0; i < numbers.length; i++) {
                if (registrationNumber == numbers[i]) {
                    numbers[i] = null;
                    isIn = true;
                }
            }
            if (isIn) {
                System.out.println("Nie posiadasz już samochodu o numerze rejstracyjnym: " + registrationNumber);
                countOfCars--;
            }

            else
                System.out.println("Nie posiadasz samochodu o takim numerze rejestracyjnym.");
        } else {
            System.out.println("Nie możesz usunąć samochodu, skoro żadnego nie posiadasz.");
        }

    }
}
