/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Take a guess from 1-1,000,000: ");
		int x = (int)(Math.random() * 1000000) + 1;
		while(true){
			int guess = sc.nextInt();
			if(guess == x){
				System.out.print("Correct!!");
				break;
			}
			else if(guess > x){
				System.out.print("Lower: ");
			}
			else if(guess < x){
				System.out.print("Higher: ");
			}
		}



		
	}
}
