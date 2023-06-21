public class Student extends Pearson {

    private float grade1, grade2, grade3;
    private float weigth1, weigth2, weight3;

    public Student(String name, String surname, float grade1, float grade2, float grade3, float weigth1, float weigth2,
            float weight3) {
        super(name, surname);
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        try {
            checkWeights(weigth1, weigth2, weight3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            this.weigth1 = 0.3f;
            this.weigth2 = 0.3f;
            this.weight3 = 0.1f;
        }
    }

    private void checkWeights(float weigth1, float weigth2, float weigth3) throws Exception {
        if (weigth1 > 1 || weigth1 < 0 || weigth2 > 1 || weigth2 < 0 || weigth3 > 1 || weigth3 < 0
                || weigth1 + weigth2 + weigth3 > 1) {
            throw new Exception("Niepoprawne wagi ocen!!! Ustawienia domyślnych wag.");
        } else {
            this.weigth1 = weigth1;
            this.weigth2 = weigth2;
            this.weigth1 = weigth3;
        }
    }

    public float avg() {
        return (grade1 * weigth1 + grade2 * weigth2 + grade3 * weight3) / (weigth1 + weigth2 + weight3);
    }

    public String info() {
        return "Uczeń o imieniu: " + super.getName() + ", nazwisku: " + super.getSurname() + ", o średniej: " + avg();
    }

}
