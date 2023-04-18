package EstateAgent;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;


public class PropertyManagment
{
 protected static void passwordValidation()
 {
    Scanner sc = new Scanner(System.in);
    String password = "estate";
    String pass;
    System.out.println("Enter password: ");
    pass = sc.next();
    if (!(pass.equals(password)))
    {
    do
    {
       System.out.println("Incorrect please re-enter: ");

       pass = sc.nextLine();

    }while(!(pass.equals(password)));}

 }
   public static void main(String args[])

   {

      Scanner sc = new Scanner(System.in);
      String password = "Admin";
      char option;
      //creates ArrayOfProperties object
      ArrayOfProperties1 MyArray = new ArrayOfProperties1();

      //creates property objects
      Property oneProperty = new Property("Argyll-Avenue", "Larne ", "Bt40 1ew ", "Semi-Detached", "Richard Green", "07565899835", 100000);
      Property twoProperty = new Property ("LindaraDrive", "Carrick ", "BT40 2JC", "Detached", "Sandra Nelson", "07999365757", 150000);
      Property threeProperty = new Property ("HerbetAvenue", "Larne ", "BT40 AB5", "Semi-Detached", "Richard Green", "07654277543", 200000);
      Property fourProperty = new Property ("ArgyllAvenue", "Portrush ", "BT5 2JX", "Detached", "Ash Wilson", "07898655432", 250000);
      Property fiveProperty = new Property ("Sallaghpark", "larne ", "BT40 3GQ", "Terrace", "Sandra Nelson", "07789677754", 100000);

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
                   case '0':
                      break;
                   case '1':
                      //displays property details when user enters 1 using contructor from ArrayOfProperties
                      MyArray.displayAllProperties();
                   case '2':
                         ArrayList<Integer> result = new ArrayList<Integer>();
                         String town;

                         System.out.println("What town is the property in?");
                         town = sc.next();
                         MyArray.findPropertyByTown(town);
                         System.out.println(result);


                   case '3':
                      String type = null;
                      String phoneNumber = null;
                      int price;
                      int n = 0;
                      int choice;
                      String town1 = null;
                      String postCode = null;
                      String vendorName = null;

                      passwordValidation();
                      System.out.print("please enter the street: ");
                      String street1 = sc.next();
                 
                      for (int i = 0; i < MyArray.getNoOfProperties(); i++)
                      {
                         MyArray.getStreet(i);
                         if (street1.equals(MyArray.getStreet(i)))
                         {
                            System.out.print("a");
                            System.out.println("This property already exists - please try again");
                            street1 = sc.next();
                         } else
                         {


                            System.out.println("Please enter the town: ");
                            town1 = sc.next();
                            System.out.println("Please enter postcode: ");
                            postCode = sc.next();
                            System.out.println("Enter name of vendor: ");
                            vendorName = sc.next();
                            do
                            {
                               System.out.println("Which type is the house?");
                               System.out.println("1- Detached");
                               System.out.println("2- Semi-Detached");
                               System.out.println("3- Terraced");
                               System.out.println("4- Apartment");
                               System.out.println("Enter your choice");
                               choice = sc.nextInt();
                               if (choice == 1)
                               {
                                  type = "Detached";
                               }
                               if (choice == 2)
                               {
                                  type = "Semi-Detached";
                               }
                               if (choice == 3)
                               {
                                  type = "Terraced";
                               }
                               if (choice == 4)
                               {
                                  type = "Apartment";
                               } else
                               {
                                  System.out.println("this is an invalid choice - please re-enter");
                               }


                            } while (choice > 0);

                            System.out.println("Enter the vendor phone number: ");
                            phoneNumber = sc.next();
                            if (phoneNumber.length() != 11)
                            {
                               do
                               {
                                  System.out.println("phone number is not 11 digits - please re-enter: ");
                                  phoneNumber = sc.next();
                               } while (phoneNumber.length() != 11);
                            }//if
                            do
                            {
                               System.out.println("Enter the price of the property: £");
                               price = sc.nextInt();
                               for (price.length())
                               {
                                  if (!Character.isDigit(price.charAt(i)))
                                  {
                                     System.out.println("Invalid price - please re-enter: ");

                                  }

                               }
                            } while (!Character.isDigit(phoneNumber.charAt(i)));

                         }
                      }
                      Property propertyNew = new Property(street1, town1, postCode, type, vendorName, phoneNumber, price);

                   case '4':

                   case '5':
                      passwordValidation();
                      System.out.println("Enter property address: ");
                      String street = sc.next();

                      for (int i = 0; i < MyArray.getNoOfProperties(); i++)
                      {

                         MyArray.getStreet(i);
                         if (street.equals(MyArray.getStreet(i)))
                         {

                            MyArray.getCurrent(i).displayProperty();
                            System.out.println("do you want to delete this property (y/n): ");
                            char answer = sc.next().charAt(0);
                            do
                            {
                               if ((answer == 'y') || (answer == 'Y'))
                               {
                                  MyArray.removeProperty(i);
                                  break;
                               }
                               break;


                            } while (true);
                         }
                      }
                   default:
                      System.out.println("Invalid choice - please re-enter");
                }





         } while (true);
      }
}


