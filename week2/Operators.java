package week2;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;
import java.text.*;
public class Operators
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int mark;
      System.out.print("Please enter your mark");
      mark = keyboard.nextInt();
      if (mark >= 0 && mark <= 100)
      {
         System.out.println("Mark entered is valid");
      }//if
      else
      {
         System.out.println("Not a valid mark");
      }//else
      char letter;
      System.out.print("Enter a character: ");
      letter = keyboard.nextLine().charAt(0);
      if ((letter == 'x') || (letter == 'y'))
      {
         System.out.println("the character is x or y");

      }//if
      else
      {
         System.out.println("The character is NOT x or y");
      }//else
      boolean found = false;
      int number = 12;
      int searchValue = 5;

      if (number == searchValue)
      {
         found = true;
      }//if
      if (!found)
      {
         System.out.println("You have not found the number");
      }//if
   }
}//class
