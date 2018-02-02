
/**
 * Write a description of class WalletTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalletTester
{
    public static void main(String[] args)
    {
        Wallet wallet = new Wallet();
        StudentIDCard card1 = new StudentIDCard("Danielle", "21695");
        DriverLicense card2 = new DriverLicense("Ciri", 2018);
        wallet.addCard(card1);
        wallet.addCard(card2);
        
        System.out.println(wallet.toString());
    }
}
