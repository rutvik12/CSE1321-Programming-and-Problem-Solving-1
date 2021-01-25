import java.util.Scanner;
class AssignGrades
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);//Takes user input
       System.out.print("Enter the number of students in the class: ");//Asks the user to input the number of students in the class
       int n=sc.nextInt();//Stores the user input in variable n
       int[] Array=new int[n];//Declares an array of size n
       
       for(int i=0;i<n;i++)
       {
          System.out.print("Enter a score for student "+i+" :");//Asks the user to enter the score for each student
          int k=sc.nextInt();//Stores the value of score in k
          if(k>0 && k<=100)
          {
             Array[i]=k;//Stores the value of k in the array spot with index i
          }
          else{
          while(k<0 || k>100){
             System.out.print("Entered score is invalid. Please enter another score: ");
             k=sc.nextInt();
             Array[i]=k;
          }
          }
       }
       printGrades(Array);//Calls method printGrades
   }
   public static void printGrades(int[] Array)
   {
      for(int i=0;i<Array.length;i++)//Prints the grade of students
      {
         if(Array[i]>=90 && Array[i]<=100)
         {
            System.out.println("Student "+i+" score is "+Array[i]+" and grade is A");
         }
         else if(Array[i]>=80 && Array[i]<=90)
         {
            System.out.println("Student "+i+" score is "+Array[i]+" and grade is B");
         }
         else if(Array[i]>=70 && Array[i]<=80)
         {
            System.out.println("Student "+i+" score is "+Array[i]+" and grade is C");
         }
         else if(Array[i]>=60 && Array[i]<=70)
         {
            System.out.println("Student "+i+" score is "+Array[i]+" and grade is D");
         }
         else
         {
            System.out.println("Student "+i+" score is "+Array[i]+" and grade is F");
         }
      }
   }
}       
          
           