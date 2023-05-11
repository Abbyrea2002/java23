package CW2;



import java.util.ArrayList;
import java.util.List;

public class PersonalAccount extends CustomerAccount
{
   private static String name;
   private static String address;
   private static double balance;
   public static int perAccNumber = 1001;//initialises personal account number

   private List<PersonalAccount> perAccList;
   public PersonalAccount(){
      super();
      perAccNumber = accRefNo;
      perAccNumber = perAccNumber + 1;
      perAccList = new ArrayList<PersonalAccount>();
   }//default constructor including reference to superclass

   public PersonalAccount(String newName, String newAddress, int perAccNumber )
   {
      super(perAccNumber, newName, newAddress);
      newName = name;
      newAddress = address;
   }//overloaded constructor making use of constructor from super class


  /// public PersonalAccount(String name, String address, int perAccNumber)
   {

   }
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


   protected PersonalAccount getCurrent(int position)
   {
      return perAccList.get(position);
   }



}
