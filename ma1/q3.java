package ma;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int bingo = (int) (Math.random() * 100);

        while (true){
            Scanner input = new Scanner(System.in);
            //prompt for user integer
            System.out.println("Guess a number from 0-100.\nEnter a number:");
            int num = input.nextInt();
            System.out.println(num);
            //Close the Scanner input
            //Check if equals
            if( num == bingo){
                System.out.println("Correct!");
                break;
            }else if (num <bingo){
                System.out.println("Too low.");
            }else {
                System.out.println("Too high.");
            }
        }
    }
}
