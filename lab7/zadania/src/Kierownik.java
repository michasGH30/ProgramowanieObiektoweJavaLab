import java.io.Serializable;
import java.util.Scanner;

public class Kierownik extends Pracownik implements Serializable {
    private int countOfWorkers;
    private String typeOfManager;
    private float supplement;

    public Kierownik() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość pracowników:");
        countOfWorkers = sc.nextInt();
        System.out.println("Podaj jakim jesteś kierownikiem:");
        typeOfManager = sc.next();
        System.out.println("Podaj dodatek funkcyjny w %:");
        supplement = sc.nextFloat();
    }

    public void print() {
        System.out.println("Pracownik: " + name + " " + surname + " " + dateOfBirth + " " + dateOfHiring + " "
                + department + " " + salary + " " + countOfWorkers + " " + typeOfManager + " " + supplement);
    }

    public void addNewWorker() {
        countOfWorkers++;
    }
}
