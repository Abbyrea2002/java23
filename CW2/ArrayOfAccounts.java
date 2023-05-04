package CW2;

import EstateAgent.Property;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfAccounts
{
   private List<ArrayOfAccounts> accounts;

   public ArrayOfAccounts() {
      accounts = new ArrayList<ArrayOfAccounts>();
   }//ArrayOfAccounts

   protected int getNoOfAccounts() {
      return accounts.size();
   }
}
