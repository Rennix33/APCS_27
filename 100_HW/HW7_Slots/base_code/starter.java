/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machone will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers mactch, you double your money."); 
		System.out.println("   b. If three numbers mactch, you triple your money."); 
		System.out.println("   c. If none, you lose your money."); 
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		String play = sc.nextLine();

		
		int x = 100;
		int wager = 0;

		while(true){
    		System.out.print("You have $" + x + ". How much would you like to wager? ");
    		wager = sc.nextInt();

    		int num1 = (int)(Math.random() * 10) + 1;
    		int num2 = (int)(Math.random() * 10) + 1;
    		int num3 = (int)(Math.random() * 10) + 1;

    		System.out.println("Great! Let's play!!!");
    		System.out.println("Your rolls are:");
    		System.out.println("-----------------------");
    		System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");

			if((num1 == num2) && (num1 == num3)){
				System.out.print("You won! Your money has been tripled!!!");
				x = x + (wager * 3);
			}

			if((num1 == num2) || (num1 == num3)){
				System.out.print("You won! Your money has been doubled");
				x = x + (wager *2);
			}
			else{
				System.out.print("You lost");
				x = x - wager;
			}
}
}
}
