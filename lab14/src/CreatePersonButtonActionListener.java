import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CreatePersonButtonActionListener implements ActionListener {
    private MainFrame mainFrame;
    private Person person;
    private JTextField nameTextField;

    private JTextField surnameTextField;
    private JRadioButton studentRadioButton;
    private JRadioButton employeeRadioButton;
    private JComboBox<String> city;

    public CreatePersonButtonActionListener(MainFrame mainFrame, Person person, JTextField nameTextField,
            JTextField surnameTextField, JRadioButton studentRadioButton, JRadioButton employeeRadioButton,
            JComboBox<String> city) {
        this.mainFrame = mainFrame;
        this.person = person;
        this.nameTextField = nameTextField;
        this.surnameTextField = surnameTextField;
        this.studentRadioButton = studentRadioButton;
        this.employeeRadioButton = employeeRadioButton;
        this.city = city;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = null;
        String surname = null;
        String cityString = null;
        int choice = -1;
        try {
            if (!studentRadioButton.isSelected() && !employeeRadioButton.isSelected())
                throw new Exception("Nie zaznaczyłeś żadnej z opcji (student/pracownik)");
            name = nameTextField.getText();
            if (name.length() == 0)
                throw new Exception("Nie podałeś imienia");
            surname = surnameTextField.getText();
            if (surname.length() == 0)
                throw new Exception("Nie podałeś nazwiska");
            cityString = (String) city.getSelectedItem();
            if (studentRadioButton.isSelected()) {
                person = new Student(name, surname, cityString);
                choice = 2;
            } else if (employeeRadioButton.isSelected()) {
                person = new Employee(name, surname, cityString);
                choice = 1;
            }
            System.out.println(person.info());
            mainFrame.setVisible(false);
            new MoreDetailsDialog(mainFrame, choice, person);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(mainFrame, ex.getMessage(), "Brak wartości",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
