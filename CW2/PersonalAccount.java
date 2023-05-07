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
      perAccNumber = perAccNumber + 1;
      perAccList = new ArrayList<PersonalAccount>();
   }//default constructor including reference to superclass

   public PersonalAccount(String newName, String newAddress )
   {
      super(perAccNumber, newName, newAddress);
   }//overloaded constructor making use of constructor from super class


   public PersonalAccount(String name, String address, int perAccNumber)
   {
   }
   protected int getNoOfPerAccounts()
   {
      return perAccList.size();
   }

   protected void insert(PersonalAccount perAccNew) {


      perAccList.add(perAccNew);

   }
   protected int findBalanceByRef(int perAccNumber) {
      boolean found = false;
      int index = 0, position = -1;
      // Keep checking until the account reference  is found or all accounts have been checked
      do {
         // Check if the street at the index position equals the street passed as the parameter
         if (perAccList.get(index).getAccountRefNo().equals(accRefNo)) {
            found = true;
            position = index;
         }
         index++;
      } while ((!found) && (index < perAccList.size()));
      // Return the index position of the account with the required account reference (or -1 if not found)
      return position;
   }

   protected PersonalAccount getCurrent(int position)
   {
      return perAccList.get(position);
   }



}
