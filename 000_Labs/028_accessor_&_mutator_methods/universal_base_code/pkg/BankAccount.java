
/*
 *	Author:  
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
	public BankAccount(){
		owner = "Unknown";
		AccountNumber = (int)(Math.random() * 900) + 100;
		Balance = 0.0;
		Status = "active";
	}


	public BankAccount(String o){
		owner = o;
		AccountNumber = (int)(Math.random() * 900) + 100;
		Balance = 0.0;
		Status = "active";
	}
	public BankAccount(String o, double bal){
		owner = o;
		AccountNumber = (int)(Math.random() * 900) + 100;
		Balance = bal;
		Status = "active";
	}


	public BankAccount(String o, int acc, double bal, String s){
    owner = o;
    AccountNumber = acc;
    Balance = bal;
    Status = s;
}
	

	// -------METHODS-------
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

	public void checkBalance(){
    System.out.println("Current Account Balance: $" + Balance);
	}

	 


	public void deposit(double bal){
		if(Status.equalsIgnoreCase("active")){
			Balance = Balance + bal;
		}
	}

	public void withdraw(double bal){
		if(!Status.equalsIgnoreCase("active") && Balance - bal >= 0){
			Balance = Balance - bal;
		}
	}

	public void closeAccount(){
		Status = "inactive";
	}

	public void displayAccountInfo(){
		System.out.println("Owner: " + owner);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance: " + Balance);
		System.out.println("Status: " + Status);
		System.out.println("");
	}

	public void checkBally(){
    System.out.println("Current Account Balance: $" + Balance);
	}

	 

}
