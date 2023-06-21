import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class DescriptionDialog extends JDialog {
    private JLabel infoLabel;
    private JButton saveButton;
    private Person person;
    private JButton backButton;

    public DescriptionDialog(MainFrame mainFrame, Person person) {
        super(mainFrame, "Opis osoby");
        this.person = person;
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));
        setUI();
        addActionListeners(mainFrame);
        pack();
        setVisible(true);
    }

    private void setUI() {
        infoLabel = new JLabel(person.info());
        saveButton = new JButton("Zapisz");
        backButton = new JButton("Powrót");
        add(infoLabel);
        add(saveButton);
        add(backButton);
    }

    private void addActionListeners(MainFrame mainFrame) {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        saveButton.addActionListener(new SaveButtonActionListener(person, this));
        backButton.addActionListener(new BackButtonActionListener(mainFrame, this));
    }
}
