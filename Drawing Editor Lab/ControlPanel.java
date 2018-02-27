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
        
        //
        // ... create and add buttons and selected color panel
        //
        
        /*  
         *  Attach the appropriate listener to the “Pick Color,” “Add Circle,” and 
         *  “Add Square” buttons, using inner action listener classes or 
         *  anonymous inline classes. 
         *  
         *  When “Pick Color” is clicked, call canvas’s pickColor method, then 
         *  get the selected color back from canvas and show that color on 
         *  the color display button. 
         *  
         *  When “Add Circle” or “Add Square” is clicked, call canvas’s addCircle or 
         *  addSquare method. 
         */
    }

    class PickColorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.pickColor();
        }
    }
    
    class AddCircleListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.addCircle();
        }
    }
    
    class AddSquareListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.addSquare();
        }
    }
}
