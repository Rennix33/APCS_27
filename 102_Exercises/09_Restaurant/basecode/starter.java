/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What item would you like to order: ");
		String item1 = sc.nextLine();
		System.out.print("How many " + item1 + " do you want? ");
		double qtyItem1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How much is that: ");
		double priceItem1 = sc.nextDouble();
		sc.nextLine();

		System.out.print("What is the second item: ");
		String item2 = sc.nextLine();
		System.out.print("How many " + item2 + " do you want? ");
		double qtyItem2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How much is that: ");
		double priceItem2 = sc.nextDouble();
		sc.nextLine();

		System.out.print("What is the third item: ");
		String item3 = sc.nextLine();
		System.out.print("How many " + item3 + " do you want? ");
		double qtyItem3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How much is that: ");
		double priceItem3 = sc.nextDouble();
		sc.nextLine();

		double totalpriceItem1 = priceItem1 * qtyItem1;
		double totalpriceItem2 = priceItem2 * qtyItem2;
		double totalpriceItem3 = priceItem3 * qtyItem3;



		double totalPrice = totalpriceItem1 + totalpriceItem2 + totalpriceItem3;
		
		double totalPriceTax = totalPrice * 0.095;


		System.out.println("Your subtotal is: $" + totalPrice);
		System.out.print("How much do you want to tip: ");
		double tip = sc.nextDouble();
		sc.nextLine();
		double tipAmount = totalPrice + tip;
		double finalPrice = totalPrice + totalPriceTax + tip;
		double finalFinalPrice = (finalPrice + tip);


		System.out.println("=================================================");
		System.out.println("        Bob's Burgers - Menu For Today");
		System.out.println("=================================================");
		System.out.println("Owner Bob");
		System.out.println("-------------------------------------------------");
		System.out.println("Item           Qty          Price");
		System.out.println("-------------------------------------------------");
		System.out.println(item1 + "             " + (int)qtyItem1 + "                    " + totalpriceItem1);
		System.out.println(item2 + "              " + (int)qtyItem2 + "                     " + totalpriceItem2);
		System.out.println(item3 + "             " + (int)qtyItem3 + "                    " + totalpriceItem3);
		System.out.println("-------------------------------------------------");
		System.out.println("tax: 9.5%             " + totalPriceTax);
		System.out.println("Tip:             " + tip );
		System.out.println("-------------------------------------------------");
		System.out.print("Your total is: " + finalPrice);





















		



	}
}