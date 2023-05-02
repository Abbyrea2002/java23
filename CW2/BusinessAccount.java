package CW2;

public class BusinessAccount extends CustomerAccount
{

   public static int busAccNumber = 2001;
   private double discount;

   public BusinessAccount(){
      super();
   }

   public BusinessAccount(String newName, String newAddress, double newDiscount)
   {
      super(newName,newAddress);
      discount = newDiscount;
   }
   public void setDiscount(double newDiscount)
   {
      newDiscount = discount;
   }

   public double getDiscount()
   {
         return discount;
   }

   public String toString()
   {
    return super.toString() + "the discount applied is: " + discount;
   }


}
