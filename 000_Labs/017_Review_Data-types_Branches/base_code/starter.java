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
		System.out.print("Choose your character name: ");
		String name = sc.nextLine();

		System.out.println("Choose Your Path");
		System.out.print("Wizard, Warrior, or Rogue: ");
		String path = sc.nextLine();

		if(path.equalsIgnoreCase("Wizard")){
			System.out.println("You have chosen Wizard");
		}

		else if(path.equalsIgnoreCase("Warrior")){
			System.out.println("You have chosen Warrior");
		}

		else if(path.equalsIgnoreCase("Rogue")){
			System.out.println("You have chosen Rogue");
		}
		else{
			System.out.println("Input a correct answer");
		}

		int totalPoints = 20;

		System.out.println("You have 20 points to spend on Strength, Dexterity, Intelligence, and Charisma. You can Spend a maximum of 10 points on each");
		System.out.println("How much do you want to spend on Strength: ");
		int strengthPoints = sc.nextInt();
		
		if((strengthPoints > 10) || (strengthPoints > totalPoints)){
			System.out.print("I cannot let you do that");
			strengthPoints = 0;
		}
		System.out.println("You have " + (totalPoints - strengthPoints) + " left to spend");

		int totalPoints2 = totalPoints - strengthPoints;

		System.out.print("How much do you want to spend on Dexterity: ");
		int dexterityPoints = sc.nextInt();
		if((dexterityPoints > 10) || (dexterityPoints > totalPoints2)){
			System.out.println("I cannot let you do that");
			dexterityPoints = 0;

		}
		int totalPoints3 = totalPoints - strengthPoints - dexterityPoints;
		System.out.println("You have " + (totalPoints - strengthPoints - dexterityPoints) + " left to spend");

		System.out.print("How much do you want to spend on Intelligence: ");
		int intelligencePoints = sc.nextInt();
		if((intelligencePoints > 10) || (intelligencePoints > totalPoints3 )){
			System.out.println("I cannot let you do that");
			intelligencePoints = 0;
		}

		int totalPoints4 = totalPoints - strengthPoints - dexterityPoints - intelligencePoints;


		System.out.println("You have " + (totalPoints - strengthPoints - dexterityPoints - intelligencePoints) + " left to spend");

		System.out.print("How much do you want to spend on Charisma: ");
		int CharismaPoints = sc.nextInt();
		if((CharismaPoints > 10) || (CharismaPoints > totalPoints4)){
			System.out.println("I cannot let you do that");
			CharismaPoints = 0;
		}

		int totalPoints5 = totalPoints - strengthPoints - dexterityPoints - intelligencePoints - CharismaPoints;



		System.out.println("You have " + (totalPoints - strengthPoints - dexterityPoints - intelligencePoints - CharismaPoints) + " left to spend");

		int finalTotalPoints = totalPoints - strengthPoints - dexterityPoints - intelligencePoints - CharismaPoints;

		System.out.println("Ok " + path + " "+ name);
		System.out.println("Strength: " + strengthPoints);
		System.out.println("Dexterity: " + dexterityPoints);
		System.out.println("Intelligence: " + intelligencePoints);
		System.out.println("Charisma: " + CharismaPoints);
		System.out.print("Points left to spend: " + finalTotalPoints);
	}
}
