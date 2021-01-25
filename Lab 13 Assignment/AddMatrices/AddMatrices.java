import java.util.Scanner;
class AddMatrices
{
   public static void main(String [] args)
   {
      int[][] arr1=new int[3][3];//Creates an array of 3 rows and 3 columns
      int[][] arr2=new int[3][3];//Creates an array of 3 rows and 3 columns
      Scanner sc=new Scanner(System.in);//Takes user input
      System.out.print("Enter 9 integers to store in first array: ");//Asks the user to enter 9 integers for first array
      for(int i=0;i<3;i++)
      {
           for(int j=0;j<3;j++)
           {
               arr1[i][j]=sc.nextInt();//Stores the integers in first array 
           }
      }
      System.out.println();
      System.out.print("Enter 9 integers to store in second array: ");//Asks the user to enter nine integers for second array
      for(int i=0;i<3;i++)
      {
           for(int j=0;j<3;j++)
           {
               arr2[i][j]=sc.nextInt();//Stores the integers in second array
           }
      }
      
      System.out.println("Matrix A:");
      for(int i=0;i<3;i++)
      {
           for(int j=0;j<3;j++)
           {
               System.out.print("   "+arr1[i][j]);//Prints the first array in form of a matrix
           }
           System.out.println();
      }
      System.out.println();
      System.out.println("Matrix B:");
      for(int i=0;i<3;i++)
      {
           for(int j=0;j<3;j++)
           {
             System.out.print("   "+arr2[i][j]);//Prints the array in form of a matrix
           }
           System.out.println();
      }
      System.out.println();
      System.out.println("A + B:");
      int[][] array=new int[3][3];//Creates an array of 3 rows and 3 columns
      array=Addition(arr1,arr2);
      for(int i=0;i<3;i++)
      {
           for(int j=0;j<3;j++)
           {
              System.out.print("   "+array[i][j]);//Prints an array in form of a matrix 
           }
           System.out.println();
      }
   }
   public static int[][] Addition(int[][] array1,int[][] array2)
   {  int[][] arr=new int[3][3];//Creates an array with 3 rows and 3 columns
      int add;
      for(int i=0;i<3;i++)
      {
           for(int j=0;j<3;j++)
           {   
               add=0;
               add=add+array1[i][j]+array2[i][j];//Adds the corresponding elements of array
               arr[i][j]=add;//Stores the value of added elements in an array
           }
      }
      return arr;//Returns the array with added elements
   }
 }





      
