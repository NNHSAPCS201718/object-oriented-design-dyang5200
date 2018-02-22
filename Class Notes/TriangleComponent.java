import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javafx.scene.shape.Line;

/**
 * 
 */
public class TriangleComponent extends JComponent
{
    private int xlocation[] = new int[3];
    private int ylocation[] = new int[3];
    int clicks = 0;
    
    public TriangleComponent()
    {
        MousePressListener listener = new MousePressListener();
        this.addMouseListener(listener);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //while(clicks < 4)
        //{
            if(clicks == 0)
            {
                g2.drawLine(xlocation[0],ylocation[0],xlocation[0],ylocation[0]);
            }
            else if(clicks == 1)
            {
                g2.drawLine(xlocation[0],ylocation[0],xlocation[1],ylocation[1]);
            }
            else if(clicks == 2)
            {
                g2.drawLine(xlocation[1],ylocation[1],xlocation[2],ylocation[2]);
                g2.drawLine(xlocation[2],ylocation[2],xlocation[0],ylocation[0]);
            }
            else
            {
                clicks = 0;
            }
        //}
    }
    
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
            if(clicks<4)
            {
                xlocation[clicks] = x;
                ylocation[clicks] = y;
                clicks++;
            }
            else
            {
                for(int i = 0; i<xlocation.length; i++)
                {
                    xlocation[i] = 0;
                    ylocation[i] = 0;
                }
            }
            
            repaint();
        }
        
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    
    // for(int i = 0; i < xlocation.length; i++)
            // {
                // xlocation[i] = event.getX();
                // ylocation[i] = event.getY();
                // // if(i == 0)
                // // {
                    // // //draw dot
                    // // line.setStartX(xlocation[i]);
                    // // line.setStartY(ylocation[i]);
                // // }
                // // else if(i == 1)
                // // {
                    // // //draw line
                    // // line.setEndX(xlocation[i]);
                    // // line.setEndY(ylocation[i]);
                // // }
                // // else
                // // {
                    // // //draw triangle
                // // }
                
                // clicks++;
                // if(clicks >= 3)
                // {
                    // i = -1;
                // }
            // }   
    
}
