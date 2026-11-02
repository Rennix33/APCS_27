/*
 *  Author:
 *  Date:
*/

package pkg;
import java.util.*;

public class BankAccount {
    // -------GLOBAL VARIABLES-------
    String owner;
    int AccountNumber;
    double Balance;
    String Status;

    // -------CONSTRUCTORS-------

    public BankAccount() {
        owner = "unknown";
        AccountNumber = (int)(Math.random() * 900) + 100;
        Balance = 0.0;
        Status = "Active";
    }

    public BankAccount(String o) {
        owner = o;
        AccountNumber = (int)(Math.random() * 900) + 100;
        Balance = 0.0;
        Status = "Active";
    }

    public BankAccount(String o, double bal) {
        owner = o;
        AccountNumber = (int)(Math.random() * 900) + 100;
        Balance = bal;
        Status = "Active";
    }

    public BankAccount(String o, int acc, double bal, String s) {
        owner = o;
        AccountNumber = acc;
        Balance = bal;
        Status = s;
    }

    // -------ACCESSORS AND MUTATORS-------

    public String getOwner() {
        return owner;
    }

    public void setOwner(String o) {
        owner = o;
    }

    public int getAccount() {
        return AccountNumber;
    }

    public void setAccount(int acc) {
        AccountNumber = acc;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double bal) {
        Balance = bal;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String s) {
        Status = s;
    }

    public boolean isActive() {
        return Status.equalsIgnoreCase("Active");
    }

    // -------ACCOUNT METHODS-------

    public void checkBalance() {
        System.out.println("Current Account Balance: $" + Balance);
    }

    public void checkBally() {
        System.out.println("Current Account Balance: $" + Balance);
    }

    public void deposit(double bal) {
        if (isActive()) {
            if (bal > 0) {
                Balance = Balance + bal;
                System.out.println("Deposited $" + bal);
            }
            else {
                System.out.println("Invalid deposit amount!");
            }
        }
        else {
            System.out.println("Account is closed. Cannot deposit.");
        }
    }

    public void withdraw(double bal) {
        if (isActive()) {
            if (bal > 0 && Balance >= bal) {
                Balance = Balance - bal;
                System.out.println("Withdrew $" + bal);
            }
            else {
                System.out.println("Insufficient funds!");
            }
        }
        else {
            System.out.println("Account is closed. Cannot withdraw.");
        }
    }

    public void closeAccount() {
        Status = "Inactive";
        System.out.println("Account closed for " + owner);
    }

    public void displayAccountInfo() {
        System.out.println("--- Account Info ---");
        System.out.println("Owner: " + owner);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: $" + Balance);

        if (isActive()) {
            System.out.println("Status: Active");
        }
        else {
            System.out.println("Status: Inactive");
        }

        System.out.println();
    }
}
