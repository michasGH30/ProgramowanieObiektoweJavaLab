import java.util.Scanner;

public class Pracownik {
    protected String name, surname, dateOfBirth, dateOfHiring, department;
    protected float salary;

    public Pracownik() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        name = sc.next();
        System.out.println("Podaj nazwisko:");
        surname = sc.next();
        System.out.println("Podaj datę urodzin(DD-MM-YYYY):");
        dateOfBirth = sc.next();
        System.out.println("Podaj datę dołączenia do firmy(DD-MM-YYYY):");
        dateOfHiring = sc.next();
        System.out.println("Podaj dział:");
        department = sc.next();
        System.out.println("Podaj wynagrodzenie:");
        salary = sc.nextFloat();
    }

    public void print() {
        System.out.println("Pracownik: " + name + " " + surname + " " + dateOfBirth + " " + dateOfHiring + " "
                + department + " " + salary);
    }

}
