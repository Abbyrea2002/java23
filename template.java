/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;
import java.text.*; //decimals!!
public class template
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      double cost;
      System.out.print("What is the cost? ");
      cost = keyboard.nextDouble();
      System.out.println("The cost is £" + cost);

      /*
      String name = "Rachel";
      int age = 21;
      System.out.println ("My name is " + name + ", i am " + age + " years old.");
      int number1 = 14;
      double number2 = 3;
      double result1,  result2;
      int number3 = 14;
      int number4 = 3;
      int result3;
      double result4;
      result1 = number1 / number2;
      System.out.println("Result is: " + result1);
      result2 = number1 % number2;
      System.out.println("Result 2 is: " + result2);
      result3 = number3/number4;
      System.out.println("Result 3 is: " + result3);
      result4 = number3 % number4;
      System.out.println("Result 4 is: " + result4);
      */

      DecimalFormat df = new DecimalFormat("00.00");
      double radius = 5;
      System.out.println("Circle radius = " + df.format(radius) + " to 2 d.p.");
   }
}//class
