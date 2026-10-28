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
		String owner = "Unknown";
		int AccountNumber = 0;
		double Balance = 0.0;
		String Status = "active";
	}


	public BankAccount(String o){
		owner = o;
		int AccountNumber = 0;
		double Balance = 0.0;
		String Status = "active";
	}
	public BankAccount(String o, double bal){
		owner = o;
		int AccountNumber = 0;
		Balance = bal;
		String Status = "active";
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

	public double getBalace() {
	return Balance;
	}

	public void setBalance(double bal) {
	Balance = bal;
	}

	public void printDetails(){
		System.out.println("Owner: " + owner);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance: " + Balance);
		System.out.print("Status: " + Status);
	}

}