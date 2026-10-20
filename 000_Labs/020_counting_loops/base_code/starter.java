/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name: ");
		String name = sc.nextLine();
		System.out.println("How many times should I print your name: ");
		int howmany = sc.nextInt();


		int x = 0;
		while(true){
			if(x == howmany){
				break;
			}
			System.out.print(name + " ");
		 	x = x + 1;
		}



		
	}
}
