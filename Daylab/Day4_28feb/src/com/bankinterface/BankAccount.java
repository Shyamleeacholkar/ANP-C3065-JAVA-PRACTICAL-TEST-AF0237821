package com.bankinterface;
//interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}
//implementing class through interface
class CheckingAccount implements BankAccount {
    private int accountNumber;
    private double balance;
    
    public CheckingAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //implementing methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Rupees " + amount + " deposited." + "\n" + "New balance: "+balance+ "/- Rupees");
    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Rupees " + amount + " withdraw." + "\n" + "New balance: "+balance+ "/- Rupees");
    }
    public static void main(String[] args) {
        // create object of CheckingAccount
        CheckingAccount account = new CheckingAccount(12345, 10000);
        // call deposit and withdraw methods
        account.deposit(5000);
        account.withdraw(2000);
    }
}
