import java.util.Scanner;
class BestDeal
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);//Takes user input for two weights and two prices
        System.out.print("Enter the weight of small box: ");//Asks the user to enter the weight of small box
        int small_weight=sc.nextInt();//Stores the small box weight in variable small_weight
        System.out.print("Enter the price of small box: ");//Asks the user to enter the price of small box
        int small_price=sc.nextInt();//Stores the price of small box in the variable small_price
        System.out.print("Enter the weight of large box: ");//Asks the user to enter the weight of large box
        int large_weight=sc.nextInt();//Stores the weight of large box in large_weight
        System.out.print("Enter the price of large box: ");//Asks the user to enter the price of large box
        int large_price=sc.nextInt();//Stores the price of large box in large_price
        System.out.println("Small box weight: "+small_weight+" pounds");
        System.out.println("Small box price: "+small_price+" dollars");
        System.out.println("Large box weight: "+large_weight+" pounds");
        System.out.println("Large box price: "+large_price+" dollars");
        
        if ((small_weight)*2 <= large_weight && (small_price)*2 > large_price)
        { 
            System.out.println("Judgment: The large box is a better deal");
        }
        else if((small_weight)*2 >= large_weight && (small_price)*2 < large_price)
        {
            System.out.println("Judgment: The smaller box is a better deal");
        }
        else{
            System.out.println("Judgment: Both boxes are of same value");
        }
     }
}
        
        