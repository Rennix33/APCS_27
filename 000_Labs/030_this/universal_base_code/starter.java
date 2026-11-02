/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf d1 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf d2 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf d3 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf d4 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf d5 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf d6 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf d7 = new PooleDwarf(randName(), (int)(Math.random()*100));

		int duplicates = 0;

		if(d1.isSameName(d2.getName())){
			 duplicates++;
		}
		if(d1.isSameName(d3.getName()))
		{
			 duplicates++;
		}
		if(d1.isSameName(d4.getName())) 
		{
			 duplicates++;
		}
		if(d1.isSameName(d5.getName()))
		{
			 duplicates++;
		}
		if(d1.isSameName(d6.getName()))
		 {
			 duplicates++;
		}
		if(d1.isSameName(d7.getName()))
		 {
			 duplicates++;
		}

		System.out.println("First dwarf: " + d1.getName());
		System.out.println("Duplicates: " + duplicates);


		PooleDwarf test = new PooleDwarf();
		
	}
}
