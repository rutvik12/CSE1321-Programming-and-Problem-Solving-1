// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java
import java.util.Scanner;
class PrintCharacters
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);//Takes user input for two characters
      System.out.print("Enter the first character: ");//Asks the user to enter the first character
      char c1=sc.next().charAt(0);//Stores the value of the first character in variable c1
      System.out.print("Enter the second character: ");//Asks the user to enter the second character
      char c2=sc.next().charAt(0);//Stores the value of the second character in  varaible c2
      printChars(c1,c2);
   }
   public static void printChars(char ch1,char ch2)
   {   if(ch1<ch2)
      {  System.out.println("Start Character: "+ch1);
         System.out.println("End Character: "+ch2);
       
      }
      else
      {
         System.out.println("Start Character: "+ch1);
         System.out.println("End Character: "+ch2);
         System.out.println("Start and end characters are out of order. Try again.");
      }

      int total=0;
      for(int i=1;ch1<=ch2;i++,ch1++)
      {
         System.out.print(ch1+" ");
         
         if(i%5==0)
         {
           System.out.println();
         }
      }
   }
}
        
      
      