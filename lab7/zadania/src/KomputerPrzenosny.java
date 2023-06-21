import java.util.Scanner;

public class KomputerPrzenosny extends Komputer {
    private String battery;
    private float weight;
    private boolean Bluetooth;

    public KomputerPrzenosny() {
        super("a", "b", "c", "d", "e", "f");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj producenta: ");
        producent = sc.nextLine();
        System.out.println("Podaj model komputera: ");
        model = sc.nextLine();
        System.out.println("Podaj kartę graficzną: ");
        motherboard = sc.nextLine();
        System.out.println("Podaj processor: ");
        processor = sc.nextLine();
        System.out.println("Podaj kartę graficzną: ");
        graphicsCard = sc.nextLine();
        System.out.println("Podaj model dysku twardego: ");
        storage = sc.nextLine();
        System.out.println("Podaj model baterii: ");
        battery = sc.nextLine();
        int choise = -1;
        while (!(choise == 1 || choise == 2)) {
            System.out.println("Posiada Bluetooth: 1. Tak. 2. Nie: ");
            choise = sc.nextInt();
        }
        if (choise == 1)
            Bluetooth = true;
        else
            Bluetooth = false;
        try {
            System.out.println("Podaj wagę(1,2 - 3,5)[kg]: ");
            weight = sc.nextFloat();
            if (weight < 1.2 || weight > 3.5)
                throw new IncorrectWageException("Podałeś wagę poza zakresem waga zostanie ustawiona na 2,5 kg.");
        } catch (IncorrectWageException e) {
            System.out.println(e.getMessage());
            weight = 2.5f;
        }
    }

    public void print() {
        System.out.println("Komputer: " + producent + " " + model + " " + motherboard + " " + processor + " "
                + graphicsCard + " " + storage + " " + battery + " " + weight + " " + Bluetooth);
    }

}
