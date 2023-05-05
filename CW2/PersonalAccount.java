package CW2;



import java.util.ArrayList;
import java.util.List;

public class PersonalAccount extends CustomerAccount
{
   public static int perAccNumber = 1001;//initialises personal account number

   private List<PersonalAccount> perAccList;
   public PersonalAccount(){
      super();
      perAccNumber = accRefNo;
      accRefNo = accRefNo + 1;
      perAccList = new ArrayList<PersonalAccount>();
   }//default constructor including reference to superclass

   public PersonalAccount(String newName, String newAddress )
   {
      super(perAccNumber, newName, newAddress);
   }//overloaded constructor making use of constructor from super class


   public PersonalAccount(String name, String address, int perAccNumber)
   {
   }

   protected void insert(PersonalAccount perAccNew) {


      perAccList.add(perAccNew);

   }
}
