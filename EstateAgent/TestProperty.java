package EstateAgent;

import EstateAgent.Property;
import EstateAgent.ArrayOfProperties;
import java.util.ArrayList;
import java.util.List;


public class TestProperty
{
   public static void main(String args[])

   {
      properties = new ArrayList<Property>();

      Property oneProperty = new Property("Recreation Road ", "Larne ", "Bt40 1ew ", "semi detached", "richard green", "07565899835", 1);
      properties.insert(oneProperty);

      properties.displayAllProperties();



   }//main
}//class

