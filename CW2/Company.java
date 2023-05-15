package CW2;

import EstateAgent.ArrayOfProperties1;
import EstateAgent.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company
{
   private static int accRefNo;//initialises the variable
   public static void main (String args[])

   {
      //initialises array lists
      PersonalAccount MyPer = new PersonalAccount();
      BusinessAccount MyBus = new BusinessAccount();
      //scanner - allows user to input data
      Scanner sc = new Scanner(System.in);
      //initialises variable option as a character
      char switch0;


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
                        int i = 0;
                        //initialises variable
                        int perAccNumber = 1001;
                        //creates new object in array
                        PersonalAccount perAccNew = new PersonalAccount(name, address, perAccNumber);
                        //inserts object into array
                        MyPer.insert(perAccNew);
                        //output - displays

                        System.out.println(java.util.Arrays.toString());
                        //breaks code
                        break;
                     case '2':
                        //initialises variable
                        int busAccNumber = 2001;

                        //creates new object
                        BusinessAccount busAccNew = new BusinessAccount(name, address, busAccNumber);
                        //inserts object into array
                        MyBus.insert(busAccNew);
                        //output - displays
                        System.out.println(busAccNew);
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
               //initialises variable
               char switch2;
               //do while loop - iterates of code inside while true
               do
            {
               //output - displays menu to user
               System.out.println("1 – Record a new sale");
               System.out.println("2 - Make a payment to the account");
               System.out.println("3 - Display current balance");
               System.out.println("4 - Display details of account");
               System.out.println("5 - For business account, change discount to be applied");
               System.out.println("0 - Exit program ");
               System.out.println("Enter your choice: ");
               //allows user to enter data
               switch2 = sc.next().charAt(0);
               //switch -  iterates case depending on users input
               switch (switch2)
               {
                  case '0':
                     System.exit(0);//breaks code
                  case '1':
                     //initialises variable


                     double saleAmount;
                     //do while loop
                     do
                     {
                        //output - displays menu to user
                        System.out.println("Is your account: ");
                        System.out.println("1 - Personal");
                        System.out.println("2 - Business");
                        //initialises variable and allows user to enter data

                         switch2= sc.next().charAt(0);
                        //switch - -  iterates case depending on users input
                        switch(switch2)
                        {
                           case '1':
                              System.out.println("Please enter your name: ");
                              name = sc.next();
                              for (int i = 0; i < MyPer.getNoOfPerAccounts(); i++)//for loop iterates over text inside certain amount of times based on condition - number of accounts
                              {
                                 MyPer.getName(i);//gets index point of account by name
                                 if (name.equals(MyPer.getName(i)))//if name equals the element from my array executed following code
                                 {
                                    System.out.println("Please enter the sale amount: £");
                                    saleAmount = sc.nextDouble();
                                    MyPer.getCurrent(i).recordSale(saleAmount);
                                 }//end if
                                 else//else - if no account with that name exists execute the following code
                                 {
                                    System.out.print("There are no accounts with this name please re-enter");// output - displays message to user
                                    break;//breaks codes
                                 }//end else
                              }//end for


                           case '2':
                              System.out.println("Please enter your name : ");
                              name = sc.next();
                              for (int i = 0; i < MyBus.getNoOfBusAccounts(); i++)//for loop iterates over text inside certain amount of times based on condition - number of properties
                              {
                                 MyBus.getName(i);//gets index point of property with particular street
                                 if (name.equals(MyBus.getName(i)))//if street1 equals the element from my array executed following code
                                 {
                                    System.out.println("Please enter the sale amount: £");
                                    saleAmount = sc.nextDouble();
                                    MyBus.getCurrent(i).recordSale(saleAmount);
                                 } else//else - if no property with that street exists execute the following code
                                 {
                                    System.out.print("There is no account with this name, please re-enter");//display message to user
                                    break;//breaks code
                                 }

                              }//end for
                        }//end switch

                     }while(true);
                  case '2':
                     do
                     {
                        String name2;
                        double paymentAmount;
                        System.out.println("Is your account: ");
                        System.out.println("1 - Personal");
                        System.out.println("2 - Business");
                        char switch3 = sc.next().charAt(0);
                        switch (switch3)
                        {
                           case '1':
                              System.out.println("Please enter your name: ");
                              name2 = sc.next();

                              for (int i = 0; i < MyPer.getNoOfPerAccounts(); i++)//for loop iterates over text inside certain amount of times based on condition - number of accounts
                              {
                                 MyPer.getName(i);//gets index point of account by name
                                 if (name2.equals(MyPer.getName(i)))//if name equals the element from my array executed following code
                                 {
                                    System.out.println("Please enter the payment amount: £");
                                    paymentAmount = sc.nextDouble();
                                    MyPer.getCurrent(i).payment(paymentAmount);
                                 }//end if
                                 else//else - if no account with that name exists execute the following code
                                 {
                                    System.out.print("There are no accounts with this name please re-enter");// output - displays message to user
                                    break;//breaks codes
                                 }//end else
                              }//end for
                           case '2':
                              System.out.println("Please enter your name : ");
                              name2 = sc.next();
                              for (int i = 0; i < MyBus.getNoOfBusAccounts(); i++)//for loop iterates over text inside certain amount of times based on condition - number of properties
                              {
                                 MyBus.getName(i);//gets index point of property with particular street
                                 if (name2.equals(MyBus.getName(i)))//if street1 equals the element from my array executed following code
                                 {
                                    System.out.println("Please enter the payment amount: £");
                                    paymentAmount = sc.nextDouble();
                                    MyBus.getCurrent(i).payment(paymentAmount);
                                 } else//else - if no property with that street exists execute the following code
                                 {
                                    System.out.print("There is no account with this name, please re-enter");//display message to user
                                    break;//breaks code
                                 }
                              }//end for
                        }//end switch
                     }while(true);


                  case '3':
                     String address1;
                     do
                     {
                        System.out.println("Is your account: ");
                        System.out.println("1 - Personal");
                        System.out.println("2 - Business");
                        char case2 = sc.next().charAt(0);
                        switch(case2)
                        {
                           case '1':
                           System.out.println("Please enter your address: ");
                           address1 = sc.next();
                              ArrayList<Integer> display = MyPer.findAccountByAddress(address1);

                           if (display.size() > 0)
                           {
                              for (int i = 0; i < display.size(); i++)
                              {
                                 MyPer.displayBalance(display.get(i));

                              }
                           } else
                           {
                              System.out.println("There is no Personal account with this address");
                              System.out.println("Please re-enter");


                           }
                           case '2':
                           System.out.println("Please enter your address: ");
                           address1 = sc.next();
                           ArrayList<Integer> display2 = MyBus.findAccountByAddress(address1);
                           if (display2.size() > 0)
                           {
                              for (int i = 0; i < MyBus.getNoOfBusAccounts(); i++)
                              {
                                 MyBus.displayBalance(display2.get(i));

                              }
                           } else
                           {
                              System.out.println("There is no business account with this reference number");
                              System.out.println("Please re-enter");

                           }
                           default:
                              System.out.println("Invaild choice please re-enter");
                        }


                        break;
                     }while(true);
                  case '4':

                     do
                     {
                        System.out.println("Is your account: ");
                        System.out.println("1 - Personal");
                        System.out.println("2 - Business");
                        char case2 = sc.next().charAt(0);
                        switch(case2)
                        {
                           case '1':
                              System.out.println("Please enter your address: ");
                              address1 = sc.next();
                              ArrayList<Integer> display = MyPer.findAccountByAddress(address1);

                              if (display.size() > 0)
                              {
                                 for (int i = 0; i < display.size(); i++)
                                 {
                                    MyPer.toString(display.get(i));

                                 }
                              } else
                              {
                                 System.out.println("There is no Personal account with this address");
                                 System.out.println("Please re-enter");


                              }
                           case '2':
                              System.out.println("Please enter your address: ");
                              address1 = sc.next();
                              ArrayList<Integer> display2 = MyBus.findAccountByAddress(address1);
                              if (display2.size() > 0)
                              {
                                 for (int i = 0; i < MyBus.getNoOfBusAccounts(); i++)
                                 {
                                    MyBus.toString(display2.get(i));

                                 }
                              } else
                              {
                                 System.out.println("There is no business account with this reference number");
                                 System.out.println("Please re-enter");

                              }
                           default:
                              System.out.println("Invaild choice please re-enter");
                        }


                        break;
                     }while(true);

                  case '5':
                     double discount =0.0;
                     do
                     {
                        try
                        {
                           System.out.println("What would you like the discount changed to: ");
                            discount = sc.nextInt();
                           MyBus.setDiscount(discount);
                        } catch (NumberFormatException nfe)
                        {
                           System.out.println("Invalid please re-enter");
                        }
                     }while(discount != 0.0);
                  default:
                     System.out.println("Invalid choice please re-enter");
               }
               break;
            } while (switch0 != 0);
            default:
               System.out.println("Invalid choice please re-enter");
         }
      }while(true);
   }//main

}//class
