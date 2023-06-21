import java.io.Serializable;

public class Client implements Serializable, PrintInfo {
    private String name;
    private String surname;
    private String ID;

    public Client(String name, String surname, String iD) {
        this.name = name;
        this.surname = surname;
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }

    @Override
    public void info() {
        System.out.println("Klient.");
        System.out.println("Klient nazywa się: " + name + " " + surname + ", ma ID: " + ID);
    }

}
