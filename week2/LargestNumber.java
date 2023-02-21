package week2;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;
import java.text.*;
public class LargestNumber
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      final int TERMINATOR = -999;
      int number;
      int Largest = 0;
      System.out.println("Enter the first number");
      number = keyboard.nextInt();
      while(number!=TERMINATOR)
      {

         System.out.println("Enter a number or (-999) to finish: ");
         number = keyboard.nextInt();
         if (number > Largest)
         {
            Largest = number;
         }

      }//while
      System.out.println("The largest number is: " + Largest);
   }//main
}//class
