import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

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
    private boolean shapeStatus;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
         this.setBackground(Color.WHITE);
         this.fillColor = Color.CYAN;
         
         Listener listener = new Listener();
         this.addListener(listener);
         
         MotionListener motionListener = new MotionListener();
         this.addListener(motionListener);
         
         shapeList = new ArrayList<DrawingShape>();
    }
    
    class Listener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            
        }
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    
    class MotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            
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
    }
    
    /**
     * Adds a new circle to the list
     */
    public void addCircle()
    {
        /*
         * The new circle has its center at the center of the drawing panel, 
         * a random radius (within a reasonable range) and the current drawing color. 
         * The new circle is designated as the “active shape.”
         */
    }
    
    /**
     * Adds a new square to the list
     */
    public void addSquare()
    {
        
    }
    
    /**
     * Draws all the shapes in the list
     * 
     * @param g     the Graphics component
     */
    public void paintComponent(Graphics g)
    {
    }
}
