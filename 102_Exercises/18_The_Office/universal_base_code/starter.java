/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static dwight(){
		ID = 1987;
		firstName = new String("Dwight");
		lastName = new String("Schrute");
		salary = 4416.66;
		
	}

	public static jim(){
		ID = 2474;
		firstName = new String("Jim");
		lastName = new String("Halpert");
		salary = 4416.66;
		
	}

	public static pam(){
		ID = 2011;
		firstName = new String("Pam");
		lastName = new String("Beesly");
		salary = 2250;
		
	}

	public static r(){
		ID = 2012;
		firstName = new String("R");
		lastName = new String("Dawg");
		salary = 5000;
		
	}



	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();

		Employee dwight = new Employee();
		dwight.employeeToString();

		Employee jim = new Employee();
		jim.employeeToString();

		Employee pam = new Employee();
		pam.employeeToString();

		Employee r = new Employee();
		r.employeeToString();
		
	}
}
