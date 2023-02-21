package week2;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;
import java.text.*;
public class Donations
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int donation;
      String name;
      int totalDonations=0;
      int largestDonation=0;
      String donor="";
      int numDonations = 0;
      do{
         System.out.print("Please enter your name: ");
         name = keyboard.next();
         System.out.print("\n Please enter the amount you would like to donate");
         donation = keyboard.nextInt();
         totalDonations = totalDonations + donation;
         numDonations = numDonations + 1;
         if (donation > largestDonation)
         {
            largestDonation = donation;
            donor = name;

         }

      }while (totalDonations < 500);
      System.out.println("The largest donation was £" + largestDonation);
      System.out.println("This was donated by: " + donor );
      System.out.println("Number of donations: " + numDonations);
   }
}//class
