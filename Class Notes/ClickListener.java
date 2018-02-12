import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An action listener that prints a message
 *
 * @author dyang5200
 * @version 12 February 2018
 */
public class ClickListener implements ActionListener
{
    public void actionPerformed( ActionEvent event)
    {
        System.out.println("button was clicked!");
    }

    
}
