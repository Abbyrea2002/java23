package week1;
import java.util.Scanner;
public class FizzBuzz {
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int number;
      System.out.println("Please insert a number");
      number = keyboard.nextInt();
      int calc1;
      int calc2;
      calc1 = number % 3;
      calc2 = number % 7;

      if (calc1 == 0)
      {
         System.out.println("Fizz");

      }else
      {
         System.out.println(number);
      }
      if (calc2 == 0)
      {
         System.out.println("Buzz");

      }else
      {
         System.out.println(number);
      }
   }
}
