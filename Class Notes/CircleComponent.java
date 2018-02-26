import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.shape.Line;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;

/**
 * Write a description of class CircleComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleComponent extends JComponent
{
    private int x;      // x coordinate of center of circle
    private int y;      // y coordinate of center of circle
    private int radius;
    
    public CircleComponent(int xCoord, int yCoord, int radiusValue)
    {
        this.x = xCoord;
        this.y = yCoord;
        this.radius = radiusValue;
        this.setPreferredSize(new Dimension(500, 500));
    }
    
    public void setValues(int xCoord, int yCoord, int radiusValue)
    {
        
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x,y,radius,radius);
        g2.draw(circle);
    }
}
