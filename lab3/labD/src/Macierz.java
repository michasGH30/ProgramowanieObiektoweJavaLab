import java.util.Random;

public class Macierz {
    private int n;
    private int[][] arr;

    public Macierz(int n) {
        this.n = n;
        arr = new int[n][n];
    }

    private int NWD(int a, int b) {
        while (a != b) {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp - b;
            } else {
                int temp = b;
                b = a;
                a = temp - a;
            }
        }
        return a;
    }

    public void fillMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (NWD(i + 1, j + 1) == 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public void fillMatrix(int a) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(1, a);
            }
        }
    }

    private int rowSum(int i) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += arr[i][j];
        }
        return sum;
    }

    private int indexOfMaxRowSum() {
        int m = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (rowSum(i) > m) {
                m = rowSum(i);
                index = i;
            }
        }
        return index;
    }

    public void printMaxRowSum() {
        int index = indexOfMaxRowSum();
        System.out.println("Maksymalna suma = " + rowSum(index) + " w indeksie " + index);
    }

    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
