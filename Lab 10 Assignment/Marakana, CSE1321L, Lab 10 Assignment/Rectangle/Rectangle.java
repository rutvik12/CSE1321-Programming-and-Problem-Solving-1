// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

class Rectangle
{
   private double height;
   private double width;
   
   public Rectangle()//Default constructor
   {
      this.height=1;
      this.width=1;
   }
   public Rectangle(double h,double w)//Parameterized constructor
   {
      this.height=h;
      this.width=w;
   }
   public double getArea()//Method that calculates and returns an area
   {
       double area=this.height*this.width;
       return area;
   }
   public double getPerimeter()//Method that calculates and returns a perimeter
   {
       double perimeter=2*(this.height+this.width);
       return perimeter;
   }
   public double getHeight()//Method that returns the height
   {
       return this.height;
   }
   public double getWidth()//Method that returns the width
   {
       return this.width;
   }
}