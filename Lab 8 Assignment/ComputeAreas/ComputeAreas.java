//Class- Java
//Section - 09
//Term - Fall 2018
//Instructor - Shweta Khandal
//Name - Rutvik Marakana

import java.util.Scanner;
class ComputeAreas
{
  public static void main(String [] args)
  {
     Scanner sc=new Scanner(System.in);//Takes the user input for side, width, length, radius, base and height
     System.out.print("Enter the side of the square: ");//Asks the user to enter the side of square
     double sd=sc.nextDouble();//Stores the value of side in variable sd
     System.out.print("Enter the width of the rectangle: ");//Asks the user to enter the width of rectangle
     double wdh=sc.nextDouble();//Stores the value of width in variable wdh
     System.out.print("Enter the length of the rectangle: ");//Asks the user to enter the length of rectangle
     double lth=sc.nextDouble();//Stores the value of length in variable lth
     System.out.print("Enter the radius of the circle: ");//Asks the user to enter the radius of circle
     double rd=sc.nextDouble();//Stores the value of radius in variable rd
     System.out.print("Enter the base of the triangle: ");//Asks the user to enter the base of triangle 
     double bs=sc.nextDouble();//Stores the value of base in variable bs
     System.out.print("Enter the height of the triangle: ");//Asks the user to enter the value of height of triangle
     double ht=sc.nextDouble();//Stores the value of height in variable ht
     
     double Area1=squareArea(sd);
     double Area2=rectangleArea(wdh,lth);
     double Area3=circleArea(rd);
     double Area4=triangleArea(bs,ht);
     
     System.out.println("Square side: "+sd);
     System.out.println("Square area: "+Area1);
     System.out.println("Rectangle width: "+wdh);
     System.out.println("Rectangle length: "+lth);
     System.out.println("Rectangle area: "+Area2);
     System.out.println("Circle radius: "+rd);
     System.out.println("Circle area: "+Area3);
     System.out.println("Triangle base: "+bs);
     System.out.println("Triangle height: "+ht);
     System.out.println("Triangle area: "+Area4);
   }
   public static double squareArea(double side)
   {
      double area=side*side;
      return area;
   }
   public static double rectangleArea(double width,double length)
   {
     double area=width*length;
     return area;
   }
   public static double circleArea(double radius)
   {
     double area=3.14*radius*radius;
     return area;
   }
   public static double triangleArea(double base,double height)
   {
     double area=0.5*base*height;
     return area;
   }
}
   