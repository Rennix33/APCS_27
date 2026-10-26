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
		BankAccount y = new BankAccount("Rennon", "Armen", 1, 1000000, 9962);
		BankAccount z = new BankAccount("Darius", "Ustuntas", 1, 1000000, 9962);
		y.printDetails();
		z.printDetails();


		
	}
}
