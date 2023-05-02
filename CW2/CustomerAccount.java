package CW2;

abstract public class CustomerAccount
{
   //initialises variables
   private int accRefNo;
   private String name;
   private String address;
   private double balance;

   public CustomerAccount(){}//default constructor


   public CustomerAccount(int newAccRefNo, String newName, String newAddress)
   {
     accRefNo = newAccRefNo;
     newAccRefNo = newAccRefNo + 1;
     name = newName;
     address = newAddress;
     balance = 0;
   }//overloaded constructor which initialises the properties of an object from the customer account


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


   protected double payment(double paymentAmount)
   {
    return balance - paymentAmount;
   }//method which subtracts the balance from the payment amount

   protected double recordSale(double saleAmount)
   {
      return saleAmount + balance;
   }// method which adds the sale amount to the current balance

   public String toString()
   {
      return "Customer " + accRefNo + " name is: " + ", they live at " + address + ". their balance is: £";
   }// method which returns a string which will display the details of the account

   public void displayBalance()
   {
      System.out.println("The current balance is this account is: £" + balance);
   }// method which prints the current balance of the account
}
