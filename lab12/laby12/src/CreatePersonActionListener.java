import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CreatePersonActionListener implements ActionListener {

    private MainFrame mainFrame;
    private Person person;
    private JLabel BMILabel;
    private JTextField enterNameTextField;
    private JTextField enterSurnameTextField;
    private JTextField enterHeigthTextField;
    private JTextField enterWeightTextField;
    private List BMIList;

    public CreatePersonActionListener(MainFrame mainFrame, Person person, JLabel bMILabel,
            JTextField enterNameTextField, JTextField enterSurnameTextField, JTextField enterHeigthTextField,
            JTextField enterWeightTextField, List bMIList) {
        this.mainFrame = mainFrame;
        this.person = person;
        BMILabel = bMILabel;
        this.enterNameTextField = enterNameTextField;
        this.enterSurnameTextField = enterSurnameTextField;
        this.enterHeigthTextField = enterHeigthTextField;
        this.enterWeightTextField = enterWeightTextField;
        BMIList = bMIList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name;
        String surname;
        float heigth = 0.0f;
        float weight = 0.0f;
        name = enterNameTextField.getText();
        surname = enterSurnameTextField.getText();
        try {
            heigth = Float.parseFloat(enterHeigthTextField.getText());
            heigth /= 100.0f;
        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(mainFrame, "Podałeś złą wartość wzrostu", "Błędna wartość",
                    JOptionPane.ERROR_MESSAGE);
            heigth = -1.0f;
        } catch (NullPointerException exc) {
            JOptionPane.showMessageDialog(mainFrame, "Podałeś złą wartość wzrostu", "Błędna wartość",
                    JOptionPane.ERROR_MESSAGE);
            heigth = -1.0f;
        }

        try {
            weight = Float.parseFloat(enterWeightTextField.getText());
        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(mainFrame, "Podałeś złą wartość wzrostu", "Błędna wartość",
                    JOptionPane.ERROR_MESSAGE);
            weight = -1.0f;
        } catch (NullPointerException exc) {
            JOptionPane.showMessageDialog(mainFrame, "Podałeś złą wartość wzrostu", "Błędna wartość",
                    JOptionPane.ERROR_MESSAGE);
            weight = -1.0f;
        }

        if (heigth >= 0 && weight >= 0) {
            person = new Person(name, surname, heigth, weight);
            BMILabel.setText(person.getName() + " " + person.getSurname() + " twoje BMI wynosi: " + person.BMI());
            BMIList.add(person.getName() + " " + person.getSurname() + " twoje BMI wynosi: " + person.BMI());
        }

    }
}
