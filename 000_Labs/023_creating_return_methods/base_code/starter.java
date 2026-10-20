/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int a, int b){

		int result = 1; 
        int count = 0; 
        
        while (true) { 
            if (count >= b) { 
                break; 
            } 
            result = result * a; 
            count = count + 1; 
        } 
        
        System.out.println(a + " to the power of " + b + " is: " + result); 
        return result; 
    } 
	
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int num1 = sc.nextInt();
	sc.nextLine();

	System.out.print("Enter another integer: ");
	int num2 = sc.nextInt();
	sc.nextLine();

	pow(num1, num2);



		
	}
}
