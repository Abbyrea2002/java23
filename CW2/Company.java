package CW2;

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
         System.out.println("1 - Create new account ");
         System.out.println("Existing customers:");
         System.out.println("2 – Record a new sale");
         System.out.println("3 - Make a payment to the account");
         System.out.println("4 - Display balance");
         System.out.println("5 - Display details of account");
         System.out.println("6 - For business account, change discount to be applied");
         System.out.println("0 - Exit program ");
         System.out.println("Enter your choice: ");
         option = sc.next().charAt(0);
         switch(option)
         {
            case 0:
               System.exit(0);
            case 1:
               do
               {

                  System.out.println("Do you wish this account to be a personal account? (y/n): ");
                  char answer = sc.next().charAt(0);
                  if ((answer == 'y') || (answer == 'Y'))
                  {

                  } else if ((answer == 'n') || (answer == 'N'))
                  {
                    System.out.println("Do you wish this account to be a buisness account? (y/n): ");
                     answer = sc.next().charAt(0);
                  }
               }while(true);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:

         }
      }while(true);
   }

}
