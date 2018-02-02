import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 * Write a description of class DriverLicense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    private int expYear;
    
    public DriverLicense(String n,int expYear)
    {
        super(n);
        this.expYear = expYear;
    }
    
    public String toString()
    {
        String name = super.toString();
        return name + " Expiration Year: " + expYear;
    }
    
    public boolean isExpired()
    {
       GregorianCalendar calendar = new GregorianCalendar();
       int currentYear = calendar.get(Calendar.YEAR);
       if(expYear < currentYear)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}
