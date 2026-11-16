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
		int y = 0;
		while(y < arr.length){
			int x = (int)(Math.random() * 1000) + 1;
			arr[y] = x;
			y++;
		}

		int d = 0;
		while(d < arr.length){
			System.out.print(arr[d] + " ");
			d++;
		}

		


		
	}
}
