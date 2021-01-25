
class TestBankAccount
{
   public static void main(String [] args)
   {    
       BankAccount myObject=new BankAccount(123456,10000);//Creates an object myObject of class BankAccount with arguments 123456 and 10000
       myObject.setAnnualInterestRate(2.5);//Object calls the method setAnnualInterestRate with argument 2.5
       myObject.withdraw(3500);//Object calls method withdraw with argument 3500
       myObject.deposit(500);//Object calls method deposit with argument 500
       myObject.getBalance();//Object calls method getBalance
       System.out.println(myObject.toString());//Object calls and prints the reurn value of method toString
       System.out.println("Date created: "+myObject.getDate());//Object calls and prints the return value of method getDate
       System.out.println("Earned monthly interest: "+myObject.getMonthlyInterest());//Object calls and prints the return value of method getMonthlyInterest
       
   }
}
        