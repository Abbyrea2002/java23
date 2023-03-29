package EstateAgent;
/**
 * Created by abby rea on 14/03/2023
 * program to define an ArrayOfProperties class
 */

import java.util.ArrayList;

import java.util.List;


public class ArrayOfProperties
{



   private List<Property> properties;//initialises the list
   public ArrayOfProperties()
   {
      properties = new ArrayList<Property>();//initialises list
   }//ArrayOfProperties

   protected int getCurrent (int position)
   {
      return getCurrent(position);//returns a reference to a property of a certain index position
   }//getCurrent

   protected int getNoOfProperties()
   {
      return properties.size();//returns number of properties
   }//gets number of properties

   protected String getStreet(int position)
   {
    return properties.get(position).getStreet(); //returns the street of a property from a certain index position
   }//getStreet

   protected void insert(Property newProperty)
   {
      properties.add(newProperty);//adds new property to the list
      System.out.println(newProperty.getStreet() + " Added");//prints proof that new property is added to list
   }//insert

   protected void remove(int position)
   {
      properties.remove(position);//removes a property from the list from a certain index position
      System.out.println(properties.get(position).getStreet() + " Removed");// conformation of removal
   }//remove property
   protected int findPropertyByStreet(String street)
   {
      //initialising variables
      int index = 0;
      boolean found = false;
      int position = -1;

      //do while loop
      //find the property from the list by the street
      //will repeat along as the found = false and index is smaller than number of properties
      do{
         if(properties.get(position).getStreet()==street){
            found = true;
            position = index;
         }//if
         index = index + 1;//adds 1 to index number
      }while (!found && index < getNoOfProperties());
         return position;//returns position
   }//findPropertyByStreet
   protected ArrayList<Integer> findPropertyByTown(String town)
   {
      int index = 0;//initialises index to 0 and as an integer
      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int i = 0; i < getNoOfProperties(); i++)//function - repeats for loop along as I is = to 0 and smaller than the number of properties in the list
      {
         //function - if statement only runs code inside statement if condition is met
         if (properties.get(index).getTown() == town)
         {
            result.add(index);
         }//if

      }//for
      return result;//returns result
   }//findPropertyByTown
   protected void displayAProperty (int position)
   {
      //prints details of a property from a certain index position
    System.out.println(properties.get(position));

   }//displays a property from a certain index position

   protected void displayAllProperties()
   {
      //for loop repeats code inside the loop a certain amount of times
      //for the number of properties in the list
      for (Property aProperty : properties)
     {
      aProperty.displayProperty();//displays the details of each property

     }//for
   }//display all properties


}//class
