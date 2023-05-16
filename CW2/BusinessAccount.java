package CW2;

import java.util.ArrayList;
import java.util.List;

public class BusinessAccount extends CustomerAccount
{

   public static int busAccNumber = 2001;
   private double discount = 0.1;





   public BusinessAccount(String newName, String newAddress, int busAccNumber)
   {
      super(busAccNumber, newName,newAddress);


   }


   protected double setDiscount(double discount)
   {
      return discount;
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
