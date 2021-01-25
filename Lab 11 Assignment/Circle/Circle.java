// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

class Circle
{
   private double radius;
   public Circle()// Default constructor
   {
      this.radius=1;
   }
   public Circle(double radius)//Parametrized constructor
   {
      this.radius=radius;
   
   }
   public double getRadius()//Get method for radius
   {
      return this.radius;
   }
   public void setRadius()//Set method for radius
   {
      this.radius=radius;
   }
   public double getArea()//Get method for area
   {
      return 3.14*this.radius*this.radius;
   }
   public double getPerimeter()//Get method for area
   {
      return 2*3.14*this.radius;
   }
   public String toString()//Method that returns a string
   {
      String radius="The circle has radius "+this.radius;
      return radius;
   }
}