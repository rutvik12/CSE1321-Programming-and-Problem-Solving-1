import java.util.Scanner;
import java.util.Arrays;
class LinearBinarySearch
{
   public static void LinearSearch(int[] array,int temp)
   { 
      int counter=0;//Counts number of comparisons
      boolean found=false;
      for(int i=0;i<array.length;i++)
      {
         if(temp==array[i])
         {
            found=true;
            counter++;
            break;
         }
         counter++;
      }
      if(found==true)
      {
         System.out.println("Linear Search Comparisons: "+counter);
      }
      else
      {
         System.out.println("The target value does not exist in the array");
      }
   }
   public static void BinarySearch(int[] array,int temp)
   {  Arrays.sort(array);//Sorts the array
      int counter=0;
      boolean found=true;
      int low=0;
      int high=array.length;
      int mid=(high+low)/2;
      int mid1=array[mid];
      
      while(low<=high)
      {
         if(temp==mid1)
         {
            found=true;
            counter++;
            break;
         }
         else if(temp<mid1)
         {
            high=mid-1;
            mid=(high+low)/2;
            mid1=array[mid];
            counter++;
         }
         else
         {
            low=mid+1;
            mid=(high+low)/2;
            mid1=array[mid];
            counter++;
         }
      }
      if(low>high)
      {
         found=false;
      }
      
      if(found==true)
      {
         System.out.println("Binary Search Comparisons: "+counter);
      }
      else
      {
         System.out.println("The target value does not exist");
      }
      
   }
   public static void main(String [] args)
   {
      int[] array;
      Scanner sc=new Scanner(System.in);//Reads the user input
      System.out.print("Enter the size of the array: ");//Asks the user to enter the size of the array
      int size=sc.nextInt();//Stores the value of the array size in variable size
      array=new int[size];
      System.out.print("Enter "+size+" integers to store in array: ");//Asks the user to enter the number of integers equal to size of the array
      for(int i=0;i<array.length;i++)
      {
         array[i]=sc.nextInt();//Stores the entered integers in array
      }
      System.out.print("Enter a target value to search in the array: ");//Asks the user to enter the target value to search for in the array
      int temp=sc.nextInt();//Stores the user input in variable temp
      System.out.print("Array values: ");
      for(int i=0;i<array.length;i++)
      {
         System.out.print(array[i]+" ");//Prints the array
      }
      System.out.println();
      System.out.println("Target value: "+temp);//Prints the target value
      LinearSearch(array,temp);//Calls method LinearSearch()
      BinarySearch(array,temp);//Calls method BinarySearch()
   }

}
      
     