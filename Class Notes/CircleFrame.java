import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;

/**
 * Create a JPanel object to which is added a CircleComponent object and
 *  a JButton object
 * The JPanel object is then added to the frame
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    private JFrame frame;
    private JButton drawButton;
    private JPanel panel;
    private CircleComponent component;
    
    public CircleFrame()
    {
        this.panel = new JPanel();
        component = new CircleComponent();
        this.panel.add(drawButton);
        this.panel.add(component);
        
        this.frame.add(this.panel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    // The class that implements the ActionListener interface to respond to 
    // the button press should be in the CircleFrame class as an inner class 
    // where it will have access to the CircleComponent object via the 
    // CircleFrame class' instance variable
}
