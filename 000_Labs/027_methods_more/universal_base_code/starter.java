/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BankAccount account;

		System.out.println("Welcome to the R-Dawg ATM");

		while(true){
			System.out.println("We're going to create a bank account! What info do we know?");
			System.out.println("1 - Nothing");
			System.out.println("2 - Owner");
			System.out.println("3 - Owner and Initial deposit");
			System.out.println("4 - done");

			int choice = sc.nextInt();
			sc.nextLine();

			if(choice == 1){
				account = new BankAccount();
			}
			else if(choice == 2){
				System.out.println("What is the name of the owner of this bank account?");
				String owner = sc.nextLine();

				account = new BankAccount(owner);
			}
			else if(choice == 3){
				System.out.println("What is the name of the owner of this bank account?");
				String owner = sc.nextLine();

				System.out.println("How much are you initially depositing into this account?");
				double balance = sc.nextDouble();
				sc.nextLine();

				account = new BankAccount(owner, balance);
			}
			else if(choice == 4){
				break;
			}
			else{
				System.out.println("Invalid choice.");
				continue;
			}

			System.out.println("Account successfully created!");
			account.displayAccountInfo();

			System.out.println("Would you like to check the balance of this account? (yes/no)");
			String checkBal = sc.nextLine();

			if(checkBal.equalsIgnoreCase("yes")){
				account.checkBalance();
			}
			else{
				System.out.println("Great! No balance checked.");
			}
		}

		System.out.println("Thank you for coming to the R-Dawg ATM!");
	}
}