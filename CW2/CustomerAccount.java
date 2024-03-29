package CW2;

import static CW2.PersonalAccount.perAccNumber;

import static CW2.BusinessAccount.busAccNumber;

abstract public class CustomerAccount
{

   //initialises variables
   //static means the variables data can change

   private static String name;
   private static String address;
   public static double balance = 0;

   public static int accRefNo;


   public static double discount = 0.1;








   public CustomerAccount( int newAccRefNo, String newName, String newAddress)
   {
      accRefNo = newAccRefNo;
     name = newName;
     address = newAddress;
      balance = 0;
      perAccNumber = accRefNo;
     perAccNumber = perAccNumber + 1;
     busAccNumber = accRefNo;
     busAccNumber = busAccNumber + 1;

   }//overloaded constructor which initialises the properties of an object from the customer account



   //setters - makes it so the variables can be set data
   //sets balance to 0.0
   protected void setBalance()
{
   balance = 0;
}//void - empty parameter
   //sets name variable
   protected void setName(String newName)
 {
    name = newName;
 }//void - empty parameter
   //sets address variable as newAddress
   protected void setAddress(String newAddress)
 {
    address = newAddress;
 }//void - empty parameter
   //sets accRefNo variable
   protected void setAccRefNo(int newAccRefNo)
   {
      accRefNo = newAccRefNo;
   }//void - empty parameter

   //getters - allows for data assigned to the variable to be pulled

   protected String getName(int index)
   {
      return name;
   }//get name constructor | returns variable data

   protected String getAddress()
   {
      return address;
   }// get address constructor | returns variable data

   protected int getAccountRefNo(int index)
   {
      return accRefNo;
   }//get account reference number | returns variable data




   protected double payment(double paymentAmount)
   {
    balance = balance - paymentAmount;
    return balance;
   }//method which subtracts the balance from the payment amount

   protected double recordSale(double saleAmount)
   {
      balance = saleAmount + balance;
      return balance;
   }// method which adds the sale amount to the current balance

   public static String toString(int index )
   {
      return  ( "Account number:" + accRefNo + "\nName:" + name + "\nAddress:"+ address + "\nBalance: £"+ balance);
   }// method which returns a string which will display the details of the account

   public boolean displayBalance()
   {
      System.out.println("The current balance is this account is: £" + balance);
      return false;
   }// method which prints the current balance of the account
   protected double setDiscount(double newDiscount)
   {

      return discount;
   }

   public double getDiscount(double paymentAmount)
   {
      return paymentAmount * discount;
   }
}
