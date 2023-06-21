import java.util.Random;

public class Liczba {
    private int a, b, liczba;

    public Liczba(int a, int b) {
        this.a = a;
        this.b = b;
        Random rand = new Random();
        liczba = rand.nextInt(a, b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public void losuj() {
        Random rand = new Random();
        liczba = rand.nextInt(a, b);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Integer.toString(liczba);
    }

    public void sumaKwadratow() {
        ;
    }

    public void iloczynCyfr() {
        ;
    }

    public boolean liczbaArmstronga() {
        int n = 0;
        int temp = liczba;
        while (temp > 0) {
            temp /= 10;
            n++;
        }
        int sum = 0;
        temp = liczba;
        int l = 0;
        while (temp > 0) {
            l = temp % 10;
            sum += Math.pow(l, n);
            temp /= 10;
        }
        if (sum == liczba) {
            System.out.println(liczba + " jest to liczba Armstronga");
            return true;
        }
        System.out.println(liczba + " nie jest to liczba Armstronga");
        return false;
    }

    public boolean liczbaPierwsza() {
        int sqrt = (int) Math.sqrt(liczba);
        boolean isPrime = true;
        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0) {
                isPrime = false;
            }
        }

        if (sqrt * sqrt == liczba)
            isPrime = false;

        if (isPrime) {
            System.out.println(liczba + " jest to liczbą pierwszą");
        } else {
            System.out.println(liczba + " nie jest to liczbą pierwszą");
        }
        return isPrime;
    }

    public boolean liczbaDoskonala() {
        int sum = 0;
        for (int i = 1; i < liczba; i++) {
            if (liczba % i == 0) {
                sum += i;
            }
        }
        if (sum == liczba) {
            System.out.println(liczba + " jest to liczbą doskonałą");
            return true;
        }
        System.out.println(liczba + " nie jest to liczbą doskonałą");
        return false;
    }

    public boolean czyFibb() {
        if (liczba == 1) {
            System.out.println(liczba + " jest to liczbą z ciągu Fibonacciego");
            return true;
        }
        int fibonacci = 0, num = 0, num2 = 1;
        while (fibonacci < liczba) {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        if (fibonacci == liczba) {
            System.out.println(liczba + " jest to liczbą z ciągu Fibonacciego");
            return true;
        }
        System.out.println(liczba + " nie jest to liczbą z ciągu Fibonacciego");
        return false;
    }

    public boolean liczbaWesola() {
        boolean is = true;
        int[] arr = new int[1];
        int count = 1;
        arr[0] = liczba;
        int temp = retSumSquareNumber(liczba);
        while (temp != 1) {
            for (int i = 0; i < count; i++) {
                if (temp == arr[i]) {
                    is = false;
                    break;
                }
            }
            int[] tempArr = new int[count];
            for (int i = 0; i < count; i++) {
                tempArr[i] = arr[i];
            }
            arr = new int[count + 1];
            for (int i = 0; i < count; i++) {
                arr[i] = tempArr[i];
            }
            arr[count] = temp;
            count++;
            temp = retSumSquareNumber(temp);
        }
        return is;
    }

    private int retSumSquareNumber(int n) {
        int num = 0;
        while (n > 0) {
            num += Math.pow(n % 10, 2);
            n /= 10;
        }
        return num;
    }
}
