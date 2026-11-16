/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] nums = new int[20];

        for(int i = 0; i < 20; i++) {
            nums[i] = (int)(Math.random() * 10) + 1;
        }

        System.out.println("Array:");

        for(int i = 0; i < 20; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int target = (int)(Math.random() * 10) + 1;
        System.out.println("Target number: " + target);

        int duplicates = 0;

        for(int i = 0; i < 20; i++) {
            if(nums[i] == target) {
                System.out.println("Duplicate found at index: " + i);
                duplicates++;
            }
        }

        System.out.println("Total duplicates: " + duplicates);

        System.out.println("Consecutive numbers:");

        for(int i = 0; i < 19; i++) {
            if(nums[i] == nums[i + 1]) {
                System.out.println("Indexes " + i + " and " + (i + 1) +
                " have the same number: " + nums[i]);
            }
        }
	}
}
