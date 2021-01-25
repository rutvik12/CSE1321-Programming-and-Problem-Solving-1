// Class:	CSE 1321L
// Section: 09         
// Term:		Fall 
// Instructor:	Shweta Khandal 
// Name:		Rutvik Marakana  
// Lab#:		Java

import java.util.Scanner;
class ProcessGrades
{
     public static void main( String [] args)
     {
          Scanner sc=new Scanner(System.in);//Takes user input for four different grades
          int g1=sc.nextInt();//Stores the first grade in g1
          int g2=sc.nextInt();//Stores the first grade in g2
          int g3=sc.nextInt();//Stores the first grade in g3
          int g4=sc.nextInt();//Stores the first grade in g4
           if (g1<=100 && g2<=100 && g3<=100 && g4<=100 && g1>=0 && g2>=0 && g3>=0 && g4>=0)
           { 
             System.out.println("You entered: "+ g1 +" , "+ g2 +" , "+ g3 +" , "+ g4);
       
          if (g1>g2 && g1>g3 && g1>g4)
          {
             System.out.println("Highest grade: "+g1);
          }
          else if (g2>g1 && g2>g3 && g2>g4)
          {
             System.out.println("Highest grade: "+g2);
          }
          else if (g3>g1 && g3>g2 && g3>g4)
          {
              System.out.println("Highest grade: "+g3);
          }
          else
          {
              System.out.println("Highest grade: "+g4);
          }
          
          
          
          if (g1<g2 && g1<g3 && g1<g4)
          {
              System.out.println("Lowest grade: "+g1);
          }
          else if (g2<g1 && g2<g3 && g2<g4)
          { 
              System.out.println("Lowest grade: "+g2);
          }
          else if (g3<g1 && g3<g2 && g3<g4)
          {
             System.out.println("Lowest grade: "+g3);
          }
          else
          {
             System.out.println("Lowest grade: "+g4);
          }
          
          
          
          double average=(g1+g2+g3+g4)/4.0;
          System.out.println("Average grade: "+average);
          }
          if (g1>100 || g2>100 || g3>100 || g4>100)
          {
             System.out.println("You have entered invalid grades. Please enter valid grades");
          }
      }
}
          