import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
    private JLabel enterNameLabel;
    private JTextField enterNameTextField;
    private JLabel enterSurnameLabel;
    private JTextField enterSurnameTextField;
    private JLabel enterHeigthLabel;
    private JTextField enterHeightTextField;
    private JLabel enterWeightLabel;
    private JTextField enterWeightTextField;
    private JButton createPersonButton;
    private JButton closeProgramButton;
    private JLabel BMILabel;
    private Person person;
    private List BMIList;
    private JButton correctWeightButton;
    private JLabel correctWeightLabel;

    public MainFrame() {
        super("Kalkulator BMI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));
        setLocationRelativeTo(null);
        setUI();
        addButtonsBindings();
        pack();
        setVisible(true);

    }

    private void setUI() {
        enterNameLabel = new JLabel("Podaj imię");
        enterNameTextField = new JTextField(30);
        enterSurnameLabel = new JLabel("Podaj nazwisko:");
        enterSurnameTextField = new JTextField(30);
        enterHeigthLabel = new JLabel("Podaj swój wzrost w cm");
        enterHeightTextField = new JTextField();
        enterWeightLabel = new JLabel("Podaj swoją wagę w kg");
        enterWeightTextField = new JTextField();
        createPersonButton = new JButton("Dodaj osobę");
        BMILabel = new JLabel("Twoje BMI");
        closeProgramButton = new JButton("Zakończ");
        BMIList = new List();
        correctWeightButton = new JButton("Poprawna waga");
        correctWeightLabel = new JLabel("Poprawna waga u osób:");

        add(enterNameLabel);
        add(enterNameTextField);
        add(enterSurnameLabel);
        add(enterSurnameTextField);
        add(enterHeigthLabel);
        add(enterHeightTextField);
        add(enterWeightLabel);
        add(enterWeightTextField);
        add(createPersonButton);
        add(BMILabel);
        add(closeProgramButton);
        add(BMIList);
        add(correctWeightButton);
        add(correctWeightLabel);
    }

    private void addButtonsBindings() {
        createPersonButton.addActionListener(new CreatePersonActionListener(this, person, BMILabel, enterNameTextField,
                enterSurnameTextField, enterHeightTextField, enterWeightTextField, BMIList));

        closeProgramButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

        correctWeightButton.addActionListener(new CorrectWeightButtonActionListener(BMIList, correctWeightLabel));
    }
}
