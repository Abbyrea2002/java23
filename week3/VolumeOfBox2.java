package week3;

import java.util.Scanner;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class VolumeOfBox2
{
   public static void main(String[] args)
   {

      Scanner keyboard = new Scanner(System.in);

      String colour;
      int length, width, height, volume;

      //Read in the colour of the box
      System.out.print("What is the colour of the box? ");
      colour = keyboard.nextLine();

      //Read in the length , width and height of the box and check each is in the range 1-10
      do
      {
         System.out.print("Enter the length of the box (in the range 1 - 10cms): ");
         length = keyboard.nextInt();
      }while ((length < 1 ) || (length > 10));
      System.out.println();
      do
      {
         System.out.print("Enter the width of the box (in the range 1 - 10cms): ");
         width = keyboard.nextInt();
      }while ((width < 1) || (width >10));
      System.out.println();
      do
      {
         System.out.print("Enter the height of the box (in the range 1 - 10cms): ");
         height = keyboard.nextInt();
      }while ((height < 1) || (height >10));
      System.out.println();

      //calculate the volume
      volume = length * width * height;

      //output the dimensions and volume
      System.out.print("\nA" + colour + " box measuring (in cms) " + length + " x " + width + " x " + height);
      System.out.println(" has a volume of " + volume + "cm cubed");
   } //main

   public static int getNumber()
   {
      Scanner keyboard = new Scanner(System.in);
      int answer;
      do{
          System.out.print("(in the range 1 - 10cms): ");
          answer = keyboard.nextInt();
         }while ((answer <1 ) || (answer >10));
      return answer; // return value

}//get number static int getNumber() //method

}//class
