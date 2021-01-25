// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

class TestRectangle
{
   public static void main(String [] args)
   {
        Rectangle R1=new Rectangle();//Creates and object R1 of class Rectangle
        Rectangle R2=new Rectangle(5,6);//Creates and object R2 of class Rectangle
        
        System.out.println("First Object:");
        System.out.println("      Height:    "+R1.getHeight()+" units");
        System.out.println("      Width:     "+R1.getWidth()+" units");
        System.out.println("      Area:      "+R1.getArea()+" units");
        System.out.println("      Perimeter: "+R1.getPerimeter()+" units");
        System.out.println();
        System.out.println("Second Object:");
        System.out.println("      Height:    "+R2.getHeight()+" units");
        System.out.println("      Width:     "+R2.getWidth()+" units");
        System.out.println("      Area:      "+R2.getArea()+" units");
        System.out.println("      Perimeter: "+R2.getPerimeter()+" units");
   }
}
        

        
        