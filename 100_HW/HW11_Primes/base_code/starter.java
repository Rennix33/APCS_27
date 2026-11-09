/*
 * Author:
 * Date:
*/

import java.util.Scanner;

class starter {

	public static boolean isPrime(int num){
		int y = num - 1;

		while(y >= 2){
			if(num % y == 0){
				return false;
			}
			y--;
		}

		return true;
	}

	public static void printPrimes(int player){
		int x = 2;

		while(x < player){
			if(isPrime(x) == true){
				System.out.println(x);
			}
			x++;
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number and we'll output every prime number until your number: ");

		int num = sc.nextInt();

		printPrimes(num);

	}
}
