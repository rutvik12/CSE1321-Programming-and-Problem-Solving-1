import java.util.Scanner;
class LocateLargestElement
{
    public static void main(String[] args)
    {
        int[][] arr=new int[3][4];//Creates an array with 3 rows and 4 columns
        Scanner sc=new Scanner(System.in);//Takes user input
        System.out.print("Enter 12 Integers: ");//Asks the user to enter 12 integers
       
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<4;j++)
           {
               arr[i][j]=sc.nextInt();//Stores the value of integers in array
           }
        }
        System.out.println("The entered matrix:");
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<4;j++)
           {
              System.out.print("   "+arr[i][j]);//Prints the array in form of a matrix 
           }
           System.out.println();
        }
        System.out.println();
        int[] arr1=new int[2];//Creates an array of size 2
        arr1=locateLargest(arr);
        System.out.println("First largest value is located at row "+arr1[0]+" and column "+arr1[1]);
    }
    public static int[] locateLargest(int[][] array)
    {   int[] arr2=new int[2];//Creates an array of size 2
        int max=0,row=0,column=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
               if(array[i][j]>max)
               {
                  max=array[i][j];//Stores the value of array in varaible max
                  arr2[0]=i;
                  arr2[1]=j;
               }
            }
        }
        return arr2;//Returns the array
    }
 }
        
