/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		BankAccount y = new BankAccount("Rennon", "Armen", 0, 1000000, 9962);
		BankAccount z = new BankAccount("Darius", "Ustuntas", 1, 523, 9964);
		BankAccount a = new BankAccount("Bob", "Billy", 2, 1234, 9965 );
		y.printDetails();
		z.printDetails();
		a.printDetails();


		
	}
}
