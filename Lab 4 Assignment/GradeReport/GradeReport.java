// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java
import java.util.Scanner;
class GradeReport
{
  public static void main(String [] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the grade: ");
     int grade=sc.nextInt();
     System.out.println("You entered :"+grade);
     grade=grade/10;
     switch(grade)
     {
       case 10:System.out.println("That grade is a perfect score. Well done");
                     break;
       case 9 :System.out.println("That grade is well above average. Excellent work");
                     break;
       case 8 :System.out.println("That grade is above average. Nice job");
                     break;
       case 7 :System.out.println("That grade is average work");
                      break;
       case 6 :System.out.println("That grade is not good, you should seek help!");
                     break;
       default :System.out.println("That grade is not passing");
                     break;
     }
  }
}
     
      
     