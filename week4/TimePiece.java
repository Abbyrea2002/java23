package week4;

public class TimePiece
{
   private String type;
   private double costPrice;
   private String readOut;
   private int hours;
   private int minutes;
   private boolean canTalk;
   private static int noOfTimePieces = 0;

   public TimePiece()
   {
     noOfTimePieces++;
   }// default constructor

   public TimePiece(String pType, double pCostPrice, String pReadOut, boolean pCanTalk)
   {
      type = pType;
      costPrice = pCostPrice;
      readOut = pReadOut;
      canTalk = pCanTalk;

   }// alternative constructor
   public TimePiece(String pType, double pCostPrice, String pReadOut,int pHours, int pMinutes, boolean pCanTalk)
   {
      type = pType;
      costPrice = pCostPrice;
      readOut = pReadOut;
      hours = pHours;
      minutes = pMinutes;
      canTalk = pCanTalk;
   }//alternative constructor

   //getters

  protected String getType()
  {
     return type;
  }//get type
   protected double getCostPrice()
   {
      return costPrice;
   }//get costprice
   protected String getReadOut()
   {
      return readOut;
   }//get readout
   protected int getHours()
   {
      return hours;
   }//get hours
   protected int getMinutes()
   {
      return minutes;
   }//get minutes
   protected boolean getCanTalk()
   {
      return canTalk;
   }//get can talk

   //setters
   protected void setType(String pType)
   {
      type = pType;
   }// set type
   protected void setCostPrice(double pCostPrice)
   {
      costPrice = pCostPrice;
   }// set COST PRICE
   protected void setReadOut(String pReadOut)
   {
      readOut = pReadOut;
   }// set readout
   protected void setHours(int pHours)
   {
      hours = pHours;
   }// set type
   protected void setMinutes(int pMinutes)
   {
      minutes = pMinutes;
   }// set type
   protected void setCanTalk(boolean pCanTalk)
   {
      canTalk = pCanTalk;
   }// set type

   protected String showTime(int pHours, int pMinutes)
   {
    String time = ("The time is " + pHours + ":" + pMinutes);
    return time;
   }//showTime

   protected void setTime(int pHours, int pMinutes)
   {
     setHours(pHours);
     setMinutes(pMinutes);
   }//setTime

   protected void updateTime(int pHours, int pMinutes)
   {

   }//updateTime

   protected void displayDetails()
   {
      System.out.println("Details of clock");
      System.out.println("========================");
      System.out.println("Cost price: £" + costPrice);
      System.out.println("Type of read out: " + readOut);
      System.out.println("Current time: " + showTime());
      System.out.println();
      System.out.println("========================");
   }//display details
   protected static int numberOfTimePieces()
   {
      return noOfTimePieces;
   }
}//class
