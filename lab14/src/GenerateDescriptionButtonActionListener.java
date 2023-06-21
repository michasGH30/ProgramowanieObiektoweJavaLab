import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GenerateDescriptionButtonActionListener implements ActionListener {

    private MoreDetailsDialog moreDetailsDialog;
    private MainFrame mainFrame;
    private JTextField companyUniversityTextField;
    private JTextField mayorPositionTextField;
    private JTextField firstTextField;
    private JTextField secondTextField;
    private JTextField thirdTextField;
    private JTextField fourthTextField;
    private JTextField fifthTextField;
    private JTextField salaryBruttoTextField;
    private Person person;
    private int choice;

    public GenerateDescriptionButtonActionListener(MoreDetailsDialog moreDetailsDialog, MainFrame mainFrame,
            JTextField companyUniversityTextField, JTextField mayorPositionTextField, JTextField firstTextField,
            JTextField secondTextField, JTextField thirdTextField, JTextField fourthTextField,
            JTextField fifthTextField, JTextField salaryBruttoTextField, Person person, int choice) {
        this.moreDetailsDialog = moreDetailsDialog;
        this.mainFrame = mainFrame;
        this.companyUniversityTextField = companyUniversityTextField;
        this.mayorPositionTextField = mayorPositionTextField;
        this.firstTextField = firstTextField;
        this.secondTextField = secondTextField;
        this.thirdTextField = thirdTextField;
        this.fourthTextField = fourthTextField;
        this.fifthTextField = fifthTextField;
        this.salaryBruttoTextField = salaryBruttoTextField;
        this.person = person;
        this.choice = choice;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String companyUniversity = null;
        String mayorPosition = null;
        String first = null;
        String second = null;
        String third = null;
        String fourth = null;
        String fifth = null;
        double salaryBrutto;

        int firstInt;
        int secondInt;
        int thirdInt;
        int fourthInt;
        int fifthInt;
        boolean bruttoIsOk = true;
        boolean gradesIsOk = true;
        try {
            companyUniversity = companyUniversityTextField.getText();
            if (companyUniversity.length() == 0)
                throw new Exception("Nie podałeś nazwy uczelni/firmy");
            mayorPosition = mayorPositionTextField.getText();
            if (mayorPosition.length() == 0)
                throw new Exception("Nie podałeś nazwy kierunku/pozycji w firmie");
            switch (choice) {
                case 1:
                    try {
                        salaryBrutto = Double.parseDouble(salaryBruttoTextField.getText());
                        ((Employee) person).setSalaryBrutto(salaryBrutto);
                    } catch (NullPointerException ex) {
                        JOptionPane.showMessageDialog(moreDetailsDialog, "Nie podałeś kwoty zarobków brutto",
                                "Brak wartości",
                                JOptionPane.ERROR_MESSAGE);
                        bruttoIsOk = false;
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(moreDetailsDialog, "Podałeś zarobki brutto w złym formacie",
                                "Błędny format",
                                JOptionPane.ERROR_MESSAGE);
                        bruttoIsOk = false;
                    }
                    ((Employee) person).setCompany(companyUniversity);
                    ((Employee) person).setPosition(mayorPosition);
                    if (bruttoIsOk) {
                        if (!firstTextField.getText().isEmpty()) {
                            first = firstTextField.getText();
                            ((Employee) person).addCourse(first);
                        }
                        if (!secondTextField.getText().isEmpty()) {
                            second = secondTextField.getText();
                            ((Employee) person).addCourse(second);
                        }
                        if (!thirdTextField.getText().isEmpty()) {
                            third = thirdTextField.getText();
                            ((Employee) person).addCourse(third);
                        }
                        if (!fourthTextField.getText().isEmpty()) {
                            fourth = fourthTextField.getText();
                            ((Employee) person).addCourse(fourth);
                        }
                        if (!fifthTextField.getText().isEmpty()) {
                            fifth = fifthTextField.getText();
                            ((Employee) person).addCourse(fifth);
                        }
                    }

                    break;
                case 2:
                    ((Student) person).setUniversity(companyUniversity);
                    ((Student) person).setMajor(mayorPosition);
                    try {
                        if (!firstTextField.getText().isEmpty()) {
                            firstInt = Integer.parseInt(firstTextField.getText());
                            ((Student) person).addGrade(firstInt);
                        }
                        if (!secondTextField.getText().isEmpty()) {
                            secondInt = Integer.parseInt(secondTextField.getText());
                            ((Student) person).addGrade(secondInt);
                        }
                        if (!thirdTextField.getText().isEmpty()) {
                            thirdInt = Integer.parseInt(thirdTextField.getText());
                            ((Student) person).addGrade(thirdInt);
                        }
                        if (!fourthTextField.getText().isEmpty()) {
                            fourthInt = Integer.parseInt(fourthTextField.getText());
                            ((Student) person).addGrade(fourthInt);
                        }
                        if (!fifthTextField.getText().isEmpty()) {
                            fifthInt = Integer.parseInt(fifthTextField.getText());
                            ((Student) person).addGrade(fifthInt);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(moreDetailsDialog, "Podałeś zły typ oceny", "Błędny typ",
                                JOptionPane.ERROR_MESSAGE);
                        gradesIsOk = false;
                    }
                    break;

            }
            if (bruttoIsOk && gradesIsOk) {
                System.out.println(person.info());
                moreDetailsDialog.dispose();
                new DescriptionDialog(mainFrame, person);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(moreDetailsDialog, ex.getMessage(), "Brak wartości",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
