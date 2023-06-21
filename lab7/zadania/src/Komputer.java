import java.util.Scanner;

public class Komputer {
    protected String producent, model, motherboard, processor, graphicsCard, storage;

    public Komputer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj producenta: ");
        producent = sc.nextLine();
        System.out.println("Podaj model komputera: ");
        model = sc.nextLine();
        System.out.println("Podaj płytę główną: ");
        motherboard = sc.nextLine();
        System.out.println("Podaj processor: ");
        processor = sc.nextLine();
        System.out.println("Podaj kartę graficzną: ");
        graphicsCard = sc.nextLine();
        System.out.println("Podaj model dysku twardego: ");
        storage = sc.nextLine();
    }

    public Komputer(String producent, String model, String motherboard, String processor, String graphicsCard,
            String storage) {
        this.producent = producent;
        this.model = model;
        this.motherboard = motherboard;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.storage = storage;
    }

    public void print() {
        System.out.println("Komputer: " + producent + " " + model + " " + motherboard + " " + processor + " "
                + graphicsCard + " " + storage);
    }

}
