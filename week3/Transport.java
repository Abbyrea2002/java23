package week3;

import java.util.Scanner;

/**
 * Created by abbyr on 22/02/2023
 * program to read in the weights of containers until -1 is entered and calculate the cost of haulage depending on the reading
 */
import java.util.Scanner;
import java.text.*;
public class Transport
{
   public static int getWeight(int number){
      Scanner keyboard = new Scanner(System.in);
      int weight;
      System.out.print("Please enter the weight of container " + number + "(in kg) or -1 to finish");
      weight = keyboard.nextInt();
      return weight;
   }

   public static int calculateCost(int number, int weight)
   {
      int cost;
      final int HIGHWEIGHT = 1000;
      final int HIGHCOST = 1200;
      final int LOWWEIGHT = 500;
      final int MIDDLECOST = 750;
      final int LOWCOST = 400;
      final int DISCOUNTNUMBER = 5;
      final double DISCOUNTRATE = 0.25;
      if (weight > HIGHWEIGHT)
      {
         cost = HIGHCOST;
      }//if
      else
      {
         if (weight > LOWWEIGHT)
         {
            cost = MIDDLECOST;
         }
         else
         {
            cost = LOWCOST;
         }
      }//else
      if (number <=DISCOUNTNUMBER)
      {
         cost = cost - (cost * DISCOUNTRATE);
      }//if
      return cost;
   }

   public static void main(String[] args)
   {
      int weight;
      final int TERMINATOR = -1;
      int totalWeight = 0;
      int numberOfContainers = 0;
      double cost;
      Scanner keyboard = new Scanner(System.in);
      weight = getWeight(1);
      while(weight!=TERMINATOR)
      {
         totalWeight = weight + totalWeight;
         weight= getWeight(numberOfContainers + 1);

      }//while
      cost = calculateCost(numberOfContainers, totalWeight);
      System.out.println("The total number of containers is        " + numberOfContainers);
      System.out.println("The total weight of the containers is    " + totalWeight + "kg");
      System.out.println("The total cost of transport is           £" + String.format("%.2f", cost));
   }

}//class
