package week2;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;
import java.text.*;
public class Loops
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      //for loops (repeats s set a certain number of times)
      for (int count =1; count <=10; count++)
      {
         System.out.print("Number" + count);
      }//for loop

      //do ... while loop(post test loop, repeats atleast once)
      int month;
      do{
         System.out.print("\n Enter a month (1-12): ");
         month = keyboard.nextInt();
      }while (month <1|| month> 12);

      //while loop - pretest loop, may never repeat or execute
      final int TERMINATOR = -999;
      int number, total = 0;
      System.out.println("Enter the first number");
      number = keyboard.nextInt();
      while(number!=TERMINATOR)
      {
         total = total + number;
         System.out.println("Enter a number or (-999) to finish: ");
         number = keyboard.nextInt();
      }//while
      System.out.print("\n the total of the number is "+ total);
   }
}//class
