import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class SamochodOsobowy extends Samochod {
    private int count;

    public SamochodOsobowy() {
        super();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj ilość osób:");
            waga = Integer.parseInt(reader.readLine());
        } catch (InputMismatchException e) {
            waga = 1500.23f;
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void print() {
        System.out.println("Model: " + model + " waga: " + waga + " ilość osób: " + count);
    }
}
