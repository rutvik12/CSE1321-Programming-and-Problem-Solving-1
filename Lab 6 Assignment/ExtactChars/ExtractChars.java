//Section- 09
//Language- Java
//Name- Rutvik marakana
//Instructor- Shweta Khandal

import java.util.Scanner;
//Program to extract and print the characters of a String on differnet lines
class ExtractChars
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the string: ");//Asks the user to enter a String
       String s=sc.nextLine();//Stores the input String in variable s
           int k=0;
       System.out.println("Entered string: "+s);//Prints the entered string
       for(int i=0;i<s.length();i++){
       k=i+1;
       char ch=s.charAt(i);
       System.out.println("Character #"+k+": "+ch);//Prints the characters of the string on different lines
       k++;
       }
   }
}