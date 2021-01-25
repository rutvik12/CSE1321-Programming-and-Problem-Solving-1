import java.util.Date;
class BankAccount
{
   private int id;
   private double balance;
   private double annualInterestRate;
   Date dateCreated=new Date();//A variable dateCreated of class Date
     
  
   public BankAccount()//Default constructor
   {
      this.id=0;
      this.balance=0.0;
      this.annualInterestRate=0.0;
   }
   public BankAccount(int id,double balance)//Parameterized constructor
   {
      this.id=id;
      this.balance=balance;
   }
   //Setter methods for id,balance,annualInterestRate
   public void setId(int id)
   {
      this.id=id;
   }
   public void setBalance(double balance)
   {
      this.balance=balance;
   }
   public void setAnnualInterestRate(double annualInterestRate)
   {
      this.annualInterestRate=annualInterestRate/100;
   }
   
   //Getter methods for id,balance,annualInterestRate,date,monthlyInterestRate,monthlyInterest
   public int getId()
   {
       return this.id;
   }
   public double getBalance()
   {
       return this.balance;
   }
   public double getAnnualInterestRate()
   {
       return this.annualInterestRate;
   }
   public Date getDate()
   { 
       return this.dateCreated;
   }
   public double getMonthlyInterestRate()
   {
      return (this.annualInterestRate/12)*100;
   }
   public double getMonthlyInterest()
   {
    return this.balance*getMonthlyInterestRate();
   }
   
   //Method withdraw 
   public double withdraw(double withdraw)
   {  
      this.balance=balance-withdraw;
      return balance;
   }
   
   //Method deposit
   public double deposit(double deposit)
   {  
      this.balance=balance+deposit;
      return balance;
   }
   
   //Metohd toString
   public String toString()
   {
      String name="Account id: "+this.id+"\nAccount balance: "+this.balance+"\nInterest rate: "+this.annualInterestRate*100+" %"; 
      return name;
   }
}
   
   
   
   