// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java
import java.util.Scanner;
class SumDigits
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);//Takes the user input for an intger
       System.out.print("Enter an integer: ");//Asks the user to enter an integer
       int num=sc.nextInt();//Stores the value of the intger in variable num
       int sum=sumDigits(num);
       System.out.println("You entered: "+num);
       System.out.println("Sum of digits: "+sum);
   }
   public static int sumDigits(int n)
   {
      int s=0;
      while(n>0)
      {
         s=s+(n%10);
         n=n/10;
      }
      return s;
   }
}
       
