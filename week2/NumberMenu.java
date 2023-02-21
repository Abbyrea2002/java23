package week2;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;
import java.text.*;
import java.math.*;
public class NumberMenu
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      char response = 'y';
      do
      {
         int number;
         int choice;
         final int ZERO = 0;

         System.out.println("Enter a number: ");
         number = keyboard.nextInt();
         do
         {
            System.out.println("1. Test if zero");
            System.out.println("2. Find the square root ");
            System.out.println("3. Test if odd or even");
            System.out.println("4. Enter another number or exit");
            System.out.println("Please enter your choice: ");
            choice = keyboard.nextInt();

            switch (choice)
            {

               case 1:
                  if (number > ZERO)
                  {
                     System.out.println("The number " + number + "is greater than " + ZERO);
                  } else
                  {
                     if (number == ZERO)
                     {
                        System.out.println("The number" + number + "is equal to " + ZERO);

                     } else
                     {
                        System.out.println("The number" + number + "is less than" + ZERO);
                     }

                  }
               case 2:
                  if (number >= 0)
                  {
                     System.out.println("The square root of " + number + "=" + Math.sqrt(number));
                  } else
                  {
                     System.out.println("This number has no square root");
                  }
               case 3:
                  System.out.println(number);
                  if (number % 2 == 0)
                  {
                     System.out.println("is an even number");
                  } else
                  {
                     System.out.println("is an odd number");
                  }
               case 4:
                  System.out.println("do u want to enter another number (Y/N)? ");
                  response = keyboard.nextLine().charAt(0);
               default:
                  System.out.println("invalid choice");
            }

         } while (choice != 4);
      } while (response == 'y' || response == 'Y');
   }
}//class
