package week5;

import java.util.Scanner;

public class parameters
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);

      int length, width;
      length = 20;
      width = 5;
      System.out.println("The area is " + multiply(length, width));

      int number = 0;
      char letter = 'a';
      boolean test = false;
      System.out.println("number = " + number + ";  letter = " + letter + ";  test = " + test);

      //contents of array is being change in trhe testPrimitives method
       testPrimitives(number, letter, test);
      System.out.println("number = " + number + ";  letter = " + letter + ";  test = " + test);

      char [] letters = {'a', 'b', 'c'};
      System.out.println("letters[0] = " + letters[0]+ "; letters[1] = " + letters[1]+ "; letters[2] = " + letters[2]);

      //contents of array is being changed by the testArray method
      testArray (letters);
      System.out.println("letters[0] = " + letters[0]+ "; letters[1] = " + letters[1]+ "; letters[2] = " + letters[2]);
   }
      // Method to return the multiplication of 2 numbers
      public static int multiply ( int num1, int num2)
      {
        return (num1 * num2);
      }//multiply
       public static void testPrimitives(int aNumber, char aLetter, boolean aTest)
       {
         aNumber = aNumber + 10;
         aLetter = 'R';
         aTest = !(aTest);
       }//testPrimitives
     public static void testArray(char [] someLetters)
     {
        someLetters = new char [3];
     someLetters [0] = 'X';
     someLetters [1] = 'Y';
     someLetters [2] = 'Z';
     }//testArray

   }

