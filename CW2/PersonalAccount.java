package CW2;



import java.util.ArrayList;
import java.util.List;

public class PersonalAccount extends CustomerAccount
{
   //initialses variables
   //private - can only access on this package
   //public - can be accessed

  public static int perAccNumber = 1001;

   private List<ArrayPer> perAccList;
   public PersonalAccount()
   {
      perAccList = new ArrayList<CustomerAccount1>();
   }

   public PersonalAccount(String newName, String newAddress, int perAccNumber )
   {

      super(perAccNumber, newName, newAddress);
      perAccNumber = accRefNo;
      perAccNumber = perAccNumber + 1;

   }//overloaded constructor making use of constructor from super class


   protected int getNoOfPerAccounts()
   {
      return perAccList.size();
   }

   protected void insert(PersonalAccount perAccNew) {


      perAccList.add(perAccNew);

   }

   protected ArrayList<Integer> findAccountByAddress(String address) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int index = 0; index < perAccList.size(); index++) {
         if (perAccList.get(index).getAddress().equals(address)) {
            result.add(index);
         }//if
      }//for
      return result;
   }


   protected CustomerAccount getCurrent(int position)
   {
      return perAccList.get(position);
   }



}
