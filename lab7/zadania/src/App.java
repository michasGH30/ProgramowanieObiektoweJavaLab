import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        // zad1();
        zad2();
    }

    public static void zad1() {
        Komputer k1 = new Komputer();
        k1.print();

        Komputer k2 = new Komputer("null", "null", "null", "null", "null", "null");
        k2.print();

        KomputerPrzenosny k3 = new KomputerPrzenosny();
        k3.print();
    }

    public static void zad2() {
        Kierownik k = new Kierownik();
        // k.print();

        // Pracownik p1 = new Pracownik();
        // Pracownik p2 = new Pracownik();
        // Pracownik p3 = new Pracownik();

        // p1.print();
        // p2.print();
        // p3.print();

        ObjectOutputStream o = null;
        try {
            o = new ObjectOutputStream(new FileOutputStream("test.ser"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            o.writeObject(k);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            o.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Kierownik obj = null;
        try (ObjectInputStream b = new ObjectInputStream(new FileInputStream("test.ser"))) {
            obj = (Kierownik) b.readObject();
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        obj.print();

    }
}
