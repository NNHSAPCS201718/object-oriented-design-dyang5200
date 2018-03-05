import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 * Models a Circle object
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends DrawingShape
{
    /**
     * Constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    /**
     * Returns true if the point lies inside the circle, false otherwise
     * 
     * @param  point       the point in question
     * @return  true if the point is inside the circle, false otherwise
     */
    public boolean isInside(Point2D.Double point)
    {
        double distance = this.getCenter().distance(point);
        if(distance < this.getRadius())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Draws the circle. Draws a filled shape if filled is true and a hollow shape otherwise
     *  (Abstract in DrawingShape class)
     *  
     * @param g2        the Graphics object
     * @param filled    state of shape
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        Graphics2D g = (Graphics2D) g2;
        Ellipse2D.Double circ = new Ellipse2D.Double(this.getCenter().getX()-this.getRadius(), 
                                        this.getCenter().getY()-this.getRadius(), 
                                        this.getRadius(),this.getRadius());   
        g2.setColor(this.getColor());
        g2.draw(circ);
        if(filled == true)
        {
            g2.fill(circ);
        }
    }
}
