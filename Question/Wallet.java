
/**
 * Write a description of class Wallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wallet
{
    private Card card1;
    private Card card2;
    
    public Wallet()
    {
        this.card1 = null;
        this.card2 = null;
    }
    
    public void addCard(Card card)
    {
        if (card1 == null)
        {
            card1 = card;
        }
        else if (card2 == null)
        {
            card2 = card;
        }
    }
    
    public String toString()
    {
        String card1String;
        String card2String;
        String message="";
        if (card1 != null)
        {
            card1String = card1.toString();
            message+="[Card 1: " + card1String;
        }
        if (card2 != null)
        {
            card2String = card2.toString();
            message+="|Card 2: " + card2String+"]";
        }
        else
        {
            message+="]";
        }
        return message;
    }
    
    public int getExpiredCardCount()
    {
        int num = 0;
        
//        if(super.isExpired() == true)
        {
            num++;
        }
        return 0;
    }
}
