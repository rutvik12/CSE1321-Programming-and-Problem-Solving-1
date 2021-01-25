import java.util.Scanner;
import java.util.Arrays;
class Occurences{


   public static void main(String args[])
   {
   
      int [] number = new int[10];
      Scanner userInput = new Scanner(System.in);    //take system input from user 
      
      for(int i = 0; i < number.length; i++){
         
         System.out.print("Enter the integer "+i+" of the array: ");
         number[i] = userInput.nextInt();
      }
      
      Count(number);
   
   }
   
   
   public static void Count(int[] num) {
      Arrays.sort(num);
      int count = 1;
      for (int i = 0; i < num.length; i++) {
         if(i < num.length-1){
            if(num[i] == num[i+1]){
            
               count++;
            }
          
          else {      //to make sure that repeated lines are not printed
            System.out.println(num[i] + " occured " + count
                    + " times."); 
            count = 1;
         }
         }
         if(i==num.length-1)
         {
             System.out.println(num[i]+" occured "+count+ " times.");
         }
      
      }
   }
 }