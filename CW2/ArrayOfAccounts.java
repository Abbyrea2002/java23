package CW2;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfAccounts
{
   //initialises list
   public List<CustomerAccount> accounts;

   public ArrayOfAccounts()
   {
      //accounts is equal to array list customer account
      accounts = new ArrayList<CustomerAccount>();
   }//default constructor

   protected CustomerAccount getCurrent(int position)
   {
      return accounts.get(position);
   }//gets current index positon of account and returns


   protected void insert(CustomerAccount newAccount) {


      accounts.add(newAccount);

   }//adds new account the list

   protected int getNoOfAccounts()
   {
      return accounts.size();
   }//gets number of accounts in list

   protected ArrayList<Integer> findAccountByAccRef(int accRefNo) {
      //creates new list
      ArrayList<Integer> result = new ArrayList<Integer>();
      //for loop iterates over code while index is smaller than number of account in acoounts
      for (int index = 0; index < accounts.size(); index++) {
         //initialises variable
         int i = 0;
         //if account with index position account ref equals acc ref entered by user
         if (accounts.get(index).getAccountRefNo(i) == (accRefNo)) {
            result.add(index);//add to new array
         }//if
      }//for
      return result;//return array containing account
   }//finds account uses account ref entered by user
}
