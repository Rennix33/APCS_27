/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fahrenheit temperature: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Celsius temperature: " + celsius);
    }
}