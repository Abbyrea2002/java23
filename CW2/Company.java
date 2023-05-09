package CW2;

import EstateAgent.ArrayOfProperties1;
import EstateAgent.Property;

import java.util.ArrayList;
import java.util.Scanner;

public class Company
{
   private static int accRefNo;
   public static void main (String args[])

   {

      PersonalAccount MyPer = new PersonalAccount();
      BusinessAccount MyBus = new BusinessAccount();
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
         switch (option)
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


               do
               {
                  System.out.println("====Account type====");
                  System.out.println("1 - Personal Account ");
                  System.out.println("2 - Business Account ");
                  System.out.println("Enter your choice: ");
                  char answer = sc.next().charAt(0);
                  switch (answer)
                  {
                     case '1':
                        int perAccNumber = 1001;
                        PersonalAccount perAccNew = new PersonalAccount(name, address, perAccNumber);
                        MyPer.insert(perAccNew);
                        System.out.println(MyPer);
                        break;
                     case '2':

                        int busAccNumber = 2001;
                        BusinessAccount busAccNew = new BusinessAccount(name, address, busAccNumber);
                        MyBus.insert(busAccNew);
                        System.out.println();
                        break;
                     default:
                        System.out.println("Invalid choice please re-enter");
                  }
                  break;
               } while (true);
               break;


            case 2:
               char choice;
               do
            {
               System.out.println("1 – Record a new sale");
               System.out.println("2 - Make a payment to the account");
               System.out.println("3 - Display current balance");
               System.out.println("4 - Display details of account");
               System.out.println("5 - For business account, change discount to be applied");
               System.out.println("0 - Exit program ");
               System.out.println("Enter your choice: ");

               choice = sc.next().charAt(0);
               switch (choice)
               {
                  case '0':
                     System.exit(0);
                  case '1':
                     int accref;
                     double saleAmount;
                     do
                     {
                        System.out.println("Is your account: ");
                        System.out.println("1 - Personal");
                        System.out.println("2 - Business");
                        char case0 = sc.next().charAt(0);
                        switch(case0)
                        {
                           case '1':
                              System.out.println("Please enter your account reference: ");
                              accref = sc.nextInt();
                              for (int i = 0; i < MyPer.getNoOfPerAccounts(); i++)//for loop iterates over text inside certain amount of times based on condition - number of properties
                              {
                                 MyPer.getAccountRefNo(i);//gets index point of property with particular street
                                 if (accref.equals(MyPer.getAccountRefNo(i)))//if street1 equals the element from my array executed following code
                                 {
                                    System.out.println("Please enter the sale amount: £");
                                    saleAmount = sc.nextDouble();
                                    MyPer.getCurrent(i).recordSale(saleAmount);

                                 } else//else - if no property with that street exists execute the following code
                                 {
                                    System.out.println("There is no account with this address please re-enter");
                                 }
                              }


                           case '2':
                              System.out.println("Please enter your address: ");
                              address2 = sc.next();
                              for (int i = 0; i < MyBus.getNoOfBusAccounts(); i++)//for loop iterates over text inside certain amount of times based on condition - number of properties
                              {
                                 MyBus.getAddress(i);//gets index point of property with particular street
                                 if (address2.equals(MyBus.getAddress(i)))//if street1 equals the element from my array executed following code
                                 {
                                    System.out.println("Please enter the sale amount: £");
                                    saleAmount = sc.nextDouble();
                                    MyBus.getCurrent(i).recordSale(saleAmount);
                                 } else//else - if no property with that street exists execute the following code
                                 {
                                    System.out.print("There are no account with this address please re-enter");
                                 }
                              }
                        }

                     }while(true);
                  case '2':
                     System.out.println("Is your account: ");
                     System.out.println("1 - Personal");
                     System.out.println("2 - Business");
                     char case1 = sc.next().charAt(0);
                     System.out.println("Please enter your address: ");
                     int accRef1 = sc.nextInt();
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
                           ArrayList<Integer> display = MyPer.findBalanceByAddress(address1);

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
                           ArrayList<Integer> display2 = MyBus.findBalanceByAddress(address1);
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
                        System.out.println("Please enter your account reference number: ");
                        int accRef = sc.nextInt();
                        ArrayList<Integer> display = MyPer.findBalanceByRef(accRef);
                        if ((accRef >= 1001) || (accRef <= 1999))
                        {
                           if (display.size() > 0)
                           {
                              for (int i = 0; i < display.size(); i++)
                              {
                                 MyPer.toString(display.get(i));

                              }
                           } else
                           {
                              System.out.println("There is no Personal account with this account reference number");
                              System.out.println("Please re-enter");


                           }
                        } else if ((accRef >= 2001) || (accRef <= 2999))
                        {
                           if (display.size() > 0)
                           {
                              for (int i = 0; i < display.size(); i++)
                              {
                                 MyBus.toString(display.get(i));

                              }
                           } else
                           {
                              System.out.println("There is no Personal account with this account reference number");
                              System.out.println("Please re-enter");


                           }

                        } else
                        {
                           System.out.println("Invaild number please re-enter");
                        }
                        break;
                     }while(true);
                  case '5':
                  default:
                     System.out.println("Invalid choice please re-enter");
               }
               break;
            } while (choice != 0);
            default:
               System.out.println("Invalid choice please re-enter");
         }
      }while(true);
   }//main

}//class
