package week5;

import java.util.Scanner;
public class ArrayRevision
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);



      final int MAX = 8;
      int [] height = new int [MAX];
      for (int count = 0; count < MAX; count++) {
         System.out.print("Enter a height : ");
         height [count] = keyboard.nextInt();
      }//for
      for (int count : height) {
         System.out.println ("Height: " + count);
      }//for

      height [1] = 72;
      height [7] = 10 * 4;
      height [0] = height [7];
      int count = 2;
      height [count] = 2 * 12;
      height [count*2] = 29 / count;
      height [count+4] = height [2];

      System.out.println("The first element of the array is " + height [0]);
      System.out.println("The sixth element of the array is " + height [5]);
      System.out.println("The third element of the array is " + height [2]);
      System.out.println("The length of the array is " + height.length);

      for (int index = 0; index < height.length; index++) {
         System.out.println("Index " + index + " is " + height [index]);
      }//for

      int average;
      average = (height [0] + height [1] + height [2]) /3;
      System.out.print("average: " + average);

      int middle;
      middle = height [height.length/2];
      System.out.print("middle: " + middle);

      int pick;
      pick = height [(int) (Math.random()*height.length)];
      System.out.print("pick: " + pick);
   }
}
