package company;
/**
 * Created by Josh on 25/04/2023
 * Comments about the program here
 */

import java.util.Scanner;
import java.text.*;
import java.text.DecimalFormat;

public class fullTimeEmployee extends employee
{
   DecimalFormat df = new DecimalFormat("0,000.00");

   private double annualSalary;

   public fullTimeEmployee()
   {
      super();
   }

   public fullTimeEmployee(String empNumber, String empName)
   {
      super(empNumber,empName);
   }

   protected double getAnnualSalary()
   {
      return annualSalary;
   }

   protected void setAnnualSalary(double empSalary)
   {
      annualSalary = empSalary;
   }

   protected double calculateMonthlyPay()
   {
      return annualSalary / 12;
   }
   protected void welcome()
   {
      System.out.println("welcome to Full Time Employee Class");
   }

  // public String toString()
  // {
    //  return ("Employee" + getNumber() + "\n monthly pay: £ " + df.format(calculateMonthlyPay()) + "\n");
 //  }

   public String toString()
   {
      return (super.toString() + " monthly pay: £ " + df.format(calculateMonthlyPay()) + "\n");
   }

   protected String getStatus()
{
   return("Full time");
}
}
