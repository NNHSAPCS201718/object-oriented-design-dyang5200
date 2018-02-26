import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.Scanner;

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

    private JPanel panel;
    private JButton drawButton;
    private CircleComponent component;
    
    private int xCoordinate;
    private int yCoordinate;
    private int radiusValue;
    
    public CircleFrame()
    {
        this.panel = new JPanel();
        this.drawButton = new JButton("Draw");
        this.panel.add(drawButton);
        component = new CircleComponent(xCoordinate, yCoordinate, radiusValue);
        this.panel.add(this.component);
        
        CircleListener listener = new CircleListener();
        this.drawButton.addActionListener(listener);
        
        this.add(this.panel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    
    class CircleListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Scanner s = new Scanner(JOptionPane.showInputDialog("Enter the x-coordinate of the center of the circle: "));
            int x = s.nextInt();
            Scanner t = new Scanner(JOptionPane.showInputDialog("Enter the y-coordinate of the center of the circle: "));
            int y = t.nextInt();
            Scanner r = new Scanner(JOptionPane.showInputDialog("Enter the radius of the circle: "));
            int radius = r.nextInt();
            
            xCoordinate = x;
            yCoordinate = y;
            radiusValue = radius;
            repaint();
        }
    }
}
