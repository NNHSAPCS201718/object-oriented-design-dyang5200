import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.geom.Point2D;
import java.awt.Point;

/**
 * The panel in which draws all of the shapes in the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingPanel extends JPanel
{
    private Color fillColor;
    private ArrayList<DrawingShape> shapeList;
    private DrawingShape activeShape;
    private ArrayList<Boolean> isPicked;
    private double xDistance;
    private double yDistance;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
         this.setBackground(Color.WHITE);
         this.fillColor = Color.BLUE;
         
         Listener listener = new Listener();
         this.addMouseListener(listener);
         
         MotionListener motionListener = new MotionListener();
         this.addMouseMotionListener(motionListener);
         
         shapeList = new ArrayList<DrawingShape>();
    }
    
    
    /**
     * Listens to see which shapes are pressed or if no shape is pressed
     */
    class Listener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
            activeShape = null;
            Point2D.Double point = new Point2D.Double(x,y);
            for(int i=shapeList.size()-1; i>=0; i--) 
            {
                if(shapeList.get(i).isInside(point))
                {
                    activeShape = shapeList.get(i);
                    break;
                }
            }
            
            try{xDistance = x-activeShape.getCenter().getX();
            yDistance = y-activeShape.getCenter().getY();}
            catch(NullPointerException e){}
            
            repaint();
        }
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    
    /**
     * Listens to see where to drag shapes
     */
    class MotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            double x = event.getX() - xDistance;
            double y = event.getY() - yDistance;
            try{activeShape.move(x,y);}
            catch(NullPointerException e){}
            repaint();
        }
        public void mouseMoved(MouseEvent event){}
    }
    
    /**
     * Invoked when the "Pick Color" button is clicked. Displays a JColorChooser and sets the
     *  selected color as the new fill color. Leaves the fill color unchanged if the user clicks
     *  "Cancel"
     *
     */
    public void pickColor()
    {
        Color selectedColor = JColorChooser.showDialog( this, "select the fill color", this.fillColor );
        
        if( selectedColor != null )
        {
            this.fillColor = selectedColor;
        }
    }

    /**
     * Returns the current drawing color
     * 
     * @return  currentColor    the current drawing color
     */
    public Color getColor()
    {
        return fillColor;
    }
    
    /**
     * Overrides JComponent’s getPreferredSize method to return a size large enough 
     * to encapsulate a reasonable drawing canvas.
     */
    public Dimension getPreferredSize()
    {
        Dimension dimension = new Dimension(500,500);
        return dimension;
    }
    
    /**
     * Adds a new circle to the list
     */
    public void addCircle()
    {
        Random randomGenerator = new Random();
        int randomRadius = randomGenerator.nextInt(50) + 50;
        double width = (this.getPreferredSize().getWidth()) / 2.0;
        double height = (this.getPreferredSize().getHeight()) / 2.0;
        Point2D.Double centerPoint = new Point2D.Double(width,height);
        Circle circle = new Circle(centerPoint,randomRadius, fillColor);
        shapeList.add(circle);
        this.activeShape = circle;
    }
    
    /**
     * Adds a new square to the list
     */
    public void addSquare()
    {
        Random randomGenerator = new Random();
        int randomRadius = randomGenerator.nextInt(50) + 50;
        double width = (this.getPreferredSize().getWidth()) / 2.0;
        double height = (this.getPreferredSize().getHeight()) / 2.0;
        Point2D.Double centerPoint = new Point2D.Double(width,height);
        Square newSquare = new Square(centerPoint,randomRadius, fillColor);
        shapeList.add(newSquare);
        this.activeShape = newSquare;
    }
    
    /**
     * Draws all the shapes in the list
     * 
     * @param g     the Graphics component
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(DrawingShape drawingShape : shapeList)
        {
            if(drawingShape == activeShape)
            {
                drawingShape.draw(g2,false);
            }
            else
            {
                drawingShape.draw(g2,true);
            }
        }
        repaint();
    }
}
