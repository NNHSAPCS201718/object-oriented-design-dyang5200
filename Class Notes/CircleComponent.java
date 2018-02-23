import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javafx.scene.shape.Line;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;

/**
 * Write a description of class CircleComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleComponent
{
    private int x;      // x coordinate of center of circle
    private int y;      // y coordinate of center of circle
    private int radius;
    private JLabel label;
    
    public CircleComponent()
    {
        
        this.setPreferredSize(new Dimension(500, 500));
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x,y,radius,radius);
        g2.draw(circle);
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            label.setText("Draw");
        }
    }
}
