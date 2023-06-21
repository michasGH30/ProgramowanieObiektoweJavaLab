import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveButtonActionListener implements ActionListener {

    private Person person;
    private DescriptionDialog descriptionDialog;

    public SaveButtonActionListener(Person person, DescriptionDialog descriptionDialog) {
        this.person = person;
        this.descriptionDialog = descriptionDialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dane.txt", true))) {
            writer.write(person.info());
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(descriptionDialog, "Nie udało się zapisać do pliku",
                    "Błąd zapisu",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
