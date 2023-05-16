package CW2;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfAccounts
{
   public List<CustomerAccount> accounts;
   public ArrayOfAccounts()
   {
      accounts = new ArrayList<CustomerAccount>();
   }

   protected CustomerAccount getCurrent(int position)
   {
      return accounts.get(position);
   }

   protected void insert(CustomerAccount newAccount) {


      accounts.add(newAccount);

   }

   protected int getNoOfAccounts()
   {
      return accounts.size();
   }

   protected ArrayList<Integer> findAccountByAccRef(int accRefNo) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int index = 0; index < accounts.size(); index++) {
         int i = 0;
         if (accounts.get(index).getAccountRefNo(i) == (accRefNo)) {
            result.add(index);
         }//if
      }//for
      return result;
   }
}
