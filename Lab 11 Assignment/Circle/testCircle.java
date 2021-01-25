// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

class testCircle
{
   public static void main(String [] args)
   {
      Circle obj1=new Circle();//Object called obj1 of class Circle
      Circle obj2=new Circle(10);//Object called obj2 of class Circle
      obj1.setRadius();//Object obj1 calls method setRadius() of class Circle
      obj2.setRadius();//Object obj2 calls method setRadius() of class Circle
      System.out.println("Print radius");
      System.out.println("      The radius is "+obj1.getRadius());
      System.out.println();
      System.out.println("Print area");
      System.out.println("      The area is "+obj1.getArea());
      System.out.println();
      System.out.println("Print perimeter");
      System.out.println("      The perimeter is "+obj1.getPerimeter());
      System.out.println();
      System.out.println("Print String");
      System.out.println("      "+obj2.toString());
      System.out.println();
      System.out.println("Print area");
      System.out.println("      The area is "+obj2.getArea());
      System.out.println();
      System.out.println("Print perimeter");
      System.out.println("      The perimeter is "+obj2.getPerimeter());
   }
}
     

      