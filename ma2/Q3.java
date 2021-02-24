package MA2;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter a string representing any number of wins, draws and losses e.g. \"WWDLDL\"");
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        while (!result){
            String input = scanner.nextLine();
            result = checkInputString(input.toUpperCase(Locale.ROOT)) ? true : false;
            if (!result){
                System.out.println("Invalid format, enter again");
            }else{
                calculateAveragePoint(input.toUpperCase(Locale.ROOT));
            }
        }

    }

    public static boolean checkInputString(String input){
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != 'W' && input.charAt(i) != 'L' && input.charAt(i) !='D'){
                return false;
            }
        }
        return true;
    }

    public static float calculateAveragePoint(String input){
        DecimalFormat f = new DecimalFormat("##.00");
        float count = 0;
        for (int i = 0; i <input.length(); i++){
            if (input.charAt(i) == 'W'){
                count +=3;
            }
            else if (input.charAt(i) == 'L'){
                count+=0;
            }
            else{
                count+=1;
            }
        }
        System.out.println("Total points: " + count);
        float answer = count / input.length();
        System.out.println("Average points: " +  f.format(answer));
        return (answer);
    }
}
