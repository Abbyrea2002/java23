package CW2;

import EstateAgent.ArrayOfProperties1;

import java.util.Scanner;

public class Company
{
   public static void main (String args[])

   {


      Scanner sc = new Scanner(System.in);
      char option;


      do
      {

         //displays menu to user
         System.out.println("---------Account menu------------");
         System.out.println("1 - Create new account");
         System.out.println("2 - Existing customers");
         System.out.println("0 - Exit program");

         option = sc.next().charAt(0);
         switch(option)
         {
            case 0:
               System.exit(0);
            case 1:
               String name;
               String address;

               do
               {

                  System.out.println("Please enter your name: ");
                  name = sc.nextLine();

                  System.out.print("Please enter your address: ");
                  address = sc.nextLine();

                  System.out.println("Do you wish this account to be a personal account? (y/n): ");
                  char answer = sc.next().charAt(0);
                  if ((answer == 'y') || (answer == 'Y'))
                  {
                     int perAccNumber = 1001;
                     for
                  } else if ((answer == 'n') || (answer == 'N'))
                  {
                    System.out.println("Do you wish this account to be a buisness account? (y/n): ");
                     answer = sc.next().charAt(0);
                  }
               }while(true);
            case 2:
               System.out.println("1 – Record a new sale");
               System.out.println("2 - Make a payment to the account");
               System.out.println("3 - Display balance");
               System.out.println("4 - Display details of account");
               System.out.println("5 - For business account, change discount to be applied");
               System.out.println("0 - Exit program ");
               System.out.println("Enter your choice: ");

            default:
              System.out.println("Invalid choice please re-enter");
         }
      }while(true);
   }

}
