package EstateAgent;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by abby rea  on 07/03/2023
 * a program containing a class which houses eight which will aid an estate agent in  displaying details on multiple properties to a user
 */
public class Property
{
   //defining attributes
   private String street;
   private String town;
   private String postcode;
   private String propertyType;
   private String nameOfVendor;
   private String vendorContactNumber;
   private int price;
   private Date dateRegistered;



   //define constructor and initialing the first seven attributes
   public Property(String pStreet, String pTown, String pPostcode, String pPropertyType, String pNameOfVendor, String pVendorContactNumber, int pPrice)
   {
     street = pStreet;
     town = pTown;
     postcode = pPostcode;
     propertyType = pPropertyType;
     nameOfVendor = pNameOfVendor;
     vendorContactNumber = pVendorContactNumber;
     price = pPrice;
     dateRegistered = new Date();
   }//constructor and initalising attributes



   protected void setStreet(String pStreet)
   {
      street = pStreet;
   }//set street
   protected void setTown(String pTown)
   {
      town = pTown;
   }//set town
   protected void setPostcode(String pPostcode)
   {
      postcode = pPostcode;
   }//set postcode
   protected void setPropertyType(String pPropertyType)
   {
      propertyType = pPropertyType;
   }//set property
   protected void setNameOfVendor(String pNameOfVendor)
   {
      nameOfVendor = pNameOfVendor;
   }//set name of vendor
   protected void setVendorContactNumber(String pVendorContactNumber)
   {
      vendorContactNumber = pVendorContactNumber;
   }//set vendor contact name
   protected void setPrice(int pPrice)
   {
      price = pPrice;
   }//set price

   protected String getStreet()
   {
      return street;
   }//get street
   protected String getTown()
   {
      return town;
   }//getReg
   protected String getPostcode()
   {
      return postcode;
   }//get postcode
   protected String getPropertyType()
   {
      return propertyType;
   }//get propertytype
   protected String getNameOfVendor()
   {
      return nameOfVendor;
   }//get nameOfVendor
   protected String getVendorContactNumber()
   {
      return vendorContactNumber;
   }//get vendorContactNumber
   protected int getPrice()
   {
      return price;
   }//get price
   protected Date getDateRegistered()
   {
      return dateRegistered;
   }//get dateRegistered

   protected String getFullAddress()
   {
      return getStreet() + getTown() + getPostcode();

   }

   protected void displayProperty()
   {
    String dateReg = new SimpleDateFormat("dd-MM-yyyy").format(dateRegistered);

    System.out.println("Property details");
    System.out.println("================");
    System.out.println("This property is in " + getFullAddress());
    System.out.println("The property is a " + propertyType);
    System.out.println("The cost of this property is " + price);
    System.out.println("The property was registered " + dateReg);
    System.out.println("Vendors details");
    System.out.println("===============");
    System.out.println("The vendor of this property is " + nameOfVendor);
    System.out.println("This vendor can be contacted on: " + vendorContactNumber);

   }// constructor which will display the details of a property when called upon

}//main
