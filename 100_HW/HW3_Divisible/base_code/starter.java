/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even.");
        } else {
            System.out.println(num1 + " is odd.");
        }

        
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even.");
        } else {
            System.out.println(num2 + " is odd.");
        }

        
        System.out.println("Checking " + num1 + ":");

        if (num1 % 3 == 0) {
            System.out.println("Divisible by 3");
        }

        if (num1 % 4 == 0) {
            System.out.println("Divisible by 4");
        }

        if (num1 % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        if (num1 % 3 != 0 && num1 % 4 != 0 && num1 % 5 != 0) {
            System.out.println("Not divisible by 3, 4, or 5.");
        }

        
        System.out.println("\nChecking " + num2 + ":");

        if (num2 % 3 == 0) {
            System.out.println("Divisible by 3");
        }

        if (num2 % 4 == 0) {
            System.out.println("Divisible by 4");
        }

        if (num2 % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        if (num2 % 3 != 0 && num2 % 4 != 0 && num2 % 5 != 0) {
            System.out.println("Not divisible by 3, 4, or 5.");
        }

        
    }
}
