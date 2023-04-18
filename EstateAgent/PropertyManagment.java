package EstateAgent;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;


public class PropertyManagment
{

   public static void main(String args[])

   {

      Scanner sc = new Scanner(System.in);
      String password = "Admin";
      char option;
      //creates ArrayOfProperties object
      ArrayOfProperties1 MyArray = new ArrayOfProperties1();

      //creates property objects
      Property oneProperty = new Property("Recreation Road ", "Larne ", "Bt40 1ew ", "Semi-Detached", "Richard Green", "07565899835", 100000);
      Property twoProperty = new Property ("Lindara Drive ", "Carrick ", "BT40 2JC", "Detached", "Sandra Nelson", "07999365757", 150000);
      Property threeProperty = new Property ("Herbet Avenue ", "Larne ", "BT40 AB5", "Semi-Detached", "Richard Green", "07654277543", 200000);
      Property fourProperty = new Property ("Argyll Avenue ", "Portrush ", "BT5 2JX", "Detached", "Ash Wilson", "07898655432", 250000);
      Property fiveProperty = new Property ("Sallagh park ", "larne ", "BT40 3GQ", "Terrace", "Sandra Nelson", "07789677754", 100000);

      //inserts property details from oneProperty object into array
      MyArray.insert(oneProperty);
      MyArray.insert(twoProperty);
      MyArray.insert(threeProperty);
      MyArray.insert(fourProperty);
      MyArray.insert(fiveProperty);

         do //do while loop-pre test loop iterates over the code inside until the user decides to exit
         {

               //displays menu to user
               System.out.println("---------Estate Agent------------");
               System.out.println("1 - List All Properties");
               System.out.println("2 – Search for a Property in a Particular Town");
               System.out.println("3 – Register a New Property");
               System.out.println("4 - Edit Details Of a Property");
               System.out.println("5 - Delete a Property");
               System.out.println("0 - Exit");
               System.out.println("Enter your choice: ");

               //allows user to input their menu choice


            option = sc.next().charAt(0);




                switch (option)
                {
                   case 0:
                      break;
                   case 1:
                     //displays property details when user enters 1 using contructor from ArrayOfProperties
                     MyArray.displayAllProperties();
                   case 2:
                     System.out.println("What town is the property in?");
                     String town = sc.next();
                   case 3:
                   case 4:

                   case 5:
                     System.out.println("What is the password?:    ");
                     password = sc.next();
                     if (password == "Admin")
                     {
                        System.out.println("");
                     } else
                     {
                        System.out.println("Invalid password - please re-enter");
                     }
                   default:
                     System.out.println("Invalid choice - please re-enter");
               }





         } while (option != 'o' || option != '1' || option != '2'|| option != '3'|| option != '4'|| option != '5');
      }
}


