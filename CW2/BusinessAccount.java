package CW2;

import java.util.ArrayList;
import java.util.List;

public class BusinessAccount extends CustomerAccount
{

   public static int busAccNumber = 2001;
   private double discount = 10.0;
   private List<CustomerAccount> busAccList;

   public BusinessAccount()
   {
      busAccList = new ArrayList<CustomerAccount>();
   }


   public BusinessAccount(String newName, String newAddress, int busAccNumber)
   {
      super(busAccNumber, newName,newAddress);


   }


   public void setDiscount(double discount)
   {
      discount = 10.0;
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
   protected ArrayList<Integer> findAccountByAddress(String address) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int index = 0; index < busAccList.size(); index++) {
         if (busAccList.get(index).getAddress().equals(address)) {
            result.add(index);
         }//if
      }//for
      return result;
   }

   protected CustomerAccount getCurrentB(int position)
   {
      return busAccList.get(position);
   }





}
