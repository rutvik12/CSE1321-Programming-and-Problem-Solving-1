import java.util.Scanner;
import java.util.Arrays;
class CompareArrays
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);//Takes user input
       System.out.print("Enter the size of two arrays: ");//Asks the user to enter the size of an array
       int n=sc.nextInt();//Stors the size of array in  varaible n
       
       int[] Array1=new int[n];
       int[] Array2=new int[n];
       
       for(int i=0;i<Array1.length;i++)
       {
          System.out.print("Enter an integer for first array: ");//Asks the user to enter integers for first array
          int a=sc.nextInt();//Stores the integers in varaible a
          Array1[i]=a;//Stores the value of a in index i of Array1
       }
       for(int j=0;j<Array2.length;j++)
       {
          System.out.print("Enter an integer for second array: ");//Asks the user to enter integers for second array
          int b=sc.nextInt();//Stores the integers in varaible n
          Array2[j]=b;//Stores the value of b in index j of Array2 
       }
       System.out.println();
       System.out.println("Array size: "+n);
       System.out.println("First array: "+Arrays.toString(Array1));
       System.out.println("Second array: "+Arrays.toString(Array2));
       if(compare(Array1,Array2)==false)//Prints the judgment depending on condition satisfied
       {
           System.out.println("Judgment: The arrays are non-identical");
       }
       else
       {
           System.out.println("Judgment: The arrays are identical");
       }
    }
    public static boolean compare(int[] Array1,int[] Array2)
    {   boolean a=false;
        for(int i=0;i<Array1.length;i++)
        {
           if(Array1[i]!=Array2[i])
           {
               a=false;
           }
           else
           {
              a=true;
           }
        }
        return a;//Return the value of a to main method
   }
}   
