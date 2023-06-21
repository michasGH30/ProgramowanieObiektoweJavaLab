import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.InputMismatchException;

public class Samochod implements Serializable {
    protected String model;
    protected float waga;

    public Samochod() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj model:");
            model = reader.readLine();
            System.out.println("Podaj wagę float:");
            waga = Float.parseFloat(reader.readLine());
        } catch (InputMismatchException | NumberFormatException e) {
            waga = 1500.23f;
        } catch (IOException e) {
            e.getMessage();
        }

    }

    public Samochod(String model, float waga) {
        this.model = model;
        this.waga = waga;
    }

    public void print() {
        System.out.println("Model: " + model + " waga: " + waga);
    }
}