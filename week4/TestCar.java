package week4;

public class TestCar
{
   public static void main(String args[])
   {
      car someCar;
      someCar = new car();

      car myCar = new car("REA 202", "mercedes", "black", 2021);
      myCar.printCarInfo();

      //changes colour
      //prints new colour
      myCar.setColour("Pink");
      myCar.printCarInfo();

      System.out.println(myCar.getColour());

      car cCar = new car("HDG 1234", "Toyota", "Blue", 2010);

      System.out.println("The car is " + cCar.ageOfCar(cCar.getManYear()) + " years old");

      System.out.println("There are " + car.numberOfCars() + " cars");
   }//main
}//class
