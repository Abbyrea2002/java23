package company;

abstract public class employee
{
   private String number;
   private String name;

   public employee()
   {}//default constructor
   public employee(String empNumber, String empName)
   {
      number = empNumber;
      name = empName;

   }

   protected String getNumber()
   {
      return number;
   }//get number
   protected String getName()
   {
      return name;
   }//get name

   protected void setName(String empName)
   {
      name = empName;
   }//set name

protected void welcome()
{
   System.out.print("Welcome to employee class");
}

   public String toString()
   {
      return "employee" + number + " is called " + name + "\n";
   }

   abstract protected String getStatus();
}

