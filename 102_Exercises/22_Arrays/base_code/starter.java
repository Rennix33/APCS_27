/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		// int [] arr = new int[1001];
		// int len = arr.length;
		// int x = 3;
		// while(x < (len * 3)){

		// System.out.print(x + " ");
		// x = x + 3;
		// }

		// System.out.println("");
		// System.out.println("");
		// System.out.println("");
		// System.out.println("");


		// int [] arr2 = new int [1001] ;
		// int len2 = arr.length;
		// int y = 1000;
		// while(y >= 0){
		// 	System.out.print(y + " ");
		// 	y--;
		// }

		int [] arr = new int[1001];
		int [] rev = new int [1001];

		int count = 0;

		while(count < arr.length){
			arr[count] = (count + 1)*3;
			count++;
		}
		count = 0;
		while(count < arr.lengh){
			System.out.println(arr[count]);
		}

		count = 0;
		while(count < rev.length){
			System.out.println(rev[count]);
			count++;
		}


	}
}
