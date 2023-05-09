package CW2;

import java.util.List;

abstract public class CustomerAccount
{

   //initialises variables

   private static String name;
   private static String address;
   private static double balance;

   private List<ArrayOfAccounts> accounts;
public static int accRefNo;





   public CustomerAccount(int newAccRefNo, String newName, String newAddress)
   {

     name = newName;
     address = newAddress;
     balance = 00.00;
   }//overloaded constructor which initialises the properties of an object from the customer account

   public CustomerAccount()
   {

   }//default constructor
protected void setBalance()
{
   balance = 00.00;
}
 protected void setName(String newName)
 {
    name = newName;
 }
 protected void setAddress(String newAddress)
 {
    address = newAddress;
 }

   protected String getName()
   {
      return name;
   }//get name constructor | returns variable data

   protected String getAddress()
   {
      return address;
   }// get address constructor | returns variable data

   protected void setAccRefNo(int newAccRefNo)
   {
      accRefNo = newAccRefNo;
   }//set account ref number constructor

   protected int getAccountRefNo(int index)
   {
      return accRefNo;
   }//get account reference number

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
      return  "Account number:  " + accRefNo + " Name: " + name + "  Address: " + address + " Balance: £";
   }// method which returns a string which will display the details of the account

   public void displayBalance(int index)
   {
      System.out.println("The current balance is this account is: £" + balance);
   }// method which prints the current balance of the account
}
