public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    public double getBalance() {
        return balance;
    }
}