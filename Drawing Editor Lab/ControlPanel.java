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
        
        this.canvas.add(pickColor);
        this.canvas.add(panel);
        this.canvas.add(addCircle);
        this.canvas.add(addSquare);
        
        ButtonListener buttonListener = new ButtonListener();
        pickColor.addActionListener(buttonListener);
        addCircle.addActionListener(buttonListener);
        addSquare.addActionListener(buttonListener);
        /*  
         *  When “Add Circle” or “Add Square” is clicked, call canvas’s addCircle or 
         *  addSquare method. 
         */
    }

    /**
     * Listener for the buttons.
     */
    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand() == "Pick Color")
            {
                canvas.pickColor();
                panel.setBackground(canvas.getColor());
            }
            else if(event.getActionCommand() == "Add Circle")
            {
                System.out.println("I'm going to add a circle");
                //canvas.addCircle();
            }
            else
            {
                System.out.println("I'm going to add a square");
                //canvas.addSquare();
            }
        }
    }
}
