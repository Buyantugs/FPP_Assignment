package assignment12;

public class CustomerAccount {
    private String cus_name;
    private String acc_no;
    private double balance;

    public CustomerAccount(String cus_name, String acc_no, double balance) {
        this.cus_name = cus_name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            return false;
        }

        if (balance - amount < 100) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds the balance.");
        }

        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}