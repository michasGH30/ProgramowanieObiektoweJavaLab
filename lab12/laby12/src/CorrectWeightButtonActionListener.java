import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class CorrectWeightButtonActionListener implements ActionListener {

    private List BMIList;
    private JLabel correctWeightLabel;

    public CorrectWeightButtonActionListener(List bMIList, JLabel correctWeightLabel) {
        BMIList = bMIList;
        this.correctWeightLabel = correctWeightLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int count = 0;
        for (int i = 0; i < BMIList.getItemCount(); i++) {
            String[] data = BMIList.getItem(i).split(" ");
            // 5 waga
            float weight = Float.parseFloat(data[5]);
            // 25.0 - 29.9
            if (weight >= 25.0f && weight <= 29.9)
                count++;
        }
        correctWeightLabel.setText("Poprawna waga u osób: " + count);
    }

}
