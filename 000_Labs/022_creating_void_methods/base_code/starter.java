/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static void toStringCombined(String r, String x){
			System.out.print(r + " " + x);
	}


	public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Write a sentence!");
			String sentence = sc.nextLine();

			System.out.println("Write a sentence!");
			String sentence2 = sc.nextLine();

			toStringCombined(sentence, sentence2);


		
	}
}
 