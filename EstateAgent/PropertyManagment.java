package EstateAgent;

import java.util.Scanner;

public class PropertyManagment
{

   public static void main(String args[])

   {
      //initialises variables
      int option;
      Scanner keyboard = new Scanner(System.in);
      //creates ArrayOfProperties object
      ArrayOfProperties MyArray = new ArrayOfProperties();

      //creates property objects
      Property oneProperty = new Property("Recreation Road ", "Larne ", "Bt40 1ew ", "semi detached", "richard green", "07565899835", 1);
      Property twoProperty = new Property ("Lindara Drive", "Carrick", "BT40 2JC", "Detached", "Sandra Nelson", "07999365757", 2);
     // Property threeProperty = new Property ();
     // Property fourProperty = new Property ();
      //Property fiveProperty = new Property ();

      //inserts property details from oneProperty object into array
      MyArray.insert(oneProperty);
      MyArray.insert(twoProperty);
      //MyArray.insert(threeProperty);
      //MyArray.insert(fourProperty);
      //MyArray.insert(fiveProperty);

      do
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
         option = keyboard.nextInt();

         if (option == 1){
            MyArray.displayAllProperties();
         }//if
         else if(option == 2){

         }//else if
         else if(option == 3){

         }//else if
         else if(option == 4){

         }//else if
         else if(option == 5){

         }//else if
         else if(option == 0){

         }//else if
         else{
            System.out.println("Invalid choice - please re-enter");
         }

      }while(option  >= 0 && option <=5 );


      //displays property details using contructor from ArrayOfProperties
      MyArray.displayAllProperties();



   }//main
}//class

