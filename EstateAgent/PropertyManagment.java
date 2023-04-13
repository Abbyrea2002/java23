package EstateAgent;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class PropertyManagment
{

   public static void main(String args[])

   {
      Scanner sc = new Scanner(System.in);

      //creates ArrayOfProperties object
      ArrayOfProperties MyArray = new ArrayOfProperties();

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

      boolean valid = false;
      do //do while loop-pre test loop iterates over the code inside until the user decides to exit
      {
         //displays menu to user
         System.out.println("1 - List All Properties");
         System.out.println("2 – Search for a Property in a Particular Town");
         System.out.println("3 – Register a New Property");
         System.out.println("4 - Edit Details Of a Property");
         System.out.println("5 - Delete a Property");
         System.out.println("0 - Exit");
         System.out.println("Enter your choice: ");

         //allows user to input their menu choice
         int option = sc.nextInt();


         if (option == 1){
            //displays property details when user enters 1 using contructor from ArrayOfProperties
            MyArray.displayAllProperties();
         }//if
        else if(option == 2){
          System.out.print("");

        }//else if
          else if(option == 3){

         }//else if
         else if(option == 4){

         }//else if
         else if(option == 5){

         }//else if
         else if(option == 0){
          break;
         }//else if
         else
         {
            System.out.println("Invalid choice - please re-enter");

      }while(option  >= 0);





   }//main
}//class

