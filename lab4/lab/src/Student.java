public class Student {
    private String nazwisko;
    private int wiek;
    private float ocena1;
    private float ocena2;

    public Student() {
        nazwisko = "Nazwisko";
        wiek = 20;
        ocena1 = 3;
        ocena2 = 4;

    }

    public Student(String nazwisko, int wiek, int ocena1, int ocena2) {
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
    }

    public Student(Student s) {
        nazwisko = s.nazwisko;
        wiek = s.wiek;
        ocena1 = s.ocena1;
        ocena2 = s.ocena2;

    }

    public float avg() {
        return (float) (ocena1 + ocena2) / 2;
    }

    public void print() {
        System.out.println("Nazwisko studenta: " + nazwisko);
        System.out.println("Wiek studenta: " + wiek);
        System.out.println("Ocena 1: " + ocena1);
        System.out.println("Ocena 2: " + ocena2);
        System.out.println("Średnia ocen: " + avg());
    }

    public void setOcena(double ocena) throws IllegalArgumentException {
        if (ocena < 2 || ocena > 5)
            throw new IllegalArgumentException("Podałeś oceną z poza zakresu!!!");
        ocena1 = (float) ocena;
    }

    public void setOcena(double o1, double o2) throws IllegalArgumentException {
        if (o1 < 2 || o1 > 5)
            throw new IllegalArgumentException("Podałeś oceną 1 z poza zakresu!!!");
        if (o2 < 2 || o2 > 5)
            throw new IllegalArgumentException("Podałeś oceną 2 z poza zakresu!!!");
        ocena1 = (float) o1;
        ocena2 = (float) o2;
    }

    public float avg(float w1, float w2) {
        return (ocena1 * w1 + ocena2 * w2) / (w1 + w2);
    }

}
