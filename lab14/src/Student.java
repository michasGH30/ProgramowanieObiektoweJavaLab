// Zdefiniuj klasę Student dziedziczącą po klasie Osoba o dodatkowych polach: Uczelnia,
// kierunek, tablica ocen z egzaminu (max 5).
// Zdefiniuj konstruktory i metody info() - zwraca tekst : Student kierunku ; oblicz() – oblicza średnią z
// ocen.

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String university;

    private String major;

    private List<Integer> grades;

    public Student(String name, String surname, String city) {
        super(name, surname, city);
        grades = new ArrayList<>();
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public String info() {
        return "Student o imieniu: " + super.getName() + ", nazwisku: " + super.getSurname()
                + ", mieszka w miejscowości: " + super.getCity() + ", studiuje na uczelni: "
                + university + ", na kierunku: " + major + ", ma średnią: " + calc();
    }

    @Override
    public double calc() {
        double avg = 0.0f;
        for (Integer integer : grades) {
            avg += (double) integer;
        }
        avg /= (double) grades.size();
        return avg;
    }

}
