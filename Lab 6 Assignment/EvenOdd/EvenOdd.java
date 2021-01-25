//Section- 09
//Language- Java
//Name- Rutvik marakana
//Instructor- Shweta Khandal

//Program to print all odd and even numbers between 50 and 100
class EvenOdd
{
   public static void main(String [] args)
   {
        int a=50;//Initializing variable a to 50
        int b=51;//Initializing variable b to 51
        
        System.out.print("Even numbers between 50 and 100: ");
        
        while(a%2==0 && a<100){
          System.out.print(a+",");
          a+=2;
        }
        if(a==100){
          System.out.print(a);
        }
        System.out.println();
        System.out.print("Odd number between 50 and 100: ");
        while(b%2!=0 && b<99){
           System.out.print(b+",");
           b+=2;
        }
        if(b==99)
        {
          System.out.print(b);
        }
     
      }
}
    
           