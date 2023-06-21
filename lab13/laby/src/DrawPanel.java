import javax.swing.BorderFactory;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel {
    private int type;

    private int color;
    private List<Point> points;

    public DrawPanel() {
        super();
        type = -1;
        color = -1;
        points = new ArrayList<>();
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        addActionListeners();
        setVisible(true);
    }

    private void addActionListeners() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int x = e.getX();
                int y = e.getY();
                points.add(new Point(x, y));
                Graphics g = getGraphics();
                switch (color) {
                    case 1:
                        g.setColor(new Color(255, 0, 0));
                        break;
                    case 2:
                        g.setColor(new Color(0, 255, 0));
                        break;
                    case 3:
                        g.setColor(new Color(0, 0, 255));
                        break;
                }
                if (color != -1 && type != -1) {
                    switch (type) {
                        case 1:
                            if (points.size() >= 2) {
                                Point p1 = points.get(points.size() - 2);
                                Point p2 = points.get(points.size() - 1);
                                g.drawLine(p1.x, p1.y, p2.x, p2.y);
                            }
                            break;
                        case 2:
                            g.drawRect(x - 50, y - 50, 100, 100);
                            points.clear();
                            break;
                        case 3:
                            g.drawOval(x - 50, y - 50, 100, 100);
                            points.clear();
                            break;
                    }
                }
            }
        });
    }

    public void setColor(int color) {
        System.out.println("Ustawiono color:" + color);
        this.color = color;
    }

    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        points.clear();
    }

    public void setType(int type) {
        System.out.println("Ustawiono type: " + type);
        this.type = type;
    }
}
