import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Frame extends JFrame {
    private JRadioButton redRadioButton;
    private JRadioButton greenRadioButton;
    private JRadioButton blueRadioButton;

    private JRadioButton lineRadioButton;
    private JRadioButton squareRadioButton;
    private JRadioButton circleRadioButton;
    private JButton clearButton;
    private DrawPanel drawPanel;
    private JPanel menuPanel;

    public Frame() {
        super("Niby Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUI();
        addActionListeners();
        pack();
        setVisible(true);
    }

    private void setUI() {
        menuPanel = new JPanel(new FlowLayout());
        ButtonGroup colors = new ButtonGroup();
        redRadioButton = new JRadioButton("Czerwony");
        greenRadioButton = new JRadioButton("Zielony");
        blueRadioButton = new JRadioButton("Niebieski");
        colors.add(redRadioButton);
        colors.add(greenRadioButton);
        colors.add(blueRadioButton);
        ButtonGroup shapes = new ButtonGroup();
        lineRadioButton = new JRadioButton("Linia");
        squareRadioButton = new JRadioButton("Kwadrat");
        circleRadioButton = new JRadioButton("Koło");
        shapes.add(lineRadioButton);
        shapes.add(squareRadioButton);
        shapes.add(circleRadioButton);
        clearButton = new JButton("Wyczyść");
        drawPanel = new DrawPanel();

        menuPanel.add(redRadioButton);
        menuPanel.add(greenRadioButton);
        menuPanel.add(blueRadioButton);
        menuPanel.add(lineRadioButton);
        menuPanel.add(squareRadioButton);
        menuPanel.add(circleRadioButton);
        menuPanel.add(clearButton);
        add(menuPanel);
        add(drawPanel);
    }

    private void addActionListeners() {
        redRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setColor(1);
            }

        });

        greenRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setColor(2);
            }

        });

        blueRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setColor(3);
            }

        });

        lineRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setType(1);
            }

        });

        squareRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setType(2);
            }

        });

        circleRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setType(3);
            }

        });

        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawPanel.getGraphics();
                drawPanel.paintComponent(g);
            }

        });
    }

}
