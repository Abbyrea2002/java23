package CW2;



import java.util.ArrayList;
import java.util.List;

public class PersonalAccount extends CustomerAccount
{
   //initialses variables
   //private - can only access on this package
   //public - can be accessed

  public static int perAccNumber = 1001;




   public PersonalAccount(String newName, String newAddress, int perAccNumber )
   {

      super(perAccNumber, newName, newAddress);
      perAccNumber = accRefNo;
      perAccNumber = perAccNumber + 1;

   }//overloaded constructor making use of constructor from super class

}
