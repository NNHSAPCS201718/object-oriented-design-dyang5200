
/**
 * Write a description of class DriverLicense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    private String expYear;
    
    public DriverLicense(String n,String expYear)
    {
        super(n);
        this.expYear = expYear;
    }
}
