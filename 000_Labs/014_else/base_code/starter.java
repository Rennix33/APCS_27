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

		int x = (int)((Math.random()) * 1000) + 1; 
		

		Scanner sc = new Scanner(System.in);

		System.out.print("Im thinking of a number between 1 and 1000, take a guess: ");
		int guess = sc.nextInt();

		if(guess == x){
			System.out.print("Correct");
		}
		else{
			System.out.println("nope");
			System.out.print("Ah, so close. You were within 1000. The correct number was " + x);
		}
	}
}
