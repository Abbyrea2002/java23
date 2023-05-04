package CW2;

import EstateAgent.Property;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfAccounts
{
   public static int accRefNo;

   private List<ArrayOfAccounts> accounts;

   public ArrayOfAccounts() {
      accounts = new ArrayList<ArrayOfAccounts>();
   }//ArrayOfAccounts

   public ArrayOfAccounts(String name, String address, int perAccNumber)
   {
   }

   protected int getNoOfAccounts() {
      return accounts.size();
   }
   protected void insert(ArrayOfAccounts newAccount) {
      accounts.add(newAccount);

   }//insert property

   protected int getAccountRefNo()
   {
      return accRefNo;
   }//get account reference number
}
