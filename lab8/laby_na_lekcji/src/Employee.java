public class Employee extends Pearson {

    private float salary1, salary2, salary3;

    public Employee(String name, String surname, float salary1, float salary2, float salary3) {
        super(name, surname);
        this.salary1 = salary1;
        this.salary2 = salary2;
        this.salary3 = salary3;
    }

    public float avg() {
        return (salary1 + salary2 + salary3) / (3.0f);
    }

    public String info() {
        return "Pracownik o imieniu: " + super.getName() + ", nazwisku: " + super.getSurname()
                + ", o średnich zarobkach: " + avg() + " zł";
    }

}
