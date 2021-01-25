import java.util.Scanner;
class Occurences
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
      
      System.out.println("Array A:");
      for(int i=0;i<3;i++)
      {
           for(int j=0;j<3;j++)
           {
               System.out.print("   "+arr1[i][j]);//Prints the first array in form of a matrix
           }
           System.out.println();
      }
      System.out.println();
      System.out.println("Array B:");
      for(int i=0;i<3;i++)
      {
           for(int j=0;j<3;j++)
           {
             System.out.print("   "+arr2[i][j]);//Prints the array in form of a matrix
           }
           System.out.println();
      }
      System.out.println();
      if(isEquivalent(arr1,arr2)==true)
      {
         System.out.println("Judgment: The arrays are equivalent");//Prints if the arrays are equivalent
      }
      else
      {
         System.out.println("Judgment: The arrays are not equivalent");//Prints if the arrays are not equivalent
      }
   }
   
   public static boolean isEquivalent(int[][] arr1,int[][] arr2)
   { 
       for(int i=0;i<2;i++)
       {
          for(int j=i+1;j<3;j++)
          {
             if(arr1[i][j]<arr1[i][j-1])
             {
                int temp=arr1[i][j];
                arr1[i][j]=arr1[i][j-1];
                arr1[i][j-1]=temp;
             }
          }
       }
       for(int i=0;i<2;i++)
       {
          for(int j=i+1;j<3;j++)
          {
             if(arr2[i][j]<arr2[i][j-1])
             {
                int temp=arr2[i][j];
                arr2[i][j]=arr2[i][j-1];
                arr2[i][j-1]=temp;
             }
          }
       }
       boolean a=false;
       for(int i=0;i<3;i++)
       {  
          for(int j=0;j<3;j++)
          {
             if(arr1[i][j]==arr2[i][j])//If the arrays are equivalent block stores true in a otherwise it stores false
             {
                a=true;
             }
             else
             {
                a=false;
             }
          }
       }
       return a;//Returns a
   }
}
   

       