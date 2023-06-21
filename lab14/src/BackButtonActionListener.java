import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonActionListener implements ActionListener {
    private MainFrame mainFrame;
    private DescriptionDialog descriptionDialog;

    public BackButtonActionListener(MainFrame mainFrame, DescriptionDialog descriptionDialog) {
        this.mainFrame = mainFrame;
        this.descriptionDialog = descriptionDialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.resetTextFieldsAndRadioButtons();
        mainFrame.setVisible(true);
        descriptionDialog.dispose();
    }

}
