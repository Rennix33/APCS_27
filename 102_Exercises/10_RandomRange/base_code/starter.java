/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter and integer : ");
		int num1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Please enter another interger(bigger than the first): ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Your range is " + num1 + " to " + num2 + ".");
		System.out.println("Here are 5 numbers generated in that range. ");

		int difference = num2 - num1;

		int x = (int)(Math.random() * difference + num1 );
		int y = (int)(Math.random() * difference + num1 );
		int a = (int)(Math.random() * difference + num1 );
		int b = (int)(Math.random() * difference + num1 );
		int c = (int)(Math.random() * difference + num1 );

		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


		 
	}
}
