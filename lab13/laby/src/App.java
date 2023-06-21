import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        // zad1();
        zad2();
    }

    public static void zad1() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }

    public static void zad2() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Frame();
            }
        });
    }
}
