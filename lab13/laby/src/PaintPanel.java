import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class PaintPanel extends JPanel {

    private int type;

    private int figureLenght;

    public PaintPanel() {
        super();
        type = -1;
        figureLenght = -1;
        setVisible(true);
    }

    public void setFigureLenght(int figureLenght) {
        this.figureLenght = figureLenght;
    }

    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void paint(Graphics g) {
        System.out.println("Typ: " + type);
        if (type == 1) {
            g.setColor(new Color(0, 255, 0));
            g.drawRect(50, 50, figureLenght, figureLenght);
        } else if (type == 2) {
            g.setColor(new Color(255, 0, 0));
            int[] yPoints = new int[3];
            int[] xPonits = new int[3];
            xPonits[0] = 50;
            yPoints[0] = 50;

            xPonits[1] = 50;
            yPoints[1] = 50 + figureLenght;

            xPonits[2] = 50 + (figureLenght / 2);
            yPoints[2] = 50 + (figureLenght / 2);
            g.drawPolygon(xPonits, yPoints, 3);
        } else if (type == 3) {
            g.setColor(new Color(0, 0, 255));
            g.drawOval(50, 50, figureLenght * 2, figureLenght * 2);
        }
    }

    public void setType(int type) {
        this.type = type;
    }
}
