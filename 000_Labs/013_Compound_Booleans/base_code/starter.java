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

		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Please enter another integer: ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.print("Please enter another integer: ");
		int num3 = sc.nextInt();
		sc.nextLine();

		
		
	
		if((num1 > num2) && (num1 > num3)){
			System.out.print(num1  + " is the largest");
		}

		if((num2 > num1) && (num2 > num3)){
			System.out.print(num2 + " is the largest");
		}

		if((num3 > num1) && (num3 > num1)){
			System.out.print(num3 + " is the largest");
		}



		
		if((num1 < num2) && (num1 < num3)){
			System.out.print(" and " + num1  + " is the smallest");
		}

		if((num2 < num1) && (num2 < num3)){
			System.out.print(" and " + num2 + " is the smallest");
		}

		if((num3 < num1) && (num3 < num2)){
			System.out.print(" and " + num3 + " is the smallest");
		}
		

		
	
}
}