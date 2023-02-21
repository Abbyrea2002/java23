package week3;

import java.util.Scanner;

/**
 * Created by abbyr on 21/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class VolumeOfBox5
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
      length = getNumber("length"); // calls the method, passes data to the method and assigns the return value to length
      System.out.println();

      width = getNumber("width"); // calls the method, passes data to the method and assigns the return value to width
      System.out.println();

      height = getNumber("height"); // calls the method, passes data to the method and assigns the return value to height
      System.out.println();

      //calculate the volume
      volume = length * width * height;

      //output the dimensions and volume
      outputVolume(colour, length, width, height);
   } //main

   public static int getNumber(String side)
   {
      Scanner keyboard = new Scanner(System.in);
      int answer;
      do{
         System.out.print("Enter the " + side + " (in the range 1 - 10cms): ");
         answer = keyboard.nextInt();
      }while ((answer <1 ) || (answer >10));
      return answer; // return value

   }//get number static int getNumber() //method

   public static int calculateVolume(int boxLength, int boxWidth, int boxHeight)
   {
      return(boxLength * boxWidth * boxHeight);
   }
   public static void outputVolume(String boxColour, int boxLength, int boxWidth, int boxHeight)
   {
      System.out.print("\nA " + boxColour + " box measuring (in cms) " + boxLength + " x " + boxWidth + " x " + boxHeight);
      System.out.println(" has a volume of " + calculateVolume(boxLength, boxWidth, boxHeight) + "cm cubed");
   }
}//class
