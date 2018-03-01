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
    private Point2D.Double shapeCenter;
    private double shapeRadius;
    private Color shapeColor;
    
    /**
     * Constructor for objects of class DrawingShape
     */
    public DrawingShape(Point2D.Double center, double radius, Color color)
    {
        this.shapeCenter = center;
        this.shapeRadius = radius;
        this.shapeColor = color;
    }
    
    /**
     * Returns the center of the shape
     * 
     * @return center   the center of the shape
     */
    public Point2D.Double getCenter()
    {
        return this.shapeCenter;
    }
    
    /**
     * Returns the radius (technically the apothem) of the shape
     * 
     * @return radius   the radius
     */
    public double getRadius()
    {
        return this.shapeRadius;
    }
    
    /**
     * Returns the color of the shape
     * 
     * @return color    the color
     */
    public Color getColor()
    {
        return this.shapeColor;
    }
    
    /**
     * Sets the center of the shape to the specified x and y values.
     * 
     * @param x     specified x value
     * @param y     specified y value
     */
    public void move(double x, double y)
    {
        this.shapeCenter.setLocation(x,y);
    }
    
    /**
     * Sets the radius of the shape to r.
     * 
     * @param r     radius of shape
     */
    public void setRadius(double r)
    {
        this.shapeRadius = r;
    }
    
    /**
     * Returns true if the point lies inside this shape, otherwise return false
     *      Abstract in DrawingShape class
     * 
     * @param  point    the point in question
     * @return true if the point is inside the square, false otherwise
     */
    public abstract boolean isInside(Point2D.Double point);
    
    /**
     * Draws the shape. Draws a filled shape if filled is true and a hollow shape otherwise
     *  (Abstract in DrawingShape class)
     *  
     * @param g2        the Graphics object
     * @param filled    state of shape
     */
    public abstract void draw(Graphics2D g2, boolean filled);
}
