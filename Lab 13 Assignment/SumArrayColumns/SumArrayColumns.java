import java.util.Scanner;
class SumArrayColumns
{
   public static void main(String [] args)
   {
       int[][] arr=new int[3][4];
       int[] arr1=new int[4];
       Scanner sc=new Scanner(System.in);//Takes user input
       System.out.print("Enter 12 Integers: ");//Asks the user to enter 12 Integers
       
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<4;j++)
           {
               arr[i][j]=sc.nextInt();//Stores the user input in array 
           }
       }
       System.out.println();
       arr1=sumColumns(arr);//Stores the return value of method sumColumns() in variable arr1 
       for(int i=0;i<4;i++)
       {
          System.out.println("Sum of column "+i+" is "+arr1[i]);
       }
   }
   public static int[] sumColumns(int[][] array)
   {   int[] arr1=new int[4];
       int sum1=0,sum2=0,sum3=0,sum4=0;
       
       for(int i=0;i<3;i++)
       { 
          sum1=sum1+array[i][0];
       }
       arr1[0]=sum1;
       
       for(int i=0;i<3;i++)
       {
          sum2=sum2+array[i][1];
       }
       arr1[1]=sum2;
       
       for(int i=0;i<3;i++)
       {
          sum3=sum3+array[i][2];
       }
       arr1[2]=sum3;
       
       for(int i=0;i<3;i++)
       {
          sum4=sum4+array[i][3];
       }
       arr1[3]=sum4;
       
       return arr1;
    }
 }
       


       
       
       
       
               
       