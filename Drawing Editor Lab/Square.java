import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * Models a square object
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends DrawingShape
{
    /**
     * Constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);   // calls constructor of DrawingShape
    }
    
    /**
     * Returns true if the point lies inside the square, false otherwise
     * 
     * @param   point   the point in question
     * @return  true if the point is inside the square, false otherwise
     */
    public boolean isInside(Point2D.Double point)
    {        
        double lowX = this.getCenter().getX() - this.getRadius();
        double highX = this.getCenter().getX() + this.getRadius();
        double lowY = this.getCenter().getY() - this.getRadius();
        double highY = this.getCenter().getY() + this.getRadius();
        
        if(lowX < point.getX() && point.getX() < highX &&
            lowY < point.getY() && point.getY() < highY)
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
        Rectangle2D.Double rect = new Rectangle2D.Double(this.getCenter().getX()-this.getRadius(), 
                                        this.getCenter().getY()-this.getRadius(), 
                                        this.getRadius()*2,this.getRadius()*2);   
        g2.setColor(this.getColor());
        g2.draw(rect);
        if(filled == true)
        {
            g2.fill(rect);
        }
        
    }
}
