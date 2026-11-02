/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Scanner sc = new Scanner(System.in);

        System.out.println("Dog name?");
        String name = sc.nextLine();

        System.out.println("What age should " + name + " be?");
        int age = sc.nextInt();


		Dog a = new Dog(name, age);
		Dog b = new Dog("Teddy", "Doberman");

		System.out.println(a.getName() + " is a " + a.getBreed() + " that is " + a.getAge() + " years old!");
        System.out.println(b.getName() + " is a " + b.getBreed() + " that is " + b.getAge() + " years old!");

		boolean aBarks = false;
		boolean bSleeping = b.isSleeping();
		boolean aSleeping = a.isSleeping();


		if(aSleeping == true){
			System.out.println("SHHH. It's asleep");
		}
		else if(aSleeping == false){
			a.bark();
			aBarks = true;
		}

		if(bSleeping == true && aBarks == true){
			b.bark();

		}
		else{
			System.out.print("");
		}

		if(bSleeping == false && aBarks == true){
			b.bark();
		}

		else{
			System.out.print("");

		}




	}
}
