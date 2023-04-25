package CW2;

abstract public class CustomerAccount
{
   private int accRefNo;
   private String name;
   private String address;
   private double balance;

   public CustomerAccount(){}


   public CustomerAccount(int newAccRefNo, String newName, String newAddress)
   {
     accRefNo = newAccRefNo;
     name = newName;
     address = newAddress;
     balance = 0;
   }

   protected double payment(double paymentAmount)
   {
    return balance - paymentAmount;
   }

   protected double recordSale(double saleAmount)
   {
      return saleAmount + balance;
   }

   public String toString()
   {
      return "Customer " + accRefNo + " name is: " + ", they live at " + address + ". their balance is: £";
   }

   public void displayBalance()
   {
      System.out.println("The current balance is this account is: £");
   }
}
