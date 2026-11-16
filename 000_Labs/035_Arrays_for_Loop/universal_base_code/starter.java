/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[1000];
		for(int y = 0; y < arr.length; y++){
			int x = (int)(Math.random() * 1000) + 1;
			arr[y] = x; 
		}

		for(int d = 0; d < arr.length; d++){
			System.out.print(arr[d] + " ");
		}


		
	}
}
