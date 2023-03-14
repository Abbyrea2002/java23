package week5;

import java.util.Scanner;

public class Array2D
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      //int [][] grid = { {20, 25, 34, 19, 22},
           // {11, 17, 15, 45, 26},
           // {25, 22, 9, 41, 13} };

      final int ROWS = 3;
       final int COLUMNS = 5;
       int [][] grid = new int [ROWS][COLUMNS];
       for (int row = 0; row < ROWS; row++)
       {
       for (int column = 0; column < COLUMNS; column++){
         System.out.print("Enter a number (row " + row +
               ", column " + column + ") : ");
          grid [row][column] = keyboard.nextInt();
         }//for
       }//for

      grid [2] [4] = 7;

      for (int row = 0; row < grid.length; row++) {
         for (int column = 0; column < grid[row].length;
              column++) {
            System.out.print("\t" + grid [row][column]);
         }//for
         System.out.println();
      }//for
      System.out.println("length of row 1 = " + grid [1].length);
   }//main
}//class
