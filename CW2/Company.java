package CW2;

import java.util.Scanner;
import java.util.Arrays;


public class Company
{
   static Scanner keys = new Scanner(System.in);

   public static String getMessage(String message)
   {
      System.out.print(message);
      return keys.next();
   }


   private static int accRefNo;//initialises the variable

   public static int perAccNumber;

   public static int busAccNumber;


   public static void main(String args[])

   {
      //initialises array lists
      ArrayOfAccounts MyArray = new ArrayOfAccounts();
      //scanner - allows user to input data
      Scanner sc = new Scanner(System.in);
      //initialises variable option as a character
      char switch0;
      boolean search = false;
      int index = 0, choice3;

      // PersonalAccount perAccOne = new PersonalAccount();
      //PersonalAccount perAccTwo = new PersonalAccount();
      // PersonalAccount perAccThree = new PersonalAccount();

//do while loop iterates over code inside while true
      do
      {

         //displays menu to user
         System.out.println("---------Account menu------------");
         System.out.println("1 - Create new account");
         System.out.println("2 - Existing customers");
         System.out.println("0 - Exit program");
         System.out.println("Please enter your choice: ");
         //input - allows user to enter their option
         switch0 = sc.next().charAt(0);
         //switch - function inside case will run depending on users inputs
         switch (switch0)
         {
            case '0':
               System.exit(0);//breaks code
            case '1':
               //initialises variable
               String address;
               String name;


               //do while loop - iterates over code in a loop while true
               do
               {
                  //output - displays menu to user
                  System.out.println("====Account type====");
                  System.out.println("1 - Personal Account ");
                  System.out.println("2 - Business Account ");
                  System.out.println("Enter your choice: ");
                  //initialises variable and allows user to enter data
                  char switch1 = sc.next().charAt(0);
                  //switch - function inside case will run depending on users inputs
                  //output - displays message to user
                  sc.nextLine();
                  System.out.println("Please enter your name: ");
                  //allows user to enter data
                  name = sc.next();
                  sc.nextLine();
                  System.out.println("Please enter your address: ");
                  //allows user to enter data
                  address = sc.next();

                  sc.nextLine();
                  switch (switch1)
                  {
                     case '1':

                        //initialises variable

                        //creates new object in array
                        PersonalAccount perAccNew = new PersonalAccount(name, address, perAccNumber);
                        //inserts object into array
                        MyArray.insert(perAccNew);
                        //output - displays

                        System.out.println(perAccNew.toString(0));
                        //breaks code
                        break;
                     case '2':
                        //initialises variable


                        //creates new object
                        BusinessAccount busAccNew = new BusinessAccount(name, address, busAccNumber);
                        //inserts object into array
                        MyArray.insert(busAccNew);
                        //output - displays
                        System.out.println(busAccNew.toString(0));
                        //breaks code
                        break;
                     //default case - displays error message when input data is incorrect
                     default:
                        System.out.println("Invalid choice please re-enter");
                  }
                  //breaks code
                  break;
                  //end of while loop
               } while (true);
               //breaks code
               break;


            case '2':


               do
               {
                  try
                  {

                     System.out.print("please enter the account number you wish to find starting with 1XXX or 2XXX\n");


                     int AccRefSearch = Integer.parseInt(sc.next());


                     if (MyArray.accounts.size() > 0)
                     {
                        MyArray.findAccountByAccRef(AccRefSearch);
                        for (int i = 0; i < MyArray.getNoOfAccounts(); i++)
                        {
                           if (MyArray.getCurrent(i).getAccountRefNo(index) == AccRefSearch)
                           {
                              System.out.println(MyArray.getCurrent(i).toString(0));
                              search = true;
                              index = i;
                           }
                        }
                     } else
                     {
                        System.out.print("Error there is no account in this array\n");
                     }
                     break;
                  } catch (ArrayIndexOutOfBoundsException | NumberFormatException e)
                  {
                     System.out.print("Error Account does not exist");
                  }
                  break;

               } while (!search);
               if (search)
               {

                  do
                  {

                     System.out.print("1 - Record sale \n");
                     System.out.print("2 - Make a payment\n");
                     System.out.print("3 - Display balance \n");
                     System.out.print("4 - Display details \n");
                     System.out.print("5 - Change discount For Business only\n");
                     System.out.print("0 - Exit to menu \n");


                     choice3 = Integer.parseInt(getMessage("please select your choice for this account:\n"));


                     switch (choice3)
                     {


                        case 1:
                        {
                           try
                           {
                             System.out.print("Please enter the amount of the sale\n");
                             double saleAmount= sc.nextDouble();

                             // double saleAmount = Double.parseDouble(getMessage("Please enter the amount of the sale\n"));

                              MyArray.getCurrent(index).recordSale(saleAmount);


                              System.out.println(MyArray.getCurrent(index).displayBalance());

                           } catch (IndexOutOfBoundsException e)
                           {
                              System.out.print("Error: Please enter a valid value");
                              break;

                           }

                        }
                        break;


                        case 2:
                        {
                           try
                           {

                              double paymentAmount = Double.parseDouble(getMessage("please enter the amount you would like to pay:\n £"));

                              char[] bus = Arrays.toString(new int[]{MyArray.getCurrent(index).getAccountRefNo(index)}).toCharArray();
                              char first = bus[1];
                              System.out.println(first);


                              if (first == '2')
                              {
                                 MyArray.getCurrent(index).getDiscount(paymentAmount);
                                 MyArray.getCurrent(index).payment(paymentAmount - MyArray.getCurrent(index).getDiscount(paymentAmount));
                              } else if (first == '1')
                              {
                                 MyArray.getCurrent(index).payment(paymentAmount);
                              }

                              System.out.println(MyArray.getCurrent(index).displayBalance());
                           } catch (IndexOutOfBoundsException e)
                           {
                              System.out.println("Error: Please enter a valid value");
                              break;

                           }
                           break;
                        }

                        case 3:
                        {

                           System.out.println(MyArray.getCurrent(index).displayBalance());
                        }
                        break;

                        case 4:
                        {

                           System.out.println(MyArray.getCurrent(index).toString(0));
                        }
                        break;

                        case 5:
                        {
                           char[] bus = Arrays.toString(new int[]{MyArray.getCurrent(index).getAccountRefNo(index)}).toCharArray();
                           char first = bus[1];
                           System.out.println(first);
                           if (first == '2')
                           {

                              double NewDiscount = Double.parseDouble(getMessage("Please enter the new discount"));
                              System.out.println(MyArray.getCurrent(index).setDiscount(NewDiscount));
                              System.out.println("Updated discount is " + NewDiscount);
                           } else if (first == '1')
                           {

                              System.out.println("This is not a business account please re-enter");
                           }
                        }
                        break;
                        default:
                           if ((choice3 < 0) || (choice3 > 4))
                              System.out.println("Selection invalid");

                     }
                  } while (choice3 != 0);
               }
         }
      }while((switch0 != '1')||(switch0 != '2')||(switch0 != '3'));
   }
}
