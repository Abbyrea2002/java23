package week5;

public class MinMax
{
   public static void main(String args[])
   {
     int[] list = {50, 2, 8, 34, 75, 19, 20, 44, 31, 60};

      int largest = list [0];
      int smallest = list [0];

      for(int index = 1; index < list.length; index++)
      {
         if (list [index] < largest)
         {
            largest = list [index];
         }//if
         else
         {
          if(list [index] < smallest)
          {
           smallest = list [index];
          }//if
         }//else
      }//for
      System.out.println("the largest number in the list is " + largest);
      System.out.println("the smallest number in the list is " + smallest);
   }//main
}//class
