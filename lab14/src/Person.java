public abstract class Person {
    private String name;
    private String surname;

    public abstract String info();

    public abstract double calc();

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public Person(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public Person() {
        name = "Michał";
        surname = "Żuk";
        city = "Siedlce";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

}
