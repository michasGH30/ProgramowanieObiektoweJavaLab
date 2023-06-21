import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        Samochod samochod = new Samochod();
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        System.out.println("Wartości wczytane:");
        samochod.print();
        samochodOsobowy.print();

        System.out.println("Zapisuje do pliku:");

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objects.bin"));
            outputStream.writeObject(samochod);
            outputStream.writeObject(samochodOsobowy);
            outputStream.close();
        } catch (IOException e) {
            e.getMessage();
        }

        Samochod samochod2 = null;
        SamochodOsobowy samochodOsobowy2 = null;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("objects.bin"));
            samochod2 = (Samochod) inputStream.readObject();
            samochodOsobowy2 = (SamochodOsobowy) inputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Wczytuje i wypisuje z pliku:");

        samochod2.print();
        samochodOsobowy2.print();

    }
}
