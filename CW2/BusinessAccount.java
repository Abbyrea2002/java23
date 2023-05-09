package CW2;

import java.util.ArrayList;
import java.util.List;

public class BusinessAccount extends CustomerAccount
{

   public static int busAccNumber = 2001;
   private double discount;
   private List<BusinessAccount> busAccList;

   public BusinessAccount(){
      super();
      busAccNumber = accRefNo;
      accRefNo = accRefNo + 1;
      busAccList = new ArrayList<BusinessAccount>();
   }

   public BusinessAccount(String newName, String newAddress, double newDiscount)
   {
      super(busAccNumber, newName,newAddress);
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

   protected int getNoOfBusAccounts() {
      return busAccList.size();

   }
   protected void insert(BusinessAccount busAccNew) {


      busAccList.add(busAccNew);

   }
   protected ArrayList<Integer> findBalanceByAddress(String address) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int index = 0; index < busAccList.size(); index++) {
         if (busAccList.get(index).getAddress().equals(address)) {
            result.add(index);
         }//if
      }//for
      return result;
   }
   protected BusinessAccount getCurrent(int position)
   {
      return busAccList.get(position);
   }

}
