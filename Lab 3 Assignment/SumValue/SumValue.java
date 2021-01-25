// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java
import java.util.Scanner;
class SumValue
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);//Reads input values from the user
        int X=sc.nextInt();//Stores the value of 1st integer in X
        int Y=sc.nextInt();//Stores the value of 2nd integer in Y
        int Z=sc.nextInt();//Stores the value of 3rd intger in Z
        
        double avg=(X+Y+Z)/3;//Calculates average of the numbers 
        System.out.println("X ="+X);
        System.out.println("Y ="+Y);
        System.out.println("Z ="+Z);
        System.out.println("Average = "+avg);
    }
}
        
    
  