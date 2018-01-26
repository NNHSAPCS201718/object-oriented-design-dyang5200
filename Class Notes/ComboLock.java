public class ComboLock
{
   private int firstNum;
   private int secondNum;
   private int thirdNum;
   private int currentDial;
    
   public ComboLock( int secret1, int secret2, int secret3 ) 
   {
       this.firstNum = secret1;
       this.secondNum = secret2;
       this.thirdNum = secret3;
   }
   
   public void reset() 
   {
       this.currentDial = 0;
   }
   
   public void turnLeft( int ticks ) 
   {
       this.currentDial += ticks;
   }
   
   public void turnRight( int ticks ) 
   {
       this.currentDial -= ticks;
   }
   
   public boolean open() 
   {
       // right to first
       // left to second
       // right to third
       
       return true;
   }
}
