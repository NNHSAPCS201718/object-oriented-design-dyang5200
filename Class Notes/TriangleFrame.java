import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * The frame contains shapes.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    
    private TriangleComponent component;
    
    public TriangleFrame()
    {
        component = new TriangleComponent();
        this.add(component);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
