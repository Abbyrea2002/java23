package company;
import java.text.DecimalFormat;
public class casualEmployee extends employee
{
   DecimalFormat df =  new DecimalFormat();

   private double hourlyPay;

   public casualEmployee()
   {
      super();

   }

   public casualEmployee(String empNumber, String empName)
   {
      super(empNumber, empName);
   }

   protected double getHourlyPay()
   {
      return hourlyPay;
   }

   protected void setHourlyPay(double empHourlyPay)
   {
      hourlyPay = empHourlyPay;
   }

   protected double calculateWeeklyPay(int empHours)
   {
      return empHours * hourlyPay;
   }
   protected String getStatus()
   {
      return("Casual");
   }
}
