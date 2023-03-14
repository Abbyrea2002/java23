package EstateAgent;
/**
 * Created by abby rea on 14/03/2023
 * program to define an array of properties class
 */

import java.util.ArrayList;

import java.util.List;


public class ArrayOfProperties
{
   private list<Property> properties;
   public ArrayOfProperties()
   {
      properties = new ArrayList<Property>();
   }//ArrayOfProperties

   protected int getCurrent (int position)
   {
      return properties.get(position).getCurrent();
   }

}//class
