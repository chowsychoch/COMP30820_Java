package ma;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt for user string of two
        System.out.println("Enter 2 words separate by a newline ");
        String wordOne = input.nextLine();
        String wordTwo = input.nextLine();
        int count = 0;
        String result = "";
        while (true){
            if (count == wordOne.length() || count == wordTwo.length()){
                //reach the end of string index, it has to stop the loop
                break;
            }
            if (wordOne.charAt(count) != wordTwo.charAt(count)){
                //not an equal prefix, has to stop the loop
                break;
            }

            //concat the result into a new string
            result+=wordOne.charAt(count);
            //increment
            count++;
        }
        //print out
        System.out.println(result);
    }



}
