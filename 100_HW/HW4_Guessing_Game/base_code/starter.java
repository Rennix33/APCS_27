/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {

        String x = "Earth";
        Scanner sc = new Scanner(System.in);

        System.out.println("The goal of the game is to guess a word with two hints");
        System.out.print("It's a planet in our solar system: ");
        String guess = sc.nextLine();

        if (guess.equalsIgnoreCase(x)) {
            System.out.println("Woo. You got it!");
        } 
		else {
            System.out.println("You sadly didn't guess right, here's another hint.");
            System.out.print("It's the only one with humans on it: ");
        }

        String guess2 = sc.nextLine();

        if (guess2.equalsIgnoreCase(x)) {
            System.out.println("Nice! You got it!");
        } 
		else {
            System.out.println("Nope.");
        }


    }
}
