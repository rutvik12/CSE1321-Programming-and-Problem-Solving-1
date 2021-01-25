import java.util.Scanner;
class Cylinder 
{
  public static void main( String [] args)
  { 
     double PI=3.14;
     Scanner sc=new Scanner(System.in);//Takes user input value for radius and length
     double Radius=sc.nextDouble();
     double Length=sc.nextDouble();
     
     double Area= Radius*Radius*PI;//Calculates area
     double Volume= Area*Length;//Calculates Volume
   
     System.out.println("Entered Radius="+Radius);
     System.out.println("Entered Length="+Length);
     System.out.println("The Volume is "+Volume);
     
   }
 
}