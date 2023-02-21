package week2;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;
import java.text.*;
public class NumberList
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int choice = 0;
      System.out.print("Please enter choice (1-4) > ");
      choice = keyboard.nextInt();
      switch (choice)
      {
         case 1:
            System.out.println("World cup hockey 2023");
            break;
         case 2:
            System.out.println("World cup football 2022");
            break;
         case 3:
            ;
            System.out.println("World cup rugby 2023");
            break;
         case 4:
            ;
            System.out.println("You have chosen to EXIT the system");
         default:
            System.out.println("You have not chosen 1, 2, 3 or 4");
      }//switch
   }//main
}//class
