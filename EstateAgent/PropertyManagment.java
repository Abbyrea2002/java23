package EstateAgent;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;
import java.util.stream.Stream;

import static java.lang.System.exit;


public class PropertyManagment{
   public static int price;//initialises the variable price globally
public static String phoneNumber;//initialises the variable phoneNumber globally
   public static String strPrice;
   private static void priceCheck()//method to check that price is only entered as numbers and no chars
   {
      Scanner sc = new Scanner(System.in);
      do
      {
         System.out.println("Enter the price of the property: ");//prompts user for price
          strPrice = sc.next();// initialises variable strPrice as a string and allows the user to input
         int price;//initialises price variable as an integer
         //try catch- evaluates whether the users input contains characters or not and acts accordingly
         try
         {
            price = Integer.parseInt(strPrice);//changes the string price to an integer
            System.out.print(price); //displays the price

         } //try
         catch (NumberFormatException nfe)
         {
            System.out.print("The price must contain numbers only, please re-enter");//displays error message is there is non integers in users input statement
         }//catch
         break;//breaks loop
      }while(true);// do while loop repeats the loop to check the price stops when its entered correctly
   }
      private static void phoneVal()//method to validate phone number input
      {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the vendor phone number: ");//prompts user for phone number
         phoneNumber = sc.next();//allows user to input phone number
         if (phoneNumber.length() != 11)//if phone number is  not 11 digits
         {
            do
            {
               System.out.println("phone number is not 11 digits - please re-enter: ");//outputs error message to user
               phoneNumber = sc.next();//allows them to re-enter
            } while (phoneNumber.length() != 11);//do while loop- reapeats while to phone number is not 11 digits long
         }//if
      }//method

 protected static void passwordValidation()//password vallidation method
 {
    Scanner sc = new Scanner(System.in);
    String password = "estate";// initiales password as a string and sets it to estate
    String pass;//initialises pass variable as a string
    System.out.println("Enter password: ");//prompts the user to enter the password
    pass = sc.next();//allows the user to enter the password
    if (!(pass.equals(password)))//if the variable pass does not equal the password
    {
       do
       {
          System.out.println("Incorrect please re-enter: ");//displays error message

          pass = sc.nextLine();//allows the user to enter the password again

       } while (!(pass.equals(password)));//do while loop - repeats until correct password is entered
    }//if

 }//class


    public static void main (String args[])

    {

       Scanner sc = new Scanner(System.in);

       char option;//initialises the variable option as a char
       //creates ArrayOfProperties object
       ArrayOfProperties1 MyArray = new ArrayOfProperties1();

       //creates property objects
       Property oneProperty = new Property("Argyll Avenue " , "larne ", "Bt40 1ew ", "Semi-Detached", "Richard Green", "07565899835",  100000);
       Property twoProperty = new Property("LindaraDrive", "Carrick ", "BT40 2JC", "Detached", "Sandra Nelson", "07999365757", 100000);
       Property threeProperty = new Property("HerbetAvenue", "larne ", "BT40 AB5", "Semi-Detached", "Richard Green", "07654277543", 200000);
       Property fourProperty = new Property("Argyll Avenue ", "Portrush ", "BT5 2JX", "Detached", "Ash Wilson", "07898655432", 250000);
       Property fiveProperty = new Property("Sallaghpark", "larne ", "BT40 3GQ", "Terrace", "Sandra Nelson", "07789677754", 175000);

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


          switch (option)//switch statement - depending on users input a case will be slected and the code inside will be executed
          {
             case '0'://case 0 - exits system
                System.exit(0);
             case '1': // case 1 displays all properties to the user
                //displays property details when user enters 1 using contructor from ArrayOfProperties
                //and now object containing a list of properties
                MyArray.displayAllProperties();
             case '2'://case 2 - searches for a property in a town selected by the user

                String town;//initializes the variable town as a string
                   sc.nextLine();
                   System.out.println("What town is the property in?");//prompts the user for the town

                    town = sc.nextLine();//allows the user to enter their town of choice

                   ArrayList<Integer> display = MyArray.findPropertyByTown(town);//creates array display - makes it equal to result list in findPropertyByTown
                   if (display.size() > 0)//if the number of properties in list display is bigger than one - excute following code
                   {
                      //initialises 1 to 0, i smaller then size of display list, i plus 1
                      for (int i = 0; i < display.size(); i++)//for loop iterates code within certain amount of times
                      {
                         MyArray.displayAProperty(display.get(i));//displays the property in that particular town using its index position
                      }
                   } else//if no property with that town exists
                   {
                      System.out.println("No property exists in this town");//displays error message to user

                   }//else
                 break;//breaks case


             case '3'://case 3
                //initialises variables
                String type = "";
                int choice;
                String town1 = "";
                String postCode = "";
                String vendorName = "";

                passwordValidation();//makes use of password validation method
                sc.nextLine();
                System.out.print("please enter the street: ");//prompts the user
                String street1 = sc.nextLine();//allows user to enter street

                for (int i = 0; i < MyArray.getNoOfProperties(); i++)//for loop iterates over text inside certain amount of times based on condition - number of properties
                {
                   MyArray.getStreet(i);//gets index point of property with particular street
                   if (street1.equals(MyArray.getStreet(i)))//if street1 equals the element from my array executed following code
                   {  sc.nextLine();
                      System.out.println("This property already exists - please try again");//tells the user the property already exists
                      street1 = sc.nextLine();// allows user to enter the street and again and stores it again
                   }
                   else//else - if no property with that street exists execute the following code
                   {

                       sc.nextLine();
                      System.out.println("Please enter the town: ");//prompts for town
                      town1 = sc.nextLine();// input and store town
                      sc.nextLine();
                      System.out.println("Please enter postcode: ");//prompts for postcode
                      postCode = sc.nextLine();//input and store postcode
                      sc.nextLine();
                      System.out.println("Enter name of vendor: ");//prompts for vendor name
                      vendorName = sc.nextLine();//input and store name
                      do{
                         //displays menu for diff house types
                         System.out.println("Which type is the house?");
                         System.out.println("1- Detached");
                         System.out.println("2- Semi-Detached");
                         System.out.println("3- Terraced");
                         System.out.println("4- Apartment");
                         System.out.println("Enter your choice");
                         choice  = sc.nextInt();//inoput and store choice from menu
                         if (choice == 1)//if stores type depending on users choice
                         {
                            type = "Detached";
                            break;
                         }
                         if (choice == 2)
                         {
                            type = "Semi-Detached";
                            break;
                         }
                         if (choice == 3)
                         {
                            type = "Terraced";
                            break;
                         }
                         if (choice == 4)
                         {
                            type = "Apartment";
                            break;
                         } else//if input is not 1 - 4 displays error message
                         {
                            System.out.println("this is an invalid choice - please re-enter");
                         }


                      } while (choice < 1 || choice > 4);//do while loop repeats loop as long as choice is smaller than or bigger than 4

                      phoneVal();//calls phone validation method
                      priceCheck();//calls price check method
                      Property propertyNew = new Property(street1, town1, postCode, type, vendorName, phoneNumber, price);//creates new object in array and stores inputs from above
                      MyArray.insert(propertyNew);//inserts object into array
                      MyArray.displayAllProperties();//displays the properties
                      break;//breaks code

                   }
                   break;//breaks code
                }
                break;//breaks code


             case '4'://case 4
                passwordValidation();//calls password validation

                do
                {
                   sc.nextLine();
                   System.out.println("Enter first line of address of the property you would like to edit: ");//prompts for street
                   String street2 = sc.nextLine();//input and store street

                   for (int i = 0; i < MyArray.getNoOfProperties(); i++)//for loop iterates over code inside for number of properties
                   {
                      MyArray.getStreet(i);//gets street index position
                      if (street2.equals(MyArray.getStreet(i)))//if street2 equals a street in my array execute code inside
                      {
                         MyArray.getCurrent(i).displayProperty();//display property from index position i
                         //menu for details u would like change
                         System.out.println("Which details would you like to change?");
                         System.out.println("1 - Vendors phone number");
                         System.out.println("2 - Property price");
                         System.out.println("0 - Return to main menu");
                         int menu = sc.nextInt();//input and store menu choice

                         switch (menu)//switch depending on users input excutes code in case
                         {
                            case 0:
                               System.exit(0);//exits code
                            case 1:
                               phoneVal();//calls phone number validation
                               MyArray.getCurrent(i).setVendorContactNumber(phoneNumber);// sets new phone number

                               System.out.println("Phone number changed successfully");//tells user number is updated
                               MyArray.getCurrent(i).displayProperty();//displays new details
                               break;//breaks code

                            case 2:
                               priceCheck();//calls price check method

                               MyArray.getCurrent(i).setPrice(Integer.parseInt(strPrice));//sets new price

                               System.out.println("Price changed successfully");//tells user new price was successful
                               MyArray.getCurrent(i).displayProperty();//dispklay new details using index position
                               break;//breaks code
                            default:
                               System.out.println("Invalid choice, please re-enter");//displays error message when input is incorrect

                         }//switch

                      }//if
                      else
                      {
                         System.out.println("A property in this street does not exist please try again");//displays error message when the property doesnt exist
                         break;//breaks code
                      }//else
                      break;//breaks code
                   }
                   break;//breaks code
                } while (true);//while loop iterates over code while it is true
                break;//breaks code
             case '5':
                passwordValidation();//calls password validation method
                sc.nextLine();
                System.out.println("Enter property address: ");// prompts for street
                String street = sc.nextLine();//input and stores street

                for (int i = 0; i < MyArray.getNoOfProperties(); i++)//iterates over code for the amount of properties their is
                {

                   MyArray.getStreet(i);//gets street and stores index
                   if (street.equals(MyArray.getStreet(i)))//if street equals a street from the array execute folowing code
                   {

                      MyArray.getCurrent(i).displayProperty();//displays the property using its index
                      System.out.println("do you want to delete this property (y/n): ");//proompts the user for answer ion wether they would like to delete this property
                      char answer = sc.next().charAt(0);//stores answer and input
                      do
                      {
                         if ((answer == 'y') || (answer == 'Y'))//if answer y Y
                         {
                            MyArray.removeProperty(i);//remove the property from the list
                            break;//breaks code
                         }
                         else if((answer == 'n')|| (answer == 'N')){//if answer N n breaks code
                            break;//breaks code
                         }


                      } while (true);//do while loop iterates over code while true
                   }//if
                }//for
             default:
                System.out.println("Invalid choice - please re-enter");//displays error message to user when their choice from menu 1 is  invalid
          }//switch


       } while (true);//do while lopp iterates over code while it is true
    }//main




}//class


