package ma.mainProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mainMenu {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int option; 
		int game;
		int VIP_count = 0;
		//use a list to save the points and name of each player and later can do sorting
		ArrayList<Player> leaderboard = new ArrayList<>();

		do {
			System.out.println("Please choose an option:");
			System.out.println("1. New Player\n2. Quit");
			option = input.nextInt();
			if ( option != 2 ) {
				System.out.println("Please enter a name:");
				String name = input.next();
				//create a new player instance
				//if (VIP_count <=5){
					//VIPPlayer p = new VIPPlayer();

				//}else{
					//Player p = new Player();
				//}
				Player p = (VIP_count <=5) ? new VIPPlayer() : new Player();;
				//Player p = new Player();
				
				//set his/her name
				p.setName(name);
				do{
					System.out.println("\nHello "+ p.getName()+". Please choose a game, or -1 to quit:");
					System.out.println("1. coin flip\n2. guessing game");
					game = input.nextInt();
					if ( game == 1) {
						//get the points the player earn from the game and add it to their instance
						p.addPoint(coinFlip());
					}else if ( game == 2) {
						//get the points the player earn from the game and add it to their instance
						p.addPoint(guessing());
					}else if (game == -1){
						continue;
					}else{
						System.out.println("You have a wrong number, please try it again");
					}
			}while(game != -1);
				//after each player done playing, add its name info into the leaderboard
				leaderboard.add(p);
				VIP_count+=5;
			}
		}while ( option == 1);
			System.out.println("Player : Points");
			//sort the players in the leaderboard based on their points using collection.sort method
			Collections.sort(leaderboard, (a, b) -> Integer.compare(b.getPoints(), a.getPoints()));

			//print out the points of player 
			for (Player player : leaderboard) {
				System.out.println(player);
			}
			
		}

	private static int guessing() {
		// this is a number guessing game that have 5 trials, the more trials left the more points the player can get
		
		System.out.println("Guess a number between 1 and 100, you have 5 trials: ");
		
		int trials = 5;
		Scanner input = new Scanner(System.in);
		
		//set a random number as the number to be guessed
		int num = (int)(100 * Math.random()) + 1;
		System.out.println("num is" + num);
		int points = 0;
		
		//use a flag to check if player guess the correct number or not
		boolean flag = false;
		while ( trials > 0) {
			int guess = input.nextInt();
			trials--;
			if ( guess == num ) {
				points = trials == 0? 20 : trials * 20;
				//System.out.println("You guess the number with"+trials+"trials left, congratulation! +"+ (points = trials == 0? 20 : trials * 20)+" points");
				flag = true;
				break;
			}else if ( guess < num ) {
				System.out.println("The guess is too small, please try again, you have "+trials+" trials left.");
			}else {
				System.out.println("The guess is too large, please try again, you have "+trials+" trials left.");
			}
			
		}
		if ( !flag ) System.out.println("Trials used up, + 0 points");
		return points;
		
	}

	private static int coinFlip() {
		// this is a coin flip game to guess if a coin is head or tail
		
		//set a random number as the coin result, 1 for h, 2 for tail
		int num = (Math.random() <= 0.5) ? 1 : 2; 
		String answer;
		if ( num == 1) {
			answer = "h";
		}else {
			answer = "t";
		}
		
		
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter you guess (h = heads, t = tails):");
        String guess = input.next();
        //change the guess to lower case to accept both capital or lower case answer
        guess.toLowerCase();
        
        //gain 50 points if win the toss
        if ( guess.equals(answer)) {
        	//System.out.println("You won the toss, congratulation! +50 points");
        	return 50;
        }else {
        	 //System.out.println("Wrong guess! 0 points");
        	 return 0;
        }
       
	}
}
