import java.util.*;

class BankAccount {
    int accNo;
    String name;
    double balance;

    void openAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest: " + (balance * 0.04));
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount() {
        System.out.println("Maturity Amount: " + (balance * 1.1));
    }
}

public class practical_14 {
    public static void main(String[] args) {

        SavingAccount s = new SavingAccount();
        s.openAccount(101, "Rachit", 10000);
        s.deposit(2000);
        s.calculateInterest();
        s.checkBalance();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(102, "Aman", 15000);
        f.maturityAmount();
    }
}
