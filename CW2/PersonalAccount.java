package CW2;
//created by abby on the 6/5/2023
//a sub class to override a constructor from it super class


import java.util.ArrayList;
import java.util.List;

public class PersonalAccount extends CustomerAccount
{
   //initialses variables
   //private - can only access on this package
   //public - can be accessed

  public static int perAccNumber = 1001;




   public PersonalAccount(String newName, String newAddress, int newAccRef )
   {

      super(perAccNumber, newName, newAddress);
      perAccNumber = accRefNo;
      perAccNumber = perAccNumber + 1;
      balance =0;

   }//overloaded constructor making use of constructor from super class

}
