package week4;

import java.util.Calendar;

public class car
{
   //private = -
   // public = +
   private String reg;
   private String make;
   private String colour;
   private int manYear;
   private static int noOfCars = 0;
   public car ()
   {
     noOfCars++;
   }//default constructor

   public car (String pReg, String pMake, String pColour, int pManYear)
   {

      //
      reg = pReg;
      make = pMake;
      colour = pColour;
      manYear = pManYear;

   }//alternative constructor
   public car(String pColour)
   {
      //user defined constructor method
      colour = pColour;

   }

   public car (String pReg, String pColour, int pManYear)
   {
      //assign attributes that are passed in
      reg = pReg;
      colour = pColour;
      //better to assign value
      manYear = 0;

   }//alternative constructor

   public car (String pReg, String pMake)
   {
      reg = pReg;
      make = pMake;
   }//alternative constructor

   //getters

   protected String getReg()
   {
      return reg;
   }//getReg
   protected String getMake()
   {
      return make;
   }//getMake
   protected String getColour()
   {
      return colour;
   }//getColour
   protected int getManYear()
   {
      return manYear;
   }//getManYear


   //Setters
   protected void setMake(String pMake)
   {
     make = pMake;
   }//set
   protected void setColour(String pColour)
   {
      colour = pColour;
   }//set
   protected void setManYear(int pManYear)
   {
      manYear = pManYear;
   }//set
   protected void setReg(String pReg)
   {
      reg = pReg;
   }//set
   protected void printCarInfo()
   {
      //void because not being returned
      //protect only can be used inside package week 4 = #
      System.out.println("CAR DETAILS");
      System.out.println("The registration number is " + reg);
      System.out.println("The make of the car is " + make);
      System.out.println("The car is " + colour + ", and was manufactured in " + manYear);
      System.out.println("=============");
   }
   protected int ageOfCar(int pManYear)
   {
      int year = Calendar.getInstance().get(Calendar.YEAR);
      int age;
      if (pManYear == 0)
      {
         age = -1;
      }//if
      else
      {
          age = year - pManYear;

      }//else
      return age;
   }
   protected static int numberOfCars()
   {
      return noOfCars;
   }//numberOfCars

}//car

