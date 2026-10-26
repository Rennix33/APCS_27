/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
        int x = (int)(Math.random() * 3 + 1);
        if(x == 1){
            return "rock";
        }
        else if(x == 2){
            return "paper";
        }
        else{
            return "scissors";
        }
        
        

    }

    public static int compare2(String a, String b){
        if(a.equalsIgnoreCase(b)){
        return 0;
        }
        else if(a.equalsIgnoreCase("rock") && b.equalsIgnoreCase("scissors")){
            return 1;

        }
        else if(a.equalsIgnoreCase("paper") && b.equalsIgnoreCase("rock")){
            return 1;

        }
        else if(a.equalsIgnoreCase("scissors") && b.equalsIgnoreCase("paper")){
            return 1;
        }
        else{
            return 2;
        }

        }


    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice = "";

    while(!choice.equalsIgnoreCase("done")){
        System.out.println("Would you like to play rock paper scissors? (yes/no/done)");
        choice = sc.nextLine();

        if(choice.equalsIgnoreCase("yes")){
            String rps = "";

            while(!rps.equalsIgnoreCase("rock") && !rps.equalsIgnoreCase("paper") && !rps.equalsIgnoreCase("scissors")){
                System.out.print("Please choose rock, paper, or scissors: ");
                rps = sc.nextLine();
            }

            String computer = getObject();

            System.out.println("You chose: " + rps);
            System.out.println("The computer chose: " + computer);

            int winner = compare2(rps, computer);

            if(winner == 0){
                System.out.println("It's a tie!");
            }
            else if(winner == 1){
                System.out.println("You win!");
            }
            else{
                System.out.println("The computer wins!");
            }
        }
        else if(choice.equalsIgnoreCase("no")){

            System.out.print("How many games should the computers play? ");
            int games = sc.nextInt();
            sc.nextLine();

            int p1 = 0;
            int p2 = 0;
            int ties = 0;
            int i = 1;

            while(i <= games){

                String computer1 = getObject();
                String computer2 = getObject();

                int winner = compare2(computer1, computer2);

                if(winner == 0){
                    ties++;
                }
                else if(winner == 1){
                    p1++;
                }
                else{
                    p2++;
                }

                i++;
            }

            System.out.println("Player 1 wins: " + p1);
            System.out.println("Player 2 wins: " + p2);
            System.out.println("Ties: " + ties);

        }

        else if(!choice.equalsIgnoreCase("done")){
            System.out.println("Please enter yes, no, or done.");
        }
    

    System.out.println("Thanks for playing!");

        }
        


}
}