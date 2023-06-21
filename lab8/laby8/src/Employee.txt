public class Employee extends Person {
    private int yearsOfWork;
    private double salary;

    public Employee() {
        super();
        yearsOfWork = 5;
        salary = 1234.56;
    }

    public Employee(String name, String surname, int yearsOfWork, double salary) {
        super(name, surname);
        this.yearsOfWork = yearsOfWork;
        this.salary = salary;
    }

    public void print() {
        System.out.println("Imię: " + getName() + ", Nazwisko: " + getSurname() + ", Lata pracy: "
                + yearsOfWork + ", Wypłata: " + salary);
    }

}
