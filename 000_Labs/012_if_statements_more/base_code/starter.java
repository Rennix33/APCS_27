/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a integer: ");
		int num1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Please enter another integer: ");
		int num2 = sc.nextInt();
		sc.nextLine();

		if( num1 != num2){
			System.out.print("They are different.");

		}

		else if( num1 == num2){

			System.out.print("They are the same");
		}


		

	}
}

