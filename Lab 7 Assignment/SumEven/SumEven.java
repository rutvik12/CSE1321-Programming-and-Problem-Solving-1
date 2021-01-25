// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

import java.util.Scanner;
//Program that prints the sum of even numbers from 2 to user input number
class SumEven
{
   public static void main(String [] args)
   {
     Scanner sc=new Scanner(System.in);//Takes user input for an integer
     System.out.print("Enter an Integer: ");//Asks the user to enter an integer
     int n=sc.nextInt();//Stores the entered integer in varaible n
     int sum=0;
     System.out.println("Entered integer: "+n);//Prints out the entered integer
     int i=2;
     while(n>=20 && n<=60 && i<=n)
     {
        sum=sum+i;
        i+=2;
     }
     if(n>=20 && n<=60)
     {
       System.out.println("Sum of even number between 2 and "+n+" is "+sum);//Prints out the sum from 2 to user input integer
     }
     else
     {
       System.out.println("Invalid number. Please try again");
     }
         
   }
}
          
       