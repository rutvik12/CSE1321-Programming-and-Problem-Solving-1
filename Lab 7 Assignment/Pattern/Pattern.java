// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

import java.util.Scanner;
class Pattern
{
  public static void main(String [] args)
  {
     Scanner sc=new Scanner(System.in);//Takes user input for the symbol and the number
     System.out.print("Enter the Symbol: ");//Prints a statement that asks the user to enter a symbol
     char s=sc.next().charAt(0);//Stores the entered symbol in variable s
     System.out.print("Enter a number: ");//Prints the statement that asks the user to enter a number
     int num=sc.nextInt();//Stores the unmber in variable num
     
     for(int i=0;i<num;i++)
     {
        for(int k=1;k<=num;k++)
        {
           System.out.print(s);
        }
        System.out.println();
     }
  }
} 
     
       