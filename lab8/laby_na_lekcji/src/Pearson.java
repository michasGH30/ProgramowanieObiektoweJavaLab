import java.io.Serializable;

public abstract class Pearson implements Serializable {

    private String name, surname;

    public Pearson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
