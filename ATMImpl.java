// task 4 code

public class ATMImpl implements ATM {
    private double balance;

    public ATMImpl(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please deposit a positive amount.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please withdraw a positive amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Unable to withdraw.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
}
