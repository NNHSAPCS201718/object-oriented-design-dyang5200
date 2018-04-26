import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The panel that contains the controls and indicators for the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class ControlPanel extends JPanel
{
    private JButton pickColor;
    private JButton addCircle;
    private JButton addSquare;
    private JPanel panel;
    
    private DrawingPanel canvas;

    /**
     * Constructor for objects of class ControlPanel
     */
    public ControlPanel( DrawingPanel canvas)
    {
        this.canvas = canvas;
        
        pickColor = new JButton("Pick Color");
        panel = new JPanel();
        addCircle = new JButton("Add Circle");
        addSquare = new JButton("Add Square");
        
        Color initialColor = this.canvas.getColor();
        panel.setBackground(initialColor);
        
        this.add(pickColor);
        this.add(panel);
        this.add(addCircle);
        this.add(addSquare);
        
        ButtonListener buttonListener = new ButtonListener();
        pickColor.addActionListener(buttonListener);
        addCircle.addActionListener(buttonListener);
        addSquare.addActionListener(buttonListener);
    }

    /**
     * Listener for the buttons.
     */
    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == pickColor)
            {
                canvas.pickColor();
                panel.setBackground(canvas.getColor());
            }
            else if(event.getSource() == addCircle)
            {
                canvas.addCircle();
            }
            else
            {
                canvas.addSquare();
            }
        }
    }
}
