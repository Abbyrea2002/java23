package EstateAgent;
/**
 * Created by abby rea on 14/03/2023
 * program to define an array of properties class
 */

import java.util.ArrayList;

import java.util.List;


public class ArrayOfProperties
{
   private  List<Property> properties;
   public ArrayOfProperties()
   {
      properties = new ArrayList<Property>();
   }//ArrayOfProperties

   protected int getCurrent (int position)
   {
      return Property.get(position).getCurrent();
   }//getCurrent

   protected int getNoOfProperties()
   {
      return properties.size();
   }//getNoOfProperties

   protected String getStreet(int position)
   {
    return properties.get(position).getStreet();
   }//getStreet

   protected void insert(Property newProperty)
   {
      properties.add(newProperty);
      System.out.println(newProperty.getStreet() + " Added");
   }//insert

   protected void remove(int position)
   {
      properties.remove(position);
      System.out.println(Property.getStreet() + " Removed");
   }//remove property
   protected int findPropertyByStreet(String street)
   {
      int index = 0;
      boolean found = false;
      int position = -1;

      do{
         if(properties.get(position).getStreet()==street){
            found = true;
            position = index;
         }//if
         index = index + 1;
      }while (!found && index < getNoOfProperties());
         return position;
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

}//class
