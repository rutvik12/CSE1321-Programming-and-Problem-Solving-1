// Class:	CSE 1321L
// Section: 09         
// Term:		Fall 
// Instructor:	Shweta Khandal 
// Name:		Rutvik Marakana  
// Lab#:		Java
import java.util.Scanner;
class CheckPoint
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);//Takes user input for X-coordinate and y-coordinate
      int X=sc.nextInt();//Stores the user input of x-coordinate in X
      int Y=sc.nextInt();//Stores the user input of y-coordinate in Y
      System.out.println("X-coordinate is "+X);
      System.out.println("Y-coordinate is "+Y);
      if(X==0 && Y==0){
        System.out.println("("+X+","+Y+") is the origin point");
      }
      else if(X!=0 && Y==0)
      {
         System.out.println("("+X+","+Y+") is on the x-axis");
      }
      else if(X==0 && Y!=0)
      {
         System.out.println("("+X+","+Y+") is on the y-axis");
      }
      else if(X>0 && Y>0)
      {
         System.out.println("("+X+","+Y+") is in the first quadrant");
      }
       else if(X<0 && Y>0)
      {
         System.out.println("("+X+","+Y+") is in the second quadrant");
      }
       else if(X<0 && Y<0)
      {
         System.out.println("("+X+","+Y+") is in the third quadrant");
      }
       else{
         System.out.println("("+X+","+Y+") is in the fourth quadrant");
      }
    }
}