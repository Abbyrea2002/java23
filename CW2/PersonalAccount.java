package CW2;

public class PersonalAccount extends CustomerAccount
{
   public static int perAccNumber = 1001;//initialises personal account number
   public PersonalAccount(){
      super();
      perAccNumber = accRefNo;
      accRefNo = accRefNo + 1;
   }//default constructor including reference to superclass

   public PersonalAccount(String newName, String newAddress )
   {
      super(perAccNumber, newName, newAddress);
   }//overloaded constructor making use of constructor from super class


}
