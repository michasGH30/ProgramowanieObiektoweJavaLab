import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class MainFrame extends JFrame {
    private JRadioButton redRadioButton;
    private JRadioButton blueRadioButton;
    private JRadioButton greenRadioButton;
    private JSlider changeLenghtSlider;
    private JButton clearButton;
    private JButton drawButton;
    private PaintPanel paintPanel;
    private Figure figure;

    public MainFrame() {
        super("Rysowanie figur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUI();
        addActionListeners();
        pack();
        setVisible(true);
    }

    private void setUI() {
        redRadioButton = new JRadioButton("Czerwony");
        blueRadioButton = new JRadioButton("Niebieski");
        greenRadioButton = new JRadioButton("Zielony");
        ButtonGroup colors = new ButtonGroup();
        colors.add(redRadioButton);
        colors.add(blueRadioButton);
        colors.add(greenRadioButton);
        paintPanel = new PaintPanel();
        changeLenghtSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
        clearButton = new JButton("Wyczyść");
        drawButton = new JButton("Rysuj");
        add(paintPanel);
        add(redRadioButton);
        add(blueRadioButton);
        add(greenRadioButton);
        add(changeLenghtSlider);
        add(clearButton);
        add(drawButton);
    }

    private void addActionListeners() {

        drawButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (greenRadioButton.isSelected()) {
                    figure = new Square();
                    paintPanel.setType(1);
                    figure.setLength(changeLenghtSlider.getValue());
                    paintPanel.setFigureLenght(changeLenghtSlider.getValue());
                } else if (redRadioButton.isSelected()) {
                    figure = new Triangle();
                    paintPanel.setType(2);
                    figure.setLength(changeLenghtSlider.getValue());
                    paintPanel.setFigureLenght(changeLenghtSlider.getValue());
                } else if (blueRadioButton.isSelected()) {
                    figure = new Circle();
                    paintPanel.setType(3);
                    figure.setLength(changeLenghtSlider.getValue());
                    paintPanel.setFigureLenght(changeLenghtSlider.getValue());
                }
                figure.info();
                paintPanel.paint(getGraphics());
            }

        });

        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                paintPanel.paintComponent(getGraphics());
            }

        });
    }
}
