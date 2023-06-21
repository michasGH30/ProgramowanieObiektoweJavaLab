import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class MainFrame extends JFrame {
    private JComboBox<String> city;
    private JRadioButton studentRadioButton;
    private JRadioButton employeeRadioButton;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel surnameLabel;
    private JTextField surnamTextField;
    private JButton createPersonButton;
    private Person person;

    public MainFrame() {
        super("Jakiś program");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 1, 10, 10));
        setUI();
        addActionListeners();
        setSize(300, 400);
        setVisible(true);
    }

    private void setUI() {
        ButtonGroup whoAreYou = new ButtonGroup();
        studentRadioButton = new JRadioButton("Student");
        employeeRadioButton = new JRadioButton("Pracownik");
        whoAreYou.add(studentRadioButton);
        whoAreYou.add(employeeRadioButton);
        add(studentRadioButton);
        add(employeeRadioButton);
        nameLabel = new JLabel("Podaj imię");
        add(nameLabel);
        nameTextField = new JTextField();
        add(nameTextField);
        surnameLabel = new JLabel("Podaj nazwisko");
        add(surnameLabel);
        surnamTextField = new JTextField();
        add(surnamTextField);
        String[] cityStrings = new String[3];
        cityStrings[0] = "Siedlce";
        cityStrings[1] = "Warszawa";
        cityStrings[2] = "Podlasie";
        city = new JComboBox<String>(cityStrings);
        city.setSelectedIndex(0);
        add(city);
        createPersonButton = new JButton("Dalsze info");
        add(createPersonButton);
    }

    private void addActionListeners() {
        createPersonButton.addActionListener(new CreatePersonButtonActionListener(this, person, nameTextField,
                surnamTextField, studentRadioButton, employeeRadioButton, city));
    }

    public void resetTextFieldsAndRadioButtons() {
        studentRadioButton.setSelected(false);
        employeeRadioButton.setSelected(false);
        nameTextField.setText("");
        surnamTextField.setText("");
    }
}
