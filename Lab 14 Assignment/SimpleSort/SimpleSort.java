import java.util.Scanner;
import java.util.Random;
class SimpleSort
{
   public static void BubbleSort(int[] arr)
   {  int counter=0;//Counts the number of comparisons to bubble sort the array
      for(int i=0;i<arr.length-1;i++)//Loop sorts the array and count number of comparisons to sort the array
      {
         for(int j=i+1;j<arr.length;j++)
         {
            if(arr[i]>arr[j])
            {
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               counter++;
            }
         }
      }
      System.out.print("Bubble sorted values: ");
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(arr[i]+" ");
      }
      System.out.println("\nBubble sort swaps: "+counter);
   }
   public static void InsertionSort(int[] arr)
   {  
      int counter = 0;//Counts the number of comparisons to sort the array
      for(int i = 1; i<arr.length; i++)//Loop sorts the array and counts the number of comparisons
      {
         int key = arr[i];
         int position = i;
         while(position > 0 && key < arr[position-1])
         {
            arr[position]= arr[position-1];
            position--;
            counter++;
         }
         arr[position]=key;
      }
      System.out.print("Insertion sorted values: ");
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(arr[i]+" ");
      }
      System.out.println("\nInsertion sort swaps: "+counter);
   }
   public static void SelectionSort(int[] Arr)
   {
      int counter=0;//Counts the number of comparisons to sort the array
      for(int i = 0; i < Arr.length-1; i++)//Loop sorts the array
      {
         int minPosition = i;
         for(int j = i + 1; j < Arr.length; j++)
         {
            if(Arr[j] < Arr[minPosition])
            {
               minPosition = j;
            }
         }
         if(i != minPosition && minPosition < Arr.length)
         {
            int temp = Arr[minPosition];
            Arr[minPosition] = Arr[i];
            Arr[i] = temp;
            counter++;
         }
     }
     System.out.print("Selection sorted values: ");
     for(int i=0;i<Arr.length;i++)
     {
        System.out.print(Arr[i]+" ");
     }
     System.out.print("\nSelection sort swaps: "+counter);
  }
  public static void main(String [] args)
  {   
      int[] array=new int[50];
      int[] array1=new int[50];
      int[] array2=new int[50];
      int[] array3=new int[50];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<50;i++)
      {
          Random rn=new Random();
          int k=rn.nextInt(101);//Stores the random integer in varaible k
          array[i]=k;//Stores the value of k in array index i
      }
      array1=array.clone();
      array2=array.clone();
      array3=array.clone();
      System.out.print("Array values: ");
      for(int i=0;i<array1.length;i++)
      {
         System.out.print(array[i]+" ");//Prints the array
      }
      System.out.println();
      BubbleSort(array1);//Calls method BubbleSort()
      InsertionSort(array2);//Calls method InsertionSort()
      SelectionSort(array3);//Calls method SelectionSort()
  }

}
      
      
         
      
