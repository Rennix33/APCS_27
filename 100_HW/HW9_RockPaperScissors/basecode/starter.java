/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static int getObject(int n1, int n2, int n3){
        int x = (int)(Math.random() * 3 + 1);
        int result = x;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        if(x == 1){
            return rock;
        }
        else if(x == 2){
            return paper;
        }
        else{
            return scissors;
        }
        
        

    }

    public static void compare2(String a, String b){
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play rock paper scissors: (yes/no/done)");
        String choice = sc.nextLine();

        if(choice.equalsIgnoreCase("Yes")){
            System.out.print("Please choose rock, paper, or scissors.: ");
        }
        String rps = sc.nextLine();

    }
}
