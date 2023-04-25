package company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class testEmployee
{
  static Scanner sc = new Scanner(System.in);
   public static String getText(String message)
   {
      System.out.print(message);
      return sc.nextLine();
   }
   public static void main (String args[])

   {
      DecimalFormat df =  new DecimalFormat("0,000.00");
      String number, name;
      double annualSalary, pay;
      int hours;

      System.out.print("TEST EMPLOYEE");
      System.out.print("=============");
      number = getText("employee number: ");
      name = getText("employee name: ");
      employee employee1 = new fullTimeEmployee(number, name);
      employee1.welcome();

      System.out.print("TEST EMPLOYEE");
      System.out.print("=============");
      number = getText("employee number: ");
      name = getText("employee name: ");
      fullTimeEmployee employee2 = new fullTimeEmployee(number, name);
      employee2.welcome();

      System.out.print("what is " + employee2.getName() + "'s annual salary? £");
      annualSalary = sc.nextDouble();
      employee2.setAnnualSalary(annualSalary);
      sc.nextLine();
      System.out.println("employee: " + employee2.getNumber());
      System.out.print("monthly pay: £ " + df.format(employee2.calculateMonthlyPay()) + "\n");

      System.out.println(employee2);

      System.out.print(employee2.getStatus() + "Employee\n");
   }
}
