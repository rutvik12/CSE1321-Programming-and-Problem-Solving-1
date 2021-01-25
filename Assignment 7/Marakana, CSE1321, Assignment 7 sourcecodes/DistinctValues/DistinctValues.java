import java.util.Scanner;
import java.util.Arrays;
class DistinctValues{


   public static void main(String args[]) {
   
   
      
      int [] number = new int[10];
   
      Scanner userInput = new Scanner(System.in);    //take system input from user 
      System.out.println("Enter 10 integers:");
      
      for(int i = 0; i < number.length; i++){
      
         number[i] = userInput.nextInt();
      }
      
      System.out.print("Original array: ");
      for(int i = 0; i < number.length; i++){
      System.out.print(number[i] + " " );
      }
      System.out.println();
      getValues(number);
   }

   public static void getValues(int [] num){
      System.out.print("Distinct array: ");
      for(int i = 0; i < num.length; i++){
         
         boolean isDistinct = true;
            
         for(int j = 0; j < i; j++){        //the for loop goes to the index value of i but it stops right before.
            
            if(num[i] == num[j]){
               isDistinct = false;
               break;
               
            }
            
         }
            
         if(isDistinct == true){                 //if the value is distinct, then print the number
            
            System.out.print(num[i] + " ");
            
         }
      }
   }
}