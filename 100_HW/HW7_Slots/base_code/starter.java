/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money."); 
		System.out.println("   b. If three numbers match, you triple your money."); 
		System.out.println("   c. If none match, you lose your wager."); 
		System.out.println("--------------------------------------------------------------");

		int x = 100;

		while(x > 0){
			System.out.print("Would you like to play slots? (Yes/yes/Y/y): ");
			String agree = sc.nextLine();

			if(!agree.equalsIgnoreCase("Yes") && (!agree.equalsIgnoreCase("Y"))){
				break;
			}

			if(agree.equalsIgnoreCase("Yes") || agree.equalsIgnoreCase("Y")){
				System.out.println("Great let's play");
			}

			if(x <= 0) {
				System.out.println("You are out of money!");
				break;
			}
			System.out.print("You have $" + x + ". How much would you like to wager? ");
			int wager = sc.nextInt();
			sc.nextLine();
			if(wager <= 0 || wager > x) {
				System.out.println("Invalid wager. Enter an amount between $1 and $" + x + ".");
				break;
			}
				int num1 = (int)(Math.random() * 10) + 1;
				int num2 = (int)(Math.random() * 10) + 1;
				int num3 = (int)(Math.random() * 10) + 1;
			if(wager > 0 && wager <= x) {
				

				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are:");
				System.out.println("-----------------------");
				System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");

			}

			
			if(num1 == num2 && num2 == num3){
				System.out.println("Nice you tripled your money");
				x = x - wager;
				x = x + (wager * 3);
				System.out.println("You now have $" + x);
				
			}
			else if(num1 == num2 || num1 == num3 || num2 == num1 || num2 == num3){
				System.out.println("Nice you doubled your money");
				x = x - wager;
				x = x + (wager * 2);
				System.out.println("You now have $" + x);
			} 
			else{
				System.out.println("You lost");
				x = x - wager;
				System.out.println("You now have $" + x);

			}

			
	
	}
	}
}
