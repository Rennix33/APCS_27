/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	int bank_num;
	String first;
	String last;
	double money;
	int ID;

	// -------CONSTRUCTORS-------
	public BankAccount() {						// Default/Empty Constructor				// Set variables to default values in case they are used.
		first = "unknown";
		last = "unknown";
		bank_num = 0;
		money = 0;
		ID = 9622;
	}

	public BankAccount(String f, String l){	// String, String Constructor
		first = f;
		last = l;
		bank_num = 0;
		money = 0;
		ID = 9622;						// This constructor allows me to make cars when I know what their model and make are.
		
	}

	public BankAccount(String f, String l, int num, double m, int Id){	// double, String, String, int, boolean Constructor
		first = f;
		last = l;
		bank_num = num;
		money = m;
		ID = Id;	
	}
	

	// -------METHODS-------
	public void setAccount(int num){		
		bank_num = num;						
		return;
	}

	public double money(){
		return money;					// This is basically like a variable look up, to access the values in the car object, we need to return values
	}

	public void printDetails(){
		System.out.println("----------------------");
		System.out.println("Name: " + first + " " + last);
		System.out.println("Bank number: " + (bank_num + 1));
		System.out.println("Money: " + money);
		System.out.println("Id: " + ID);
		
		System.out.println("----------------------");
		System.out.println();
		return;
	


	}
}