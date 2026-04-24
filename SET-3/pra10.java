import java.util.*;

class BankAccount {
    String name;
    double balance;
    static double interest_rate = 5.0;

    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    static void setInterestRate(double rate) {
        interest_rate = rate;
    }

    void calculateInterest() {
        double interest = (balance * interest_rate) / 100;
        System.out.println("Interest for " + name + ": " + interest);
    }
}

public class practical_10 {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("Rachit", 10000);
        BankAccount a2 = new BankAccount("Aman", 20000);

        BankAccount.setInterestRate(6.0);

        a1.calculateInterest();
        a2.calculateInterest();
    }
}
