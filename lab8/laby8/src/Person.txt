public abstract class Person {
    private String name, surname;
    private static int ID;

    public Person() {
        name = "Jan";
        surname = "Kowalski";
        ID += 1;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        ID += 1;
    }

    public static int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract void print();
}
