package EstateAgent;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Janet on 01/02/21
 * Program to define an ArrayOfProperties class which is used to hold pointers to each Property
 *     which is registered by the Estate Agent
 */

public class ArrayOfProperties1 {
   private List<Property> properties;

   // Constructor to create an array of references to Property objects
   public ArrayOfProperties1() {
      properties = new ArrayList<Property>();
   }//ArrayOfProprties

   // Return a reference to the current property
   protected Property getCurrent(int position) {
      return properties.get(position);
   }//getCurrent

   // Return the number of properties registered by the Estate Agent
   protected int getNoOfProperties() {
      return properties.size();
   }//getNoOfProperties

   // Return first line of the address of a property at a particular index position
   protected String getStreet(int position) {
      return properties.get(position).getStreet();
   }//getStreet

   // Add Property object to the array
   protected void insert(Property newProperty) {
      properties.add(newProperty);
      System.out.println(newProperty.getFullAddress() + " Added");
   }//insert property

   // Remove Property object from the array
   protected void removeProperty(int position) {
      System.out.println(getCurrent(position).getFullAddress() + " Removed");
      properties.remove(position);
   }//removeProperty

   // **************
   // SEARCH METHODS
   // **************

   // Return index position of property or number = -1 if not found
   protected int findPropertyByStreet(String street) {
      boolean found = false;
      int index = 0, position = -1;
      // Keep checking until the street is found or all properties have been checked
      do {
         // Check if the street at the index position equals the street passed as the parameter
         if (properties.get(index).getStreet().equals(street)) {
            found = true;
            position = index;
         }
         index++;
      } while ((!found) && (index < properties.size()));
      // Return the index position of the property with the required street (or -1 if not found)
      return position;
   }//findPropertyByStreet

   // Method to find properties by their town
   // Return a range of indices or an empty list if none are found
   protected ArrayList<Integer> findPropertyByTown(String town) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int index = 0; index < properties.size(); index++) {
         if (properties.get(index).getTown().equals(town)) {
            result.add(index);
         }//if
      }//for
      return result;
   }//findPropertyByTown

   // *************
   // PRINT METHODS
   // *************

   protected void displayAProperty(int index) {
      properties.get(index).displayProperty();
   }//displayMember

   protected void displayAllProperties() {
      for (Property aPerson : properties) {
         aPerson.displayProperty();
      }//for
   }//displayEveryone
}
