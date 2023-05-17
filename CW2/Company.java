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
                     case '1'://case 1 allows user to make and store a personal account

                        //initialises variable

                        //creates new object in array
                        PersonalAccount perAccNew = new PersonalAccount(name, address, perAccNumber);
                        //inserts object into array
                        MyArray.insert(perAccNew);
                        //output - displays

                        System.out.println(perAccNew.toString(0));
                        //breaks code
                        break;
                     case '2'://case 2 allows user to make and store a business account



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


            case '2'://case two allows user to enter their account number and stores it and displays account details


               do//do while iterates over code inside
               {
                  try//try catch trys the code inside and executes the code inside the catch whenever there is an exception
                  {
                     //output - prompts user for account number
                     System.out.print("please enter the account number you wish to find\n");
                     int AccRefSearch = Integer.parseInt(sc.next());//initialises variable and allows user to enter data

                     //if my array accounts has more than 0 accounts excute the following code
                     if (MyArray.accounts.size() > 0)
                     {
                        //uses method findAccountByAccRef to find the account with the matching account number from the array
                        MyArray.findAccountByAccRef(AccRefSearch);
                        for (int i = 0; i < MyArray.getNoOfAccounts(); i++)//for rang of i = 0, number of accounts in array, i ++ executes code inside forloop for the number of accounts
                        {
                           //if account at the index positions acc ref equals the users acc ref
                           if (MyArray.getCurrent(i).getAccountRefNo(index) == AccRefSearch)
                           {
                              //output - get account aat index and display using to string method
                              System.out.println(MyArray.getCurrent(i).toString(0));
                              //initialises variables
                              //search = true exit do while
                              search = true;
                              index = i;
                           }//end if
                        }//end for

                     } //end if
                     else//else execute this code if 0 accounts in array
                     {
                        //output - displays error message to user
                        System.out.print("Error there is no account in this array\n");
                     }//end else
                     //breaks code
                     break;
                  }//end try
                  catch (ArrayIndexOutOfBoundsException | NumberFormatException e)//catch - executes code inside if index is out of bounds or there is a number exception
                  {
                     //output - displays error message to user
                     System.out.print("Error Account does not exist");
                  }//end catch
                  //breaks code
                  break;

               } while (!search);//while not search
               //if search iterate over code inside
               if (search)
               {
                  //initialises variable
                  int switch2;
                  //do while loop iterates over code inside while switch is not equal to zero
                  do
                  {
                     //output - displays menu to user
                     System.out.println("1 - Record sale ");
                     System.out.println("2 - Make a payment");
                     System.out.println("3 - Display balance");
                     System.out.println("4 - Display details");
                     System.out.println("5 - Change discount For Business only");
                     System.out.println("0 - Exit to menu");

                     //prompts user to enter choice
                     switch2 = Integer.parseInt(getMessage("please select your choice for this account:\n"));

                     //switch - executes code inside case depending on users choice
                     switch (switch2)
                     {


                        case 1://case 1 records sale
                        {
                           try//try catch executes code inside try and if exception executes code inside catch
                           {
                              //output - prompts user to enter sale amount
                              System.out.print("Please enter the amount of the sale\n");
                              //initialises variable and allows user to enter data
                              double saleAmount = sc.nextDouble();


                              //uses the index position of the account in the array and uses this account in the record sale method
                              MyArray.getCurrent(index).recordSale(saleAmount);

                              //output - displays balance after sale
                              System.out.println(MyArray.getCurrent(index).displayBalance());

                           } //end try
                           catch (IndexOutOfBoundsException e)//catch execption - when index is out of bounds
                           {
                              //output - displays error message to user
                              System.out.print("Error: Please enter a valid value");
                              //breaks code
                              break;

                           }//ends catch

                        }//end of case 1
                        break;


                        case 2://case 2 allows the user to make a payment to account and applies a discount if the user has a business account
                        {
                           try//try catch executes code inside try and if exception executes code inside catch
                           {
                              //initializes variable while allowing user to enter data requested in promt
                              double paymentAmount = Double.parseDouble(getMessage("please enter the amount you would like to pay:\n £"));

                              //initialises and converts account reference number to char array
                              char[] bus = Arrays.toString(new int[]{MyArray.getCurrent(index).getAccountRefNo(index)}).toCharArray();
                              //initialises variable and stores first char from the char array
                              char first = bus[1];
                              //outputs char
                              System.out.println(first);

                              //if first char equals 2 execute following code
                              if (first == '2')
                              {
                                 //uses index position to find account and uses get discount method to get the discount
                                 MyArray.getCurrent(index).getDiscount(paymentAmount);
                                 //uses index position to find account and payment method to execute the method paymnet while applying discount
                                 MyArray.getCurrent(index).payment(paymentAmount - MyArray.getCurrent(index).getDiscount(paymentAmount));
                              } //end if
                               else if (first == '1')//else if first equals 1
                              {
                                 //uses index position to locate account to use in payment method - no discount as this is for personal accounts
                                 MyArray.getCurrent(index).payment(paymentAmount);
                              }//end else if
                              //output - displays balanace of account
                              System.out.println(MyArray.getCurrent(index).displayBalance());
                           } //end try
                           catch (IndexOutOfBoundsException e)//catch if index is out of bounds
                           {
                              //displays error message to user
                              System.out.println("Error: Please enter a valid value");
                              //breaks code
                              break;

                           }//end catch
                           //breaks code
                           break;
                        }//end of case 2

                        case 3://case 3 displays balance
                        {
                           //output - uses index position of account to find and display balance
                           System.out.println(MyArray.getCurrent(index).displayBalance());
                        }//end of case 3
                        //break
                        break;

                        case 4://case 4 displays details of account
                        {
                           //output - uses index position to display details of account also useing to string method
                           System.out.println(MyArray.getCurrent(index).toString(0));
                        }//end case 4
                        //breaks code
                        break;

                        case 5://case 5 allows user to change discount
                        {
                           //initialises and converts account reference number to char array
                           char[] bus = Arrays.toString(new int[]{MyArray.getCurrent(index).getAccountRefNo(index)}).toCharArray();
                           //initialises variable and stores first char from the char array
                           char first = bus[1];
                           //outputs char
                           System.out.println(first);
                           //if first equals 2 execute following code
                           if (first == '2')
                           {
                              //initialises variable while prompting for and allowing user to input new discount value
                              double NewDiscount = Double.parseDouble(getMessage("Please enter the new discount"));
                              //output - displays account using index and uses set dicount method to set new discount
                              System.out.println(MyArray.getCurrent(index).setDiscount(NewDiscount));
                              //output - display new discount to user
                              System.out.println("Updated discount is " + NewDiscount);
                           } //end if
                           else if (first == '1')//else if first is equal to 1
                           {
                              //output - displays message to user
                              System.out.println("This is not a business account please re-enter");
                           }//end else if
                        }//end case 5
                        //breaks code
                        break;
                        //default executes code inside if user enters invalid data into switch2
                        default:
                           if ((switch2 < 0) || (switch2 > 4))//if switch2 is smaller than 0 or bigger than 4
                              System.out.println("Selection invalid");//output - displays error message

                     }//end switch
                  } while (switch2 != 0);
               }//end if
         }//end switch
      }while((switch0 != '1')||(switch0 != '2')||(switch0 != '3'));//do while switch0 is not equal to 1 2 or 3
   }//main
}//class
