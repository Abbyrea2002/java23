package CW2;

import EstateAgent.ArrayOfProperties1;
import EstateAgent.Property;

import java.util.Scanner;

public class Company
{
   private static int accRefNo;
   public static void main (String args[])

   {

      ArrayOfAccounts MyArray = new ArrayOfAccounts();
      Scanner sc = new Scanner(System.in);
      char option;



      do
      {

         //displays menu to user
         System.out.println("---------Account menu------------");
         System.out.println("1 - Create new account");
         System.out.println("2 - Existing customers");
         System.out.println("0 - Exit program");
         System.out.println("Please enter your choice: ");

         option = sc.next().charAt(0);
         switch(option)
         {
            case '0':
               System.exit(0);
            case '1':
               String name;
               String address;



                  System.out.println("Please enter your name: ");
                  name = sc.next();

                  System.out.println("Please enter your address: ");
                  address = sc.next();

                  System.out.println("Do you wish this account to be a personal account? (y/n): ");
                  char answer = sc.next().charAt(0);
                  if ((answer == 'y') || (answer == 'Y'))
                  {
                     int perAccNumber = 1001;
                     ArrayOfAccounts accountsNew = new ArrayOfAccounts(name, address, perAccNumber);
                     MyArray.insert(accountsNew);
                     System.out.println("Your reference number is: " + MyArray.getAccountRefNo());
                     break;
                  } else if ((answer == 'n') || (answer == 'N'))
                  {
                    System.out.println("Do you wish this account to be a business account? (y/n): ");
                      char choice = sc.next().charAt(0);
                      if ((choice == 'y') || (choice == 'Y'))
                      {
                         int busAccNumber = 2001;
                         ArrayOfAccounts accountsNew = new ArrayOfAccounts(name, address, busAccNumber);
                         MyArray.insert(accountsNew);
                         System.out.println("Your reference number is: " + MyArray.getAccountRefNo());
                         break;

                      }
                      else if((choice == 'n') || (choice == 'N'))
                      {

                      }


                     break;
                  }

            case 2:
               do
               {
                  System.out.println("1 – Record a new sale");
                  System.out.println("2 - Make a payment to the account");
                  System.out.println("3 - Display balance");
                  System.out.println("4 - Display details of account");
                  System.out.println("5 - For business account, change discount to be applied");
                  System.out.println("0 - Exit program ");
                  System.out.println("Enter your choice: ");
               }while(true);
            default:
              System.out.println("Invalid choice please re-enter");
         }
      }while(true);
   }

}
