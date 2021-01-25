import java.util.Scanner;
class IndexOfLargest
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);
       int [] array=new int[10];
       for(int i=0;i<array.length;i++)
       {
          System.out.print("Enter the number "+i+" of the array: ");
          int n=sc.nextInt();
          array[i]=n;
       }
       System.out.println();
       System.out.print("Entered numbers: ");
       for(int i=0;i<array.length;i++)
       {  
          if(i<array.length-1)
          {
              System.out.print(array[i]+", ");
          }
          else
          {
              System.out.print(array[i]);
          }
       }
       System.out.println();
       int index=findIndex(array);
       System.out.println("Index of the largest value is : "+index);
   }
   public static int findIndex(int[] arr)
   {
      int max=0,index=0;
      for(int i=0;i<arr.length;i++)
      {
         if(arr[i]>max)
         {
            max=arr[i];
            index=i;
         }
      }
      return index;
  }
} 
            
          