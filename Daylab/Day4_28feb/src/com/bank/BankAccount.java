package com.bank;
//base class
public abstract class BankAccount {  //abstract class bankAccount
    private int accountNumber;
    protected double balance;
    
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //getter methods
    public int getAccountNumber() {
        return accountNumber;
    }    
    public double getBalance() {
        return balance;
    }    
    //void methods
    public abstract void deposit(double amount);
    
    public abstract void withdraw(double amount);
}
// derived class CheckingAccount with own methods
class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }    
    public void deposit(double amount) {
    	//for knowing the new balance after depositing the amount
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        System.out.println("Rupees " + amount + " deposited." + "\n" + "New balance: "+ newBalance + "/- Rupees");
    }   
    public void withdraw(double amount) {
    	//for knowing the new balance after deducting amount
        double newBalance = getBalance() - amount;
        setBalance(newBalance);
        System.out.println("Rupees " + amount + " withdrawn. " +"\n" + "New balance: " +newBalance + "/- Rupees");
    }   
    private void setBalance(double balance) {
        super.balance = balance;
    }
    
    public static void main(String[] args) {
        // create object of CheckingAccount
        CheckingAccount account = new CheckingAccount(150684,50000);
        // call deposit and withdraw methods
        account.deposit(5000);
        account.withdraw(2000);
    }
}

