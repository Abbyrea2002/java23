package week2;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;
import java.text.*;
public class FizzBuzz2
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int start;
      int finish;
      System.out.println("Enter the number would u like to start with");
      start = keyboard.nextInt();
      System.out.println("Enter the number you would like to finish with");
      finish = keyboard.nextInt();
      for(int count = start; count <= finish; count ++)
      {
         int calc1;
         int calc2;
         calc1 = count % 3;
         calc2 = count % 7;

         if (calc1 == 0 && calc2 == 0)
         {
            if (calc1 == 0)
            {
               System.out.println("Fizz");
            }
            if (calc2 == 0)
            {
               System.out.println("Buzz");
            }
         }else
         {
            System.out.println(count);
         }
      }
   }
}//class
