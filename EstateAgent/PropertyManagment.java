package EstateAgent;

public class PropertyManagment
{
   public static void main(String args[])

   {
      //creates ArrayOfProperties object
      ArrayOfProperties MyArray = new ArrayOfProperties();

      //creates property objects
      Property oneProperty = new Property("Recreation Road ", "Larne ", "Bt40 1ew ", "semi detached", "richard green", "07565899835", 1);
      Property twoProperty = new Property ("Lindara Drive", "Carrick", "BT40 2JC", "Detatched", "Sandra Nelson", "07999365757", 2);
      Property threeProperty = new Property ();
      Property fourProperty = new Property ();
      Property fiveProperty = new Property ();

      //inserts property details from oneProperty object into array
      MyArray.insert(oneProperty);
      MyArray.insert(twoProperty);
      MyArray.insert(threeProperty);
      MyArray.insert(fourProperty);
      MyArray.insert(fiveProperty);

      //displays property details using contructor from ArrayOfProperties
      MyArray.displayAllProperties();



   }//main
}//class

