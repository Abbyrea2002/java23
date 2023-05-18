package CW2;

import java.util.ArrayList;
import java.util.List;

import static CW2.BusinessAccount.busAccNumber;

public class BusinessAccount extends CustomerAccount
{

   public static int busAccNumber = 2001;
   private double discount = 0.1;





   public BusinessAccount(String newName, String newAddress, int NewAccRef)
   {
      super(busAccNumber, newName,newAddress);
      busAccNumber = accRefNo;
      busAccNumber = busAccNumber + 1;
      balance = 0;
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
