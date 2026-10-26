/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();

		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);

		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);

		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);

		Employee r = new Employee(2012, "R", "Dawg", 5000);

		michael.raiseSalary(1);
		dwight.raiseSalary(11);
		jim.raiseSalary(10);
		pam.raiseSalary(1);
		r.raiseSalary(50);

		michael.employeeToString();
		System.out.println("Annual Salary: " + michael.getAnnualSalary());

		dwight.employeeToString();
		System.out.println("Annual Salary: " + dwight.getAnnualSalary());

		jim.employeeToString();
		System.out.println("Annual Salary: " + jim.getAnnualSalary());

		pam.employeeToString();
		System.out.println("Annual Salary: " + pam.getAnnualSalary());

		r.employeeToString();
		System.out.println("Annual Salary: " + r.getAnnualSalary());
	}
}
