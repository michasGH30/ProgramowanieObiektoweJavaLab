import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MoreDetailsDialog extends JDialog {
    private int type;
    private JLabel companyUniversityLabel;
    private JTextField companyUniversityTextField;
    private JLabel mayorPositionLabel;
    private JTextField mayorPositionTextField;
    private JLabel addMoreDetailsLabel;

    private JLabel salaryBruttoLabel;
    private JTextField salaryBruttoTextField;

    private JTextField firstTextField;
    private JTextField secondTextField;
    private JTextField thirdTextField;
    private JTextField fourthTextField;
    private JTextField fifthTextField;

    private JButton generateDescriptionButton;

    public MoreDetailsDialog(MainFrame mainFrame, int type, Person person) {
        super(mainFrame, "Dodatkowe dane");
        this.type = type;
        setLocationRelativeTo(mainFrame);
        setLayout(new GridLayout(13, 1, 10, 10));
        setUI();
        addActionListners(mainFrame, person);
        setSize(300, 500);
        setVisible(true);
    }

    private void setUI() {
        companyUniversityLabel = new JLabel();
        companyUniversityTextField = new JTextField();
        mayorPositionLabel = new JLabel();
        mayorPositionTextField = new JTextField();
        salaryBruttoLabel = new JLabel("Podaj zarobki brutto");
        salaryBruttoTextField = new JTextField();
        addMoreDetailsLabel = new JLabel();
        firstTextField = new JTextField();
        secondTextField = new JTextField();
        thirdTextField = new JTextField();
        fourthTextField = new JTextField();
        fifthTextField = new JTextField();
        generateDescriptionButton = new JButton("Generuj opis");

        switch (type) {
            case 1:
                companyUniversityLabel.setText("Podaj nazwę firmy");
                mayorPositionLabel.setText("Podaj stanowisko");
                addMoreDetailsLabel.setText("Podaj kursy");
                break;
            case 2:
                companyUniversityLabel.setText("Podaj nazwę uczelni");
                mayorPositionLabel.setText("Podaj kierunek");
                addMoreDetailsLabel.setText("Podaj oceny");
                break;
        }
        add(companyUniversityLabel);
        add(companyUniversityTextField);
        add(mayorPositionLabel);
        add(mayorPositionTextField);
        if (type == 1) {
            add(salaryBruttoLabel);
            add(salaryBruttoTextField);
        }
        add(addMoreDetailsLabel);
        add(firstTextField);
        add(secondTextField);
        add(thirdTextField);
        add(fourthTextField);
        add(fifthTextField);
        add(generateDescriptionButton);
    }

    private void addActionListners(MainFrame mainFrame, Person person) {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        generateDescriptionButton.addActionListener(new GenerateDescriptionButtonActionListener(this,
                mainFrame, companyUniversityTextField, mayorPositionTextField, firstTextField, secondTextField,
                thirdTextField,
                fourthTextField, fifthTextField, salaryBruttoTextField, person, type));
    }
}
