/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      final Coin DOLLAR = new Coin(1.0, "Dollar");
      final Coin QUARTER = new Coin(0.25, "Quarter");
      final Coin DIME = new Coin(0.10, "Dime");
      final Coin NICKEL = new Coin(0.05, "Nickel");
      final Coin PENNY = new Coin(0.01, "Penny");

      Coin[] availableCoins = { QUARTER, DIME, NICKEL, PENNY };
      
      CashRegister register = new CashRegister();

      register.recordPurchase(1.95);
      register.recordPurchase(1.40);
      register.receivePayment(3, DOLLAR);
      register.receivePayment(2, QUARTER);

      for(Coin coinType : availableCoins)
      {
            int coinCount = register.giveChange(coinType);
            if(coinCount > 0)
            {
                System.out.println("Dispensed change of " + coinCount + 
                    " " + coinType.getName() );
            }
      }
 
      System.out.println("Expected: 0.15");          
   }
}
