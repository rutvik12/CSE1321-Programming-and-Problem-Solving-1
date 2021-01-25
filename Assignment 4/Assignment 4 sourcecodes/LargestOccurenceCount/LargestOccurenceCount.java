import java.util.Scanner;
class LargestOccurenceDigit
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number of integers(0 to Quit): ");
      int n=sc.nextInt();
      int num;
      int max=0,occurrence=0;
    
      for(int i=0;i<n;i++)
      { 
        System.out.print("Enter a positive Integer(0 to Quit): ");
        num=sc.nextInt();
        if(num!=0 && num>0)
        {
           if(num>max)
           {
              max=num;
              occurrence=1;
           }
           else if(num==max){
           occurrence++;
           }
        }
      }
      System.out.println("Largest number: "+max);
      System.out.println("Occurrence: "+occurrence+" times");
    }
      
 }
      
      
      
      
      
      
      
      
      
      
      
      
          

       