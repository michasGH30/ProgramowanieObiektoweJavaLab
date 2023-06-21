// Zdefiniuj klasę Osoba o polach
// • imie,
// • nazwisko,
// • wzrost ( w cm),
// • waga (w kg),
// • konstruktorze z argumentami
// i metodzie BMI:
// oraz wypisz dane – wypisuje dane osoby, w tym wzrost, wagę i BMI
// i ewentualnych innych Twoim zdaniem niezbędnych metodach.. 

public class Person {
    private String name;
    private String surname;
    private float heigth;
    private float weight;

    public Person(String name, String surname, float heigth, float weight) {
        this.name = name;
        this.surname = surname;
        this.heigth = heigth;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float BMI() {
        return weight / (heigth * heigth);
    }

}
