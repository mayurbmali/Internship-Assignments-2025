//Program Statement: Create a BankAccount class with private fields (balance) and public methods to deposit and display balance.

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.displayBalance(); 
    }
}

// Output
// Balance: $1000.0