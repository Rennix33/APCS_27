/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets gamble");
        System.out.println("You start with $20 and each roll is $1");
        System.out.println("Payout = 7x");
        System.out.print("Type Pull to roll: ");
        String pull = sc.nextLine();


        int money = 20;

        int num1 = (int)((Math.random()) * 10) + 1;
        int num2 = (int)((Math.random()) * 10) + 1;
        int num3 = (int)((Math.random()) * 10) + 1;
        System.out.println(num1 + " | " + num2 + " | " + num3);

        if((num1 == 7) && (num2 == 7) && (num3 == 7)){
            money = money - 1;
            System.out.println("YOU WON!!!!!");
            System.out.print("Money: $" + (money * 7));

        }
        else{
            System.out.println("You lost");
            System.out.print("Money: $" + (money - 1));
        }
        
        
    }
}
