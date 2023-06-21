import java.io.FileWriter;
import java.io.IOException;

public class ArmstrongNumbers {
    private ArmstrongNumbers() {
        ;
    }

    private static int getNumberCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    private static int[] numbersOfNumber(int p, int number) {
        int[] arr = new int[p];

        for (int i = 0; i < p; i++) {
            arr[i] = number % 10;
            number /= 10;
        }

        return arr;
    }

    private static int sumOfNumbersToPower(int[] arr, int p) {
        int sum = 0;
        for (int i : arr) {
            sum += (int) Math.pow(i, p);
        }
        return sum;
    }

    public static void writeToFileFromRange(int a, int b) {

        FileWriter writer = null;

        try {
            writer = new FileWriter("zad4.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = a; i <= b; i++) {
            int power = getNumberCount(i);
            int[] arr = numbersOfNumber(power, i);
            int sum = sumOfNumbersToPower(arr, power);
            if (sum == i) {
                try {
                    writer.write(i + "\n");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        try {
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
