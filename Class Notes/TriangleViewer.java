import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This program displays
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleViewer
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 400;
    private JFrame frame;
    private JPanel panel;
    
    public TriangleViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
    }
    
    public static void main(String[] args)
    {
        JFrame frame = new TriangleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
