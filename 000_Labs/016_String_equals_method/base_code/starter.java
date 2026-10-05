/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Your Path");
		System.out.print("Wizard, Warrior, or Rogue: ");
		String path = sc.nextLine();

		if(path.equalsIgnoreCase("Wizard")){
			System.out.print("You have chosen Wizard");
		}

		else if(path.equalsIgnoreCase("Warrior")){
			System.out.print("You have chosen Warrior");
		}

		else if(path.equalsIgnoreCase("Rogue")){
			System.out.print("You have chosen Rogue");
		}
		else{
			System.out.print("Input a correct answer");
		}
	
	}
}
