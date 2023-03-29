package EstateAgent;

import EstateAgent.Property;
import EstateAgent.ArrayOfProperties;
import java.util.ArrayList;
import java.util.List;

public class TestProperty
{
   public static void main(String args[])

   {
     //initialises array in this class
      ArrayOfProperties MyArray = new ArrayOfProperties();

      //creates property objects
      Property oneProperty = new Property("Recreation Road ", "Larne ", "Bt40 1ew ", "semi detached", "richard green", "07565899835", 1);
      Property twoProperty = new Property ("Lindara Drive", "Carrick", "BT40 2JC", "Detatched", "Sandra Nelson", "07999365757", 2);

      //inserts property details from oneProperty object into array
      MyArray.insert(oneProperty);

      //displays property details using contructor from ArrayOfProperties
      MyArray.displayAllProperties();



   }//main
}//class

