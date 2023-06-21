// Zdefiniuj klasę Pracownik dziedziczącą po Osoba o dodatkowych polach:
// • firma,
// • stanowisko,
// • pobory_brutto,
// • ukończone_kursy (max 5).
// Zdefiniuj konstruktory i metody info() - zwraca tekst: " Pracownik na stanowisku ukończył kursy .;
// oblicz() – wypłatę (pobory_brutto - 19% .podatku), podatek liczony od poborów brutto

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {

    private String company;

    private String position;

    private double salaryBrutto;

    private List<String> courses;

    public Employee(String name, String surname, String city) {
        super(name, surname, city);
        courses = new ArrayList<>();
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalaryBrutto(double salaryBrutto) {
        this.salaryBrutto = salaryBrutto;
    }

    public void addCourse(String name) {
        courses.add(name);
    }

    @Override
    public String info() {
        return "Pracownik o imieniu: " + super.getName() + ", nazwisku: " + super.getSurname()
                + ", mieszka w miejscowości: " + super.getCity() + ", pracuje w firmie: "
                + company + ", na stanowisku: " + position + ", zarabia brutto: " + salaryBrutto + "zł, zarabia netto: "
                + calc() + "zł, kursy jakie ukończył: " + courses;
    }

    @Override
    public double calc() {
        return salaryBrutto * 0.81;
    }

}
