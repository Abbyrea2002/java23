package EstateAgent;
/**
 * Created by abby rea on 14/03/2023
 * program to define an array of properties class
 */

import java.util.ArrayList;

import java.util.List;


public class ArrayOfProperties
{
   Property obj = new Property();



   private  List<Property> properties;//initialises the list
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
    return properties.get(position).getStreet();
   }//getStreet

   protected void insert(Property newProperty)
   {
      properties.add(newProperty);//adds new property to the list
      System.out.println(newProperty.getStreet() + " Added");//prints proof that new property is added to list
   }//insert

   protected void remove(int position)
   {
      properties.remove(position);//removes a property from the list from a certain index position
      System.out.println(" Removed");//check
   }//remove property
   protected int findPropertyByStreet(String street)
   {
      //initalising variables
      int index = 0;
      boolean found = false;
      int position = -1;

      //do while loop
      //find the property from the list by the street
      //will repeat aslong as the found = false and index is smaller than number of properties
      do{
         if(properties.get(position).getStreet()==street){
            found = true;
            position = index;
         }//if
         index = index + 1;
      }while (!found && index < getNoOfProperties());
         return position;//returns position
   }//findPropertyByStreet
   protected ArrayList<Integer> findPropertyByTown(String town)
   {
      int index = 0;
      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int i = 0; i < getNoOfProperties(); i++)
      {
         if (properties.get(index).getTown() == town)
         {
            result.add(index);
         }//if

      }//for
      return result;
   }//findPropertyByTown
   protected void displayAProperty (int position)
   {
      //prints details of a property from a certain index position
    System.out.println(properties.get(position));

   }//displays a property from a certain index position

   protected void displayAllProperties()
   {
      //for loop repeats code inside the loop a certain amount of times
      for (getNoOfProperties())
     {
      System.out.println(obj.displayProperty());

     }
   }//display all properties


}//class
