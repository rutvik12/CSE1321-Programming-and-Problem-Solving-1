import java.util.Scanner;
class SumDigits 
{
    public static void main(String args[])
    {
        int num, n, sum = 0;
        Scanner s = new Scanner(System.in);//Takes user input for number
        num = s.nextInt();
        System.out.println();
        System.out.println("Entered Number:"+num);
        while(num > 0 && num< 1000)//Calculates the sum of individual digits of the number
        {
            n = num % 10;
            sum = sum + n;
            num = num / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}