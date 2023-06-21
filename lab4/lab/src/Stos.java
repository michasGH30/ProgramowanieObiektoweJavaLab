import java.util.Random;

public class Stos {
    private int length;
    private String[] stack;
    private int index;

    public Stos() {
        Random rand = new Random();
        length = rand.nextInt(9) + 1;
        stack = new String[length];
    }

    public Stos(int length) {
        this.length = length;
        stack = new String[this.length];
    }

    public int getLength() {
        return length;
    }

    public int getIndex() {
        return index;
    }

    public void push(String item) {
        try {
            stack[index] = item;
            index++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyszedłeś poza stos!!!");
        }
    }

    public void pop() {
        try {
            System.out.println("Zrzucasz " + stack[index - 1]);
            index--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie można zdjąć z pustego stosu!!!");
        }
    }

    public void printStack() {
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("");
    }

}
