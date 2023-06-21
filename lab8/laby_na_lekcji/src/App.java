import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        // zad2();
        // zad5();
    }

    public static void zad2() {
        System.out.println("Dane z utworzonych obiektów:");
        Student studentTest = new Student("Test", "Test", 3.75f, 4.5f, 5.5f, 0.5f, 0.5f, 0.3f);
        System.out.println(studentTest.info());
        Student student = new Student("Adam", "Kowalski", 4.5f, 3.75f, 5.0F, 0.2f, 0.7f, 0.1f);
        System.out.println(student.info());
        Employee employee = new Employee("Tomasz", "Kot", 3456.31f, 5431.76f, 3452.76f);
        System.out.println(employee.info());
        System.out.println("Zapisuje do pliku:");

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("zad2.bin"));
            objectOutputStream.writeObject(student);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("Dane odczytane z pliku:");

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("zad2.bin"));
            Student student2 = (Student) objectInputStream.readObject();
            System.out.println(student2.info());
            Employee employee2 = (Employee) objectInputStream.readObject();
            System.out.println(employee2.info());
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void zad5() {
        Car car = new Car("Tomek", 60, "Toyota", 123);
        Hydroplan hydroplan = new Hydroplan("Adma", 120);
        Drive R1 = car;
        Fly R2 = hydroplan;

        try {
            R1.drive(120);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            R1.drive(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        R2.fly();
    }
}
