
public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public boolean equals(Object otherObject)
   {
       if(otherObject == null)
       {
           return false;
       }
       if(this.getClass() == otherObject.getClass())
       {
           Card other = (Card) otherObject;
           return this.name.equals(other.name);
       }
       return false;
   }
   
   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
       return false;
   }

   public String toString()
   {
      return "Card holder: " + name;
   }
}
