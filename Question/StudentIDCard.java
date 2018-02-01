
/**
 * Write a description of class StudentIDCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentIDCard extends Card
{
    private String idNumber;
    
    public StudentIDCard(String n, String id)
    {  
       super(n);
       idNumber = id;
    }
    
    public String toString()
    {
        String name = super.toString();
        return name + " ID Number: " + idNumber;
    }
}
