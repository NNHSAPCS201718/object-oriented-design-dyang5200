
/**
 * Write a description of class ATMCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATMCard extends Card
{
    private String cardNumber;
    private String pin;
    
    public ATMCard(String n, String cardNum, String pinNum)
    {
        super(n);
        this.cardNumber = cardNum;
        this.pin = pinNum;
    }
    
    public String toString()
    {
        String name = super.toString();
        return name + "Card Number: " + cardNumber+" Pin: "+pin;
    }
}
