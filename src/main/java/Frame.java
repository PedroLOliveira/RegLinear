import javax.swing.*;
import java.awt.geom.Point2D;
import java.util.*;

public class Frame extends JFrame {
    Panel panel;
    
    Frame(ArrayList<Point2D> base, ArrayList<Point2D> points1, ArrayList<Point2D> points2) {
        panel = new Panel(base, points1, points2);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }  
}