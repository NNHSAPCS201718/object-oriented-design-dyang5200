import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

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
     * Adds a circle.
     */
    public void addCircle()
    {
    }
    
    /**
     * Returns true if the point lies inside the circle, false otherwise
     * 
     * @return  point       the point in question
     */
    public boolean isInside(Point2D.Double point)
    {
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
        
    }
}
