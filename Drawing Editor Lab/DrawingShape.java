import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Write a description of class DrawingShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingShape
{
    //add instance variables
    /**
     * Constructor for objects of class DrawingShape
     */
    public DrawingShape(Point2D.Double center, double radius, Color color)
    {
        
    }
    
    /**
     * Returns the center of the shape
     * 
     * @return center   the center of the shape
     */
    public Point2D.Double getCenter()
    {
        
    }
    
    /**
     * Returns the radius (technically the apothem) of the shape
     * 
     * @return radius   the radius
     */
    public double getRadius()
    {
        
    }
    
    /**
     * Returns the color of the shape
     * 
     * @return color    the color
     */
    public Color getColor()
    {
    }
    
    /**
     * Sets the center of the shape to the specified x and y values.
     * 
     * @param x     specified x value
     * @param y     specified y value
     */
    public void move(double x, double y)
    {
    }
    
    /**
     * Sets the radius of the shape to r.
     * 
     * @param r     radius of shape
     */
    public void setRadius(double r)
    {
    }
    
    /**
     * Returns true if the point lies inside this shape, otherwise return false
     * 
     * @param point     the point in question
     */
    public boolean isInside(Point2D.Double point)
    {
    }
    
    /**
     * Draws the shape. Draws a filled shape if filled is true and a hollow shape otherwise
     *  (Abstract in DrawingShape class)
     *  
     * @param g2        the Graphics object
     * @param filled    state of shape
     */
    public void draw(Graphics2D g2, boolean filled)
    {
    }
}
