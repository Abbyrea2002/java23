package CW2;

import static CW2.PersonalAccount.perAccNumber;

import static CW2.BusinessAccount.busAccNumber;

abstract public class CustomerAccount
{

   //initialises variables
   //static means the variables data can change

   private static String name;
   private static String address;
   private static double balance;

   public static int accRefNo;




   public CustomerAccount(){}//default constructor



   public CustomerAccount(int newAccRefNo, String newName, String newAddress)
   {
      accRefNo = newAccRefNo;
     name = newName;
     address = newAddress;
     balance = 00.00;
     accRefNo = perAccNumber;
     perAccNumber = perAccNumber + 1;
     busAccNumber = accRefNo;
     accRefNo = accRefNo + 1;
   }//overloaded constructor which initialises the properties of an object from the customer account

      public CustomerAccount(int busAccNumber, int newAccRefNo, String newName, String newAddress)
      {
         accRefNo = newAccRefNo;
         name = newName;
         address = newAddress;
         balance = 00.00;
         accRefNo = busAccNumber;
         busAccNumber = busAccNumber + 1;
         busAccNumber = accRefNo;
         accRefNo = accRefNo + 1;

      }

   //setters - makes it so the variables can be set data
   //sets balance to 0.0
   protected void setBalance()
{
   balance = 00.00;
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
    return balance - paymentAmount;
   }//method which subtracts the balance from the payment amount

   protected double recordSale(double saleAmount)
   {
      return balance + saleAmount;
   }// method which adds the sale amount to the current balance

   public String toString(int index)
   {
      return  ( "Account number:  " + getAccountRefNo() + " Name: " + name + "  Address: " + address + " Balance: £"+ balance);
   }// method which returns a string which will display the details of the account

   public void displayBalance(int index)
   {
      System.out.println("The current balance is this account is: £" + balance);
   }// method which prints the current balance of the account
}
