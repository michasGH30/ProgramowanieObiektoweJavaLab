import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class TablicaLiczb {
    private long[] arr;
    private int rangeUp;
    private int rangeDown;

    public TablicaLiczb(int n) {
        arr = new long[n];
        rangeUp = 1000000000;
        rangeDown = 999999990;
        // rangeUp = 10;
        // rangeDown = 1;
    }

    public void enter() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(rangeUp - rangeDown) + rangeDown;
        }
    }

    public void print() {
        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }

    public void writeToFileMap(TablicaLiczb t) {
        FileWriter writer = null;

        try {
            writer = new FileWriter("zad5.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashMap<Long, Integer> map = new HashMap<>();

        map.put(arr[0], 1);

        for (int i = 1; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int i = 0; i < t.arr.length; i++) {
            if (map.containsKey(t.arr[i])) {
                map.put(t.arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(t.arr[i], 1);
            }
        }

        for (HashMap.Entry<Long, Integer> p : map.entrySet()) {
            try {
                writer.write(p.getValue() + " " + p.getValue() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(TablicaLiczb t) {

        FileWriter writer = null;

        try {
            writer = new FileWriter("zad5.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int count = 0;
        for (int i = rangeDown; i <= rangeUp; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j])
                    count++;
            }
            for (int j = 0; j < t.arr.length; j++) {
                if (i == arr[j])
                    count++;
            }
            if (count > 0) {

                try {
                    writer.write(i + " " + count + "\n");
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

    public static void maxCount() {
        FileReader reader = null;

        try {
            reader = new FileReader("zad5.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Scanner sc = new Scanner(reader);

        int maxCount = -1;
        int maxNumber = -1;
        int tempCount = 0;
        int tempNumber = 0;

        while (sc.hasNextInt()) {
            tempNumber = sc.nextInt();
            tempCount = sc.nextInt();
            if (tempCount > maxCount) {
                maxCount = tempCount;
                maxNumber = tempNumber;
            }
        }

        System.out.println(maxNumber + " " + maxCount);

        sc.close();

        try {
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
