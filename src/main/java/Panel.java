import java.awt.*;
import javax.swing.*;
import java.awt.geom.Point2D;
import java.util.*;

public class Panel extends JPanel {
    private final ArrayList<Point2D> base;
    private final ArrayList<Point2D> points1;
    private final ArrayList<Point2D> points2;
    
    Panel(ArrayList<Point2D> base, ArrayList<Point2D> points1, ArrayList<Point2D> points2) {
        this.base = base;
        this.points1 = points1;
        this.points2 = points2;
        this.setPreferredSize(new Dimension(500,500));
    }
 
    public void paint(Graphics g) {
  
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(1));

        g2D.scale(50, 50);
        
        base.forEach(item -> {
            g2D.drawRect((int)item.getX(), (int)item.getX(), (int)item.getY(), (int)item.getY());
        });

        for(int i = 0; i < points1.size(); i++) {
            g2D.drawLine((int)points1.get(i).getX(), (int)points1.get(i).getY(), (int)points2.get(i).getX(), (int)points2.get(i).getY());
        }
    }
}